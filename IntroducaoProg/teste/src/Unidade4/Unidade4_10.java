package Unidade4;

import java.util.Scanner;

public class Unidade4_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Dados dois valores inteiros, escreva um algoritmo que informe se eles s�o m�ltiplos ou n�o.
		
		System.out.println("Digite um n�mero: ");
		int num1 = teclado.nextInt();
		System.out.println("Digite outro n�mero: ");
		int num2 = teclado.nextInt();
		
		if(num1 % num2 == 0) {
			
			System.out.println("Os n�meros s�o m�ltiplos.");
			
		}else {
			
			System.out.println("Os n�meros n�o s�o m�ltiplos.");
		}
		teclado.close();
	}

}
