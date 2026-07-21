package classexam;

public class Custamer {
	
	
	int cash ;
	int buyItems;
	int bag;
	
	public Custamer (int cash, int buyItems) {
		this.cash = cash;
		this.buyItems = buyItems;
		this.bag = buyItems;
	}
	
	public int buyer (int price) {
		int cash = this.cash - price;
		return cash;
	}
	
	
	
	public int bagCount (int stock) {
		this.bag = stock;
		
		return this.bag;
	}

}
