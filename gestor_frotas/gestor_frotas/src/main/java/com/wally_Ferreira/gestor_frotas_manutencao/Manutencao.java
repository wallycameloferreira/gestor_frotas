package com.wally_Ferreira.gestor_frotas_manutencao;

import java.util.Date;

public class Manutencao {
	private Date data;
	private String descicao;
	private double custo;
	private TipoManutencao tipoManutencao;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescicao() {
		return descicao;
	}
	public void setDescicao(String descicao) {
		this.descicao = descicao;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public TipoManutencao getTipoManutencao() {
		return tipoManutencao;
	}
	public void setTipoManutencao(TipoManutencao tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}
	
	
	
	

}
