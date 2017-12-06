package injecaoDeDependencia;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	private List<Aluno> alunos;
	private ILogger logger;
	
	public Escola(ILogger logger) {
		alunos = new ArrayList<>();
		this.logger = logger;
	} 
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		logger.log("Aluno adicionado!");
	}

	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
		logger.log("Aluno removido!");
	}

	public List<Aluno> listarAlunos() {
		return this.alunos;
	}

}
