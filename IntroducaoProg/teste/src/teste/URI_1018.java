package teste;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1018 {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("0");
	        
	        double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
	        @SuppressWarnings("unused")
			double centavos, N, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
	        
	        N = input.nextDouble();
	        double nFixo = N;

	        n100 = N / 100.0;
	        N %= 100;
	        n50 = N / 50.0;
	        N %= 50;
	        n20 = N / 20.0;
	        N %= 20;
	        n10 = N / 10.0;
	        N %= 10;
	        n5 = N / 5.0;
	        N %= 5;
	        n2 = N / 2.0;
	        N %= 2;
	        n1 = N / 1.0;
	            
	        System.out.println(df.format(nFixo));
	        System.out.println((int)n100 + " nota(s) de R$ 100,00");
	        System.out.println((int)n50 + " nota(s) de R$ 50,00");
	        System.out.println((int)n20 + " nota(s) de R$ 20,00");
	        System.out.println((int)n10 + " nota(s) de R$ 10,00");
	        System.out.println((int)n5 + " nota(s) de R$ 5,00");
	        System.out.println((int)n2 + " nota(s) de R$ 2,00");
	        System.out.println((int)n1 + " nota(s) de R$ 1,00");
	        
	        input.close();
	}

}
