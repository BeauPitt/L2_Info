import java.awt.*;
import java.awt.event.*;

class TPFrame extends Frame implements ItemListener {
	//Dessin d = new Dessin();

	Checkbox cb = new Checkbox();
	Choice cc = new Choice();

	public void itemStateChanged()
		
	public TPFrame() {
		this.setVisible(true);
		this.setTitle("TP6");
		this.setSize(500,300);
		this.addWindowListener(new BoutonCroix());
		/*this.add(d);
		this.add(cb);
		cb.addEventLister(this);*/
		cc.add("X-files");
		cc.add("Friends");
		cc.add("Lost");
		this.add(cc);
		cc.addItemListener(this);
	}
}