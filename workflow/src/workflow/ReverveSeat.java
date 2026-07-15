package workflow;



public class ReverveSeat {
	
	public static void main(String[] args) {
		
		int[] seats = new int[50];
		
		
		int agree = 0;
		int disagree = 0;
		
		//랜덤하게 좌석을 배정
		//0 <-- 예약 가능한 좌석 
		//1 <-- 예약 불가 좌석
		
		for(int i = 0; i < seats.length ; i ++) {
			seats[i] = (int) (Math.random() * 2);
		}
		
		//배열의 값을 출력
		for(int i = 0; i < seats.length; i ++) {
			System.out.print(seats[i]);
			
			if (seats[i] == 0) {
				
				agree ++;
				
			}else {
				
				disagree ++;
			}
		}
		
		
		
		System.out.println();
		
		//예약 가능한 좌석의 수를 출력
		//x개의 좌석을 예약할 수 있습니다.
		System.out.println(agree + "개의 좌석을 예약할 수 있습니다. ");
		
		//예약 불가능한 좌석의 수 출력
		//y개의 좌석을 예약할 수 있습니다.
		System.out.println(disagree + "개의 좌석이미 예약되어 있습니다. ");
		
		
		
		String longText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since 1966, when designers at Letraset and James Mosley, the librarian at St Bride Printing Library in London, took a 1914 Cicero translation and scrambled it to make dummy text for Letraset's Body Type sheets. It has survived not only many decades, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised thanks to these sheets and more recently with desktop publishing software like Aldus PageMaker and Microsoft Word including versions of Lorem Ipsum.";
		char[] letters = longText.toCharArray();
		int add = 0;
		//character는 홀따옴표('')로 작성.
		for (int i = 0; i < letters.length; i++) {
			
			if (letters[i] == 's') {
				
				add++;
			}
		}
		System.out.println("'s'의 갯수는 : " + add);
		
		System.out.println(letters.equals((char[])longText.toCharArray()));
		
		
		//si == 아예 새로 만드는것
		//sm == 시스템 유지보수 및 리펙토링?
		//솔수션 == 서비스 개발 
		//void == 반환을 시키지 않는다. 반환하지 않는다.
	}
	
	

}
