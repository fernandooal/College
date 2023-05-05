package br.com.unicuritiba;

import java.util.Scanner;

public class VetoresNomes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomes[] = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um nome: ");
			nomes[i] = scan.next();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("--------");
		
		for(int i = 4; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
	}
}
