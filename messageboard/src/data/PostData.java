package data;


import java.util.ArrayList;
import java.util.List;

public class PostData {
	
//	private CommentData data;
	private List<CommentData> commentData = new ArrayList<>();
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

	public String foundTitle(String title){
		if(this.title.equals(title)){
			return printPostTitle();

		}
		return "";
	}

	public boolean removecomment(int num){
		if (commentData.size() <= num || num < 0){
			System.out.println("잘못된 댓글번호입니다");
			return false;
		}else {
			commentData.remove(num);
			return true;
		}

	}

	public void addCommentData(String writer, String day, String contents){
		commentData.add(new CommentData(writer,day,contents));
	}

	public String printPostTitle(){
		System.out.println(this.title + "(" + this.commentData.size() + ")");
		return this.title + "(" + this.commentData.size() + ")";
	}


	public void printPostContents(){
		System.out.println("제목 : " + this.title);
		System.out.println("내용 : " + this.contents);
	}

	public void printcomment(){

		if(commentData.size() <= 0 ){
			System.out.println("등록된 댓글이 없습니다");
			return;
		}
		for (int i = 0 ; i < commentData.size(); i++){
			this.commentData.get(i).printContents();
		}

	}

	public void addCount(int num){
		if(num >= commentData.size() || num <0){
			System.out.println("잘못된 댓글 번호입니다");
			return;
		}
		commentData.get(num).count();
	}

	public void clearcomment(){
		if (commentData.size() <= 0 ){
			System.out.println("등록된 댓글이 없습니다");
			return;
		}else {
			System.out.println(commentData.size() +"개의 댓글을 삭제 했습니다");
			this.commentData.clear();
		}

	}

	public void modifyContents(String title , String contents){
		this.title = title;
		this.contents = contents;
	}

	public void view() {
		this.viewcount++;
	}
	
}
