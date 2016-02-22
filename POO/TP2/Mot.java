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
}