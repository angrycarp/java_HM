package day2.scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// System.in : 표준입력
		// 표준 입력을 이용해서 스캐너를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num1 = sc.nextInt(); // 정수를 입력 받음
		System.out.println(num1);
		
		System.out.println("실수를 입력해주세요.");
		double num2 = sc.nextDouble(); // 실수를 입력 받음
		System.out.println(num2);

		System.out.println("문자열를 입력해주세요.");
		sc.nextLine();//
		String str1 = sc.nextLine(); // 스페이스를 포함한 문자열 한줄을 읽음
		System.out.println(str1);
		
		System.out.println("문자열2를 입력해주세요.");
		String str2 = sc.next();  // 첫번째 문자부터 읽어와서 다음 공백(엔터, 스페이스가 오기전까지 읽어옴)
		System.out.println(str2);

		System.out.println("문자열를 입력해주세요.");
		char ch = sc.next().charAt(0); // next(0)를 이용하여 한 단어를 읽어오고 읽어온 단어의 첫 글자를 가져옴
		System.out.println(ch);

		sc.close(); // close() 로 닫지 않아도 크게 문제는 없지만 안쓰면 주의표시가 생김
		
	}

}

