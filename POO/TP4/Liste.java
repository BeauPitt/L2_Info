class Liste {
	
	private int val;
	private Element current;
	private Element tmp;
	public Liste(int firstVal) {
		Element init = new Element(firstVal, null, null);
		current= init;
		tmp = null;
	}

	public void ajouterElem(int valeur){
		tmp = new Element(valeur, current, null);
		current.setSuivant(tmp);
		current = tmp;
	}
}