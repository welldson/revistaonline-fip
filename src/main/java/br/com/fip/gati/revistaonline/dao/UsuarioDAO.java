package br.com.fip.gati.revistaonline.dao;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.fip.gati.revistaonline.model.Usuario;
import br.com.fip.gati.revistaonline.repositorio.UsuarioRepositorio;

@Component
public class UsuarioDAO extends GenericDAO<Usuario> implements UsuarioRepositorio {
	public UsuarioDAO(Session session) {
		super(Usuario.class, session);
	}
}
