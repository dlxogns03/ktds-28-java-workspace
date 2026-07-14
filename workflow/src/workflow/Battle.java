package workflow;

public class Battle {
	
	public static void main(String[] args) {
		/*
		 * boss 와 player가 전투를 합니다.
		 * boss의 체력과 player의 체력 중 하나라도 0 이하가 된다면 게임은 종료 됩니다.
		 * 
		 * 
		 * boss가 Player에게 공격을 합니다.(데미지는 랜덤한 정수값)
		 * player가 boss에게 공격을 합니다.(데미지는 랜덤한 정수값)
		 * 
		 * 공격이 끝난 이후 서로의 체력을 출력합니다.
		 */
		
		int boss = 200;
		int player= 100;
		
		while(true) {
			
			double randomDamage = Math.random();
			int bossIntDamage = (int)(randomDamage * 100);
			
			System.out.println("boss attack");
			System.out.println("boss의 체력 : " + boss);
			System.out.println("player의 체력 : " + (player - bossIntDamage));
			player -= bossIntDamage;
			
			if (player <= 0){
				System.out.println("boss의 승리 !");
				break;
			}
			
			
			
			randomDamage = Math.random();
			int playerIntDamage = (int)(randomDamage * 180);
			
			System.out.println("player attack");
			System.out.println("boss의 체력 : " + (boss - playerIntDamage));
			System.out.println("player의 체력 : " + player);
			boss -= playerIntDamage;
			
			if (boss <= 0) {
				System.out.println("player의 승리 !");
				break;
			}
		}
		
		
		
	}

}
