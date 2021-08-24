package listanova;

public class Aluno extends ListaEstatica {
	
	private int matricula;
	private String nome;
	
	public Aluno() {
		matricula = 0;
		nome = "";
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
