package day4.ifex;

public class NestedIfEx {

	public static void main(String[] args) {
		/* 2,3,6의 배수 판별 예제
		 * (day4.practice패키지에 IfMultipleex2 문제)
		 */
		
		int num = 6;
		
		// 2의 배수
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println(num + " is multiple of 6 ");
			}
			else {
				System.out.println(num + " is multiple of 2 ");
			}
		}
		// 3의 배수
		else if(num % 3 == 0) {
			System.out.println(num + " is multiple of 3 ");
		}
		else {
			System.out.println(num + " is not multiple of 2, 3, 6 ");
		}
	}

}
