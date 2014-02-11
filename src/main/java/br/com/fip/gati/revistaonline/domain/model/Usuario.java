package br.com.fip.gati.revistaonline.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@javax.persistence.Entity(name="usuario")
public class Usuario extends Entity {

	@NotNull
	private Integer tentativasLogon;
	
	@NotNull
	@Size(min=11, max=14)
	@CPF
	private String cpf;
	
	@NotNull
	private Date dtaCadastro;
	
	private Date dtaUltimoAcesso;
	
	@NotNull
	@Email
	@Column(unique=true)
	private String email;
	
	private String senha;
	
	@NotNull
	@Size(min=5)
	private String nome;
	
	@NotNull
	private boolean alterarSenhaProximoAcesso;
	
	@NotNull
	@Size(min=3, max=20)
	@Column(unique=true)
	private String login;
	
	public Usuario() { }

	public void setTentativasLogon(Integer tentativasLogon) {
		this.tentativasLogon = tentativasLogon;
	}

	public Integer getTentativasLogon() {
		return tentativasLogon;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setDtaCadastro(Date dtaCadastro) {
		this.dtaCadastro = dtaCadastro;
	}

	public Date getDtaCadastro() {
		return dtaCadastro;
	}

	public void setDtaUltimoAcesso(Date dtaUltimoAcesso) {
		this.dtaUltimoAcesso = dtaUltimoAcesso;
	}

	public Date getDtaUltimoAcesso() {
		return dtaUltimoAcesso;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setAlterarSenhaProximoAcesso(boolean alterarSenhaProximoAcesso) {
		this.alterarSenhaProximoAcesso = alterarSenhaProximoAcesso;
	}

	public boolean isAlterarSenhaProximoAcesso() {
		return alterarSenhaProximoAcesso;	
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	
}
