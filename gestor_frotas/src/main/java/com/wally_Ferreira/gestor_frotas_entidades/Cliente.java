package com.wally_Ferreira.gestor_frotas_entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String nome;
	public String cpf;
	public String telefone;
	public String email;
	public List<Locacao> historicoLocacoes = new ArrayList<>();
	
	public void adiconarLocacao(Locacao addLocacao) {
		historicoLocacoes.add(addLocacao);
	}

	public List<Locacao> getHistoricoLocacoes() {
		return historicoLocacoes;
	}

	
	

}
