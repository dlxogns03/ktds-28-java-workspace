package data;

public class CommentData {

	private String writer;
	private String day;
	private String contents;
	private int recommendcount;
	
	public CommentData (String writer, String day, String contents) {
		this.writer = writer;
		this.day = day;
		this.contents = contents;
	}
	
	
	public void count() {
		this.recommendcount++;
	}
	
}
