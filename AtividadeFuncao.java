package br.com.unicuritiba;

import java.util.Scanner;

public class AtividadeFuncao {

	public static void main(String[] args) {
		
		//Exercício:
		//Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra.
		//Se a letra for A o procedimento calcula a média aritmética das notas do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2) e se for H, a sua média harmônica. 
		//A média calculada também deve retornar por parâmetro.

		
		Scanner scan = new Scanner(System.in);
		
		double nota[] = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe a " + (1 + i) + "º nota do aluno: ");
			nota[i] = scan.nextDouble();
		}
		
		System.out.println("Informe o procedimento do cálculo da média (A, P ou H): ");
		String letra = scan.next();
		
		nota(nota, letra);
		
	}
	
	public static void nota(double nota[], String letra) {
		
		double media = 0;
		
		if(letra.equals("A")) {
			for(int i = 0; i < 3; i++) {
				media += nota[i];
			}
			System.out.println("A média é: " + media/3);
		} else if(letra.equals("P")) {
			media = ((nota[0] * 5) + (nota[1] * 3) + (nota[2] * 2)/10);
			System.out.println("A média é: " + media);
		} else if(letra.equals("H")) {
			media = ((1/nota[0] + 1/nota[1] + 1/nota[2])/3);
			System.out.println("A média é: " + (1 + media));
		}
	}
}
