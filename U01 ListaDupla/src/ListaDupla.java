public class ListaDupla <T>{
	
	private NoListaDupla<T> primeiro;
	
	public ListaDupla()   {
		
		primeiro = null;
	}
	
	public NoListaDupla<T> getPrimeiro() {
		
		return this.primeiro;
	}
	
	public void inserir(T valor) {
		
		NoListaDupla<T> novo = new NoListaDupla<>();
		novo.setInfo(valor);
		novo.setProximo(primeiro);
		novo.setAnterior(null);
		if(primeiro != null)
			primeiro.setAnterior(novo);
		primeiro = novo;
	}
	
	public boolean estaVazia() {
		
		return primeiro == null;
	}
	
	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = this.primeiro;
		
		while(p != null) {
			if(p.getInfo().equals(valor)) {
				return p;
			}
		p = p.getProximo();
		}
		return null;
	}
	
	public void retirar(T valor) {
		NoListaDupla<T> p = buscar(valor);

	if(p != null) {
		if(primeiro == p) {
			primeiro = p.getProximo();
		}else {
			p.getAnterior().setProximo(p.getAnterior());
			}
		if(p.getProximo() != null) {
			p.getProximo().setAnterior(p.getAnterior());
		}
	  }
	}
	
	private NoListaDupla<T> obterUltimo() {
		NoListaDupla<T> ultimo = primeiro;
		NoListaDupla<T> p = primeiro;
		while(p != null) {
			ultimo = p;
			p=p.getProximo();
		}
		return ultimo;
	}
	
	public void exibirOrdemInversa() {
		NoListaDupla<T> p = obterUltimo();
		
		while(p != null) {
			System.out.println(p.getInfo());
			p = p.getAnterior();
		}
	}
	
	public void liberarLista() {
		
		NoListaDupla<T> p = primeiro;
		while(p!=null) {
			p.setAnterior(null);
			
			NoListaDupla<T> backup;
			backup = p.getProximo();
			
			p.setProximo(null);
			p=backup;
		}
		
		primeiro = null;
	}
	
	public String toString() {
		String resultado ="";
		NoListaDupla<T> p = primeiro;
		while(p != null){
			
			if(p != primeiro)
				resultado +=",";
			
		resultado += p.getInfo().toString();
		p = p.getProximo();
		
		}
		
		return resultado;
	}

}
