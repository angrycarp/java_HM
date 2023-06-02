package day4.ifex;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		// 정수 num를 입력받아 num가 2의 배수인지 아닌지를 판별하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		
		int num;
		num = sc.nextInt();
				
		if(num % 2 == 0) {
			System.out.println(num + " is multiple of 2");
		}
		else {
			System.out.println(num + " is not multiple of 2");
		}
		sc.close();
	}
}
