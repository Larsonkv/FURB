import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEncadeadaTest {

	@Test
	void testarBuscaDados1aPosicao() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		
		NoLista<Integer> no;
		
		no = lista.getPrimeiro();
		assertEquals(15, no.getInfo().intValue());
		
		no = no.getProximo();
		assertEquals(10, no.getInfo().intValue());
		
		no = no.getProximo();
		assertEquals(5, no.getInfo().intValue());
		
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	

}
