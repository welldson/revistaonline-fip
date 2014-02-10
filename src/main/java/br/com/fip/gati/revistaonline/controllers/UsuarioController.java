package br.com.fip.gati.revistaonline.controllers;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.fip.gati.revistaonline.model.Usuario;
import br.com.fip.gati.revistaonline.repositorio.UsuarioRepositorio;

@Resource
public class UsuarioController {
	
	private final Result result;
	private UsuarioRepositorio usuarioRepositorio;

	public UsuarioController(UsuarioRepositorio usuarioRepositorio, Result result) {
		this.usuarioRepositorio = usuarioRepositorio;
		this.result = result;
	}
	
	//o nome do metodo deve ser o nome da pagina .jsp
	public void formulario() {
		
	}
	
	public void salvar(Usuario usuario) {
		//EFETUAR VALIDAÇÕES NECESSARIAS
		this.usuarioRepositorio.save(usuario); //aqui o usuário foi salvo
		
		//aqui estou informando que ao terminar esse metodo deve redirecionar para a pagina formulario.jsp
		result.redirectTo(this).formulario(); 
	}
	
	public void atualizar(Usuario usuario) {
		
	}
	
	public Usuario editar() {
		Usuario user = new Usuario();
		return user;
	}
	
	public void excluir() {
		
	}
	
	public List<Usuario> listar() {
		return null;
	}
}
