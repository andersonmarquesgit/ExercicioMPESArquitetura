package templateMethod;

public class Escola extends EscolaTemplate {

	@Override
	public void antesAdicionarAluno() {
		System.out.println("Antes de Adicionar Alunos!");
	}

	@Override
	public void aposAdicionarAluno() {
		System.out.println("Após Adicionar Alunos!");
		
	}

}
