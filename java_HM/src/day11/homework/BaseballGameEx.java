package day11.homework;

import java.util.Scanner;

import array.Array;
import day11.practice.ArrayRadomEx2;

public class BaseballGameEx {

	public static void main(String[] args) {
		// 1 ~ 9 사이의 중복되지 않은 세 수를 맞추는 게임.
		/*	규칙 :
		 * 	B : 같은 숫자가 있지만 위치가 다름
		 * 	S : 같은 숫자가 있고 위치가 같음
		 * 	3O : 일치하는 숫자가 하나도 없음
		 **/
		
		int [] baseball = new int[3];
		int [] throw1 = new int[3];
		int scount = 0, bcount = 0;
		Scanner sc = new Scanner(System.in);
		
		ArrayRadomEx2.createRandomArray(1, 9, baseball);
		
		while(scount != 3) {
			System.out.println("Input 3 nums : ");
			for(int i = 0; i < 3; i++) {
				throw1[i] = sc.nextInt();
			}
			if(Array.arryCheck(throw1)) {
				System.out.println("You must not enter the same number!");
				continue;
			}
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(baseball[i] == throw1[j] && i != j) {
						bcount++;
					}
				}
				if(baseball[i] == throw1[i]) {
					scount++; 
				}
			}

			if(scount == 3) {
				System.out.println("Congratuaion 3S!");
			}
			else if(scount == 0 && bcount == 0) {
				System.out.println("Your score is : 3O");
			}
			else if(scount > 0 && bcount == 0) {
				System.out.println("Your score is : " + scount + "S");
				scount = 0;
			}
			else if(scount == 0 && bcount > 0) {
				System.out.println("Your score is : " + bcount + "B");
				bcount = 0;
			}
			else {
				System.out.println("Your score is : " + scount + "S" + bcount + "B");
				scount = 0;
				bcount = 0;
			}
		}
	}
}