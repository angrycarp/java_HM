package week1homework;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		// 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input three nums : ");
		
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if((num1 + num2) > num3 && (num1 + num3) > num2 && (num2 + num3) > num1) {
			System.out.println("Can make Triangle!");
		}
		else {
			System.out.println("Cannot make Triangle!");

		}
		

		sc.close();
		
	}

}
