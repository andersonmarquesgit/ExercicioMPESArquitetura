package proxy;

public class Biblioteca implements IBiblioteca {

	@Override
	public void consultarLivro() {
		System.out.println("Biblioteca: Consultando livro!!!");
	}

	@Override
	public void retirarLivro() {
		System.out.println("Biblioteca: Retirando livro!!!");
	}

	@Override
	public void devolverLivro() {
		System.out.println("Biblioteca: Devolvendo livro!!!");
	}

}
