public class ListaEncadeada <T>{
	
	private NoLista<T> primeiro;
	
	public ListaEncadeada()   {
		primeiro = null;
	}
	
	public NoLista<T> getPrimeiro() {
	// retornar No
		return this.primeiro;
	}
	
	public void inserir(T info) {
	// retornar void
		NoLista<T> novo = new NoLista<>();
		novo.setInfo(info);
		novo.setProximo(this.primeiro);
		this.primeiro = novo;
	}
	
	public boolean estaVazia() {
	// retornar boolean
		return this.primeiro ==null;
	}
	
	public NoLista<T> buscar(T valor) {
	// retornar No
		NoLista<T> p = this.primeiro;
		
		while(p != null) {
			if(p.getInfo().equals(valor)) {  // por EQUALS pq se for STRING o == NAO COMPARA CORRETAMENTE!
				return p;
			}
		p = p.getProximo();
		}
		return null;
	}
	
	public void retirar(T valor) {

	// retornar void
	NoLista<T> anterior = null;
	NoLista<T> p = primeiro;
	
	while((p!= null)&&(p.getInfo().equals(valor))) {
		anterior = p;
		p = p.getProximo();
	}
	
	if(p != null) {
		if(p == primeiro) {
			primeiro = primeiro.getProximo();
		}else {
			anterior.setProximo(p.getProximo());
			}
		}
	}
	
	public int obterComprimento() {
	// retornar int
		int qtdNos = 0;
		NoLista<T> p = primeiro;
		
		while(p != null) {
			qtdNos++;
			p=p.getProximo();
		}
		return qtdNos;
	}
	
	public NoLista<T> obterNo(int idx) {
	// retornar No
		if(idx < 0)
			throw new IndexOutOfBoundsException();
		
		NoLista<T> p = getPrimeiro();
		while((p != null) && (idx >0)) {
			idx--;
			p=p.getProximo();
		}
		
		if(p ==null) 
			throw new IndexOutOfBoundsException();
		
		return p;
	}
	
	public String toString() {
		String resultado ="";
		NoLista<T> p = primeiro;
		
		while(p != null){
			
			if(p != primeiro)
				resultado +=",";
			
		resultado += p.getInfo().toString();
		p = p.getProximo();
		
		}
		
		return resultado;
	}
		
}
