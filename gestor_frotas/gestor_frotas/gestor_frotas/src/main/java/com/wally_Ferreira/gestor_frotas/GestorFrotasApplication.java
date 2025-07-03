package com.wally_Ferreira.gestor_frotas;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wally_Ferreira.gestor_frotas_entidades.Cliente;
import com.wally_Ferreira.gestor_frotas_entidades.Funcionario;
import com.wally_Ferreira.gestor_frotas_entidades.Veiculo;

@SpringBootApplication
public class GestorFrotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorFrotasApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Veiculo veiculo = new Veiculo();
		
		
		//Cadastrar cliente
		System.out.println(" Cadastro do Cliente");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		cliente.setNome(nomeCliente);
		System.out.print("CPF: ");
		String cpfCliente = sc.nextLine();
		cliente.setCpf(cpfCliente);
		System.out.print("Telefone: ");
		String telefoneCliente = sc.nextLine();
		cliente.setTelefone(telefoneCliente);
		System.out.print("E-mail: ");
		String emailCliente = sc.nextLine();
		cliente.setEmail(emailCliente);
		
		
		
		//Cadastrar funcionario
		System.out.println("Cadastrar Funcionario");
		System.out.print("Nome: ");
		String nomeFuncionario = sc.nextLine();
		funcionario.setNome(nomeFuncionario);
		System.out.print("Cargo: ");
		String cargoFuncionario = sc.nextLine();
		funcionario.setCargo(cargoFuncionario);
		System.out.print("Departamento: ");
		String departamentoFuncionario = sc.nextLine();
		funcionario.setDepartamento(departamentoFuncionario);
		System.out.print("Matrícula: ");
		String matriculaFuncionario = sc.nextLine();
		funcionario.setMatricula(matriculaFuncionario);
		
		
		//Cadastro do veículo
		System.out.println("Cadastro do veículo");
		System.out.print("Placa: ");
		String placa = sc.nextLine();
		veiculo.setPlaca(placa);
		System.out.print("Renavam: ");
		String renavam = sc.nextLine();
		veiculo.setRenavam(renavam);
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		veiculo.setModelo(modelo);
		System.out.print("Marca: ");
		String marca = sc.nextLine();
		veiculo.setMarca(marca);
		System.out.print("Ano: ");
		int anoCarro = sc.nextInt();
		veiculo.setAno(anoCarro);
		System.out.print("Cor: ");
		String corCarro = sc.nextLine();
		veiculo.setCor(corCarro);
		System.out.print("Quilometragem: ");
		double quilometragemCarro = sc.nextDouble();
		veiculo.setQuilometragem(quilometragemCarro);
		System.out.println(veiculo);
		
		sc.close();
	}

}