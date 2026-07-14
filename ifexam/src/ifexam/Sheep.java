package ifexam;

public class Sheep  {
	
	private static int service = 0;
	
	public static void main(String[] args) {
		/* 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 
		 * 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
		 * 정수 n과 k가 매개변수로 주어졌을 때, 
		 * 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지
		 *  return 하도록 solution 함수를 완성해보세요.
		 */
		
		
		System.out.println(solution(10,3) + "원 이고 서비스로 받은 음료수의 갯수는 " + service + "개 입니다.");
		
		
		
		
		
	}
	
	public static int solution(int n, int k) {
		
		
		int price = 0;
		
		if (n >= 10) {
			service += n / 10;
			k -= service;
		}
		
		price = (n * 12000) + (k * 2000);
		
		
		return price;
	}
	
	
	public void swtich1 () {
		
		int step = 1 ;
		
		switch (step) {
			case 1:
				System.out.println("라면선택하기");
			case 2:
				System.out.println("냄비꺼내기");
			case 3:
				System.out.println("물받기 500");
			case 4:
				System.out.println("냄비를 가스레인지에 올리기");
			case 5:
				System.out.println("가스불켜기 ");
			case 6:
				System.out.println("물이 끓으면 면과스프 넣기");
				break;
			case 7:
				System.out.println("계란1개풀기");
			case 8:
				System.out.println("불을 끄고 먹는다");
			default:
				System.out.println("설거지한다");
		}
	}
	

}
