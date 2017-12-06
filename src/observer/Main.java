package observer;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola();
		Biblioteca biblioteca = new Biblioteca();
		escola.attach(biblioteca);
		
		Aluno aluno1 = new Aluno("1111", "José", "1111-1111");
		Aluno aluno2 = new Aluno("2222", "Maria", "2222-2222");
		Aluno aluno3 = new Aluno("3333", "João", "3333-3333");
		Aluno aluno4 = new Aluno("4444", "Carlos", "4444-4444");
		
		escola.adicionarAluno(aluno1);
		escola.adicionarAluno(aluno2);
		escola.adicionarAluno(aluno3);
		escola.adicionarAluno(aluno4);
		
		System.out.println("Alunos da Escola:");
		for (Aluno aluno : escola.listarAlunos()) {
			System.out.println(aluno.toString());
		}
		
		escola.removerAluno(aluno4, "Ausência das aulas acima de 25%");
		
		System.out.println("Alunos da Escola após remoção:");
		for (Aluno aluno : escola.listarAlunos()) {
			System.out.println(aluno.toString());
		}
		
	}

}
