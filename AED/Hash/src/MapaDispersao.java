import java.util.ArrayList;

public class MapaDispersao<K, T> {

  public class Pair<K, T>{
    public K k;
    public T t;

    Pair(K k, T t){
      this.k=k;
      this.t=t;
    }
  }

  private ArrayList<ArrayList<Pair<K, T>>> mapa;
  public int elementos;

  MapaDispersao(int quantidade){
    this.mapa = new ArrayList<ArrayList<Pair<K, T>>>(quantidade);
    for (int i=0; i<quantidade; i++)
      this.mapa.add(new ArrayList<Pair<K, T>>());
    this.elementos=0;
  }

  // Utilizando ABS pois o valor retornava negativo caso a placa fosse diferente de AAA
  public int calcularHash(K k){
    return Math.abs(k.hashCode()) % this.mapa.size();
  }

  // Inserindo
  public boolean inserir(K k, T t){
    int hash = this.calcularHash(k);
    if (this.buscar(k) == null){
      this.mapa.get(hash).add(new Pair(k, t));
      this.elementos+=1;
      return true;
    } else {
      return false;
    }
  }

  //Removendo
  public T remover(K k){
    T t = null;
    int hash = this.calcularHash(k);
    for (int i=0; i<this.mapa.get(hash).size(); i++){
      if (this.mapa.get(hash).get(i).k == k){
        this.mapa.get(hash).remove(i);
        this.elementos-=1;
        break;
      }
    }

    return t;
  }

  // Buscando
  public T buscar(K k){
    T t = null;
    int hash = this.calcularHash(k);
    for (int i=0; i<this.mapa.get(hash).size(); i++){
      if (this.mapa.get(hash).get(i).k == k){
        t = this.mapa.get(hash).get(i).t;
        break;
      }
    }

    return t;
  }

  // Quantidade de Elementos
  public int quantosElementos(){
    return this.elementos;
  }
}