package teste;

import java.util.Scanner;

public class URI_1004 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valorA = teclado.nextInt();
		int valorB = teclado.nextInt();
		int PROD = valorA * valorB;
		
		System.out.println("PROD = "+PROD);
		
		teclado.close();

	}

}
