package teste;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class URI_1005 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		// media = ((notaA * 3,5)+(notaB * 7,5))/11
		double MEDIA = ((A*3.5)+(B*7.5))/11; 
		Format formatador = new DecimalFormat("0.00000");

		System.out.println("MEDIA = " + formatador.format(MEDIA));

		teclado.close();
	}

}
