package injecaoDeDependencia;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class EscolaLogTest {

	public static void main(String[] args) {
		MutablePicoContainer pico = new DefaultPicoContainer();
		pico.addComponent(ILogger.class, ConsoleLogger.class);
		pico.addComponent(Escola.class);
		
		Escola escola = pico.getComponent(Escola.class);
		Aluno aluno1 = new Aluno("1111", "José", "1111-1111");
		escola.adicionarAluno(aluno1);
		escola.removerAluno(aluno1);
	}
	
}
