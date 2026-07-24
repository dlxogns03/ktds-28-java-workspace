package restrant;

public class Foods {
	
	private int full;
	private int alcohol; 
	
	
	public Foods(int full, int alcohol) {
		this.full = full;
		this.alcohol = alcohol;
	}
	
	
	public int getFull() {
		return this.full;
	}
	
	public int getalcohol() {
		return this.alcohol;
	}
}
