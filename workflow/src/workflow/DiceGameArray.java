package workflow;

public class DiceGameArray {
	public static boolean isNotArrive (int[] playerPosition) {
		final int GOAL_POSITION = 127;
		
		for(int i = 0; i < playerPosition.length ; i++) {
			
			if(playerPosition[i] >= GOAL_POSITION) {
				
				return false;
				
			}
		}
		
		
		
		return true;
	}

	//=========================================================
	
	public static int rollDice() {
		int place = 0;
		
		int dice1 = 0;
		int dice2 = 0;
		
		double random = Math.random();
		
		
		random = Math.random();
		dice1 = (int)(random * 6) + 1;
		
		
		random = Math.random();
		dice2 = (int) (random * 6) + 1;
		
		
		place = dice1 + dice2;
		
		if((place % 3) == 0) {
			
			place *= -1;
			
		} else if (dice1 == dice2) {
			
			place *= 2;
			
		}
		
		
		return place;
	}
	
	
	//===============================================
	public static void main(String[] args) {
		
		int movecount = 0;
		
		int[] playersPoint = new int[4];
		
		//모든 플레이어가 127 미만의 위치에 있는가?
		boolean isPlaying = true;
		
		isPlaying = isNotArrive(playersPoint);
		
		
		while(isPlaying) {
			
			
			for(int i = 0 ; i < playersPoint.length ; i++) {
				
				movecount = rollDice();
				playersPoint[i] += movecount;
				
				if (playersPoint[i] < 0 ) {
					
					playersPoint[i] = 0;
				}
				
				System.out.println("====== player" + (i + 1) + " =====");
				System.out.print("플레이어가 이동할 칸수 ");
				System.out.println(movecount);
				System.out.print("player" + (i + 1) + "의 위치 ");
				System.out.println(playersPoint[i]);
				System.out.println("================");
				
				
				
			}//  주사위 for문 종료 //
			
			isPlaying = isNotArrive(playersPoint);
			
			
		}// while문 종료 //
		
		System.out.println("==========");
		System.out.println("player 1 : " + playersPoint[0]);
		System.out.println("player 2 : " + playersPoint[1]);
		System.out.println("player 3 : " + playersPoint[2]);
		System.out.println("player 4 : " + playersPoint[3]);
		System.out.println("==========");
		
	}

}
