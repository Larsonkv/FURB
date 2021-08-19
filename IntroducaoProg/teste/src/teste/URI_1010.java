package teste;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		@SuppressWarnings("unused")
		int CODIGO1, PECAS1;
		@SuppressWarnings("unused")
		int CODIGO2, PECAS2;
		double VALOR1, VALOR2, VALOR;

		CODIGO1 = teclado.nextInt();
		PECAS1 = teclado.nextInt();
		VALOR1 = teclado.nextDouble();
		CODIGO2 = teclado.nextInt();
		PECAS2 = teclado.nextInt();
		VALOR2 = teclado.nextDouble();
		
		VALOR = PECAS1 * VALOR1 + PECAS2 * VALOR2;

		System.out.println("VALOR A PAGAR: R$ " + df.format(VALOR));
		
		teclado.close();
	}

}
