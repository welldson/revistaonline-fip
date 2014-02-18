package br.com.fip.gati.revistaonline.domain.model;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@javax.persistence.Entity(name="revista")
public class Revista extends Entity{
	
	@NotNull
	@Size(min=5)
	private String nomeRevista;
	
	@NotNull
	@Size(min=5)
	private String areaDeAtuacao;
	
	@NotNull
	@Size(min=5)
	private String descricao;
	
	@NotNull
	@Size(min=5)
	private int edicao;
	
	
	@NotNull
	@Size(min=5)
	private long ISSN;
	
	
	@NotNull
	@Size(min=5)
	private long eISSN;
	
	public long getISSN() {
		return ISSN;
	}
	public void setISSN(long iSSN) {
		ISSN = iSSN;
	}
	public long geteISSN() {
		return eISSN;
	}
	public void seteISSN(long eISSN) {
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
