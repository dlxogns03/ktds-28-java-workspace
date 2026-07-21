package classexam;

public class Seller {
	
	
	
	
	int itemStock;
	int itemPrice;
	int itemSell;
	
	public Seller(int itemPrice, int itemStock) {
		
		this.itemStock = itemStock;
		this.itemPrice = itemPrice;
		
	}
	
	
	
	public void sales (int buyitems, int price) {
		
		this.itemStock -= buyitems;
		
		this.itemSell = (buyitems * price);
		
	
	}
	

}
