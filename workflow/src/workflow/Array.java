package workflow;

public class Array {
	public static void main(String[] args) {
		
		//여러개의 변수를 하나의 변수로 병합한다 ==> 배열
		//배열을 만드는 방법
		//자료형 [] 변수의 이름 = new 자료형 [값의 개수 ];
		
		char[] numArray = new char[6];
		
		
		numArray[0] = 5;
		numArray[1] = 6;
		numArray[2] = 9;
		numArray[3] = 11;
		numArray[4] = 12;
		numArray[5] = 13;
		
		//numArray를 출력한다.
		System.out.println(numArray);//[I@28a418fc ==> type@HashData
		
		//numArray에 합쳐진 변수의 개수를 구한다 ==> 인덱스의 길이
		
		System.out.println(numArray.length);
		
		//숫자 여러개가 주어진다.
		//5, 6, 9, 11, 12, 13, ...
		//주어진 숫자들이 소수인지 확인한다.
		
		//int[] numbers = {5, 6, 9, 11, 12,13};
		
		int num1 = 5;
		int num2 = 6;
		int num3 = 9;
		int num4 = 11;
		int num5 = 12;
		int num6 = 13;
		for(int i  = 0 ; i < numArray.length ; i ++) {
			//System.out.println(numArray[i]);
			boolean isRemainZero = false;
			
			for (int j = 2; j < numArray[i]; j ++) {
				if(numArray[i] % j ==0) {
					System.out.println(numArray[i] + "은 소수가 아닙니다 ");
					isRemainZero = true;
					break;
				}
			}
			
			if ( ! isRemainZero) {
				
				System.out.println(numArray[i] + "은 소수입니다");
				
			}
		}
		
		// num2이 소수 이면 "소수 입니다" 를 출력, 아니면 "소수가 아닙니다."
		
		boolean isRemainZero = false;
		
		for (int i = 2; i < num2; i ++) {
			if(num2 % i ==0) {
				System.out.println(num2 + "은 소수가 아닙니다 ");
				isRemainZero = true;
				break;
			}
		}
		
		if (isRemainZero == false ) {
			
			System.out.println(num2 + "은 소수입니다");
			
		}
		
		isRemainZero = false;
		
		for (int i = 2; i < num3; i ++) {
			if(num3 % i ==0) {
				System.out.println(num3 + "은 소수가 아닙니다 ");
				isRemainZero = true;
				break;
			}
		}
		
		if (isRemainZero == false ) {
			
			System.out.println(num3 + "은 소수입니다");
			
		}
		
		
	}

}
