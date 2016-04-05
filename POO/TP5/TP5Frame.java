import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;


class TP5Frame extends Frame implements ActionListener {

	Bouton b;

	public TP5Frame() {
		this.setVisible(true);
		this.setTitle("TP5");
		this.setSize(500,300);
		this.addWindowListener(new BoutonCroix());
		// this.setLayout(new FlowLayout());
		// this.add(new Texte("a"));
		// this.add(new Bouton("b"));
		// this.add(new Bouton("c"));
		// méthode générale
		// this.setLayout(new GridLayout(3,1));
		// this.add(new Bouton("a"));
		// this.add(new Bouton("b"));
		// this.add(new Bouton("c"));
 		// autre méhode
 		// this.add(new Bouton("South"), BorderLayout.SOUTH);
 		// this.add(new Bouton("Center"), BorderLayout.CENTER);
 		// this.add(new Bouton("North"), BorderLayout.NORTH);
 		// this.add(new Bouton("West"), BorderLayout.WEST);
 		// this.add(new Bouton("East"), BorderLayout.EAST);
		b = new Bouton("jour");
		this.add(b);
		b.addActionListener(this);
 	}

 	public void actionPerformed(ActionEvent e) {
 		if (b.getLabel() == "jour") {
 			b.setLabel("nuit");
 		}
 		else if (b.getLabel() == "nuit") {
 			b.setLabel("jour");
 		}
 	}
}