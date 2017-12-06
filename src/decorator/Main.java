package decorator;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola();
		EscolaComBusca escolaComBusca = new EscolaComBusca(escola);
		
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
		
		System.out.println("Alunos da Escola com Busca:");
		for (Aluno aluno : escolaComBusca.listarAlunos("J")) {
			System.out.println(aluno.toString());
		}
		
		System.out.println();
		System.out.println("----- Adicionando aluno com o decorator ------");
		Aluno aluno5 = new Aluno("5555", "Aluno adicionado com decorator", "5555-5555");
		escolaComBusca.adicionarAluno(aluno5);
		
		System.out.println("Alunos da Escola:");
		for (Aluno aluno : escola.listarAlunos()) {
			System.out.println(aluno.toString());
		}
		
		System.out.println("Alunos da Escola com Busca:");
		for (Aluno aluno : escolaComBusca.listarAlunos("J")) {
			System.out.println(aluno.toString());
		}
	}

}
