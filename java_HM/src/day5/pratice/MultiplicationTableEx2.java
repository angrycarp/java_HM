package day5.pratice;

public class MultiplicationTableEx2 {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지
		
		
		int i = 2;
		int j = 1;
		int ans = 0;
		
		while(i <= 9) {
			System.out.println(i + " Dan ");
			while(j <= 9) {
				ans = i * j;
				System.out.println(i + " x " + j + " = " + ans);
				j++;
			}
			j = 1;
			i++;
			System.out.println(" ");
		}
		System.out.println(" ===================== ");

	}
}
