package martexam;

public class NewCustomer implements Customer{

	private String name;
	private int cash;
	private int age;

	
	public NewCustomer(String name, int cash, int age) {
		this.name = name;
		this.age = age;
		this.cash = cash;
		
	}


	@Override
	public void buy(Goods[] goods) {
		// TODO Auto-generated method stub
		
	}
	

}
