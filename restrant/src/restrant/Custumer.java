package restrant;

public class Custumer {
	
	private int age;
	private boolean prants;
	private int full;
	private int alcohol;
	
	public Custumer(int age, boolean prants) {
		this.age = age;
		this.prants = prants;
	
	}
	
	public void eat(int full, int alcohol) {
		if(alcohol > 0) {
			if(agreeAlcohol()) {
				if(this.full + full > 100) {
					System.out.println("더이상 음식을 드실수 없습니다.");
					return;
				}
				
				if(this.alcohol + alcohol > 60) {
					System.out.println("더이상 술을 드실수 없습니다");
					return;
				}
				
				this.full += full;
				this.alcohol += alcohol;
				
				
				if(this.full < 0) {
					this.full = 0;
				}else if(this.alcohol < 0) {
					this.alcohol = 0;
				}
				
			}
			
		}else {
			if(this.full + full > 100) {
				System.out.println("더이상 음식을 드실수 없습니다.");
				return;
			}
			
			if(this.alcohol + alcohol > 60) {
				System.out.println("더이상 술을 드실수 없습니다");
				return;
			}
			
			this.full += full;
			this.alcohol += alcohol;
			
			
			if(this.full < 0) {
				this.full = 0;
			}else if(this.alcohol < 0) {
				this.alcohol = 0;
			}
		}
		
		
		System.out.println("포만감 : " + this.full);
		System.out.println("취기 : " + this.alcohol);
		
	}
	
	
	public boolean agreeAlcohol() {
		if(this.age < 19 && !this.prants) {
			System.out.println("부모 미동반 미성년자여서 술을 제공할수 없습니다");
			return false;
		}
		return true;
	}
	
	public int getFull() {
		return this.full;
	}
	
	public int getAlcohol() {
		return this.alcohol;
	}
	
}
