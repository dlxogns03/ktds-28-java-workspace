import data.CommentData;
import data.PostData;
import exceptions.ArticleException;
import exceptions.ArticleWriterExeption;

import java.util.ArrayList;
import java.util.List;

public class Community implements  CommunityFuntions{
    List<PostData> postDataList = new ArrayList<>();




    //1
    @Override
    public void fillInPost(String title, String writer, String day, String contents) {

        if(title.trim().isEmpty() || title.length() <= 30){

            ArticleException aie = new ArticleException("제목을 다시 입력해주세요 ");
            throw aie;
        }

        if(writer.trim().isEmpty()){

            ArticleWriterExeption awe = new ArticleWriterExeption("작성자의 이름을 다시 입력해주세요");
            throw awe;
        }


        this.postDataList.add(new PostData(title.trim(), writer.trim(),contents, day.trim()));

        System.out.println("게시글 작성이 완료되었습니다.");

    }
    //2
    @Override
    public void allPrintPost() {

        if (postDataList.size() <=  0){

            System.out.println("아직 등록된 게시글이 없습니다");
            return;
        }
        for (PostData postData : postDataList) {
            postData.printPostTitle();
        }



    }
    //3
    @Override
    public void printPost(int num) {

        if(num >= postDataList.size() || num <0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }
        postDataList.get(num).printPostContents();
        postDataList.get(num).printcomment();


    }
    //4
    @Override
    public void postModify(int num,String title, String contents) {


        if(num >= postDataList.size() || num <0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }
        postDataList.get(num).modifyContents(title, contents);

    }
    //5
    @Override
    public void removePost(int num) {
        if(num >= postDataList.size() || num <0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }

        postDataList.remove(num);
        System.out.println(num + "번의 게시글을 삭제했습니다.");


    }

    //6
    @Override
    public void postNumber() {
        if (postDataList.size() <=  0){

            System.out.println("아직 등록된 게시글이 없습니다");
            return;
        }

        System.out.println(postDataList.size() + "개의 게시글이 등록되었습니다.");

    }

    //7
    @Override
    public void writeComment(int num, String name, String day, String contents) {
        if(num >= postDataList.size() || num <0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }
        postDataList.get(num).addCommentData(name, day, contents);

    }


    //8
    @Override
    public void removeComment(int num, int num2) {
        if(num >= postDataList.size() || num <0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }
        if (postDataList.get(num).removecomment(num2)){
            System.out.println(num + "번 게시물의 " + num2 + "번 댓글을 삭제했습니다");
        }


    }


    //9
    @Override
    public void recommendcount(int num, int num2) {
        if(num >= postDataList.size() || num < 0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }
        postDataList.get(num).addCount(num2);

    }


    //10
    @Override
    public void SearchPost(String Title) {
        List<String> arrytitle = new ArrayList<>();
        for (int i = 0; i < postDataList.size(); i++) {
            arrytitle.add(postDataList.get(i).foundTitle(Title));

        }
    }

    //11
    @Override
    public void removeAll() {
        System.out.println(postDataList.size() + "개의 게시물을 삭제했습니다.");
        postDataList.clear();

    }


    //12
    @Override
    public void removePostCommentAll(int num) {
        if(num >= postDataList.size() || num <0){
            System.out.println("잘못된 게시글 번호입니다");
            return;
        }
        postDataList.get(num).clearcomment();

    }

    public void printCount(){

    }
}
