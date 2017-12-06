package observer;

import java.util.ArrayList;
import java.util.List;

public class Escola implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	private List<Aluno> alunos;
	
	public Escola() {
		alunos = new ArrayList<>();
	} 
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void removerAluno(Aluno aluno, String motivoDoDesligamento) {
		this.alunos.remove(aluno);
		this.notifyObserver(aluno, motivoDoDesligamento);
	}

	public List<Aluno> listarAlunos() {
		return this.alunos;
	}

	@Override
	public void attach(Observer meuObserver) {
		observers.add(meuObserver);
	}

	@Override
	public void detach(Observer meuObserver) {
		observers.remove(meuObserver);
	}

	@Override
	public void notifyObserver(Aluno aluno, String motivoDoDesligamento) {
        for (Observer ob : observers) {
        System.out.println("Notificando observers sobre o desligamento do aluno:" + aluno.getNome() + " - Motivo: " + motivoDoDesligamento);
        	ob.update(motivoDoDesligamento);
        }
	}
}
