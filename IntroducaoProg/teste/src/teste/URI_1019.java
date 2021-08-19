package teste;

import java.util.Scanner;

public class URI_1019 {

	public static void main(String[] args) {
		
		int entradaSegundos, hora, minuto, segundo;
		
		Scanner teclado = new Scanner(System.in);
		
		entradaSegundos = teclado.nextInt();
		
		hora = entradaSegundos/3600;
		minuto = (entradaSegundos % 3600)/60;
		segundo = (entradaSegundos % 3600)%60;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		teclado.close();
	}

}

