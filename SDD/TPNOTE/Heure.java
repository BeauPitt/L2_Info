/*
* Classe Heure
*/

import java.util.*;

class Heure {

	// Attributs

	private int valeur;
	private String event;

	// Constructeur

	public Heure(int v, String e) {
		// Une heure doit etre comprise entre 8 et 18h
		if (v < 19 && v > 7) {
			valeur = v;
			event = e;
		}	
		else {
			throw new IllegalArgumentException();
		}
	}

	// Getters

	public int getValeur() {
		return valeur;
	}

	public String getEvent() {
		return event;
	}

	// Redefinition toString

	@Override
	public String toString() {
		return (valeur + "h : " + event);
	}
}