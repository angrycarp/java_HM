package day3.homework;

import java.util.Scanner;

public class Ex2_if_Ans {
	
	/* 성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
	* (package : day3.homework, file : Ex2_if) 
	* input gender : 
	* M
	* Are you a women? man
	*	
	* input gender : 
	* W
	* Are you a women? women
	*/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender W or M");
		char gender;
		gender = sc.next().charAt(0);
		String result = " ";
		
		if(gender == 'W') {
			result = "women";
		}
		if(gender == 'M') {
			result = "man";
		}
		
		System.out.println("Are you a women? " + result);

		
		
		sc.close();
	}


}
