package day2.homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연산자를 입력하세요 (예:1 + 2) :");
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		System.out.println(num1 + operator + num2);


		sc.close();
		

		
		

		
		
		
		
	
		}
}
