package Unidade4;

import java.util.Scanner;

public class Unidade4_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Um  casal  possui  tr�s  filhos:  Marquinhos,  Zezinho  e  Luluzinha.  
		// Fa�a  um  algoritmo para ler as idades dos filhos e exibir quem � o ca�ula da fam�lia; suponha que n�o haja empates.
		
		System.out.println("Digite a idade de Marquinhos: ");
		int idadeMarquinhos = teclado.nextInt();
		System.out.println("Digite a idade de Zezinho: ");
		int idadeZezinho = teclado.nextInt();
		System.out.println("Digite a idade de Luluzinha: ");
		int idadeLuluzinha = teclado.nextInt();
		
		
		if(idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
			
			System.out.println("Marquinhos � o cal�ula!");
			
		}else {
			
			if(idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
				
				System.out.println("Zezinho � o cal�ula!");
			}else {
				
				System.out.println("Luluzinha � a cal�ula!");
			}
		}		
		
		teclado.close();
	}

}
