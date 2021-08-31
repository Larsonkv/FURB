package listanova;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaTest {

	private ListaEstatica<Integer> lista = new ListaEstatica<>();
	
	public void testeString() {
		ListaEstatica<String> nomes = new ListaEstatica<>();
		nomes.inserir("Andre");
		nomes.inserir("Ana");
		String primeiroNome = nomes.obterElemento(0);
		System.out.println(primeiroNome);
		
		ListaEstatica nomes2 = new ListaEstatica();
		nomes2.inserir("andre");
		nomes2.inserir("ana");
		String primeiroNomeLista2 = (String) nomes2.obterElemento(0);
		
	}
	
	
	@Test
	public void testInclusaoItensLista() {
		ListaEstatica<Integer> lista = new ListaEstatica<>();
		lista.inserir(5); // lista.inserir(Integer.valueOf(5));
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		assertEquals("[5, 10, 15, 20]", lista.toString());
	}

}
