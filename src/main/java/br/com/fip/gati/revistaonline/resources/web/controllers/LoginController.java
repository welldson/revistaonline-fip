package br.com.fip.gati.revistaonline.resources.web.controllers;

import java.util.Arrays;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationException;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.fip.gati.revistaonline.application.usuario.Autenticador;
import br.com.fip.gati.revistaonline.application.usuario.AuthException;
import br.com.fip.gati.revistaonline.domain.model.Usuario;
import br.com.fip.gati.revistaonline.resources.web.UsuarioLogado;


@Resource
public class LoginController {
	private Autenticador autenticador;
	private UsuarioLogado usuarioLogado;
	private Validator validator;
	private Result result;
	
	public LoginController(Autenticador autenticador, UsuarioLogado usuarioLogado, Validator validator, Result result) {
		this.result = result;
		this.usuarioLogado = usuarioLogado;
		this.autenticador = autenticador;
		this.validator = validator;
	}
	
	@Get("/login")
	public void login() {
		
	}

	@Post("/auth")
	public void auth(Usuario usuario) {
		try {
			if(usuario.getLogin() == null || usuario.getLogin().trim().isEmpty()
					|| usuario.getSenha() == null || usuario.getSenha().trim().isEmpty()) {
				validator.add(new ValidationMessage("Usuário e/ou senha devem ser preenchidos", "autenticacao.credencial", "credencial.obrigatorio"));
			}
			validator.onErrorRedirectTo(this).login();
			
			if (autenticador.autenticar(usuario)) {
				usuarioLogado.setUsuario(usuario);
				result.redirectTo(IndexController.class).index();
			} else {
				result.include("errors", Arrays.asList(new ValidationMessage("Login ou senha incorretos!", "autenticacao.credencial"))).redirectTo(this).login();
			}
			
		} catch (ValidationException vex) {
			throw vex;
		} catch (AuthException authex) {
			authex.printStackTrace();
			result.include("errors", Arrays.asList(new ValidationMessage(authex.getMessage(), "autenticacao.credencial"))).redirectTo(this).login();
		} catch (Exception e) {
			e.printStackTrace();
			result.include("errors", Arrays.asList(new ValidationMessage("Login ou senha incorretos!", "autenticacao.credencial"))).redirectTo(this).login();
		}
	}
	
	@Get("/logout")
    public void logout() {
		this.usuarioLogado.logout();
		result.redirectTo(this).login();
    }
	
}
