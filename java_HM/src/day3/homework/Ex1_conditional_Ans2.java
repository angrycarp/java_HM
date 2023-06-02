package day3.homework;

import java.util.Scanner;

public class Ex1_conditional_Ans2 {
	
	public static void main(String[] args) {
		
		/* 성별 (M:남성, W:여성)을 입력받아 여성인지 확인하는 코드를 작성하세요.
		* 조건 연산자 이용
		* (package : day3.homework, file : Ex1_conditional) 
		* input gender : 
		* M
		* Are you a women? false
		*
		* input gender : 
		* W
		* Are you a women? true
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender W or M");
		String gender;
		gender = sc.next();
	
		
		boolean result = gender.equals("W") ? true : false;
		
		

		System.out.println("Are you a women? " + result);
		
		
		sc.close();
	}
		
}

