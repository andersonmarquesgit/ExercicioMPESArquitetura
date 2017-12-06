package abstractFactory;

public class Environment {

	private Button button;
	
	public Environment(GUIFactory factory) {
		this.button = factory.createButton();
	}
	
	public void Run() {
		this.button.paint();
	}
}
