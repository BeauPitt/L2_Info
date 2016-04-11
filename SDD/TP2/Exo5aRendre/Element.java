/*
* Classe Element
*/

class Element {

  // attributs
  private int valeur;
  private char operand;

  // constructeurs
  public Element(int v) {
    valeur = v;
  }

  public Element(char op) {
    operand = op;
  }

  // getters
  public int getValeur() {
    return valeur;
  }

  public char getOperand() {
    return operand;
  }

  public String toString() {
    if (operand != '\u0000') {
      return ""+operand;
    }
    else return ""+valeur;
  }

}
