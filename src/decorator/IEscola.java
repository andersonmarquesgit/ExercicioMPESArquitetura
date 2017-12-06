package decorator;

import java.util.List;

public interface IEscola {

	public void adicionarAluno(Aluno aluno);
	public void removerAluno(Aluno aluno);
	public List<Aluno> listarAlunos();
}
