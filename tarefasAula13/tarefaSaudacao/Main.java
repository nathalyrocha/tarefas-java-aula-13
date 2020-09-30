package tarefaSaudacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    // 4 - Crie um programa que receba um nome e imprima uma saudação.
		
		Scanner saudacao = new Scanner(System.in);
		System.out.println("Digite seu nome");
		
		String nome = saudacao.nextLine();
		
		System.out.println("Olá " + nome + "," + " seja bem vindo(a)!");

		
		saudacao.close();
	}

}
