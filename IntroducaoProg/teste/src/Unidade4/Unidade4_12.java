package Unidade4;

import java.util.Scanner;

public class Unidade4_12 {

	public static void main(String[] args) {
		// Escreva  um  algoritmo  para  ler  o  ano  de  nascimento  de  3  irmãos, 
		// escrever  uma mensagem  que  indique  se  eles  são  TRIGÊMEOS,
		// GÊMEOS,  APENAS  IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade
		// e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento do primeiro irmão: ");
		int anoPrimeiro = teclado.nextInt();
		System.out.println("Digite o ano de nascimento do segundo irmão: ");
		int anoSegundo = teclado.nextInt();
		System.out.println("Digite o ano de nascimento do terceiro irmão: ");
		int anoTerceiro = teclado.nextInt();
		
		if(anoPrimeiro == anoSegundo && anoSegundo == anoTerceiro) {
			
			System.out.println("Os irmãos são Trigêmeos!");
		}else {
			if(anoPrimeiro == anoSegundo || anoPrimeiro == anoTerceiro || anoSegundo == anoTerceiro) {
				
				System.out.println("Os irmãos são Gêmeos!");
			}else {
				
				System.out.println("Apenas Irmãos!");
			}
		}
		
		teclado.close();
	}

}
