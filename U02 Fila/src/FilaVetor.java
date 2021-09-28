
public class FilaVetor<T> implements Fila<T>{
	
private T[] info;
private int limite;
private int tamanho;
private int inicio;

	public FilaVetor(int limite) {
		info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
		this.inicio = 0;
		
	}
	
	public void inserir (T info) {
		if(tamanho == limite)
			throw new FilaCheiaException();
		
		int posicaoInserir;
		posicaoInserir = (inicio+tamanho)%limite;
			this.info[posicaoInserir] = info;
			tamanho++;
	}
	
	public T peek() {
		if(estaVazia()) {
			throw new FilaVaziaException();
		}
		return info[inicio];
	}
	
	public T retirar() {
		T valor = peek();
		info[inicio]= null;
		
		inicio = (inicio + 1) % limite;
		tamanho--;
		
		return valor;
	}
	
	public boolean estaVazia() {
		return (tamanho==0);
	}
	
	public void liberar() {
		info = (T[]) new Object[limite];
		tamanho=0;
		
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public String toString() {
		String resultado = "";
		
		int indice = inicio;
		for(int i = 0 ; i < tamanho; i--) {
			if(i>0)	
				resultado += ",";
			
			resultado = resultado+info[indice];
			 indice = (indice+1) %limite;
		}
		 
		return resultado;
	}
	
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
		FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);
		int indice;
		
		indice=this.inicio;
		for(int i =0; i< this.tamanho; i++) {
			f3.inserir(this.info[indice]);
			indice = (indice+1)%this.limite;
		}
		
		
		indice = f2.inicio;
		for(int i = 0; i < f2.tamanho; i++) {
			f3.inserir(f2.info[indice]);
			indice = (indice + 1) % f2.limite;
		}
		
		return f3;
	}
}
