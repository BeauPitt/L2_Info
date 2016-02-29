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
		String voyelles = "aeiouyAEIOUY";
		for (int i = 0; i < mot.length(); i++) {
			for (int j = 0; j < voyelles.length(); j++) {
				if (mot.charAt(i) == voyelles.charAt(j)) {
					result=result+mot.charAt(i);
				}
			}
		}
		return result;
	}

	public String estPalindrome() {
		String palin= "";
		int result = 0;
		int j = mot.length();
		int i = 0;
		if(mot.length()%2 == 0) {
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
		else if(mot.length()%2 == 1) {
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

	public String estContenu(String motD) {
		int j = 0;
		for (int i = 0; i < mot.length(); i++) {
			if(motD.charAt(0) == mot.charAt(i)){
				j++;
				for(i = i+1; i<mot.length(); i++) {
					
				}
			}
		}
		if(j == motD.length()){
			return "Est contenu";
		}else {
		 	return "n'est pas contenu";
			}
		}

}