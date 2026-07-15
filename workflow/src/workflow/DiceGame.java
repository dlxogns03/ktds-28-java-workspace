package workflow;

public class DiceGame {
	public static void main(String[] args) {
		
		int player1 = 0;
		int player2 = 0;
		int player3 = 0;
		int player4 = 0;
		
		int place = 0;
		
		int dice1 = 0;
		int dice2 = 0;
		
		final int GOAL_POSITION = 127;
		
		double random = Math.random();
		
		
		/////////////////////////
		/// 
		/*
		double random = Math.random();
		int dice1 = (int)(random * 10);
		System.out.println(dice1);
		
		random = Math.random();
		int dice2 = (int) (random * 10);
		*/
		
		//////////////////////////
		
		
	/*
		while(player1 < GOAL_POSITION && 
			   player2 < GOAL_POSITION && 
			   player3 < GOAL_POSITION && 
			   player4 < GOAL_POSITION) {
			/*
			 * 
			 * 
			 * player 1
			 * 
			 * 
			 * 
			 */
		
		/*
			random = Math.random();
			dice1 = (int)(random * 10);
			System.out.println(dice1);
			
			random = Math.random();
			dice2 = (int) (random * 10);
			System.out.println(dice2);
			
			
			
			if (((dice1 + dice2) % 3) == 0) {
				
				
				place = -(dice1 + dice2);
				
				System.out.println("이동할 칸 수");
				System.out.println(place);
				player1 += place;
				
				if(player1 <= 0) {
					player1 = 0;
				}
				
				System.out.println("플레이어1의 위치");
				System.out.println(player1);
				System.out.println("==========");
				
			} else if (dice1 == dice2 ) {
				
				place = (dice1 + dice2) * 2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player1 += place;
				System.out.println("플레이어1의 위치");
				System.out.println(player1);
				System.out.println("==========");
				
			} else {
				
				place = dice1 + dice2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player1 += place;
				System.out.println("플레이어1의 위치");
				System.out.println(player1);
				System.out.println("==========");
			}
			
			/*
			 * 
			 * 
			 * player 2 
			 * 
			 * 
			 * 
			 */
		/*
			random = Math.random();
			dice1 = (int)(random * 10);
			System.out.println(dice1);
			
			random = Math.random();
			dice2 = (int) (random * 10);
			System.out.println(dice2);
			
			if (((dice1 + dice2) % 3) == 0) {
				
				
				place = -(dice1+ dice2);
				
				System.out.println("이동할 칸 수");
				System.out.println(place);
				player2 += place ;
				
				if(player2 <= 0) {
					player2 = 0;
				}
				
				System.out.println("플레이어2의 위치");
				System.out.println(player2);
				System.out.println("==========");
			} else if (dice1 == dice2 ) {
				
				place = (dice1 + dice2) * 2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player2 += place;
				System.out.println("플레이어2의 위치");
				System.out.println(player2);
				System.out.println("==========");
			} else {
				
				place = dice1 + dice2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player2 += place;
				System.out.println("플레이어2의 위치");
				System.out.println(player2);
				System.out.println("==========");
				
			}
			
			/*
			 * 
			 * 
			 * player 3
			 * 
			 * 
			 * 
			 */
		/*
			random = Math.random();
			dice1 = (int)(random * 10);
			System.out.println(dice1);
			
			random = Math.random();
			dice2 = (int) (random * 10);
			System.out.println(dice2);
			
			place = dice1+ dice2;
			if ((place % 3) == 0) {
				
				
				place *= -1;
				
				System.out.println("이동할 칸 수");
				System.out.println(place);
				player3 += place ;
				
				if(player3 <= 0) {
					player3 = 0;
				}
				
				System.out.println("플레이어3의 위치");
				System.out.println(player3);
				System.out.println("==========");
				
			} else if (dice1 == dice2 ) {
				
				place *= 2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player3 += place;
				System.out.println("플레이어3의 위치");
				System.out.println(player3);
				System.out.println("==========");
				
			}
				
			
			System.out.println("이동할 칸 수");
			System.out.println(place);
			
			player3 += place;
			System.out.println("플레이어3의 위치");
			System.out.println(player3);
			System.out.println("==========");
				
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * 
			 * 
			 * player 4 
			 * 
			 * 
			 * 
			 */
			
			
			
		/*
			random = Math.random();
			dice1 = (int)(random * 10);
			System.out.println(dice1);
			
			random = Math.random();
			dice2 = (int) (random * 10);
			System.out.println(dice2);
			
			if (((dice1 + dice2) % 3) == 0) {
				
				
				place = -(dice1+ dice2);
				
				System.out.println("이동할 칸 수");
				System.out.println(place);
				player4 += place ;
				
				if(player4 <= 0) {
					player4 = 0;
				}
				
				System.out.println("플레이어4의 위치");
				System.out.println(player4);
				System.out.println("==========");
				
			} else if (dice1 == dice2 ) {
				
				place = (dice1 + dice2) * 2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player4 += place;
				System.out.println("플레이어4의 위치");
				System.out.println(player4);
				System.out.println("==========");
				
			} else {
				
				place = dice1 + dice2;
				System.out.println("이동할 칸 수");
				System.out.println(place);
				
				player4 += place;
				System.out.println("플레이어4의 위치");
				System.out.println(player4);
				System.out.println("==========");
				
			}
		}
		*/
		
		int[] playersPoint = {player1, player2, player3, player4};
		
		while(playersPoint[0] < GOAL_POSITION && 
				playersPoint[1] < GOAL_POSITION && 
				playersPoint[2] < GOAL_POSITION && 
				playersPoint[3] < GOAL_POSITION) {
			
			for(int i = 0 ; i < playersPoint.length ; i++) {
				
				System.out.println("====== player" + (i + 1) + " =====");
				
				random = Math.random();
				dice1 = (int)(random * 10);
				System.out.println("첫번째 주사위 " + dice1);
				
				random = Math.random();
				dice2 = (int) (random * 10);
				System.out.println("두번째 주사위 " + dice2);
				
				place = dice1 + dice2;
				
				if((place % 3) == 0) {
					place *= -1;
					System.out.print("플레이어가 이동할 칸수 ");
					System.out.println(place);
					playersPoint[i] -= place;
					
					if (playersPoint[i] < 0 ) {
						
						playersPoint[i] = 0;
					}
					
					System.out.print("player" + (i + 1) + "의 위치 ");
					System.out.println(playersPoint[i]);
					System.out.println("==========");
					
				} else if (dice1 == dice2) {
					
					place *= 2;
					System.out.print("플레이어가 이동할 칸수 ");
					System.out.println(place);
					
					playersPoint[i] += place;
					
					System.out.print("player" + (i + 1) + "의 위치 ");
					System.out.println(playersPoint[i]);
					System.out.println("==========");
					
				}else {
					
					System.out.print("플레이어가 이동할 칸수 ");
					System.out.println(place);
					playersPoint[i] += place;
					System.out.print("player" + (i + 1) + "의 위치 ");
					System.out.println(playersPoint[i]);
					System.out.println("==========");
					
				}
				
				
			}
		}
		System.out.println("==========");
		System.out.println("player 1 : " + playersPoint[0]);
		System.out.println("player 2 : " + playersPoint[1]);
		System.out.println("player 3 : " + playersPoint[2]);
		System.out.println("player 4 : " + playersPoint[3]);
		System.out.println("==========");
		
	}

}
