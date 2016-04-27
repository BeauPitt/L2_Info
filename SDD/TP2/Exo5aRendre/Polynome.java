/*
* Classe Polynome
*/
import java.util.*;

class Polynome {

  // attributs
  private ArrayList<Element> polynome;
  private String poly;

  // constructeur
  public Polynome(String p) {
    poly = p;
  }

  public void Saisie() {
    Scanner sc = new Scanner(System.in);
    poly = sc.nextLine();
  }

  // ToString
  public String toString() {
    return poly;
  }


}
