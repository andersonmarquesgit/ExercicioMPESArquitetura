package observer;

public interface Subject {

	public void attach(Observer meuObserver);
	public void detach(Observer meuObserver);
	public void notifyObserver(Aluno aluno, String motivoDoDesligamento);
}
