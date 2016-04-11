import java.awt.*;
import java.awt.event.*;


public class Touche extends KeyAdapter {
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_F1) {
			System.out.println("pourquoi pas");
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_F1) {
			System.out.println("Non");
		} else {
			System.out.println("Oui");
		}
	}
	
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
	}
}
