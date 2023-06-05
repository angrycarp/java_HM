package day5.pratice;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		/*	구구단 2단을 출력하는 코드를 작성하세요.
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 */
		
		int i = 1;
		int ans = 0;
		
		while(i <= 9) {
			ans = 2 * i;
			System.out.println("2 x " + i++ + " = " + ans);
		}
		System.out.println("=================");
	}
}
