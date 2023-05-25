package br.com.unicuritiba;

import java.util.Scanner;

public class CalculoTotalCompra {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor total da compra: ");
		double total = scan.nextDouble();
		System.out.println("Informe o procedimento da compra de acordo com a tabela: ");
		System.out.println("1 - Pagamento à vista;\n2 - Pagamento 30 dias;\n3 - Pagamento 60 dias;\n4 - Pagamento 90 dias.");
		int procedimento = scan.nextInt();
		
		while(true) {
			if(procedimento > 4 || procedimento < 1) {
				System.out.println("Procedimento inválido! Insira um valor entre 1 e 4: ");
				procedimento = scan.nextInt();
			} else {
				break;
			}
		}
		
		metodoCompra(total, procedimento);
	}
	
	public static void metodoCompra(double total, int procedimento) {
		if(procedimento == 1) {
			total = (total * 0.9);
		} else if(procedimento == 2) {
			total = (total * 0.95);
		} else if(procedimento == 4) {
			total = (total * 1.05);
		}
		System.out.println("O valor a ser pago pela compra é de R$"+total);
	}
	
	
}
