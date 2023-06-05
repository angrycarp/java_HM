package day5.pratice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		// 10이하의 짝수를 출력하는 코드를 작서아세요.
		
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
			i++;
		}
	}
}
