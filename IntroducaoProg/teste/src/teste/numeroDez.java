package teste;

import java.util.Scanner;

public class numeroDez {

	public static void main(String[] args) {
		int entradaSegundos, hora, minuto, segundo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os segundos: ");
		entradaSegundos = teclado.nextInt();
		
		hora = entradaSegundos/3600;
		minuto = (entradaSegundos % 3600)/60;
		segundo = (entradaSegundos % 3600)%60;
		
		System.out.println("Resposta \n" + hora + ":" + minuto + ":" + segundo);
		
		teclado.close();
	}

}
