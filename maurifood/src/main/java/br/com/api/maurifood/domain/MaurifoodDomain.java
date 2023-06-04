package br.com.api.maurifood.domain;

public class MaurifoodDomain {

	private Long codigo;
	private String produto;
	private String valor;
	private Boolean isAtivo;

	public MaurifoodDomain() {

	}

	public MaurifoodDomain(Long codigo, String produto, String valor, Boolean isAtivo) {
		this.codigo = codigo;
		this.produto = produto;
		this.valor = valor;
		
		this.isAtivo = isAtivo;

	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

}