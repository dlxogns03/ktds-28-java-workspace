package workflow;

public class MethodExam {
	public static void print () {
		System.out.println("안녕하세요");
	}
	
	
	public static void powerAndPrint(int number) {
		int powerResult = number* number;
		System.out.println(powerResult);
	}
	
	public static void printNameAndAge(String name, int age) {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	
	public static double divideTwoNumbers(int num1, int num2) {
		double divResult = (double) num1 / num2;
		return divResult;
	}
	
	
	public static void main(String[] args) {
		// 단순하게 출력하는 메소드(함수)를 생성하고 호출해본다.
		print();
		print();
		print();
		print();
		
		//파라미터(인자)가 있는 메소드를 생서하고 호출
		
		
		powerAndPrint(1);
		powerAndPrint(10);
		powerAndPrint(5);
		powerAndPrint(3);
		//파라미터가 여러개 있는 메소드를 생성하고 호출해본다.
		printNameAndAge("이태훈", 10);
		
		//반환값이 있는 메소드를 생성하고 호출 한 뒤 결과를 출력해본다.
		double div1 =divideTwoNumbers(10,3);
		System.out.println(div1);
		double div2 = divideTwoNumbers(20,3);
		System.out.println(div2);
	}
	
	// stack 제일 먼저 넣은 데이터가 제일 나중에 빠진다 
	// first in lastout
	
	

}
