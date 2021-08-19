package teste;

import java.util.Scanner;

public class URI_1007 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		int D = teclado.nextInt();
		int DIFERENCA = ((A * B) - (C * D));
		
		System.out.println("DIFERENCA = "+DIFERENCA);
		
		teclado.close();
	}

}
