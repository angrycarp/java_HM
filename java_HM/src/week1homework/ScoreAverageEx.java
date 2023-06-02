package week1homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 * (package : day4.homework, file : ScoreAverageEx)
		 * 성적은 정수.
		 */	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input Korea score : ");
		
		double korea;
		korea = sc.nextDouble();
		
		System.out.println("input Math score : ");

		double math;
		math = sc.nextDouble();
		
		System.out.println("input English score : ");
		
		double english;
		english = sc.nextDouble();
		
		
		double average;
		average = (korea + english + math) / 3; 
		
		
		System.out.println(average);
		
		
		
		sc.close();

	}

}
