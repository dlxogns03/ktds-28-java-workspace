package ifexam;

public class Angle {
	
	public static void main(String[] args) {
		
		/* 예각일 때 1 
		 * 직각일때 2 
		 * 둔각일때 3 
		 * 평각일때4 
		*/
		
		int angle = 0;
		
		if (angle < 90 && angle > 0) {
			
			System.out.println("1 예각입니다");
			
		}else if (angle == 90) {
			
			System.out.println("2 직각입니다");
			
		}else if (angle > 90 && angle < 180) {
			
			System.out.println("3 둔각입니다");
			
		}else if (angle == 180) {
			
			System.out.println("4 평각입니다");
			
		}else {
			
			System.out.println("유효하지 않은 각입니다");
			
		}
		
	}
	
	

}
