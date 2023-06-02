package day4.ifex;

import java.util.Scanner;

public class IfArtithmaticEx {

	public static void main(String[] args) {
		// 산술 연산자와 두 정수를 입력 받아 산술 연산자에 마즌ㄴ 연산 결과를 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and operator : ex) 1 + 2 [enter]");
		
		int num1;
		int num2;
		char oper;
		
		num1 = sc.nextInt();
		oper = sc.next().charAt(0);
		num2 = sc.nextInt();
				
		if(oper == '+') {
			int sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
		}
		else if(oper == '-') {
			int sub = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + sub);
		}
		else if(oper == '*') {
			int mul = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + mul);
		}
		else if(oper == '/' && num2 != 0) {
			double div = (double)num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + div);
		}
		else if(oper == '%') {
			int mod = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + mod);
		}
		else {
			System.out.println("Input wrong arithmetic operator or div by 0!");
		}
		sc.close();
	}
}
