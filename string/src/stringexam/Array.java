package stringexam;


import java.util.Arrays;

public class Array {
	
	public static String Ary(String[] arr) {
		String Array = String.join("", arr);
		return Array;
	}
	
	public static int[]sortArraysfive(int[] num_list) {
		int [] numbers = new int[num_list.length-5];
		int count = 0;
		Arrays.sort(num_list);
		
		for(int i = 5; i < num_list.length ; i++) {
			
			
			
			numbers[count] += num_list[i];
			count++;
		}
		return numbers;
	}
	
	public static int[] sortArraysfive2(int [] num_list) {
		int[] numbers = new int [5];
		Arrays.sort(num_list);
		for(int i = 0; i < 5; i++) {
			numbers[i] += num_list[i];
		}
		return numbers;
	}
	
	
	public static int[] sumArrys(int[] arr, int a) {
		
		if((arr.length % 2) == 0 ) {
			for(int i = 0; i < arr.length; i ++) {
				if ((i % 2 ) != 0) {
					arr[i] += a;
				}
			}
		}else {
			for(int i = 0; i < arr.length ; i ++) {
				if ((i % 2) == 0) {
					arr[i] += a;
				}
			}
		}
		
		return arr;
	}
	
	
	public static int arryIf(int[] num1, int[]num2) {
		
		if(num1.length < num2.length){
			return -1;
		}else if (num1.length > num2.length) {
			return 1;
		}else {
			return 0;
		}
		

	}
	
	
	
	public static int[] ArrayAddint (int[] arr1) {
		int sum = 0;
		for(int i = 0; i < arr1.length ; i++ ) {
			sum += arr1[i];
		}
		
		
		int[] X = new int[sum];
		int count = 0;
		
		for(int i = 0; i < arr1.length ; i++) {
			for(int j = 0; j < arr1[i]; j++) {
				X[count] = arr1[i];
				count++;
			}
		}
		
		return X;
	}
	
	
	public static int[] stringsplit(String myString2) {
		if(myString2.endsWith("x")) {
			myString2 += " ";
		}
		
		String[] arr = myString2.split("x");
		
		int[] lgth = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			lgth[i] = arr[i].trim().length();
		}
		
		return lgth;
	}
	/**
	 * "[] {2<- 대괄호 안에 있는 글자의 갯수), 3 } <-2글자 아님 3글자를 바꿔라 
	 * @param my_string
	 * @return
	 */
	public static String[] splitString(String my_string) {
		
		my_string = my_string.trim();
		my_string = my_string.replaceAll("\\s+", " ");
		String[] arr = my_string.split(" ");
		return arr;
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		System.out.println(Ary(arr));
		
		
		int[] num_list = { 12, 1, 2, 3, 45, 26, 47, 40};
		
		num_list = sortArraysfive(num_list);
		System.out.println(num_list[2]);
		
		int[]num_list2 = {12, 1, 2, 3, 45, 26, 47, 40};
		num_list2 = sortArraysfive2(num_list2);
		System.out.println(num_list2[4]);
		
		
		
		System.out.println("=======");
		int[] arrnum = {49, 12, 100, 276, 33 , 10};
		arrnum = sumArrys(arrnum, 2);
		for(int i = 0 ; i < arrnum.length ; i++) {
			System.out.println(arrnum[i]);
		}
		
		System.out.println("=====");
		int [] num1 = {1,2,3,4};
		int [] num2 = {1,2,3,4};
		System.out.println(arryIf(num1, num2));
		
		
		
		System.out.println("====");
		int[] arr1 = {5,1,4};
		arr1 = ArrayAddint(arr1);
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("====");
		String myString2 = "oxooxoxxox";
		
		int[] splitArr = stringsplit(myString2);
		for(int i = 0 ; i<splitArr.length ; i++ ) {
			System.out.println(splitArr[i]);
		}
		
		System.out.println("====");
		String my_string = "programmers";
		System.out.println(splitString(my_string)[0]);
		
		
		
	}
}
