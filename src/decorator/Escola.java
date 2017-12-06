package decorator;

import java.util.ArrayList;
import java.util.List;

public class Escola implements IEscola {

	private List<Aluno> alunos;
	
	public Escola() {
		alunos = new ArrayList<>();
	} 
	
	@Override
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	@Override
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}

	@Override
	public List<Aluno> listarAlunos() {
		return this.alunos;
	}

}
