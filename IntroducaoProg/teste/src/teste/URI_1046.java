package teste;

import java.util.Scanner;

public class URI_1046 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int inicio, fim, duracao;
		
		inicio = teclado.nextInt();
		fim = teclado.nextInt();

		if (inicio == fim) {
			
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (inicio > fim) {
			
			duracao = (24 - inicio) + fim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else if (inicio < fim) {
			
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

	teclado.close();
	}
}
