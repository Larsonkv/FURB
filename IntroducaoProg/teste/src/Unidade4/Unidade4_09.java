package Unidade4;

import java.util.Scanner;

public class Unidade4_09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		//Dado uma letra, escreva um algoritmo que informe se ela � ou n�o uma vogal.
		
		System.out.println("Escreva uma letra: ");
		String letra = teclado.next();
		String letraMaiuscula = letra.toUpperCase();
		
		if(letraMaiuscula.contains("A") || letraMaiuscula.contains("E") ||
		letraMaiuscula.contains("I") || letraMaiuscula.contains("O") || letraMaiuscula.contains("U")) {
			
			System.out.println("A letra � uma vogal!");
			
		}else {
			
			System.out.println("A letra n�o � uma vogal!");
		}
		
		teclado.close();
	}
}
