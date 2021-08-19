package Unidade4;

import java.util.Scanner;

public class Unidade4_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Um  casal  possui  três  filhos:  Marquinhos,  Zezinho  e  Luluzinha.  
		// Faça  um  algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.
		
		System.out.println("Digite a idade de Marquinhos: ");
		int idadeMarquinhos = teclado.nextInt();
		System.out.println("Digite a idade de Zezinho: ");
		int idadeZezinho = teclado.nextInt();
		System.out.println("Digite a idade de Luluzinha: ");
		int idadeLuluzinha = teclado.nextInt();
		
		
		if(idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
			
			System.out.println("Marquinhos é o calçula!");
			
		}else {
			
			if(idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
				
				System.out.println("Zezinho é o calçula!");
			}else {
				
				System.out.println("Luluzinha é a calçula!");
			}
		}		
		
		teclado.close();
	}

}
