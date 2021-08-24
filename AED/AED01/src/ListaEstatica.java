
public class ListaEstatica {

	int[] infoRedimensionado;
	int[] info = new int[10];
	int tamanho = 0;
	
	public void inserir(int i) {
		if(tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = i;
		tamanho += 1;
	}
	
	public void redimensionar() {
		infoRedimensionado = new int[info.length+10];
		
		for (int i = 0; i < info.length; i++) {
			infoRedimensionado[i] = info[i];
		}
		info = infoRedimensionado;
	}
	
	public int buscar(int valor) {
	    for (int i = 0; i < tamanho; i++)
	        if (info[i] == valor)
	            return i;
	    	
	    return -1;
	}
	
	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}
	
	public void retirar(int valor) {
		int posicao = buscar(valor);
		
		if(posicao > -1) {
			for (int i = posicao; i < tamanho-1; i++) {
				info[i] = info[i+1];
			}
			tamanho --;
		}
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public void liberar() {
		info = new int[10];
		tamanho =0;
	}
	
	public boolean estaVazia() {
		return tamanho==0;
	}
	
	@Override
	public String toString() {
		if (estaVazia() == true) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < tamanho -1; i++) {
			builder.append(info[i]);
			builder.append(", ");
			}
		builder.append(info[tamanho-1]);
		builder.append("]");
		return builder.toString();
	}
	
	public int obterElemento(int i) {
		if(i > tamanho) 
			throw new IndexOutOfBoundsException("Não exite dados nesta posição!");
		return info[i];
	}
	
}