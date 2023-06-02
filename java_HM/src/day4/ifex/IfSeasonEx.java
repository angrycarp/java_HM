package day4.ifex;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {	
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 
		 * 3, 4, 5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10, 11 : 가을
		 * 12, 1, 2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input Month : ");
		int season;
		season = sc.nextInt();
		
		String result = " ";
		
		if(season >= 3 && season < 6) {
			result = "Spring";
		}
		else if(season >= 6 && season < 9) {
			result = "Summer";
		}
		else if(season >= 9 && season < 12) {
			result = "Fall";
		}
		else if((season >= 12 && season < 13) || (season < 3 && season >= 1)) {
			result = "Winter";
		}
		else {
			result = "Wrong input";
		}
		
		System.out.println(season + " is " + result);
		
		
		sc.close();
		
	}


}
