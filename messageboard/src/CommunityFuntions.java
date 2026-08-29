
public interface CommunityFuntions {

	void fillInPost(String title, String writer,  String day, String contents);
    void allPrintPost();
	void printPost(int num);
    void postModify(int num,String title,String contents);
    void removePost(int num);
    void postNumber();
    void writeComment(int num,String name, String day, String contents);
    void removeComment(int num, int num2);
    void recommendcount(int num, int num2);
    void SearchPost(String Title);
    void removeAll();
    void removePostCommentAll(int num);

}
