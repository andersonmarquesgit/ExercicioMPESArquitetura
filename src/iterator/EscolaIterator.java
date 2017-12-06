package iterator;

import java.util.List;

public class EscolaIterator implements Iterator {

	private List<Aluno> alunos; 
	private int posicao = 0;
	
	public EscolaIterator(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	@Override
	public Aluno first() {
		posicao = 0;
		Aluno aluno = alunos.get(posicao);
		return aluno;
	}

	@Override
	public Aluno next() {
		Aluno aluno = alunos.get(posicao);
		posicao++;
		return aluno;
	}

	@Override
	public boolean isDone() {
		return posicao == alunos.size();
	}

	@Override
	public Aluno currentItem() {
		Aluno aluno = alunos.get(posicao);
		return aluno;
	}

}
