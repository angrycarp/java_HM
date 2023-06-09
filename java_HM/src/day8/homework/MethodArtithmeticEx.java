package day8.homework;

import java.util.Scanner;

public class MethodArtithmeticEx {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		// 단, 메서드 이용
		// 연산자를 잘못 입력한 경우는 없다고 가정. (예외처리 x)
		// 0 으로 나누는 일은 없다고 가정
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 number and arithmetic (ex : num1, *, num2) :");
		int num1, num2;
		char ari;
		num1 = sc.nextInt();
		ari = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		// ari 값에 따라서 add, sub, mul, div, mod 함수를 선택하는 if문을 만들어라
		
		if(ari == '+') {
			System.out.println("" + num1 + " " + ari + " "+ num2 + " = " + Add(num1,num2));
		}
		else if(ari == '-') {
			System.out.println("" + num1 + " " + ari + " " + num2 + " = " + Sub(num1,num2));
		}
		else if(ari == '*') {
			System.out.println("" + num1 + " " + ari + " " + num2 + " = " + Mul(num1,num2));
		}
		else if(ari == '/') {
			System.out.println("" + num1 + " " + ari + " " + num2 + " = " + Div(num1,num2));
		}
		else if(ari == '%') {
			System.out.println("" + num1 + " " + ari + " " + num2 + " = " + Mod(num1,num2));
		}
	sc.close();	

	}
	public static int Add(int num1, int num2) {
		return num1 + num2;
	}
	public static int Sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int Mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double Div(int num1, double num2) {
		return num1 / num2;
	}
	public static int Mod(int num1, int num2) {
		return num1 % num2;
	}

}
