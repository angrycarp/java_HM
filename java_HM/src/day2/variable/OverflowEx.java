package day2.variable;

public class OverflowEx {

	public static void main(String[] args) {
		byte num = 127;
		num = ++num; //num에 1을 증가
		System.out.println(num);
		num = -128; // 오버프로우가 발생
		num = --num; // num에 1 감소
		System.out.println(num); //언더플로우가 발생
	}

}

