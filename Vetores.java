package br.com.unicuritiba;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nums[] = new int[10];
		int nums5[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um número: ");
			nums[i] = scan.nextInt();
			nums5[i] = (nums[i] * 5);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i] + " - " + nums5[i]);
		}
	}
}
