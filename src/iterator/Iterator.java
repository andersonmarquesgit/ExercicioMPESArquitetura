package iterator;

public interface Iterator {
	
	public Aluno first();
	public Aluno next();
	public boolean isDone();
	public Aluno currentItem();
	
}
