package com.wally_Ferreira.gestor_frotas_entidades;

import java.util.ArrayList;
import java.util.List;

import com.wally_Ferreira.gestor_frotas_manutencao.Manutencao;
import com.wally_Ferreira.gestor_frotas_manutencao.Sinistro;

public class Veiculo {
	public String placa;
	public String renavam;
	public String modelo;
	public String marca;
	public int ano;
	public String cor;
	public double quilometragem;
	public StatusVeiculo statusVeiculo;
	public List<Manutencao> manutencoes = new ArrayList<>();
	public List<Sinistro> sinistro = new ArrayList<>();
	
	
	public StatusVeiculo getStatusVeiculo() {
		return statusVeiculo;
	}
	
	public void adicionarManutencao(Manutencao realizarManutencao) {
		manutencoes.add(realizarManutencao);
	}
	
	public void adicionarSinistro(Sinistro addSinistro) {
		sinistro.add(addSinistro);
	}
	
	
	
	
	

}
