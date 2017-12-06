package abstractFactory;

public class OSXFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new OSXButton();
	}

}
