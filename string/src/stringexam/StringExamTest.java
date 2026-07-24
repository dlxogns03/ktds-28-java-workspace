package stringexam;

import org.w3c.dom.html.HTMLBodyElement;

/**
 * 정규 표현식
 * https://regexr.com/
 * 
 * "^ <- 뒤에 나오는 패턴으로 시작해야한다.
 * [ (그룹) ]<- 그룹내의 글자가 한개 존재한다.
 * + <- 한개 이상있다.
 * $ <- 그리고 끝난다.
 * [^ ] <- 그룹내에 ^이 있으면 그룹을 부정한다.
 */
public class StringExamTest {
	
	public static void main(String[] args) {
		
		
		/**
		 * formating oracel 공식 가이드 사이트
		 * https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		 */
		
		//format binding (static method)
		int num =2 ;
		String messageFormat = "%s 에서 교육하는 %s과정, %d시간 %d일 과정, %.2f 진행했습니다.";
		
		String message = String.format(messageFormat, 
										"ktds University",
										"Java Programming",
										800,
										100,
										(8/100d));
		System.out.println(message);
		
		//format
		
		
		int biggestNumber = Integer.MAX_VALUE;
		System.out.println(biggestNumber);
		
		String numberString = "%,d".formatted(biggestNumber);
		System.out.println(numberString);
		
		
		/**
		 *  
		 */
		
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.endsWith("");
		System.out.println(isSeoul);
		
		String name = "ktdsuniversity";
		boolean isEqual = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println(isEqual);
		
		String alphabets = "abcdefg";
		int letterCIndex = alphabets.indexOf('C');
		System.out.println(letterCIndex);
		
		
		
		String str = "     ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		
		boolean isEmpty = str.isEmpty();
		
		System.out.println(isEmpty);
		
		
		
		String message1 = "안녕하세요";
		String name1 = "홍길동님 ";
		String helloMessage = String.join(" -- " , message1, name1);
		System.out.println(helloMessage);
		
		String message2 = "asdfjklbaafljn";
		int letterALastIndex = message2.lastIndexOf("a");
		System.out.println(letterALastIndex);
		
		
		letterALastIndex = message2.lastIndexOf("jk");
		System.out.println(letterALastIndex);
		
		
		
		int length = message2.length();
		System.out.println(length);
		
		
		
		String phone = "01056262008";
		Boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println(isNumber);
		
		
		String message3 = "안녕하세요, 홍길동님, 안녕히가세요, 홍길동님";
		message3 = message3.replace("홍길동", "ktds");
		System.out.println(message);
		
		
		
		phone = "010-5626-2008";
		phone = phone.replaceAll("[^0-9]", "");
		System.out.println(phone);
		
		phone = "010-5626-2008";
		String[] phoneArea = phone.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
		
		
		
		phone = "+8210-5626-2008";
		
		boolean isKoreaNum = phone.startsWith("+82");
		System.out.println(isKoreaNum);
		
		
		String datetime = "2026-07-23 14:30:20";
		String year = datetime.substring(0,4);
		System.out.println(year);
		
		
		String hour = datetime.substring(11, 13);
		System.out.println(hour);
		
		
		String time = datetime.substring(11);
		System.out.println(time);
		
		
		
		
		
		datetime = "         2026-07-23 14:30:20     ";
		
		System.out.println(datetime.length());
		System.out.println(datetime);
		
		
		
		
		datetime = datetime.trim();
		System.out.println(datetime.length());
		System.out.println(datetime);
		
		
		String iStr = String.valueOf(1);
		System.out.println(iStr);
	}

}
