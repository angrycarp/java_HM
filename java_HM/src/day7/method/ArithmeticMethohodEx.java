package day7.method;

public class ArithmeticMethohodEx {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sub(1,2));
		System.out.println(mul(1,2));
		System.out.println(div(1,2));
		System.out.println(mod(1,2));
		sum(1,2);
		//	System.out.println(1+2);
	}
	/**
	 * 주어진 num1, num2의 합을 출력하는 메소드
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / (double)num2;
	}
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
}

