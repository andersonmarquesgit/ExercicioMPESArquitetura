package abstractFactory;

public class WinFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

}
