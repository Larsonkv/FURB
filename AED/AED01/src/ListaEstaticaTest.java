import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class ListaEstaticaTest {

	@Test
	void testInserir() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		//Conferir Saída
		//System.out.println(lista.toString());
		assertEquals(lista.toString(), "[5, 10, 15, 20]");
		
	}
	
	@Test
	void testGetTamanho() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		//Conferir tamanho
		//System.out.println(lista.getTamanho());
		assertEquals(lista.getTamanho(), 4);
	}

	@Test
	void testBuscar() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		//Conferindo valor da busca
		//System.out.println(lista.buscar(15));
		assertEquals(lista.buscar(15), 2);
	}
	
	@Test
	void testBuscarInvalido() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		//Conferindo valor da busca
		//System.out.println(lista.buscar(30));
		assertEquals(lista.buscar(30), -1);
	}
	
	@Test
	void testRetirar() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		lista.retirar(10);
		
		
		System.out.println(lista.getTamanho());
		assertEquals(lista.getTamanho(), 3);
		
		System.out.println(lista.toString());
		assertEquals(lista.toString(), "[5, 15, 20]");

		
	}
	

	@Test
	void testRedimensionar() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(6);
		lista.inserir(7);
		lista.inserir(8);
		lista.inserir(9);
		lista.inserir(10);
		lista.inserir(11);
		lista.inserir(12);
		lista.inserir(13);
		lista.inserir(14);
		lista.inserir(15);
		
		//System.out.print(lista.getTamanho());
		assertEquals(lista.getTamanho(), 15);
		
		//System.out.println(lista.toString());
		assertEquals(lista.toString(), "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]");
		
	}

	@Test
	void testObterElemento() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		//System.out.println(lista.obterElemento(3));
		assertEquals(lista.obterElemento(3), 20);
	}
	
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	void testObterElementoInvalido() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Não exite dados nesta posição!");
	}
	
	@Test
	void liberarTest() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.liberar();
		
		//System.out.println(lista.estaVazia());
		assertEquals(lista.estaVazia(), true);
	}
}
