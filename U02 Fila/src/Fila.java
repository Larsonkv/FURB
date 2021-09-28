
public interface Fila<T> {

	void inserir(T v);
	
	T peek();
	
	T retirar();
	
	boolean estaVazia();
	
	void liberar();
	
	String toString();
}
