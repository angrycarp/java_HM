package day8.homework;

import java.util.Scanner;

public class MethodPrintCharEx {

	public static void main(String[] args) {
		// 다음과 같이 출력하기 위한 코드를 작성하세요.
		// 단, 메서드 이용
		// *****
		// ***
		// ?????
		// ^^^^^^^
		
		Scanner sc = new Scanner(System.in);
		char pattern;
		int mag;
		System.out.println("Input Pattern(ex : ^, *, !) and num :");
		pattern = sc.next().charAt(0);
		mag = sc.nextInt();
		
		Printer(pattern,mag);

	}
	public static void Printer(char ch, int num) {
		int i;
		for(i = 1; i <= num; i++) {
			System.out.print(ch);
		}
	}

}
