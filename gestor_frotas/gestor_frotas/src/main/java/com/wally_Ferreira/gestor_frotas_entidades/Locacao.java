package com.wally_Ferreira.gestor_frotas_entidades;

import java.util.Date;

public class Locacao {
	private Cliente cliente;
	private Veiculo veiculo;
	private Funcionario atendente;
	private Date dataInicio;
	private Date dataFim;
	private double valorDiaria;
	private double valorTotal;
	private boolean ativo;
	private Vistoria vistoriaRetirada;
	private Vistoria vistoriaDevolucao;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Funcionario getAtendente() {
		return atendente;
	}

	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Vistoria getVistoriaRetirada() {
		return vistoriaRetirada;
	}

	public void setVistoriaRetirada(Vistoria vistoriaRetirada) {
		this.vistoriaRetirada = vistoriaRetirada;
	}

	public Vistoria getVistoriaDevolucao() {
		return vistoriaDevolucao;
	}

	public void setVistoriaDevolucao(Vistoria vistoriaDevolucao) {
		this.vistoriaDevolucao = vistoriaDevolucao;
	}

	public double calcularValorTotal() {
		if(dataInicio == null || dataFim == null) return 0.0;
			long dias = (dataFim.getTime() - dataInicio.getTime()) / (1000 * 60 * 60 * 24);
			
			if(dias <= 0) dias = 1;
			valorTotal = dias * valorDiaria;
			return valorTotal;
	}
	
	public void encerrarLocacao() {
		this.ativo = false;
		this.valorTotal = calcularValorTotal();
	}
	
}
