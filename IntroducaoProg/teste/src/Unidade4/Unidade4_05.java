package Unidade4;

import java.util.Scanner;

public class Unidade4_05 {
 
	// Dada uma pergunta, �a cor � azul?�, 
	// fa�a um programa que leia uma vari�vel l�gica
	// com a resposta e responda �Sim�, caso a resposta seja true,
	// ou �N�o�, caso seja false.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("a cor � azul?");
		boolean Resposta = teclado.nextBoolean();
		
		if(Resposta == true) {
			System.out.println("Sim");
		}
		else {
			System.out.println("N�o");
		}
		
		teclado.close();
	}
}
