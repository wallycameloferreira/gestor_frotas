package com.wally_Ferreira.gestor_frotas_entidades;

import java.util.ArrayList;
import java.util.List;

import com.wally_Ferreira.gestor_frotas_manutencao.Manutencao;
import com.wally_Ferreira.gestor_frotas_manutencao.Sinistro;

public class Veiculo {
	private String placa;
	private String renavam;
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	private double quilometragem;
	private StatusVeiculo statusVeiculo;
	private List<Manutencao> manutencoes = new ArrayList<>();
	private List<Sinistro> sinistro = new ArrayList<>();
	
	
	
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public StatusVeiculo getStatusVeiculo() {
		return statusVeiculo;
	}

	public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
		this.statusVeiculo = statusVeiculo;
	}

	public List<Manutencao> getManutencoes() {
		return manutencoes;
	}

	public void setManutencoes(List<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}

	public List<Sinistro> getSinistro() {
		return sinistro;
	}

	public void setSinistro(List<Sinistro> sinistro) {
		this.sinistro = sinistro;
	}

	public void adicionarManutencao(Manutencao realizarManutencao) {
		manutencoes.add(realizarManutencao);
	}
	
	public void adicionarSinistro(Sinistro addSinistro) {
		sinistro.add(addSinistro);
	}
	
	
	
	
	

}
