package br.com.unicuritiba;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		float salario = scan.nextFloat();
		System.out.println("Informe o departamento: ");
		char letra = scan.next().charAt(0);
		
		letra = Character.toUpperCase(letra);
		
		while(true) {
			if(letra == 'A' || letra == 'I' || letra == 'O') {
				aumentoSalario(salario,letra);
				break;
			} else {
				System.out.println("Departamento inválido! Tente novamente utilizando A, I ou O: ");
				letra = scan.next().charAt(0);
				letra = Character.toUpperCase(letra);
			}
		}
	}
	
	public static void aumentoSalario(float salario, char letra) {
		
		if(letra == 'A') {
			salario = (salario*1.15f);
		} else if(letra == 'I') {
			salario = (salario*1.12f);
		} else {
			salario = (salario*(1.10f));
		}
		System.out.println("O novo salário é: " + salario);
	}
}
