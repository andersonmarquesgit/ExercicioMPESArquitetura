package composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {

	private List<Graphic> graphics = new ArrayList<>();
			
	@Override
	public void draw() {
		for(Graphic gr : graphics)
		{
			gr.draw();
		}
	}
	
	public void adicionarFilho(Graphic g) {
		this.graphics.add(g);
	}
	
	public void removerFilho(Graphic g) {
		this.graphics.remove(g);
	}
	
	public Graphic buscarFilho(int g) {
		return this.graphics.get(g);
	}

}
