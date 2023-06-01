package day2.homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);

		System.out.println("산술 연산자를 입력해주세요.");
		String str = sc.next();  
		System.out.println(str);
		
		System.out.println("" + num1 + str + num2);

		sc.close();
		
	}

		
}
