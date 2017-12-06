package templateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class EscolaTemplate {

	public abstract void antesAdicionarAluno();
	public abstract void aposAdicionarAluno();
	
	protected List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

}
