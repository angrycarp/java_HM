package day6.whileex;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		// n을 입력받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하세요 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number :");
		int n, i = 1, sum = 0;
		n = sc.nextInt();
		
		
		while(i <= n) {
			switch(i % 2){
			case 0 : 
				sum += i;
				i++;
				break;
			default:
				i++;
			}
		}
		System.out.println("Sum of even 1 ~ " + n + " is " + sum);				
		sc.close();
	}
}
