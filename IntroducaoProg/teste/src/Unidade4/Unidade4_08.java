package Unidade4;

import java.util.Scanner;

public class Unidade4_08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Dado um ano, informar se o mesmo � bissexto.
		
		System.out.println("Digite um ano: ");
		int ano = teclado.nextInt();
		
		if(ano % 4 == 0) {
			
			System.out.println("O ano � bissexto");
			
		}else {
			
			System.out.println("O ano n�o � bissexto");
		}
		
		teclado.close();
	}

}
