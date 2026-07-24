package stringexam;

public class StringBufferTest {
	
	
	public static void changeStr(StringBuffer str) {
		str.append("바뀌었을까요?");
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		StringBuffer message  = new StringBuffer();
		
		message.append("원본입니다");
		
		changeStr(message);
		System.out.println(message);
		
		
		
		
	}
}
