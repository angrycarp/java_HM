package day5.homework;

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
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number 1 ~ 100 :");
		int i;
		i = sc.nextInt();
			
		int min = 1, max = 100;
		int random = (int)(Math.random() * (max - min + 1) + min);
		
		
		
		/* num을 입력 -> 1번 num > random -> Down! 이라 출력하고 다시 num 입력하는 곳으로
					   2번 num < random -> Up! 			''
					   3번 num = random -> Good! 이라 출력하고 종료
		*/
		
		while(i == random) {
			if(i > random) {
				System.out.println("Down!");
			}
			else if(i < random) {
				System.out.println("Up!");
			}
			else {
				System.out.println("Good!");
			}
		}

	
		sc.close();		
	}
}
