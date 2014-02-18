package br.com.fip.gati.revistaonline.domain.model;



import javax.validation.constraints.NotNull;




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
	private Long issn;
	
	
	@NotNull
	private Long eissn;
	
	
	
	public Long getIssn() {
		return issn;
	}
	public void setIssn(Long issn) {
		this.issn = issn;
	}
	public Long getEissn() {
		return eissn;
	}
	public void setEissn(Long eissn) {
		this.eissn = eissn;
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
