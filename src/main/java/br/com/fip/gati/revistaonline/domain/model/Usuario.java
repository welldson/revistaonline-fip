package br.com.fip.gati.revistaonline.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@javax.persistence.Entity
@Table(name="usuario")
public class Usuario extends Entity {

	private Integer tentativasLogon;
	
	@NotNull(message="{usuario.cpf.nulo}")
	@Size(min=11, max=14, message="{usuario.cpf.tamanho}")
	@CPF(message="{usuario.cpf.invalido}")
	private String cpf;
	
	private String status;
	
	private Date dtaCadastro;
	
	private Date dtaUltimoAcesso;
	
	@NotNull(message="{usuario.email.nulo}")
	@Email(message="{usuario.email.invalido}")
	@Column(unique=true)
	private String email;
	
	@NotNull(message="{usuario.senha.nulo}")
	@Size(min=5, max=14, message="{usuario.senha.tamanho}")
	private String senha;
	
	@NotNull(message="{usuario.nome.nulo}")
	@Size(min=5, message="{usuario.nome.tamanho}")
	private String nome;
	
	private boolean alterarSenhaProximoAcesso;
	
	@NotNull(message="{usuario.login.nulo}")
	@Size(min=3, max=20, message="{usuario.login.tamanho}")
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
