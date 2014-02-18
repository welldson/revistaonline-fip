package br.com.fip.gati.revistaonline.domain.model;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@javax.persistence.Entity(name="revista")
public class Revista extends Entity{
	
	@NotNull
	
	private String nomeRevista;
	
	@NotNull
	
	private String areaDeAtuacao;
	
	@NotNull
	
	private String descricao;
	
	@NotNull
	
	private int edicao;
	
	
	@NotNull
	
	private Long ISSN;
	
	
	@NotNull
	
	private Long eISSN;
	
	
	public Long getISSN() {
		return ISSN;
	}
	public void setISSN(Long iSSN) {
		ISSN = iSSN;
	}
	public Long geteISSN() {
		return eISSN;
	}
	public void seteISSN(Long eISSN) {
		this.eISSN = eISSN;
	}
	public String getNomeRevista() {
		return nomeRevista;
	}
	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}
	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}
	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	
	
	
}
