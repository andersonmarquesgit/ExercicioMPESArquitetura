package observer;

public class Biblioteca implements Observer {

	@Override
	public void update(String motivoDoDesligamento) {
		System.out.println("Biblioteca recebeu a notifica��o!!!");
	}

	
}
