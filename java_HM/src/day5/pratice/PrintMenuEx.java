package day5.pratice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		/*	다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로 실행되는 코드를 작성하세요.
		 * 	Menu
		 * 
		 * 	1. Start
		 * 	2. Save
		 * 	3. Exit
		 * 
		 * 	Select Menu :
		 * 
		 * 	2
		 * 
		 * 	Program Save!
		 * 	
		 * Menu
		 * 
		 * 	1. Start
		 * 	2. Save
		 * 	3. Exit
		 * 
		 * 	Select Menu :
		 * 
		 * 	3
		 * 
		 * 	program Exit!
		 * 
		 */
		
		
		
		int i = 0;		
		Scanner sc = new Scanner(System.in);
				
		while(i != 3) {
			System.out.println("Menu");
			System.out.println(" ");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.println(" ");
			System.out.println("Select Menu :");
			
			i = sc.nextInt();

				switch(i) {
				case 1:
					System.out.println("Program Start!");
					break;
				case 2:
					System.out.println("Program Save");
					break;
				case 3:
					System.out.println("Program Exit");
					break;
				}		
		}
		sc.close();
	}
}
