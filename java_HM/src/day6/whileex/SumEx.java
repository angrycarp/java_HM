package day6.whileex;

public class SumEx {

	public static void main(String[] args) {
		// 1부터 n까지 합을 구하는 코드를 작성하세요. (n은 10)
		int i = 1;
		int sum = 0;
		int n = 10;
		while(i <= n) {
			sum = sum + i;
			++i;
		}
		System.out.println(sum);
	}
}
