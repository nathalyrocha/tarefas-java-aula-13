package tarefaRequisitosParaDirigir;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// 7 - Crie um programa que verifique se a pessoa tem todos os requisitos para dirigir.
		
		Scanner req = new Scanner (System.in);
		
		System.out.println("Você é maior de idade? (S ou N)");
		String idade = req.nextLine().toUpperCase();
		
		System.out.println("Possui habilitação? (S ou N)");
		String habilitado = req.nextLine().toUpperCase();
		
		System.out.println("Ingeriu alguma bebida alcóolica? (S ou N)");
		String alcool = req.nextLine().toUpperCase();
		
		System.out.println("Está com os exames de vista em dia? (S ou N)");
		String exames = req.nextLine().toUpperCase();
		
		if((idade.equals("S")) && (habilitado.equals("S")) && (alcool.equals("N")) && (exames.equals("S"))) {
			System.out.println("Parabéns, vc tem todos os requisitos válidos para digirir!");
		} else {
			System.out.println("Ops' não foi dessa vez, reavalie os requisitos para dirigir e veja se você se encaixa neles!");
		}
		
		
		req.close();
	}

}
