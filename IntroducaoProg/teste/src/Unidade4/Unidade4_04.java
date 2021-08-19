package Unidade4;

import java.util.Scanner;

public class Unidade4_04 {

	public static void main(String[] args) {
		
		//Dado um número de ponto flutuantemaior do que 0, informe se foram digitadas ou não casas decimais no número.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número Flutuante ou Inteiro: ");
		double num = teclado.nextDouble();
		
		double resto = num - Math.floor(num);

		if (resto != 0f){
		  System.out.println("O número tem casas após a vírgula!");
		}else {
			System.out.println("O número não tem casas após a vírgula!");
		}
		
		teclado.close();
	}
}
