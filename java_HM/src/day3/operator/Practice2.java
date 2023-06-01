package day3.operator;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/* 성적을 입력받아 입력받은 성적이 60점 이상인지 확인하는 코드를 작성하세요.
		 * 
		 * 예 :
		 * input score :
		 * 65
		 * do you pass 65 point? true
		 *
		 * input score :
		 * 45
		 * do you pass 45 point? false
		 */
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		int score = sc.nextInt();
		
		String str;
		str = score >= 60 ? "pass" : "fail";		
		 
		System.out.println("Do you pass " + score + " points? " + str);
		
		sc.close();
	}
}


