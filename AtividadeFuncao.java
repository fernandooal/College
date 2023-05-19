package br.com.unicuritiba;

import java.util.Scanner;

public class AtividadeFuncao {

	public static void main(String[] args) {
		
		//Exerc�cio:
		//Escreva um procedimento que recebe as 3 notas de um aluno por par�metro e uma letra.
		//Se a letra for A o procedimento calcula a m�dia aritm�tica das notas do aluno, se for P, a sua m�dia ponderada (pesos: 5, 3 e 2) e se for H, a sua m�dia harm�nica. 
		//A m�dia calculada tamb�m deve retornar por par�metro.

		
		Scanner scan = new Scanner(System.in);
		
		double nota[] = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe a " + (1 + i) + "� nota do aluno: ");
			nota[i] = scan.nextDouble();
		}
		
		System.out.println("Informe o procedimento do c�lculo da m�dia (A, P ou H): ");
		String letra = scan.next();
		
		nota(nota, letra);
		
	}
	
	public static void nota(double nota[], String letra) {
		
		double media = 0;
		
		if(letra.equals("A")) {
			for(int i = 0; i < 3; i++) {
				media += nota[i];
			}
			System.out.println("A m�dia �: " + media/3);
		} else if(letra.equals("P")) {
			media = ((nota[0] * 5) + (nota[1] * 3) + (nota[2] * 2)/10);
			System.out.println("A m�dia �: " + media);
		} else if(letra.equals("H")) {
			media = ((1/nota[0] + 1/nota[1] + 1/nota[2])/3);
			System.out.println("A m�dia �: " + (1 + media));
		}
	}
}
