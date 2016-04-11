import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;

public class TP6Frame extends Frame implements KeyListener {
	Label l = new Label();
	public TP6Frame() {
		this.setVisible(true);
		this.setTitle("TP6");
		this.setSize(500,300);
		this.addWindowListener(new BoutonCroix());
		TextField t = new TextField();
		this.add(l);
		this.add(t);
		t.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_F1) {
			l.setText("pourquoi pas");
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_F1) {
			l.setText("Non");
		} else {
			l.setText("Oui");
		}
	}
	
	public void keyTyped(KeyEvent e) {
		String s =  e.toString();
		l.setText(s);
	}
}
