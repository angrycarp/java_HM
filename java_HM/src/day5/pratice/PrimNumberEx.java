package day5.pratice;

import java.util.Scanner;

public class PrimNumberEx {

	public static void main(String[] args) {
		// 정수 num를 입력받아 num가 소수인지 아닌지를 판별하느 코드를 작성하세요.
		// 소수 : 약수가 1과 자기 자신밖에 없는 수
		// 소수 : 2,3,5,7,11,13 등
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Input Positive Number : ");
		num = sc.nextInt();

		int i = 1;
		int j = 0;		
		
		// num % i == 0 이 참인 경우가 2개 일 때 num은 소수이다.
		
		while(i <= num) {
			if(num % i == 0) {
				++j;
			}
			++i;
		}
		switch(j) {
		case 2 : System.out.println(num + " Is PrimeNumber.");
		break;
		default : System.out.println(num + " Is not PrimNumber.");
		}
		sc.close();
	}
}
