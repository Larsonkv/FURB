package teste;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String nome = teclado.next();
		double salarioFixo = teclado.nextDouble();
		double valorVendas = teclado.nextDouble();
		double salarioFinal = salarioFixo +(valorVendas * 0.15);
		
		Format F = new DecimalFormat("0.00");
		System.out.println("TOTAL = R$ "+ F.format(salarioFinal));
		
		teclado.close();
	}

}
