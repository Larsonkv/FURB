package Unidade4;

import java.util.Scanner;

public class Unidade4_03 {

	public static void main(String[] args) {
		
		//Dados  dois  n�meros  inteiros  descreva  um  algoritmo  para  informar  o  maior  valor entre eles.
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva dois n�meros: ");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		
		if(num1>num2){
			int numeroMaior = num1-1;
			System.out.println("Maior n�mero �: "+numeroMaior);
		}else {
			int numeroMaior = num2-1;
			System.out.println("Maior n�mero �: "+numeroMaior);
		}
		
		teclado.close();
	}

}
