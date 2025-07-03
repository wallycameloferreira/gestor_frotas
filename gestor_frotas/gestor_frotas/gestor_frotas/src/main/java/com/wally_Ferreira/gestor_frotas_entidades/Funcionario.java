package com.wally_Ferreira.gestor_frotas_entidades;

public class Funcionario {
	private String nome;
	private String cargo;
	private String departamento;
	private String matricula;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public String getDepartamento() {
		return nome + cargo + matricula + departamento;
	}
	
	
	

}
