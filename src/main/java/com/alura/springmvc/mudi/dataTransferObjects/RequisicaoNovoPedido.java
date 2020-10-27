package com.alura.springmvc.mudi.dataTransferObjects;

import javax.validation.constraints.NotBlank;

import com.alura.springmvc.mudi.model.Pedido;
import com.alura.springmvc.mudi.model.enums.StatusPedido;

public class RequisicaoNovoPedido {

	//Para personalizar a mensagem de erro, pode-se usar tanto o message do NotBlank, como criar um arquivo messages.properties,
	//associando um novo valor às mensagens. Para alterar o default, basta colocar o NotBlank. Para alterar uma mensagem específica,
	//coloca-se a anotação, seguido do nome da classe, seguido do nome do atributo
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagem;
	
	//A descrição pode estar em branco
	private String  descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		return new Pedido(nomeProduto, urlProduto, urlImagem, descricao, StatusPedido.AGUARDANDO);
	}
	
	
}
