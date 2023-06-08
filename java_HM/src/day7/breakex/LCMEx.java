package day7.breakex;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		int i, j, lcm = 1;
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Input 2 nums : ");
		i = sc.nextInt();
		j = sc.nextInt();
		
		for(lcm = 1; lcm <= i * j; lcm++) {
			if(lcm % i == 0 && lcm % j == 0) {
				System.out.println(lcm);
				break;
			}
		}	
		sc.close();
	}
}
