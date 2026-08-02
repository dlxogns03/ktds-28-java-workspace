package data;

public class CommentData {

	private String writer;
	private String day;
	private String contents;
	private int recommendCount =0;

	public CommentData (String writer, String day, String contents) {
		this.writer = writer;
		this.day = day;
		this.contents = contents;
	}

	public int getRecommendCount() {
		return this.recommendCount;
	}

	public void printContents(){

		System.out.println(contents);

	}

	public void count() {
		++this.recommendCount;
		System.out.println("해당 댓글의 추천수  : " + recommendCount);
	}


}
