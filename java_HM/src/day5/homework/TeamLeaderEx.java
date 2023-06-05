package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		/*	30명의 학생이 있는 반에서 1번부터 연속된 번호를 가진 3명의 학생이 1조가 되도록 나누었다.
		 * 	이 때 가장 큰 번호인 학생이 조장이 된다.
		 * 
		 * 	학생 번호가 주어졌을 때 조장인지 조원인지 판별하는 코드를 작성하세요 
		 * 
		 * 	?? 걍 3의 배수 찾으란거 아님?
		 * 	왤케 복잡하게 씀 ?
		 */
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println(" Input positive number :");
		i = sc.nextInt();
		
		if(i % 3 == 0 && i <= 30) {
			System.out.println(i + " is leader!");
		}
		else {
			System.out.println(i + " is not leader");
		}
		sc.close();		
	}
}
