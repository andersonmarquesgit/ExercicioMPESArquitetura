package abstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIFactory factory1 = new OSXFactory();
		Environment e1 = new Environment(factory1);
		e1.Run();
		
		GUIFactory factory2 = new WinFactory();
		Environment e2 = new Environment(factory2);
		e2.Run();
	}

}
