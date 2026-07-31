package data;




public class PostData {
	
	
	CommentData commentData;
	private String title;
	private String writer;
	private int viewcount;
	private String day;
	private String contents;
	
	public PostData(String title, String writer, String contents, String day) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.day = day;
	}
	
	
	
	
	
	public void view() {
		this.viewcount++;
	}
	
}
