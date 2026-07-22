package oop;


import com.ktdsuniversity.edu.oop.exam.Student;

public class Test {
	public static void main(String[] args) {
		Student student = new Student(60, 80, 90 ,100);
		
		int score = student.getSumAllScore();
		
		
		double avg = student.getAverage(score);
		
		double credit = student.getCanseCredit(avg);
		
		System.out.println(student.getSumAllScore());
		System.out.println(student.getAverage(score));
		System.out.println(student.getCanseCredit(avg));
		System.out.println(student.getABCDF(credit));
		
		
//		CraneGameMachine game = new CraneGameMachine();
//		game.insertCoin();
//		System.out.println(game.isInsertCoin);
//		if (game.isInsertCoin) {
//			game.doGame();
		}
		
	}

}
