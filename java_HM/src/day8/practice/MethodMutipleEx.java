package day8.practice;

import java.util.Scanner;

public class MethodMutipleEx {

	public static void main(String[] args) {
		// 정수 num를 입력받아 2,3,6,의 배수인지 아닌지 판별하는 코드를 작성하세요.
		// 단, 메서드를 이용할 것
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number :");
		int num;
		num = sc.nextInt();
		
		if(isMultiple(num,6)) {
			System.out.println("is multiple of 6");
		}
		else if(isMultiple(num,3)) {
			System.out.println("is multiple of 3");
		}
		else if(isMultiple(num,2)) {
			System.out.println("is multiple of 2");
		}
		else {
			System.out.println("is not multiple of 2,3,6");
		}
		
		sc.close();
	}
	// MethodEvenNumberEx.isMultiple(4.2)); 다른 클래스파일에서 메서드 불러오기 
	
	/** num1이 num2의 배수인지 판별하는 메서드
	 * 	매개변수 :	int num1, int num2
	 * 	리턴타입 :	boolean
	 * 	함수명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
