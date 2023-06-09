package br.com.unicuritiba.jokenpo;

import java.util.Random;
import java.util.Scanner;

import br.com.unicuritiba.jokenpo.model.Jogada;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao JokenPo!");
		System.out.println();
		
		Jogada[] jogadas = new Jogada[3];
		
		jogadas[0] = new Jogada("Pedra", 1);
		jogadas[1] = new Jogada("Papel", 2);
		jogadas[2] = new Jogada("Tesoura", 3);

		System.out.println("Digite a jogada que deseja: ");
		System.out.println();
		System.out.println("1 - Pedra\n2 - Papel\n3 - Tesoura" );
		
		int jogadorJogadaPosicao = scan.nextInt();
		int computadorJogadaPosicao = new Random().nextInt(3);
		
		Jogada jogadaComputador = jogadas[computadorJogadaPosicao];
		
		checkWinner(jogadorJogadaPosicao, jogadaComputador);
	}
	
	public static void checkWinner(int jogadorJogadaPosicao, Jogada jogadaComputador) {
		if(jogadorJogadaPosicao == jogadaComputador.getValor()) {
			System.out.println("O jogo empatou!!"); //empate
		} else if(jogadorJogadaPosicao != 3) {
			if(jogadorJogadaPosicao > jogadaComputador.getValor()) {
				System.out.println("Parab�ns, voc� ganhou!!"); //jogador ganhou (pedra - papel)
			} else if(jogadaComputador.getValor() == 3) {
				if(jogadorJogadaPosicao == 1) {
					System.out.println("Parab�ns, voc� ganhou!"); //jogador ganhou (tesoura - pedra)
				} else {
					System.out.println("O computador ganhou!"); //computador ganhou (tesoura - papel)
				}
			} else {
				System.out.println("O computador ganhou!"); //computador ganhou (papel - pedra)
			}
		} else {
			if(jogadaComputador.getValor() == 1) {
				System.out.println("O computador ganhou!"); //computador ganhou (pedra - tesoura)
			} else {
				System.out.println("Parab�ns, voc� ganhou!!"); //jogador ganhou (papel - tesoura)
			}
		}
	}
}
