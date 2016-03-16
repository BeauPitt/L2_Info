class Heure {
	
	int valeur;
	String event;

	public Heure(int v, String e) {
		if (v >= 8 && v <= 18) {
			valeur = v;
			event = e;
		} else throw new IllegalArgumentException();
	}

	public int getValeur() {
		return valeur;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String toString() {
		if (valeur < 10) {
			return "0"+valeur + " h : " + event; 
		}
		else return valeur + " h : " + event; 
	}
}