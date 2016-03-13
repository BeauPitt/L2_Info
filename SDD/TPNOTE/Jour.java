/*
* Classe Jour
*/
import java.util.Hashtable;

class Jour {
	private String identif;
	public Jour(String id) {
		identif = id;
	}
	public void SetHeure(){
		Hashtable heure = new Hashtable();
		for(int i =8; i<19; i++){
			heure.put(i, "Vide");
		}
	}
	
}
