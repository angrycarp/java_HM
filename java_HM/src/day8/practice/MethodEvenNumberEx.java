package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		// 정수 num을 입력받아 짝수인지 아닌지 판별하는 코드를 작성하세요.
		// 단, 메서드를 이용할 것.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number :");
		int num;
		num = sc.nextInt();		
		even(num);				
		sc.close();		
	}

	public static int even(int num1) {
		if(num1 % 2 == 0) {
			System.out.println("is evennumber.");
		}
		else {
			System.out.println("is not evennumber.");
		}
		return num1;
	}

	public static boolean isMultiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
