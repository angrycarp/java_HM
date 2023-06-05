package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 
		 * 3, 4, 5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10, 11 : 가을
		 * 12, 1, 2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		
		int month;
		String season;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month : ");
		
		month = sc.nextInt();
		
		switch(month) {
		case 1, 2, 12 : season = "winter";
		break;
		case 3, 4, 5 : season = "Spring";
		break;
		case 6, 7, 8 : season = "Summer";
		break;
		case 9, 10, 11 : season = "Fall";
		break;
		default : season = "Wrong month";
		}
		System.out.println(month + " is " + season);
		
		sc.close();
	}

}
