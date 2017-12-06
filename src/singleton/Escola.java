package singleton;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	private static Escola instancia = null;
	private List<Aluno> alunos;
	
	private Escola() {
		alunos = new ArrayList<>();
	} 
	
	public static Escola getEscola() {
		if (instancia == null) {
			instancia = new Escola();
		}
		
		return instancia;
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	
	public List<Aluno> listarAlunos() {
		return this.alunos;
	}
	
}
