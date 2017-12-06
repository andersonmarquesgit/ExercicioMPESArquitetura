package injecaoDeDependencia;

public class ConsoleLogger implements ILogger {

	@Override
	public void log(String texto) {
		System.out.println(texto);
	}

}
