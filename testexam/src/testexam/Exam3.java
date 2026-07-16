package testexam;

public class Exam3 {
	/*1. 정수 두 개를 받아서 사칙연산(+,-, X, /) 의 결과를 출력하는 메소드를 만들고 호출해보세요.

		2. 정수 한 개를 받아서 짝수라면 true를, 홀수라면 false를 반환하는 메소드를 만들고 호출해보세요.
		
		3. 정수 세 개를 받아서 가장 큰 수를 출력하는 메소드를 만들고 호출해보세요.
		
		4. 정수 한 개를 받아서 소수(prime number)라면 true를 아니라면 false를 반환하는 메소드를 만들고 호출해 보세요.
	*/
	
	public static void elementary(int num1, int num2) {
		System.out.println("더하기 " + (num1 + num2));
		System.out.println("빼기 " + (num1 - num2));
		System.out.println("곱하기 " + (num1 * num2));
		System.out.println("나누기 " + (num1 / num2));
	}
	
	
	public static boolean oddAndEven(int num) {
		
		if (num % 2 == 1) {
			return false;
		}
		
		return true;
	}
	
	public static void compare(int first, int second, int third) {
		
		int[] numbers = {first, second, third};
		
		for(int i = 0 ; i < numbers.length ; i++) {
			
			if(numbers[i] >= first && numbers[i] >= second && numbers[i] >= third) {
				
				System.out.println(numbers[i] + "(이)가 가장 큰수 입니다.");
				break;
				
			}
			
		}
			
	}
	
	public static boolean primeNumber(int num) {
		
		for (int i = 2 ; i < num; i ++ ) {
			if ((num % i) == 0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		elementary(30, 5);
		System.out.println();
		
		
		System.out.println(oddAndEven(11));
		System.out.println();
		
		
		compare(100, 40, 110);
		System.out.println();
		
		
		System.out.println(primeNumber(10));
		System.out.println();
	}


	

}
