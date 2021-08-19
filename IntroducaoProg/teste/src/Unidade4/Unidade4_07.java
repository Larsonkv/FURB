package Unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Unidade4_07 {

	public static void main(String[] args) {
		
			// O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um
			//	adicional de R$ 0,45 por cada 20 gramas, 
			// ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, 
			//	em gramas, determine o custo do selo.
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o peso da carta: ");
		double peso = teclado.nextDouble();
		
		if(peso <= 0.50) {
			
			System.out.println("Valor é de R$ 0,45.");
			System.exit(0);
		}else {
			if(peso > 0.50) {
				
				double pesoRestante = peso - 0.50;
				double valorRestante = 0.45 * (pesoRestante / 0.20);
				double valorFinal = valorRestante + 0.45;
				
				System.out.println("Valor é de R$ "+df.format(valorFinal)+".");
				}
		}
		
		teclado.close();
	}

}
