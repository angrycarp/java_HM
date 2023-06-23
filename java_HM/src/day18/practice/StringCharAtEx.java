package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		// 영문 소문자로 된 문자열을 입력받아 알파벳이 각각 몇개 있는지 확인하는 코드를 작성하세요.
		/*	input : hello world
		 * 	d : 1
		 * 	e : 1
		 *  h : 1
		 *  l : 3
		 *  o : 2
		 *  r : 1
		 *  w : 1
		 */
		
		Scanner sc = new Scanner(System.in);
		int count = 0, index = 0;
		char search = 0;
	
		
		System.out.println("Input : ");
		String str = sc.nextLine();
		
		
		// 1. StringIndexOfEx응용 해서 a부터 z까지 반복
		for(char i = 'a'; i <= 'z'; i++) {
			do {
				// Hello world에 l의 위치를 찾음 => lo world에서 l의 위치를 찾음 => o world에서 l의 위치를 찾음
				// => d에서 l의 위치를 찾음
				index = str.indexOf(i, ++index);
				// 찾았으면 개수를 증
				if(index != -1) {
					count++;
				}
			}while(index != -1);
			if(count > 0) {
				System.out.println(i + " : " + count);
				count = 0;
			}
		}
		System.out.println("=============================");
		
		// 2. charAt(i)을 이용해서 i번째 글자가 a ~ z까지 중 무엇인지 판별 해당되는 글자 count++
		// switch case로 a~ z까지 만들고 각각 해야됨 ? 
		
		for(char i = 'a'; i <= 'z'; i++) {
			for(int j = 0; j < str.length(); j++) {
				search = str.charAt(j);	
				if(search == i) {
					count++;
				}
			}
			if(count > 0) {
				System.out.println(i + " : " + count);
				count = 0;
			}
		}
		sc.close();
	}
}
