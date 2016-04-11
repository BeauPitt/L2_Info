import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.TextListener;

public class TP6Frame3 extends Frame  {
	TextArea ta = new TextArea();
	Label l = new Label("xxxx");
	public TP6Frame3() {
		this.setVisible(true);
		this.setTitle("TP6");
		this.setSize(500,300);
		this.addWindowListener(new BoutonCroix());
		this.setLayout(new FlowLayout());
		
	}
}
