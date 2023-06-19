package day12.homework;

import java.util.Scanner;

import array.Array;

public class LottoEx {

	public static void main(String[] args) {
		// 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를 작성하세요.
		/*	1등 : 번호 6개
		 * 	2등 : 번호 5개 + 보너스
		 * 	3등 : 번호 5개
		 * 	4등 : 번호 4개
		 * 	5등 : 번호 3개
		 * 	number : [1, 3, 40, 23, 24, 45]
		 * 	bonus : 2
		 * 	use : 1, 3, 40, 23, 24, 2
		 *  2!
		 **/
		int [] lotto = new int [7];
		int [] input = new int [6];
		int count = 0;
		int bcount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Array.createRandomArray(1, 45, lotto);
		// Array.printArray(lotto);
		
		
		System.out.println("Input 6 nums : ");
		for(int i = 0; i < 6; i++) {
			input[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(lotto[i] == input[j]) {
					count++;
				}
			}
			
		}
		for(int i = 0; i < 6; i++) {
			if(input[i] == lotto[6]) {
				bcount++;
			}
		}
		switch(count) {
		case 6 :
			System.out.println("First Place!");
			break;
		case 5 :
			if(bcount == 1) {
			System.out.println("Second Place!"); 
			}
		else { 
			System.out.println("Third Place");
			}
			break;
		case 4 :
			System.out.println("4th Place!");
			break;
		case 3 :
			System.out.println("5th Place!");
			break;
		default :
			System.out.println("You didn't win the lottery");
			break;
		}
	}
}
// 메서드들로 만들어 봐야 되는데 ....
// 입력시 중복된 수 안되게
// 입력시 1~45만