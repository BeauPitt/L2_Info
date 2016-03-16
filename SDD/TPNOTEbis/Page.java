/*
* Classe Page (d'agenda)
*/

import java.util.Scanner; 
import java.io.*;

class Page {
	
	// attributs
	public static final int NB_JOUR = 7;
	int identif;
	Jour jours[] = new Jour[NB_JOUR];

	// constructeur
	public Page(int id) {
		if (id < 52) {
			identif = id;
			for(int j = 0; j < NB_JOUR; j++){
				jours[j] = new Jour(j);
			}
		} else throw new IllegalArgumentException();
	}

	// getter
	public int getID() {
		return identif;
	}

	// toString
	@Override
	public String toString() {
		return "Semaine "+identif;
	}

	// Affichage d'une page de calendrier
	public void affichage() {
		// On affiche la semaine
		System.out.println("\nAGENDA >> "+this+ " <<\n");
		System.out.print("######  ");
		// On affiche les jours de la semaine
		for (int i = 0; i < NB_JOUR; i++) {
			System.out.print(""+ jours[i].toString()+"   |  ");	
		}
		// esthetique...
		System.out.print("\n");
		System.out.println("###### ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("\n");

		// On affiche les heures
		for (int i = 0; i < Jour.NB_HEURE; i++) {
			System.out.print(jours[0].heures[i].toString());
			// On affiche les évenements
			for (int j = 0; j < NB_JOUR; j++) {
				System.out.print(jours[j].heures[i].event);
			}
			System.out.print(" \n\n");
		}
	}

	// fonction d'ajout d'evenement
	public void ajouterEvent() {
			// le scanner permet de recuperer la saisie
			Scanner sc = new Scanner(System.in);
			System.out.println("Quel jour ?");
			System.out.print("1 : lundi, ");
			System.out.print("2 : mardi, ");
			System.out.print("3 : mercredi, ");
			System.out.print("4 : jeudi, ");
			System.out.print("5 : vendredi, ");
			System.out.print("6 : samedi, ");
			System.out.println("7 : dimanche");
			// on récupère le jour 
			int jourJ = sc.nextInt() - 1;
			System.out.println("Quelle heure ? Entre 8 et 18h");
			// on récupère l'heure
			int heureH = sc.nextInt() - 8;
			System.out.println("Et enfin, quel evenement voulez vous ajouter ?");
			// on récupère l'evenemet
			String eventEnope = sc.nextLine(); // Deux scanner car sinon bug
			String eventE = sc.nextLine(); // l'evenement est stocke dans cette variable
			this.jours[jourJ].heures[heureH].event = eventE;
			System.out.println("Evenement ajouté.")
	}
}