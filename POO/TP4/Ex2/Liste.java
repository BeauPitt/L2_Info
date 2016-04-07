// package tp4;

class Liste {
	
	private Element lastObj;
    private Element firstObj;
	private Element tmp;
	private Element currObj;
	private int index = 0;

	// Constructeur de la liste qui donne une valeur au premier élément de la liste
	public Liste(int firstVal) {
		Element init = new Element(firstVal, null, null);
		lastObj= init;
        firstObj= init;
		tmp = null;
	}

	// Ajoute un élément dans la liste
	public boolean add(int valeur) {
		tmp = new Element(valeur, lastObj, null);
		lastObj.setSuivant(tmp);
		lastObj = tmp;
		currObj = lastObj;
		index++;
		return true;
	}
	
	// Retourne la valeur grâce à l'index
	public int getValue(int index) {
		currObj = firstObj;
		for(int i = 0; i<=index; i++) {
			currObj = currObj.getSuivant();
			return currObj.getValeur();
		}
		
		return 0;
	}
	
	// Supprime une valeur
	public boolean remove(Element e) {
		int val = e.getValeur();
		Element tmp2 = null;
		if(currObj.getValeur() == val) {
			tmp2= currObj.getSuivant();
			tmp2.setPrecedent(currObj.getPrecedent());
			index--;
		}else {
			if(currObj.getPrecedent() == null) {
				return false;
			}else {
				currObj  = currObj.getPrecedent();
				remove(e);
			}
		}
		return true;
	}
	
	// Retourne si oui ou non un élément e est contenu dans la liste
	public boolean contains(Element e) {
		int val = e.getValeur();
                Element temp1;
        for(int i= 0; i<this.getSize(); i++){
        	if(val == currObj.getValeur()) {
    			return true;
    		}
        	temp1  = currObj.getPrecedent();
            currObj = temp1;
        }
        return false;
	}
        
	// Fonction qui échange les valeurs d'une liste pour qu'elle soit à l'envers (ne fonctionne pas)
    public void reverse() {
        Element tmp1;
        Element tmp2;
        currObj=firstObj;

        for (int i = 0; i<=this.getSize(); i++) {
            tmp1 = currObj.getPrecedent();
            tmp2 = currObj.getSuivant();
            currObj.setSuivant(tmp1);
            currObj.setPrecedent(tmp2);
            firstObj = currObj;
            currObj = tmp2;   
        }
    }
	
	// Retourne la taille de la liste
	public int getSize() {
		return index;
	}
        
	// Affiche la liste (fonction utilisée uniquement pour les phases de test et debug)
    public void afficherListe() {
        currObj=firstObj;
        for (int i = 0; i<=this.getSize(); i++) {
            System.out.print(" " + currObj.getValeur());
            currObj = currObj.getSuivant();
         
        }
        System.out.println("");
    }
}