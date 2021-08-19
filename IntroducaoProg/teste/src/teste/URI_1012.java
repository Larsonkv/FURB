package teste;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1012 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.000");

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		double areaTriangulo = (a * c)/2;
		double areaCirculo = (c * c) * 3.14159;
		double areaTrapezio = ((a + b)* c)/2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.println("TRIANGULO: "+ df.format(areaTriangulo));
		System.out.println("CIRCULO: "+ df.format(areaCirculo));
		System.out.println("TRAPEZIO: "+ df.format(areaTrapezio));
		System.out.println("QUADRADO: "+ df.format(areaQuadrado));
		System.out.println("RETANGULO: "+ df.format(areaRetangulo));
		
		teclado.close();
	}

}
