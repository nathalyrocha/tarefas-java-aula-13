package tarefaIdade;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	// 5 - Crie um programa que receba um input do teclado com uma idade e retorne se é maior ou menor de idade.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int numero = input.nextInt();
		
		if(numero > 18) {
			System.out.println("É maior de idade!");
		} else {
			System.out.println("É menor de idade!");
		}
		
		input.close();
	}
	
}
