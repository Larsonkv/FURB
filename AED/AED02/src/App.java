public class App {

	public static void main(String[] args) {
		
		ListaEncadeada<String> frutas = new ListaEncadeada<>();
		frutas.inserir("abacate");
		frutas.inserir("morango");
		frutas.inserir("banana");
		frutas.liberarLista();
		
		ListaEncadeada<Integer> num = new ListaEncadeada<>();
		num.inserir(1);
		num.inserir(2);
		num.inserir(3);
		num.liberarLista();
		
		System.out.println(num.estaVazia());
	}
}
