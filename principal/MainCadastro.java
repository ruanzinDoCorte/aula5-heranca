package principal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class MainCadastro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<>();
		while(true) {
	
		System.out.println("Digite o nome: ");
		String nome = scn.next();
		
		System.out.println("Digite o numero: ");
		int numero = scn.nextInt();
		
		System.out.println("Digite o saldo: ");
		double saldo = scn.nextDouble();
		
		
		double limite = 0;
		Conta x = new ContaCorrente(nome, numero, saldo, limite);
		Conta y = new ContaPoupanca(numero, nome, saldo);
		
		
		System.out.println("Opções: ");
		System.out.println("1. Conta Corrente");
		System.out.println("2. Conta Poupança");
		System.out.println("3. Sair");
		System.out.println("Digite a opção desejada: ");
		int opcao = scn.nextInt();
		scn.nextLine();
		
		switch (opcao) {
		case 1: 
			System.out.println("Conta Corrente Criada!");
			
			
			break;
		case 2:
			System.out.println("Conta Poupança!");
		case 4:
			System.out.println("Saindo...");
			return;
			default: 
				System.out.println("Opção Inválida. Tente Novamente!");
				
		} 
		if(opcao == 1) {
			List<Conta> lista = new ArrayList<>();
			lista.add(y);
			System.out.println(lista);
			
			
		}
		else if(opcao ==2) {
		List<Conta> lista = new ArrayList<>();
		lista.add(x);
		System.out.println(lista);
		}
		}
		
		

	}

}
