package iterator;

public class Aluno {

	private String matricula;
	private String nome;
	private String telefone;
	
	public Aluno(String matricula, String nome, String telefone) {
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}
