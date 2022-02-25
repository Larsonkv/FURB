	import java.util.Scanner;
	
	
public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	ListaDupla<Integer> teste = new ListaDupla<Integer>();
	teste.inserir(10);
	teste.inserir(20);
	teste.inserir(30);
	teste.inserir(40);
	teste.inserir(50);
	teste.inserir(20);
	teste.retirar(20);
	teste.inserir(5);

	System.out.println(teste.toString());
	
	}
}
