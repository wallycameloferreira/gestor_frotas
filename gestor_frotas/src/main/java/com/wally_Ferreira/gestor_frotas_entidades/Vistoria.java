package com.wally_Ferreira.gestor_frotas_entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vistoria {
	private Date data;
	private Funcionario responsavel;
	private String observacoes;
	private List<String> fotos;
	
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public List<String> getFotos() {
		return fotos;
	}
	public void setFotos(List<String> fotos) {
		this.fotos = fotos;
	}
	public Vistoria(Date data, Funcionario responsavel, String observacoes) {
		this.data = data;
		this.responsavel = responsavel;
		this.observacoes = observacoes;
		this.fotos = new ArrayList<>();
	}
	public void adicionarFoto(String url) {
		fotos.add(url);
	}

}
