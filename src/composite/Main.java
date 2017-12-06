package composite;

public class Main {

	public static void main(String[] args) {
		Graphic rec = new Rectangle();
		Graphic text = new Text();
		Graphic lin = new Line();
		
		Picture picture = new Picture();
		picture.adicionarFilho(rec);
		picture.adicionarFilho(text);
		picture.adicionarFilho(lin);
		
		picture.draw();

	}

}
