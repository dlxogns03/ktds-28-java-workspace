package testexam;

public class Exam1 {
	public static void main(String[] args) {
		int korScore = 100;
		int engScore = 80;
		int mathScore = 80;
		int progScore = 10;
		
		
		int sum = 0;
		int average = 0;
		
		sum = korScore + engScore + mathScore + progScore;
		
		
		average = sum / 4;
		System.out.println(average);
		
		if (average >= 95) {
			
			System.out.println("A+");
			
		}
		else if(average >= 90 && average < 95) {
			
			System.out.println("A");
			
		}
		else if(average >= 85 && average < 90) {
			
			System.out.println("B+");
			
		}
		else if(average >= 80 && average < 85) {
			
			System.out.println("B");
			
		}
		else if(average >= 70 && average < 80) {
			
			System.out.println("C");
			
		}
		else {
			
			System.out.println("F");
		}
		
	}
}
