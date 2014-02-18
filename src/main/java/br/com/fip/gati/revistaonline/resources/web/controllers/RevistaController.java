package br.com.fip.gati.revistaonline.resources.web.controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.fip.gati.revistaonline.domain.model.Revista;

import br.com.fip.gati.revistaonline.repositorio.RevistaRepositorio;

@Resource
public class RevistaController {

	private RevistaRepositorio revistaRepositorio;
	private final Result result;

	public RevistaController(RevistaRepositorio revistaRep, Result result) {
		this.revistaRepositorio = revistaRep;
		this.result = result;

	}

	@Path("/cadastro/revista")
	public void formularioRevista() {

	}

	public void salvar(Revista revista) {

		this.revistaRepositorio.save(revista);

		result.redirectTo(this).formularioRevista();

	}

	public void atualizar(Revista revista) {
		this.revistaRepositorio.update(revista);
	}

	public Revista editar() {
		return null;
	}

	public void excluir(Revista revista) {
		revistaRepositorio.delete(revista);
	}

	public List<Revista> listar() {
		return revistaRepositorio.listAll();
	}

}