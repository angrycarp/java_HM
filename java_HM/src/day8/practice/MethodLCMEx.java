package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		// 정수 num1과 num2를 입력받아 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		// 단, 메서드를 이용할 것
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 number :");
		int num1, num2, i = 1, gcd = 0, lcm = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i <= num1 && i <= num2) {
			if(MethodMutipleEx.isMultiple(num1, i) && MethodMutipleEx.isMultiple(num2, i)) {
				gcd = i;
			}
			i++;
		}	
		System.out.println(num1 + " and " + num2 + " of LCM is " + num1 * num2 / gcd);
		sc.close();

	}

}
