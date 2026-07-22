package cafe;

public class ComicsBook {
	
	private String name;
	private boolean IsRented;
	private int rentFee;
	//생성자
	public ComicsBook(String name, boolean rentalStaus, int rentFee) {
		this.name = name;
		this.IsRented = rentalStaus;
		this.rentFee = rentFee;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getIsRented() {
		return this.IsRented;
	}
	
	public int getRentFee() {
		return this.rentFee;
	}
	
	public void rent() {
		this.IsRented = true;
	}
	
	public void returnBook() {
		this.IsRented = false;
	}

}
