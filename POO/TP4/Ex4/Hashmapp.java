import java.util.*;

class Hashmapp {

	private ArrayList<Objet> tab;
	
	// Constructeur 
	public Hashmapp() {
		tab =new ArrayList<Objet>();
	}

	// Ajoute un élément dans la Hashtable
	public void put(int k, int v) {
		Objet o = new Objet(k,v);
		tab.add(o);
	}
	
	// Retourne si oui ou non la clef k existe dans la Hashtable
	public boolean containsKey(int k) {
		Objet o;
		for(int i=0; i<tab.size(); i++){
			o = tab.get(i);
			if(o.getKey() == k){
				return true;
			}
		}
		return false;
	}
	
	// Retourne si oui ou non la valeur v existe dans la Hashtable
	public boolean containsValue(int v) {
		Objet o;
		for(int i=0; i<tab.size(); i++){
			o = tab.get(i);
			if(o.getValue() == v){
				return true;
			}
		}
		return false;
	}
	
	// Retourne l'objet dont la clef est k
	public Objet get(int k){
		Objet o;
		for(int i=0; i<tab.size(); i++){
			o = tab.get(i);
			if(o.getKey() == k){
				return o;
			}
		}
		return null;
	}
	
	// Retourne la valeur dont la clef associé est k
	public int getValue(int k){
		Objet o;
		for(int i=0; i<tab.size(); i++){
			o = tab.get(i);
			if(o.getKey() == k){
				return o.getValue();
			}
		}
		return 0;
	}
	
	// Retourne la taille de la Hashtable
	public int getSize(){
		return this.tab.size();
	}
	
	// Affiche la Hashtable (fonction utilisée surtout pour la phase de test)
	public void afficherHash(){
		for(int i=0; i<tab.size(); i++){
			System.out.print(tab.get(i).getValue() +" ");
		}
		System.out.println(" ");
	}
}