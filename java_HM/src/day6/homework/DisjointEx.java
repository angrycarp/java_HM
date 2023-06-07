package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요
		
		int num1, num2, i = 1, gcd = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input num1, num2 :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i <= num1 && i <= num2) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		if(gcd == 1) {
			System.out.println(num1 + " , " + num2 + " is disjoint");
		}
		else {
			System.out.println(num1 + " , " + num2 + " is not disjoint");
		}
		sc.close();
	}
}