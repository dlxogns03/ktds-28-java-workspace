package operations;

public class OperationsMain {
	public static void main(String [] args) {
		
		int num =10;
		System.out.println(num++);
		System.out.println(++num);
		
		
		System.out.println(num--);
		System.out.println(--num);
		
		
		int num3 = 3;
		int num4 = 5;
		// num ++ ; 세미콜론 뒤에 ++ 수행
		int operResult = num ++ + num3 * num4;
		System.out.println(operResult);
		
		
		//나누기의 나머지를 구한다 
		int num1 = 10;
		int num2 = 3;
		
		int mod = num1 % num2;
		System.out.println(mod);
		
		int bigNumber = 1_000_000_000;
		int powerResult = bigNumber * bigNumber;
		
		System.out.println(powerResult);
		
		
		
		
		int maxIntValue = Integer.MAX_VALUE;
		int minIntValue = Integer.MIN_VALUE;
		
		//maxIntValue = maxIntValue + 1;
		//minIntValue = minIntValue - 1;
		
		//maxIntValue +=1;
		// ++나 --는 위치에 따라 먼저 증감할지 아니면 출력후에 증감할지 정해진다
		maxIntValue ++;
		
		//minIntValue -= 1;
		minIntValue --;
		
		System.out.println(maxIntValue);
		System.out.println(minIntValue);
		
		// Screaming Snake Case
		final float SUBJECT_COUNT = 3f;
		
		
		
		int kor = 80;
		int math =90;
		int sci = 93;
		
		float avg = (kor + math + sci) / SUBJECT_COUNT ;
		
		System.out.println(avg);
		
		int firstNumber = 40;
		int secondNumber = 20;
		//firstNumber + secondNumber
		
		int Result = firstNumber + secondNumber;
		System.out.println(Result);
		
		
		//first - second
		Result = firstNumber - secondNumber;
		System.out.println(Result);
		
		//first * second
		Result = firstNumber * secondNumber;
		System.out.println(Result);
		
		//first / second 
		Result = firstNumber / secondNumber;
		System.out.println(Result);
		
		float firstDoubleNumber = 10.5f;
		float secondDoubleNumber = 3.55f;
		float divDoubleNumber = firstDoubleNumber /secondDoubleNumber;
		System.out.println(divDoubleNumber);
		
		//first % second
		Result = firstNumber % secondNumber;
		System.out.println(Result);
	}

}
