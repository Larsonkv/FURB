package Unidade4;

import java.util.Scanner;

public class Unidade4_14 {

	public static void main(String[] args) {
		
		// Escreva um algoritmoque obtém do usuário 3 valores inteiros representando as três cartas  deste 
		// usuário  em  uma  mão  de  jogo  de  truco  (1=  AS;  2=2;  3=3;  7=7; 11=Valete;  12=  Dama;  13=  Rei). 
		// O algoritmodeve  imprimir  na  tela  a  palavra “TRUCO” (se APENAS UMA das três cartas for AS,2 ou 3),
		// “SEIS” (se APENAS DUAS das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas forem AS, 2 ou 3). 
		// Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Números possíveis: 1, 2, 3, 7, 11, 12, 13!!!");
		System.out.println("Digite o número de uma Carta: ");
		int carta1 = teclado.nextInt();
		System.out.println("Digite o número de uma outra Carta: ");
		int carta2 = teclado.nextInt();
		System.out.println("Digite o número de uma outra Carta: ");
		int carta3 = teclado.nextInt();
	
		int contadorCartasBoas = 0;
		
		if(carta1 <= 3) {
			contadorCartasBoas += 1;
			if(carta2 <= 3) {
				contadorCartasBoas += 1;
				if(carta3 <= 3) {
					contadorCartasBoas += 1;
				}
			}
		}
		
		if(contadorCartasBoas == 1) {
			
			System.out.println("TRUCO");
		}
		else if(contadorCartasBoas == 2) {
			
			System.out.println("SEIS");
		}
		else if(contadorCartasBoas == 3) {
			
			System.out.println("NOVE");
		}
		
		teclado.close();
	}

}
