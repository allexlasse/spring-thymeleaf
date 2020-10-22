package com.alura.springmvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private BigDecimal valor;
	private LocalDate data;
	private String urlProd;
	private String urlImg;
	private String descricao;
	
	
	public Pedido() {}
	
	public Pedido(String nome, BigDecimal valor, LocalDate data, String urlProd, String urlImg, String descricao) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.urlProd = urlProd;
		this.urlImg = urlImg;
		this.descricao = descricao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getUrlProd() {
		return urlProd;
	}
	public void setUrlProd(String urlProd) {
		this.urlProd = urlProd;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
