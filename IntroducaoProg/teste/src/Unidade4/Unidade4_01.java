package Unidade4;

import java.util.Scanner;

public class Unidade4_01 {

	public static void main(String[] args) {
		
			// A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais de 40 horas receber� hora extra, 
			// cujo c�lculo � o valor da hora regular com  um  acr�scimo  de  50%.  Escreva  um  algoritmo  que  leia  o  n�mero  de
			// horas trabalhadas em um m�s, o valor por hora e escreva o sal�rio total do funcion�rio,
			// que dever� ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o m�s possua 4 semanas exatas)
		
		Scanner teclado = new Scanner(System.in);
		
		double salarioTotal = 0, salarioBase= 0, salarioExtra=0;
		int horasExtra=0;
		
		System.out.println("Digite as horas trabalhadas no m�s: ");
		int horasTrabalhadasNoMes = teclado.nextInt();
		System.out.println("Digite valor hora: ");
		double valorHora = teclado.nextInt();
		
		if(horasTrabalhadasNoMes > 160) {
			horasExtra = horasTrabalhadasNoMes - 160;
			salarioExtra = (horasExtra * (valorHora*1.5));
		}
		
		salarioBase = 160*valorHora;
		salarioTotal = salarioBase + salarioExtra;
		
		System.out.println("Seu sal�rio esse m�s � de: R$"+ salarioTotal);
		
		teclado.close();
	}

}
