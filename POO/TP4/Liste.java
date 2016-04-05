// package tp4;

class Liste {
	
	private Element lastObj;
    private Element firstObj;
	private Element tmp;
	private Element currObj;
	private int index = 0;

	public Liste(int firstVal) {
		Element init = new Element(firstVal, null, null);
		lastObj= init;
                firstObj= init;
		tmp = null;
	}

	public boolean add(int valeur) {
		tmp = new Element(valeur, lastObj, null);
		lastObj.setSuivant(tmp);
		lastObj = tmp;
		currObj = lastObj;
		index++;
		return true;
	}
	
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
	
	public boolean contains(Element e) {
		int val = e.getValeur();
                Element temp1;
                boolean result = false;
		if(val == currObj.getValeur()) {
			result = true;
		}else {
				temp1  = currObj.getPrecedent();
                                currObj = temp1;
				this.contains(e);
                }
                return result;
	}
        
    public void reverse() {
        Element tmp1;
        Element tmp2;
        currObj=firstObj;

        for (int i =0; i<=this.getSize(); i++) {
            tmp1 = currObj.getPrecedent();
            tmp2 = currObj.getSuivant();
            currObj.setSuivant(tmp1);
            currObj.setPrecedent(tmp2);
            firstObj = currObj;
            currObj = tmp2;   
        }  
    }
	
	
	public int getSize() {
		return index;
	}
        
    public void afficherListe() {
        currObj=firstObj;
        for (int i =0; i<=this.getSize(); i++) {
            System.out.print(" " + currObj.getValeur());
            currObj = currObj.getSuivant();
         
        }
        System.out.println("");
    }
}