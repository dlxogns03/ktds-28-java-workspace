package utils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
	public static final Scanner CONSOLE;
	static {
		CONSOLE = new Scanner(System.in);
		
	}
	
	public static void inputString(String message) {
		String str = "";
		while(str.isEmpty()) {
			System.out.println(message);
			
			try {
				str = CONSOLE.nextLine();
				
			}catch(InputMismatchException ime) {
				ime.printStackTrace();
				str = "";
			}
		}
		
	}
	
	public static void inputInt(String message) {
		int num = -1;
		System.out.println(message);
		
		while (num<0)
		try {
			num = CONSOLE.nextInt();
			CONSOLE.nextLine();
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
			num = -1;
		}
	}

}
