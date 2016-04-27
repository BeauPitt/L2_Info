import java.awt.*;

class Frame2 extends Frame {

	public Frame2() {

		this.setVisible(true);
		this.setTitle("TP5");
		this.setSize(500,300);
		this.addWindowListener(new BoutonCroix());
		// Agencement du conteneur principal
		this.setLayout(new GridLayout(3,1));
		// Agencement et déclaration du sous-conteur
		Panel p = new Panel(new GridLayout(3,3));
		// on ajoute le panel à la fenetre
		this.add(p);
		// on crée 9 boutons
		for (int i = 1; i < 10; i++) {
			p.add(new Bouton("btn "+i));
		}
		// on crée le Label et la Zone de texte
		Label l = new Label("Label");
		TextArea t = new TextArea("Zone de texte");
		this.add(l);
		this.add(t);

	}
}