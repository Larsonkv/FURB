package Unidade4;

import java.util.Scanner;

public class Unidade4_06 {

	public static void main(String[] args) {
		
			// Faça um algoritmo que leia um caractere. Caso seja digitada a letra ‘M’ escreva “Masculino”.
			// Se for digitada a letra 'F' escreva “Feminino”. Se for informado  'I' escreva “Não Informado”.
			// Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula. 
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = teclado.next();
		String letraMaiuscula = letra.toUpperCase();

		if (letraMaiuscula.contentEquals("M")) {

			System.out.println("Masculino");
			System.exit(0);
		}else {
			
			if (letraMaiuscula.contentEquals("F")) {

				System.out.println("Feminino");
				System.exit(0);

			}else {
				
				if (letraMaiuscula.contentEquals("I")) {

					System.out.println("Não Informado");
					System.exit(0);

				} else {

					System.out.println("Entrada Incorreta");
				}
			}
		}
		teclado.close();
	}
}
