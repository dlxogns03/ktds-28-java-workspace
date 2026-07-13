package workflow;

public class IfCondition {
	
	public static void main(String [] args) {
		
		int num1 = 31;
		int num2 = 33;
		// num1과 num2중에 큰수를 출력해라 
		
		//num1 이 num2보다 크다면 num1을 출력해라
		if (num1 > num2) {
			
			System.out.println(num1);
			
		}
		//num2가 num1보다 크다면 출력 ↓
		else if (num1 < num2) {
			
			System.out.println(num2);
		
			
		}
		
		//num1 과 num2가 같다 ↓
		else {
			System.out.println("같다");
		}
		
	}

}
