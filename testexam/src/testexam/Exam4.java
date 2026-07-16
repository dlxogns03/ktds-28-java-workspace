package testexam;

public class Exam4 {
	
	public static void main(String[] args) {
		view(10,20);
		addPrint(5,10);
		
		System.out.println(decimalPlace(10.333333,4));
		
		
		
		PrimeNumber(11);
	}
	
	//1 번
	public static int view(int num1, int num2) {
		System.out.println("정수 형 1 : " + num1);
		System.out.println("정수 형 2 : " + num2);
		return 0;
	}
	
	//2번
	public static void addPrint(int num1, int num2) {
		System.out.println("두 정수의 합 : " +(num1 + num2));
	}
	
	//3번
	public static int addReutrn(int num1, int num2, int num3) {
		return num1 + num2 + num3 ;
	}
	
	
	//4번
	public static void divisionPrint(int num1, int num2) {
		 System.out.println((float)(num1 / num2));
	}
	//4 - 1번
	public static float divisionReturn(int num1, int num2) {
		return (float)(num1 / num2);
	}
	
	
	//5번
	public static double decimalPlace (double num1, int num2) {
		
		for(int i = 0 ; i < num2 ; i ++) {
			
		}
		
		
		
		return num1;
	}
	
	
	//6번
	public static float theBig(float num1 , float num2 ) {
		if (num1 > num2) {
			return num1;
		}else if (num2 > num1) {
			return num2;
		}else {
			return 0;
		}
	}
	//7번
	public static float theMin(float num1, float num2, float num3, float num4) {
		float minnumber = 0f;
		float [] numbers = {num1, num2, num3, num4};
		
		for(int i = 0 ; i < numbers.length ; i++) {
			if(numbers[i]<=num1 && numbers[i]<=num2 && numbers[i]<=num3 && numbers[i]<=num4) {
				minnumber =  numbers[i];
			}else {
				return 0;
			}
		}
		return minnumber;
	}
	
	//8번
	public static void multiple(int [] numbers) {
		for(int i=0 ; i < numbers.length; i++) {
			if((numbers[i] % 2) == 0) {
				
				if((numbers[i] % 5) == 0) {
					if((numbers[i] % 8) == 0) {
						System.out.print(numbers[i]);
					}
				}
				
			}
			
		}
	}
	
	
	//9번
	public static void forString(String name, int num) {
		for(int i = 0 ; i < num; i++) {
			System.out.println(name);
		}
	}
	
	//10번
	public static void multiplicationTable(int num) {
		
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println(num + " x " + i + " = " + (i*num));
			
		}
	}
	
	//11번
	
	public static void PrimeNumber(int num) {
		for(int i = 4; i <= num ; i ++) {
			
			for(int j = 2; j < i ; j++) {
				if(i / j > 0 && i % j == 0 ) {
					System.out.println(i + "는 소수 입니다 ");
					
				}
				
			}
		}
	}
/*

5. 실수형 변수 1개와 정수형 파라미터 1개를 받아 소수점 이하 자리수를 변경하여 반환하는 메소드.

   -> 예> 소수점 변경(10.33333333, 2) ==> 10.33 

   -> 예> 소수점 변경(10.33333333, 3) ==> 10.333

   -> 예> 소수점 변경(10.33333333, 1) ==> 10.3

   -> 예> 소수점 변경(10.33333333, 0) ==> 10.0



11. 정수형 변수 1개를 파라미터로 받아, 4부터 정수형 변수까지의 범위 중 소수(Prime Number)만 출력하는 메소드.

12. 정수형 배열 변수 1개와 정수형 변수 1개를 파라미터로 받아, 해당 배열의 정수형변수 인덱스에 의 값을 반환하는 메소드.

    -> 예> 값(길이가 5인 배열, 2) ==> 배열의 2번 인덱스의 값

    -> 예> 값(길이가 5인 배열, 4) ==> 배열의 4번 인덱스의 값

    -> 예> 값(길이가 5인 배열, 5) ==> 0

    -> 예> 값(길이가 5인 배열, -1) ==> 0

    -> 예> 값(길이가 5인 배열, 1) ==> 배열의 1번 인덱스의 값

    -> 예> 값(길이가 5인 배열, 0) ==> 배열의 0번 인덱스의 값

    -> 예> 값(길이가 5인 배열, 3) ==> 배열의 3번 인덱스의 값

    -> 예> 값(길이가 5인 배열, 7) ==> 0

13. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드    - 정수형 배열 변수내부에 3의 배수가 없을 경우 -1 을 반환.

14. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복값만 출력하는 메소드.

    -> 중복([1,2,3,4,5], [9,7,454,1,2,3]) ==> 1 2 3

15. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.

    -> 고유([1,2,3,4,5], [9,7,454,1,2,3]) ==> 4, 5, 9. 7, 454
16. 정수형 배열 1변수 1개를 파라미터로 받아, 모든 값들을 배수로 만드는 (반환x) 메소드
	-> 호출 이후에 main 메소드 내무에서 배열 내부의 값들을 모두출력
	 */
}
