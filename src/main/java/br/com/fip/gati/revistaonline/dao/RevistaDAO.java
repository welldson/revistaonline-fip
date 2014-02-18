package br.com.fip.gati.revistaonline.dao;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.fip.gati.revistaonline.domain.model.Revista;
import br.com.fip.gati.revistaonline.domain.model.Usuario;
import br.com.fip.gati.revistaonline.repositorio.RevistaRepositorio;
import br.com.fip.gati.revistaonline.repositorio.UsuarioRepositorio;

@Component
public class RevistaDAO extends GenericDAO<Revista> implements RevistaRepositorio {
	public RevistaDAO(Session session) {
		super(Revista.class, session);
	}

	public Revista getRevista(String nome) {
		
		return null;
	}

	

}