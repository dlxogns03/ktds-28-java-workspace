package stringexam;

public class StringExam {
	

	public static int str(String[] str1, String[] str2, int num) {
		
		if (str1.length <= str2.length && str1.length >= 1 && str2.length <= 20) {
			
			if(str2[num].contains(str1[num])) {
				
				return 1;
			}else {
				
				return 0;
			}
			
		}else {
			return 0;
		}
		
		
	}		
	
	
	public static int myStringContaine(String myString , String target) {
		if(myString.length() <= 100 && target.length() <=100 &&
				myString.length() >= 1 && target.length() >= 1) {
			if(myString.contains(target)) {
				return 1;
			}
		}
		
		return 0 ;
	}
	
	public static String Stringnum(int n) {
		return n + "";
	}
	
	
	public static int integerSting(String n_str) {
		return Integer.parseInt(n_str);
	}
	
	public static int splitSum(String n_str) {
		
		int sum = 0;
		if(3<= n_str.length() && 100 >= n_str.length()) {
			String[] num = n_str.split("");
			for (int i =0 ; i < num.length ; i++) {
				sum += Integer.parseInt(num[i]);
			}
			
		}
		return sum;
	}
	
	public static String lowerCase(String myString) {
		
		if(myString.length() <= 100_000 && myString.length() >= 1) {
			return myString.toLowerCase();
		}
		return "0";
	}
	
	public static int lowerCaseContains(String myString, String pat) {
		myString = myString.toLowerCase();
		pat = pat.toLowerCase();
		
		if(myString.contains(pat) && myString.length() > pat.length()
				&& pat.length() <= 300 && myString.length() < 100000
				&& pat.length() >= 1 && myString.length() >= 1) {
			
			return 1;
		}
		
		return 0;
	}
	
	public static String[] upperAndLower(String[] strArr) {
		for(int i = 0; i < strArr.length ; i++) {
			
			if ((i % 2) == 0 ) {
				strArr[i] = strArr[i].toLowerCase();
			}else {
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		return strArr;
	}
	public static void main(String[] args) {
		
		String[] str1 = {"abc", "tbt"};
		String[] str2 = {"aabcc","tbbttb"};
		
		
		System.out.println(str(str1, str2,0));
		System.out.println(str(str1, str2,1));
		
		System.out.println(myStringContaine("banana", "ana"));
		System.out.println(myStringContaine("banana", "wxy"));
		
		
		System.out.println(Stringnum(10));
		
		String n_str = "1235145";
		System.out.println(integerSting(n_str));
		
		n_str = "0001235145";
		System.out.println(integerSting(n_str));
		
		n_str = "123456789";
		System.out.println(splitSum(n_str));
		
		
		String myString = "aBcDeF";
		System.out.println(lowerCase(myString));
	
		myString = "AbCdEfG";
		String pat = "aBc";
		
		System.out.println(lowerCaseContains(myString , pat));
		
		String[] strArr = {"ABA", "BBB", "CFC", "DDD"};
		upperAndLower(strArr);
		for(int i = 0; i < strArr.length ; i ++) {
			System.out.println(strArr[i]);
		}
		
	}

	
}
