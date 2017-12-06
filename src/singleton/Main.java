package singleton;

public class Main {

	public static void main(String[] args) {
		Escola escola = Escola.getEscola();
		
		Aluno aluno1 = new Aluno("1111", "José", "1111-1111");
		Aluno aluno2 = new Aluno("2222", "Maria", "2222-2222");
		Aluno aluno3 = new Aluno("3333", "João", "3333-3333");
		
		escola.adicionarAluno(aluno1);
		escola.adicionarAluno(aluno2);
		escola.adicionarAluno(aluno3);
		
		escola.removerAluno(aluno1);
		
		for (Aluno aluno : escola.listarAlunos()) {
			System.out.println(aluno.toString());
		}

	}

}
