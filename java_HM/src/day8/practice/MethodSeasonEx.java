package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {
	public static void main(String[] args) {
		// 월을 입력받아 계절을 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number :");
		int num;
		num = sc.nextInt();
		
		System.out.println(num + " is " +Season(num));
		
		sc.close();
	}
	/** num달에 해당하는 계절을 출력하는 메서드
	 * 	매개변수 : int num
	 * 	리턴타입 :	String
	 * 	함수명 : Season
	 */
	
	public static String Season(int num) {
		String season = " ";
		if(num == 3 || num == 4 || num == 5) {
			season = "Spring";
		}
		else if(num == 6 || num == 7 || num == 8) {
			season = "Summer";
		}
		else if(num == 9 || num == 10 || num == 11) {
			season = "Fall";
		}
		else if(num == 12 || num == 1 || num == 2) {
			season = "Winter";
		}
		else {
			season = "Wrong month";			
		}
		return season;	
	}
}
