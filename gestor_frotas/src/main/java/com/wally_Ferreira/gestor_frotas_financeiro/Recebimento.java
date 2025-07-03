package com.wally_Ferreira.gestor_frotas_financeiro;

import java.util.Date;

import com.wally_Ferreira.gestor_frotas_entidades.Cliente;

public class Recebimento {
	private String descricao;
	private double valor;
	private Date data;
	private Cliente cliente;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
