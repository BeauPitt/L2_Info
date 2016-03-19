class Heure {

	// attributs
	private int valeur;
	private Event event;

	// constructeur
	public Heure(int v, String e) {
		if (v >= 8 && v <= 18) {
			valeur = v;
			event = new Event(e);
		} else throw new IllegalArgumentException();
	}

	// getters
	public int getValeur() {
		return valeur;
	}

	public Event getEvent() {
		return event;
	}

	// setter
	public void setEvent(Event event) {
		this.event = event;
	}

	// toString
	@Override
	public String toString() {
		if (valeur < 10) {
			return "0"+valeur + " h : " + event;
		}
		else return valeur + " h : " + event;
	}

}
