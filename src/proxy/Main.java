package proxy;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		IBiblioteca assistenteBiblioteca = new AssitenteBiblioteca(biblioteca);
		
		biblioteca.retirarLivro();
		assistenteBiblioteca.retirarLivro(); 
		biblioteca.consultarLivro();
		assistenteBiblioteca.consultarLivro();
	}
}
