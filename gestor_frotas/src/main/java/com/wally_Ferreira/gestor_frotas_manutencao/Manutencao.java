package com.wally_Ferreira.gestor_frotas_manutencao;

import java.util.Date;

public class Manutencao {
	public Date data;
	public String descicao;
	public double custo;
	public TipoManutencao tipoManutencao;
	public TipoManutencao getTipoManutencao() {
		return tipoManutencao;
	}
	public void setTipoManutencao(TipoManutencao tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}
	
	

}
