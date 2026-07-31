package workflow;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		
		//키보드에서 값을 받아올수 있는 변수하나를 생성
		Scanner keybord = new Scanner(System.in);
		
		// 업다운 게임 시작 출력 
		System.out.println("업 다운 게임 시작");
		
		// 0 ~ 99 사이의 숫자를 임의로 생성.
		double randomNumber = Math.random();
		int goal = (int)(randomNumber * 100);
		
		
		//System.out.println(goal);
		
		int value = -1;
		while(goal != value) {
			// 사용자로부터 값을 입력 받는다.
			System.out.println("값을 입력해주세요 : ");
			value = keybord.nextInt();
			
			// 임의의 숫자 == 입력값 
			// '정답'
			
			if(goal == value) {
				System.out.println("정답입니다");
				
			}
			
			// 임의의 숫자 > 입력값
			// 'up'
			
			else if (goal > value) {
				System.out.println("up");
			}
			
			// 임의의 숫자 < 입력값 
			// 'down'
			
			else {
				System.out.println("down");
			}
			
			
		}
		keybord.close();// app <-> keybord 사이에 생성된 Pipe를 제거
		
	}

}
