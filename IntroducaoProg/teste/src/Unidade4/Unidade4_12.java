package Unidade4;

import java.util.Scanner;

public class Unidade4_12 {

	public static void main(String[] args) {
		// Escreva  um  algoritmo  para  ler  o  ano  de  nascimento  de  3  irm�os, 
		// escrever  uma mensagem  que  indique  se  eles  s�o  TRIG�MEOS,
		// G�MEOS,  APENAS  IRM�OS. Considere que eles s�o G�MEOS se dois deles possuem a mesma idade
		// e o outro diferente dos demais, e apenas irm�os se todas as idades forem diferentes.

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento do primeiro irm�o: ");
		int anoPrimeiro = teclado.nextInt();
		System.out.println("Digite o ano de nascimento do segundo irm�o: ");
		int anoSegundo = teclado.nextInt();
		System.out.println("Digite o ano de nascimento do terceiro irm�o: ");
		int anoTerceiro = teclado.nextInt();
		
		if(anoPrimeiro == anoSegundo && anoSegundo == anoTerceiro) {
			
			System.out.println("Os irm�os s�o Trig�meos!");
		}else {
			if(anoPrimeiro == anoSegundo || anoPrimeiro == anoTerceiro || anoSegundo == anoTerceiro) {
				
				System.out.println("Os irm�os s�o G�meos!");
			}else {
				
				System.out.println("Apenas Irm�os!");
			}
		}
		
		teclado.close();
	}

}
