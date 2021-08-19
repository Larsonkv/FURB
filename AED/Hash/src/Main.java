class Main {
  public static void main(String[] args) {
    System.out.println("TESTES:\n\n");

    Veiculo v = new Veiculo();
    v.setPlaca("MHJ-0386");
    v.setModelo("Volkswagen Fox");
    v.setAno(2011);
    v.setProprietario("Larson Kremer");
    System.out.println("Inserindo no mapa o veículo:\n" + v );
    MapaDispersao<String,Veiculo> mp = new MapaDispersao(2000);
    mp.inserir(v.getPlaca(), v);

    System.out.println("Buscando no mapa o veículo"
      + " de placa " + v.getPlaca() + ". \n" +
      mp.buscar(v.getPlaca()) );

    System.out.println("Removendo do mapa a  chave " + v.getPlaca() +
      " Elementos atuais do mapa antes: " + mp.quantosElementos());
    mp.remover(v.getPlaca()); 
    System.out.println("Elementos atuais do mapa depois da remoção: "
      +  mp.quantosElementos());
  }

}