package chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class Escola{

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

}
