package com.wally_Ferreira.gestor_frotas_manutencao;

import java.util.Date;

import com.wally_Ferreira.gestor_frotas_entidades.Cliente;
import com.wally_Ferreira.gestor_frotas_entidades.StatusVeiculo;
import com.wally_Ferreira.gestor_frotas_entidades.Veiculo;

public class Sinistro {
	public Date data;
	public Cliente condutor;
	public boolean envolveuTerceiro;
	public double custoEstimado;
	public boolean acionarSeguro;
	public Veiculo veiculo;
	public StatusVeiculo statusVeiculo;
	public StatusSinistro status;
	public void atualizarStatus(StatusSinistro atualStatus) {
		this.status = atualStatus;
	}

}
