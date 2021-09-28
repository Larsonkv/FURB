package listanova;


public class ListaEstatica<ClasseInformadaProgramador>{

	private Integer[] info;
	private int tamanho;
	
	public ListaEstatica() {
		info = (ClasseInformadaProgramador[]) new Object[10];
		tamanho = 0;
	} 
	
	public void inserir(Integer i) {
		if(tamanho == info.length) {
			redimensionar();
		}
		if(obterElemento(tamanho) < i) {
			info[tamanho] = i;
			tamanho ++;
		}
		
	}
	
	public void redimensionar() {
		ClasseInformadaProgramador[] infoRedimensionado = (ClasseInformadaProgramador[])new  Object[info.length+10];
		
		for (int i = 0; i < info.length; i++) {
			infoRedimensionado[i] = info[i];
		}
		info = infoRedimensionado;
	}
	
	public int buscar(Integer valor) {
	    for (int i = 0; i < tamanho; i++)
	        if (info[i].equals(valor))
	            return i;
	    	
	    return -1;
	}
	
	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}
	
	public void retirar(Integer valor) {
		int posicao = buscar(valor);
		
		if(posicao > -1) {
			for (int i = posicao; i < tamanho-1; i++) {
				info[i] = info[i+1];
			}
			info[tamanho-1] = null;
			tamanho --;
		}
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public void liberar() {
		info = (ClasseInformadaProgramador[])new Object[10];
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
			builder.append(info[i].toString());
			builder.append(", ");
			}
		builder.append(info[tamanho-1].toString());
		builder.append("]");
		return builder.toString();
	}
	
	public int obterElemento(int i) {
		if(i > tamanho) 
			throw new IndexOutOfBoundsException("Não exite dados nesta posição!");
		return (int) info[i];
	}
	
	public void inverter() {
		int esquerda = 0;
		int direita = tamanho -1;
		int qtdeTrocas = tamanho/2;
		
		ClasseInformadaProgramador backup;
		
		while(qtdeTrocas >0) {
			backup = info[esquerda];
			info[esquerda] = info[direita];
			info[direita] = backup;
			
			esquerda ++;
			direita --;
			
			qtdeTrocas--;
		}
	}
	
}
