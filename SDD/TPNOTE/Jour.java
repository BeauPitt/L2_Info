/*
* Classe Jour
*/
import java.util.Hashtable;

class Jour {
	String identif;
	Hashtable<Integer, String> heure = new Hashtable<Integer, String>();
	
	public Jour(String id) {
		identif = id;
	}
	public void SetHeure(){
		for(int i =8; i<19; i++){
			heure.put(i, "Vide");
		}
	}
	public void SetEvent(int heure1, String event){
		heure.put(heure1, event);
	}
	public void GetEvent(int heure1){
		heure.get(heure1);
	}
}
