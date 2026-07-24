package stringexam;

public class ArrayExam {
	public static void main(String[] args) {
		
		//1. 자료형 [] 배열이름 = new 자료형[배열길이]
		int[] num1 = new int[3];
		
		
		//2.자료형[] 배열이름 = new 자료형[]{각 인덱스에 들어갈 값들}
		int[] num2 = new int[]{1,3,4};
		
		
		//3.자료형[] 배열이므 = {각 인덱스에 들어갈 값들}
		// 사용하는 방법이 제한적
		int[] num3 = {1,2,3};
		
		
		
		printArrysValue(num3);
		
		printArrysValue(new int[5]);
		
		printArrysValue(new int[] {1,2,3,4});
	}
	
	public static void printArrysValue(int[] num3) {
		for(int i =0 ; i < num3.length ; i++) {
			System.out.println(num3[i]);
		}
	}
}
