package teste;

import java.util.Scanner;

public class numeroVinte {
	
	public static void main(String[] args) {
		
		int dobras;
		double quadrados1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o número de dobras: ");
		dobras = teclado.nextInt();
		
		quadrados1 = Math.pow(2, dobras);
		//quadrados1 = 2*Math.pow(2,dobras-1);
		
		System.out.println("Dobras: " + dobras + " Quadrados:" + (int)quadrados1);
		
		teclado.close();
	}

}
