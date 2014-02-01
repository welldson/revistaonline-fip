package br.com.fip.gati.revistaonline.controllers;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.fip.gati.revistaonline.model.Usuario;


@Resource
public class LoginController {
	private final Result result;
	//private UsuarioSession usuarioLogado;
	
	public LoginController(Result result) {
		this.result = result;
	}
	
	@Get("/login")
	public void login() {
		
	}

	@Post("/auth")
	public void auth(Usuario usuario) {
	}
	
	@Get("/logout")
    public void logout() {
       result.redirectTo(this).login();
    }
	
}
