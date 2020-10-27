package com.alura.springmvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alura.springmvc.mudi.dataTransferObjects.RequisicaoNovoPedido;
import com.alura.springmvc.mudi.model.Pedido;
import com.alura.springmvc.mudi.repository.PedidoRepository;

@Controller @RequestMapping("pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "pedidos/formulario";
	}
	
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		
		if(result.hasErrors()) return "pedidos/formulario";
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		return "redirect:/home";
	}
}
