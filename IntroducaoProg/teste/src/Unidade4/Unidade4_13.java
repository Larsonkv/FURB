package Unidade4;

import java.util.Scanner;

public class Unidade4_13 {

	public static void main(String[] args) {
		// Dados 3 valores x, y, z, descreva um algoritmo que verifique se os mesmos podem 
		// ser  os  comprimentos  dos  lados  de  um  triângulo.  Em  caso  afirmativo, verifique
		// e informe se é ‘triângulo equilátero’, ‘triângulo isósceles’ ou ‘triângulo escaleno’. Em caso negativo, 
		// informe que os mesmos não formam um triângulo. Considere que:
		
		// A: o  comprimento  de  cada  lado  de  um  triângulo  é  menor  que  a  soma  dos comprimentos dos outros lados
		// B: um triângulo equilátero tem três lados iguais
		// C: um triângulo isósceles tem dois lados iguais e um diferenteum triângulo escaleno tem três lados diferentes
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		int A = teclado.nextInt();
		System.out.println("Digite o número B: ");
		int B = teclado.nextInt();
		System.out.println("Digite o número C: ");
		int C = teclado.nextInt();
		
		if(A<(B+C) && B<(A+C) && C<(A+B)) {
			if(A==B && B==C) {
				
				System.out.println("É um triângulo equilátero");
			}else if(A == B || B == C || A==C) {
				
				System.out.println("É um triângulo isósceles");
			}else {
			
				System.out.println("É um triângulo escaleno");
			}
			
		}else {
			
			System.out.println("Os números não formam um triângulo");
		}
		
		teclado.close();
	}
}
