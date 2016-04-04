import java.awt.event.*;

class BoutonCroix extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}
}