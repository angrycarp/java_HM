package day6.whileex;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		/*	국어, 영어, 수학, 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		 * 	input 3 score (kor, eng, math) : 10 20 30
		 * 	average : 20.0
		 *	continue? (y/n) :
		 *	y
		 * 	input 3 score (kor, eng, math) : 10 20 30
		 * 	average : 20.0
		 *	continue? (y/n) :
		 *	n
		 *	Exit		 *
		 */

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		double avg;
		char con = ' ';
		
		while(con != 'n') {
			System.out.println("Input 3 score (kor, eng, math) :" );
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			avg = (kor + eng + math) / 3;
			System.out.println("average : " + avg);
			System.out.println("continue? (y/n) :");
			con = sc.next().charAt(0);
		}
		System.out.println("Exit");
		sc.close();
	}
}
