package martexam;

public class CommonCus implements Customer{
	
	private String name;
	private int cash;
	private int age;
	

	
	public CommonCus(String name, int cash, int age) {
		this.name =name;
		this.cash = cash;
		this.age = age;
		
	}



	@Override
	public void buy(Goods[] goods) {
		
	}
	
	
	

}
