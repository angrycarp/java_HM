package day2.homework;

import java.util.Scanner;

public class AnsHomework2 {

	public static void main(String[] args) {
		/* 두 정수를 입력받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.
		 * 예:
		 * 두 정수를 입력하세요
		 * 1 2 [엔터]
		 * 1 + 2 = 3
		 * 1 - 2 = -1
		 * 1 * 2 = 2
		 * 1 / 2 = 0.5
		 * 1 % 2 = 1
		 */
		System.out.println("두 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2;
		//int mod = num1 % num2;
		
		System.out.println("" + num1 + " + " + num2 + " = " + sum);
		System.out.println("" + num1 + " - " + num2 + " = " + sub);
		System.out.println("" + num1 + " * " + num2 + " = " + mul);
		System.out.println("" + num1 + " / " + num2 + " = " + div);
		//System.out.println("" + num1 + " % " + num2 + " = " + mod);
		System.out.println("" + num1 + " % " + num2 + " = " + (num1 % num2));

		
		sc.close();
		
	}

}
