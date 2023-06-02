package day4.ifex;

import java.util.Scanner;

public class IfMultipleEx2 {

	public static void main(String[] args) {
		// 정수 num를 입력받아 num가 2의 배수이면 2의 배수라고 출력하고,
		// 3의 배수이면 3의 배수라고 출력하고, 6의 배수이면 6의 배수라고 출력하고,
		// 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input num : ");
		
		int num;
		num = sc.nextInt();
		
		if(num % 6 == 0) {
			System.out.println(num + " is multiple of 6 ");
		}
		else if(num % 2 == 0) {
			System.out.println(num + " is multiple of 2 ");
		}
		else if(num % 3 == 0) {
			System.out.println(num + " is multiple of 3 ");
		}
		else {
			System.out.println(num + " is not multiple of 2, 3, 6 ");
		}
		sc.close();	
	}
}
