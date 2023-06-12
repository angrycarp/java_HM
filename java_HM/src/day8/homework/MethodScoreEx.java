package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		// 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
		// 단 메서드 이용
		
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.println("Input score :");
		score = sc.nextInt();
		
		
		System.out.println("Your score is " + Grade(score));

	}
	public static char Grade(int num1) {
		char grade = ' ';
		if(num1 >= 90 && num1 < 100) {
			grade = 'A';
		}
		else if(num1 >= 80 && num1 < 90) {
			grade = 'B';
		}
		else if(num1 >= 70 && num1 < 80) {
			grade = 'C';
		}
		else if(num1 >= 60 && num1 < 70) {
			grade = 'D';
		}
		else if(num1 >= 0 && num1 < 60) {
			grade = 'E';
		}
		else {
			grade = 'X';
		}
		return grade;
	}
}
