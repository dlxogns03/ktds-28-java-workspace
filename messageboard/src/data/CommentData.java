package data;

public class CommentData {
	private String title;
	private String writer;
	private String day;
	private String contents;
	private int recommendcount;
	
	public CommentData (String title, String writer, String day, String contents) {
		this.title = title;
		this.writer = writer;
		this.day = day;
		this.contents = contents;
	}
}
