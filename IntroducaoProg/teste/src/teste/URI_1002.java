package teste;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double N = 3.14159;
		
		double raio = teclado.nextDouble();
		double area = N*(raio * raio);
		
		Format formatador = new DecimalFormat("0.0000");

		System.out.println("A=" + formatador.format(area));
		
		teclado.close();
	}

}
