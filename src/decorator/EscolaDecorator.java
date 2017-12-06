package decorator;

import java.util.List;

public abstract class EscolaDecorator implements IEscola {

	protected IEscola escolaDecorada;
	
	public EscolaDecorator(Escola escolaDecorada) {
		this.escolaDecorada = escolaDecorada;
	}
	
	@Override
	public void adicionarAluno(Aluno aluno) {
		escolaDecorada.adicionarAluno(aluno);
	}

	@Override
	public void removerAluno(Aluno aluno) {
		escolaDecorada.removerAluno(aluno);
	}

	@Override
	public List<Aluno> listarAlunos() {
		return escolaDecorada.listarAlunos();
	}

}
