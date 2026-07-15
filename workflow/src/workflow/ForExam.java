package workflow;

public class ForExam {
	
	public static void main(String [] args) {
		
		
		// 1번
		int sum = 0;
		
		for(int i = 1 ; i< 101 ; i++) {
			
			sum += i ;
		}
		
		System.out.println(sum);
		
		
		
		//2번
		
		sum = 0;
		for(int i = 1 ; i < 101 ; i++) {
			
			if ((i % 2) == 1) {
				
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
		
		
		//3번 
		
		for(int i = 1; i < 101 ; i++) {
			
			if ((i % 3) == 0) {
				
				System.out.println(i);
				
			}else if ((i % 5) == 0) {
				
				System.out.println(i);
				
			}else if((i % 6) == 0) {
				
				System.out.println(i);
				
			}
		}
		
		
		
		//4번
		
		for(int i = 1 ; i < 6; i++) {
			
			for(int j = 1 ; j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		/*
		for(int i = 2 ; i < 10; i++){
			
			for(int j = 1; j < 10; j++) {
				
				System.out.println(i +" X " + j + " = " + (i * j));
				
			}
			
		}
		*/
	}

}
