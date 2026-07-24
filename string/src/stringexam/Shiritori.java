package stringexam;

import java.util.Scanner;

public class Shiritori {
	
	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		String startword = "자전거";
		int count = 0;
		System.out.println(startword);
		
		String nextword = "";
		
		String startEndWord = startword.substring(startword.length()-1);
		
		System.out.println(startEndWord);
		
		while(true) {
//			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("\"" + startEndWord + "\"로 시작하는 단어 입력 : ");
			nextword = keybord.nextLine();
			nextword = nextword.replace(" ", "");
			
			if (nextword.length() < 3) {
				System.out.println("글자수 부족");
				break;
			}
			if(nextword.startsWith(startEndWord)) {
				System.out.println("입력한 단어 : " + nextword);
				startEndWord = nextword.substring(nextword.length()-1);
			
			}else { 
				
				System.out.println("마지막 단어 : " + nextword);
				
				break;
				
			}
			count++;
		}
		
		
		System.out.println("이어나간 단어의 수 : " + count);
		
	}

}
