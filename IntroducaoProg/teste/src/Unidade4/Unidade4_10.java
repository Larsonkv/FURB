package Unidade4;

import java.util.Scanner;

public class Unidade4_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
		
		System.out.println("Digite um número: ");
		int num1 = teclado.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = teclado.nextInt();
		
		if(num1 % num2 == 0) {
			
			System.out.println("Os números são múltiplos.");
			
		}else {
			
			System.out.println("Os números não são múltiplos.");
		}
		teclado.close();
	}

}
