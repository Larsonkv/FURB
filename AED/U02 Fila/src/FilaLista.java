
public class FilaLista<T> implements Fila<T>{
	
	private ListaEncadeada<T> lista;
	
	public FilaLista() {
		lista = new ListaEncadeada<>();
	}


	@Override
	public void inserir(T valor) {
		lista.inserirNoFinal(valor);
		
	}

	@Override
	public T peek() {
		if(estaVazia()) {
			throw new FilaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public T retirar() {
		T valor;
		valor= peek();
		lista.retirar(valor);
		
		return valor;
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {	
		
		try {
			while(true) {
				retirar();
			}
		}catch(FilaVaziaException e) {
			
		}
	}

	
	public String toString() {
		return lista.toString();
	}
}
