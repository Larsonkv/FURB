package teste;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numFuncionario = teclado.nextInt();
		int horas = teclado.nextInt();
		double valorHoras = teclado.nextDouble();
		double salario = horas * valorHoras;
		
		System.out.println("NUMBER = "+numFuncionario);
		Format F = new DecimalFormat("0.00");
		System.out.println("SALARY = U$ " + F.format(salario));
		
		teclado.close();
	}

}
