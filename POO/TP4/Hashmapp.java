import java.util.*;

class Hashmapp {

	private Arraylist tab;

	public Hashmapp() {
		tab =new Arraylist();
	}

	public void put(int k, int v) {
		Objet o = new Objet(k,v);
		tab.add(o);
	}
}