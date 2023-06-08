package day7.breakex;

import java.util.Scanner;

public class LCM2Ex {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		int num1, num2, i;
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Input 2 nums : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for(i = 1; i <= num2; i++) {
			if((num1 * i) % num2 == 0) {
				System.out.println(num1 * i);
				break;
			}
		}	
		sc.close();
	}
}
