package Unidade4;

import java.util.Scanner;

public class Unidade4_01 {

	public static void main(String[] args) {
		
			// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, 
			// cujo cálculo é o valor da hora regular com  um  acréscimo  de  50%.  Escreva  um  algoritmo  que  leia  o  número  de
			// horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário,
			// que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)
		
		Scanner teclado = new Scanner(System.in);
		
		double salarioTotal = 0, salarioBase= 0, salarioExtra=0;
		int horasExtra=0;
		
		System.out.println("Digite as horas trabalhadas no mês: ");
		int horasTrabalhadasNoMes = teclado.nextInt();
		System.out.println("Digite valor hora: ");
		double valorHora = teclado.nextInt();
		
		if(horasTrabalhadasNoMes > 160) {
			horasExtra = horasTrabalhadasNoMes - 160;
			salarioExtra = (horasExtra * (valorHora*1.5));
		}
		
		salarioBase = 160*valorHora;
		salarioTotal = salarioBase + salarioExtra;
		
		System.out.println("Seu salário esse mês é de: R$"+ salarioTotal);
		
		teclado.close();
	}

}
