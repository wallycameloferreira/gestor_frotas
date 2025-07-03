package com.wally_Ferreira.gestor_frotas_entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private List<Locacao> historicoLocacoes = new ArrayList<>();
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHistoricoLocacoes(List<Locacao> historicoLocacoes) {
		this.historicoLocacoes = historicoLocacoes;
	}

	public void adiconarLocacao(Locacao addLocacao) {
		historicoLocacoes.add(addLocacao);
	}

	public List<Locacao> getHistoricoLocacoes() {
		return historicoLocacoes;
	}

	
	

}
