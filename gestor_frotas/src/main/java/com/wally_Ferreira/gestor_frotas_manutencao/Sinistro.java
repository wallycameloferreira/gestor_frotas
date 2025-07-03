package com.wally_Ferreira.gestor_frotas_manutencao;

import java.util.Date;

import com.wally_Ferreira.gestor_frotas_entidades.Cliente;
import com.wally_Ferreira.gestor_frotas_entidades.StatusVeiculo;
import com.wally_Ferreira.gestor_frotas_entidades.Veiculo;

public class Sinistro {
	private Date data;
	private Cliente condutor;
	private boolean envolveuTerceiro;
	private double custoEstimado;
	private boolean acionarSeguro;
	private Veiculo veiculo;
	private StatusVeiculo statusVeiculo;
	private StatusSinistro status;
	
	
	
	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public Cliente getCondutor() {
		return condutor;
	}



	public void setCondutor(Cliente condutor) {
		this.condutor = condutor;
	}



	public boolean isEnvolveuTerceiro() {
		return envolveuTerceiro;
	}



	public void setEnvolveuTerceiro(boolean envolveuTerceiro) {
		this.envolveuTerceiro = envolveuTerceiro;
	}



	public double getCustoEstimado() {
		return custoEstimado;
	}



	public void setCustoEstimado(double custoEstimado) {
		this.custoEstimado = custoEstimado;
	}



	public boolean isAcionarSeguro() {
		return acionarSeguro;
	}



	public void setAcionarSeguro(boolean acionarSeguro) {
		this.acionarSeguro = acionarSeguro;
	}



	public Veiculo getVeiculo() {
		return veiculo;
	}



	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}



	public StatusVeiculo getStatusVeiculo() {
		return statusVeiculo;
	}



	public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
		this.statusVeiculo = statusVeiculo;
	}



	public StatusSinistro getStatus() {
		return status;
	}



	public void setStatus(StatusSinistro status) {
		this.status = status;
	}



	public void atualizarStatus(StatusSinistro atualStatus) {
		this.status = atualStatus;
	}

}
