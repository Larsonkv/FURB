package Unidade4;

import java.util.Scanner;

public class Unidade4_02 {

	public static void main(String[] args) {
		
		//Dado um valor inteiro maior do que 0 informe se o valor � par ou �mpar.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero maior que zero: ");
		int num = teclado.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("O n�mero � Par");
			}
			else {
				System.out.println("O numero � Impar");
			}
		}
		else {
			System.out.println("Digite um n�mero maior que zero!!");
		}

		teclado.close();
	}
}
