package Unidade4;

import java.util.Scanner;

public class Unidade4_05 {
 
	// Dada uma pergunta, “a cor é azul?”, 
	// faça um programa que leia uma variável lógica
	// com a resposta e responda “Sim”, caso a resposta seja true,
	// ou “Não”, caso seja false.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("a cor é azul?");
		boolean Resposta = teclado.nextBoolean();
		
		if(Resposta == true) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não");
		}
		
		teclado.close();
	}
}
