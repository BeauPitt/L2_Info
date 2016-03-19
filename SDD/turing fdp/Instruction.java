
public class Instruction {
	
	char c, c_;
	int n, n_;
	boolean d; // <- : false, -> : true	
	
	public Instruction(char c, int n, int n_, char c_, boolean d) {
		this.c = c;
		this.n = n;
		this.n_ = n_;
		this.c_ = c_;
		this.d = d;
	}
	
	public char getC() {
		return c;
	}

	public char getC_() {
		return c_;
	}

	public int getN() {
		return n;
	}

	public int getN_() {
		return n_;
	}

	public boolean getD() {
		return d;
	}
}
