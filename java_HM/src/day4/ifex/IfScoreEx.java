package day4.ifex;

import java.util.Scanner;

public class IfScoreEx {
	public static void main(String[] args) {	

	/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
	 * 90이상 ~ 100이하 : A
	 * 80이상 ~ 90미만 : B
	 * 70이상 ~ 80미만 : C
	 * 60이상 ~ 70미만 : D
	 * 60미만 : F
	 * 0보다 작거나 100보다 큰 경우 : wrong score	
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		
		int score;
		score = sc.nextInt();
		String result = " ";
		
		if(score >= 90 && score <= 100) {
			result = "A";
		}
		else if(score >= 80 && score < 90) {
			result = "B";
		}
		else if(score >= 70 && score < 80) {
			result = "C";
		}
		else if(score >= 60 && score < 70) {
			result = "D";
		}
		else if(score >= 0 && score <60) {
			result = "F";
		}	
		else {
			result = "wrong score";
		}		
		System.out.println(result);	
		sc.close();	
	}
}
