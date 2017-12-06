package decorator;

import java.util.ArrayList;
import java.util.List;

public class EscolaComBusca extends EscolaDecorator {

	public EscolaComBusca(Escola escolaDecorada) {
		super(escolaDecorada);
	}

	public List<Aluno> listarAlunos(String letraInicial) {
		List<Aluno> alunosSelecionados = new ArrayList<>();
		for (Aluno aluno : listarAlunos()) {
			if(aluno.getNome().startsWith(letraInicial)) {
				alunosSelecionados.add(aluno);
			}
		}
		return alunosSelecionados;
	}
}
