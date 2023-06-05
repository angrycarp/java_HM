package day5.pratice;

import java.util.Scanner;

public class DivisiorEx {

	public static void main(String[] args) {
		// 정수 num을 입력받아 약수를 출력하는 코드를 작성하세요.
		// 약수 : A를 B로 나누었을 때, 나머지가 0이면 B는 A의 약수이다.
		// 12의 약수 : 1, 2, 3, 4, 6, 12
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Input positive number :");
		num = sc.nextInt();
		
		int i = 1;

		while(i <= num) {
			if(num % i == 0) {
				System.out.println(i);
			}
			++i;
		}
		sc.close();
	}
}