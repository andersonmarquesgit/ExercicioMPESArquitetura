package templateMethod;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola();
		
		Aluno aluno1 = new Aluno("1111", "José", "1111-1111");
		Aluno aluno2 = new Aluno("2222", "Maria", "2222-2222");
		Aluno aluno3 = new Aluno("3333", "João", "3333-3333");
		Aluno aluno4 = new Aluno("4444", "Carlos", "4444-4444");
		
		
		escola.antesAdicionarAluno();
		escola.adicionarAluno(aluno1);
		escola.adicionarAluno(aluno2);
		escola.adicionarAluno(aluno3);
		escola.adicionarAluno(aluno4);
		escola.aposAdicionarAluno();
	}

}
