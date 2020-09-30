package tarefaDiaDaSemana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    // 6 - Crie um programa que , dado um dia da semana, verifique se é final de semana.
		
		Scanner dia = new Scanner(System.in);
		
		System.out.println("Escreva um dia da semana (Ex: sábado).");
		String diaDaSemana = dia.nextLine();
		
		String resultado = diaDaSemana.toLowerCase();
		
		if((resultado.equals("domingo")) || (resultado.equals("sábado"))) {
			System.out.println("Uhul, é final de semana, dia de descanso!");
		} else {
			System.out.println("O final de semana ainda não chegou, então bora trabalhar!");
		}
		

		dia.close();
	}

}
