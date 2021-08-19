class Veiculo{
  private String placa;  
  private String modelo;
  private int ano;
  private String proprietario;

  Veiculo(){}

  public void setPlaca(String placa){
    this.placa = placa;
  }

  public String getPlaca(){
    return this.placa;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getModelo(){
    return this.modelo;
  }

  public void setAno(int ano ){
    this.ano = ano;
  }

  public int getAno(){
    return this.ano;
  }

  public void setProprietario(String proprietario){
    this.proprietario = proprietario;
  }

  public String getProprietario(){
    return this.proprietario;
  }

  @Override
  public String toString(){
    String str = "Proprietário: " + this.getProprietario()
      + "\nPlaca: " + this.getPlaca()
      + "\nModelo: " + this.getModelo()
      + "\nAno: " + this.getAno();

    return str;
  }
}