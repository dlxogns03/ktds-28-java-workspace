import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import data.PostData;
import utils.Input;

public class Main {
	static Community community = new Community();
	static Scanner keybord = new Scanner(System.in);

	
	public static void main(String[] args) {


		boolean inProgress = true;

		List<PostData> posts = new ArrayList<>();
		int choice = 0 ;

//		Input input = new Input();
//		
//		input.inputInt("번호를 입력해주세요");




		while (inProgress){
			System.out.println("======= 게시판 실행 ========");
			System.out.println("1. 게시물, 2.댓글, 3.게시물 및 댓글 삭제, 4.종료");
			System.out.print("번호 입력 : ");
			choice = keybord.nextInt();
			System.out.println();

			if (choice == 1){
				System.out.println("1. 게시글 작성, 2.게시물 수정, 3.게시물 출력");
				System.out.print("번호 입력 : " );
				choice = keybord.nextInt();
				System.out.println();

				if (choice == 1){
					System.out.println("== 작성 시작 ==");
					keybord.nextLine();
					writepost2();

				} else if (choice == 2) {
					modifypost();

				} else if (choice == 3) {

					System.out.println("1.선택 게시물 출력 2.전체 게시물 출력");
					choice = keybord.nextInt();
					keybord.nextLine();
					if(choice == 1){
						choicePrintPost();

					} else if (choice == 2 ) {
						community.allPrintPost();

					}else {
						wrongnumber();
					}

				}else{
					wrongnumber();
				}

			}else if (choice == 2){
				System.out.println("1.댓글 작성, 2.댓글 추천");
				System.out.println("번호 입력 : " );
				choice = keybord.nextInt();
				keybord.nextLine();
				if (choice == 1){
					wrirecomment();
				} else if (choice == 2) {
					countComment();

				}else {
					wrongnumber();
				}

			} else if (choice == 3) {
				System.out.println("1.게시물 삭제, 2.댓글 삭제, 3.전체 삭제");
				System.out.println("번호 입력 : " );
				choice = keybord.nextInt();
				keybord.nextLine();
				if(choice == 1){
					choiceDeletePost();
				}else if(choice == 2){

					choiceDeleteComment();
					
				}else if(choice == 3 ){
					System.out.println("1.게시물 댓글 전체 삭제 , 2. 전체 삭제");
					choice = keybord.nextInt();
					keybord.nextLine();
					if(choice == 1){
						removePostCommentAll();


					}if(choice == 2){
						community.removeAll();
					}else {
						wrongnumber();
					}

				}else {
					wrongnumber();
				}
			} else if (choice == 4) {
				System.out.println("프로그램이 종료 됩니다.");
				inProgress = false;
			}else {
				wrongnumber();

			}
		}

		keybord.close();

<<<<<<< HEAD
=======





>>>>>>> 70480976a316154d3e6d4a942cc155cef8e5c820
	}

	private static void wrirecomment() {
		int num;
		String writer;
		String day;
		String contents;

		System.out.print("작성할 게시글 번호 :");
		num = keybord.nextInt();
		keybord.nextLine();
		System.out.println("작성자 : ");
		writer = keybord.nextLine();
		System.out.println("날짜 입력 : ");
		day = keybord.nextLine();
		System.out.println("내용 입력 : ");
		contents = keybord.nextLine();

		community.writeComment(num, writer, day, contents);

	}

	private static void choicePrintPost(){
		int num = -1 ;

		System.out.println("게시물 번호 입력 : ");
		num = keybord.nextInt();
		keybord.nextLine();
		community.printPost(num);
	}

	private static void modifypost() {
		int num = -1;
		String contents = "";
		boolean inProcess = true;
		while (inProcess){
			try{
				System.out.print("게시물의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();
				System.out.println();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}

		System.out.println("재목: ");
		String title = keybord.nextLine();
		
		System.out.println("내용 입력 : ");
		contents = keybord.nextLine();

		community.postModify(num,title,contents);

	}

	public static void writepost2(){
		String title;
		String writer;
		String day;
		String contents;

		System.out.println("게시글 제목 : ");
		title = keybord.nextLine();

		System.out.println("작성자 : ");
		writer = keybord.nextLine();

		System.out.println("날짜 입력 : ");
		day = keybord.nextLine();

		System.out.println("내용 입력 : ");
		contents = keybord.nextLine();



		community.fillInPost(title,writer,day,contents);
	}

	public static void choiceDeletePost(){
		int num = -1;
		String contents = "";
		boolean inProcess = true;
		while (inProcess){
			try{
				System.out.print("게시물의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}
		community.removePost(num);
	}

	public static void choiceDeleteComment(){
		int num = -1 ;
		int num2  = -1;
		boolean inProcess = true;
		while (inProcess){
			try{
				System.out.print("게시물의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}


		inProcess = true;
		while (inProcess){
			try{
				System.out.print("댓글의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}
		community.removeComment(num, num2);
	}

	public static void removePostCommentAll(){
		int num = -1 ;
		boolean inProcess = true;
		while (inProcess){
			try{
				System.out.print("게시물의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}

		community.removePostCommentAll(num);

	}
	public static void countComment(){
		int num = -1 ;
		int num2  = -1;
		boolean inProcess = true;
		while (inProcess){
			try{
				System.out.print("게시물의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}


		inProcess = true;
		while (inProcess){
			try{
				System.out.print("댓글의 번호 : ");
				num = keybord.nextInt();
				keybord.nextLine();

				inProcess = false;
			}catch (InputMismatchException ime){

				inProcess = false;
			}
		}
		community.recommendcount(num,num2);

	}

	public static void wrongnumber(){
		System.out.println("잘못된번호 입니다 ");
	}



}