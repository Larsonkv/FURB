package Unidade4;

import java.util.Scanner;

public class Unidade4_13 {

	public static void main(String[] args) {
		// Dados 3 valores x, y, z, descreva um algoritmo que verifique se os mesmos podem 
		// ser  os  comprimentos  dos  lados  de  um  tri�ngulo.  Em  caso  afirmativo, verifique
		// e informe se � �tri�ngulo equil�tero�, �tri�ngulo is�sceles� ou �tri�ngulo escaleno�. Em caso negativo, 
		// informe que os mesmos n�o formam um tri�ngulo. Considere que:
		
		// A: o  comprimento  de  cada  lado  de  um  tri�ngulo  �  menor  que  a  soma  dos comprimentos dos outros lados
		// B: um tri�ngulo equil�tero tem tr�s lados iguais
		// C: um tri�ngulo is�sceles tem dois lados iguais e um diferenteum tri�ngulo escaleno tem tr�s lados diferentes
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero A: ");
		int A = teclado.nextInt();
		System.out.println("Digite o n�mero B: ");
		int B = teclado.nextInt();
		System.out.println("Digite o n�mero C: ");
		int C = teclado.nextInt();
		
		if(A<(B+C) && B<(A+C) && C<(A+B)) {
			if(A==B && B==C) {
				
				System.out.println("� um tri�ngulo equil�tero");
			}else if(A == B || B == C || A==C) {
				
				System.out.println("� um tri�ngulo is�sceles");
			}else {
			
				System.out.println("� um tri�ngulo escaleno");
			}
			
		}else {
			
			System.out.println("Os n�meros n�o formam um tri�ngulo");
		}
		
		teclado.close();
	}
}
