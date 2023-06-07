package day6.nestedloofex;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/*	1 ~ 100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		 * 	랜덤한 수 : 45
		 * 	input : 50
		 * 	Down!
		 * 	input : 40
		 * 	Up!
		 * 	input : 45
		 * 	Good!  
		 * 
		 * 	+ 한판이 끝나면 더 할건지를 물어서 n을 입력하면 종료, y를 입력하면 이어서 게임이 진행
		 */
		
		Scanner sc = new Scanner(System.in);
		int min = 1, max = 100;
		int i = min - 1;			
		
		/* num을 입력 -> 1번 num > random -> Down! 이라 출력하고 다시 num 입력하는 곳으로
					   2번 num < random -> Up! 			''
					   3번 num = random -> Good! 이라 출력하고 종료 -> while( i != random){} sysout("good!");
		*/
		
		char ans = ' ';
		
		while(ans != 'n') {
			int random = (int)(Math.random() * (max - min + 1) + min);	
			while(i != random) {
				System.out.println("Input number 1 ~ 100 :");
				i = sc.nextInt();
				if(i > random) {
					System.out.println("Down!");
				}
				else if(i < random) {
					System.out.println("Up!");
				}
			}
			System.out.println("Good!");
			System.out.println(" Continue ? (y/n) : ");
			ans = sc.next().charAt(0);			
		}
		System.out.println("Game Over. ");				
		sc.close();		
	}
}