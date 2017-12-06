package iterator;

import java.util.ArrayList;
import java.util.List;

public class Escola implements Aggregate {

	private List<Aluno> alunos;
	
	public Escola() {
		alunos = new ArrayList<>();
	} 
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void removerAluno(Aluno aluno, String motivoDoDesligamento) {
		this.alunos.remove(aluno);
	}

	public List<Aluno> listarAlunos() {
		return this.alunos;
	}
	
	@Override
	public Iterator createIterator() {
		return new EscolaIterator(alunos);
	}

}
