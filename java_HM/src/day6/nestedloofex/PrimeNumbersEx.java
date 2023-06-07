package day6.nestedloofex;

public class PrimeNumbersEx {

	public static void main(String[] args) {
		// 2부터 100사이의 소수를 출력하는 코드를 작성하세요
		
		int num, i = 1, j = 0;
		
		// num = 1 고정 하고 이걸 소수인지 판별해보자
				
		for(num = 1; num <= 100; num++) {
			for (i = 1; i <= num; i++) {
				if(num % i == 0) {
					j++;
				}
			}
			switch(j) {
			case 2 : System.out.println(num);
			break;
			}
			j = 0;
		}
	}
}
