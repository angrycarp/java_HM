package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		// 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
		// 단 메서드 이용
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		System.out.println("Input kor, eng, math score :");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		System.out.println("Your average is " + Average(kor, eng, math));

	}
	public static double Average(int num1, int num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}
}
