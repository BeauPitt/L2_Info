import java.io.*;

class Mot {
	private String mot;

	public Mot() {
		mot = null ;
		try {
		Reader isr = new InputStreamReader(System.in) ;
		BufferedReader br = new BufferedReader(isr) ;
		mot = br.readLine() ;
		}
		catch (IOException e) {
		}
	}

	public String toString() {
		return mot;
	}

	public String afficheVoyelles() {
		String result="";
		String voyelles = "aeiouyAEIOUY";  //Chaine de caractère regroupant les voyelles
		for (int i = 0; i < mot.length(); i++) {
			for (int j = 0; j < voyelles.length(); j++) {
				if (mot.charAt(i) == voyelles.charAt(j)) { //comparaison entre la chaine de voyelle et le mot
					result=result+mot.charAt(i);
				}
			}
		}
		return result; //retour d'une chaine de caractère composé uniquement de voyelles
	}

	public String estPalindrome() {
		String palin= "";
		int result = 0;
		int j = mot.length();
		int i = 0;
		if(mot.length()%2 == 0) { //si le mot a un nombre pair de lettres
			while(i<j) {
				if (mot.charAt(i) == mot.charAt(j-1)) {
					result = result + 2;
				}
				j--;
				i++;
			}
			if(result == mot.length()) {
				palin = "Oui";
			} 
			else {
				palin = "Non";
			}
		}
		else if(mot.length()%2 == 1) { //si le mot contient un nombre impair de lettres
			while(i!=j-1){
				if (mot.charAt(i) == mot.charAt(j-1)) {
					result = result + 2;
				}
				j--;
				i++;
			}
				if((result+1/2)+1 == mot.length()) {
					palin = "Oui";
				} 
				else {
					palin = "Non";
				}
			
		}
		return palin;
	}

	public boolean estContenu(String motD) {
		return mot.contains(motD);  //la fonction contains retourne true si il le string mot contient motD
	}
/*	public String tri(){
		String tmp ="";
		for(int i =0; i<mot.length(); i++){
													//fonction non aboutie
		}
	}
*/
}