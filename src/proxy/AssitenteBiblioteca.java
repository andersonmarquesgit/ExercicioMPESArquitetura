package proxy;

public class AssitenteBiblioteca implements IBiblioteca {

	private Biblioteca biblioteca;
	
	public AssitenteBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public void consultarLivro() {
		System.out.println("Asstente: Consultando livro");
	}

	@Override
	public void retirarLivro() {
		this.biblioteca.retirarLivro();
	}

	@Override
	public void devolverLivro() {
		this.biblioteca.devolverLivro();
	}

}
