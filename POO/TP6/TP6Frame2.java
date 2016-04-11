import java.awt.*;
import java.awt.event.*;

public class TP6Frame2 extends Frame implements TextListener {
	TextArea ta = new TextArea();
	Label l = new Label("xxxx");
	public TP6Frame2() {
		this.setVisible(true);
		this.setTitle("TP6");
		this.setSize(500,300);
		this.addWindowListener(new BoutonCroix());
		this.setLayout(new FlowLayout());
		this.add(ta);
		this.add(l);
		ta.addTextListener(this);
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		int taille = ta.getText().length();
		l.setText("  " +taille);
	}


}