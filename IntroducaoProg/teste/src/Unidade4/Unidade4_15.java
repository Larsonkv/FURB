package Unidade4;

import java.util.Scanner;

public class Unidade4_15 {

	public static void main(String[] args) {
		// Leia uma data e determine se ela � v�lida. Ou seja, verifique se o m�s est� entre 1 e  12, 
		// e  se  o  dia  existe  naquele  m�s.  Note  que  Fevereiro  tem  29  dias
		// em  anosbissextos, e 28 dias em anos n�o bissextos.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero do dia: ");
		int numDia = teclado.nextInt();
		System.out.println("Digite o n�mero do m�s: ");
		int numMes = teclado.nextInt();
		System.out.println("Digite o n�mero do ano: ");
		int numAno = teclado.nextInt();
		
		if(numMes >=1 && numMes <=12) {
			if(numDia >=1) {
				if(numMes ==2) {
					if(numAno % 4 == 0 && numAno % 100 == 1) {
						if(numDia >= 1 && numDia <= 29) {
							
							System.out.println("Data v�lida");
						}
					}
				}else {
					if(mes 1,3,6) {
						
					}
				}
				
				
			}
			else {
				
				System.out.println("Data Inv�lida");
			}
		}
		else {
			
			System.out.println("Data Inv�lida");
		}
		
		teclado.close();
	}
}
