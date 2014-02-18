package br.com.fip.gati.revistaonline.repositorio;

import br.com.fip.gati.revistaonline.domain.model.Usuario;

public interface UsuarioRepositorio extends Repositorio<Usuario> {

	public Usuario getUsuario(String login, String senha);
	
}
