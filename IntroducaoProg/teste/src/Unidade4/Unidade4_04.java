package Unidade4;

import java.util.Scanner;

public class Unidade4_04 {

	public static void main(String[] args) {
		
		//Dado um n�mero de ponto flutuantemaior do que 0, informe se foram digitadas ou n�o casas decimais no n�mero.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um n�mero Flutuante ou Inteiro: ");
		double num = teclado.nextDouble();
		
		double resto = num - Math.floor(num);

		if (resto != 0f){
		  System.out.println("O n�mero tem casas ap�s a v�rgula!");
		}else {
			System.out.println("O n�mero n�o tem casas ap�s a v�rgula!");
		}
		
		teclado.close();
	}
}
