package day7.practice;

public class Ex {

	public static void main(String[] args) {
		/* 다음과 같이 출력되는 코드를 작성하세요.
		 * a
		 * ab
		 * abc
		 * ...
		 * abcde...xyz
		 */
		
		char ch = 'a', end = 'a';
		
		for(end = 'a'; end <= 'z'; end++) {
			for(ch = 'a'; ch <= end; ch++) {
				System.out.print(ch);
			}
			System.out.println();		
		}
	}
}
