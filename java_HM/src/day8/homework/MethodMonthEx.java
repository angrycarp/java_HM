package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		// 월을 입력받아 월에 맞는 영어를 출력하세요.
		// 단 메서드 이용
		// 예:
		// input month :
		// 3
		// march
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number :");
		int month;
		month = sc.nextInt();
		
		System.out.println(month + " is " + Season(month));		
		
	}
	public static String Season(int num) {
		String month = " ";
		if(num == 1) {
			month = "January";
		}
		else if(num == 2) {
			month = "Fabuary";
		}
		else if(num == 3) {
			month = "March";
		}
		else if(num == 4) {
			month = "April";
		}
		else if(num == 5) {
			month = "May";
		}
		else if(num == 6) {
			month = "June";
		}
		else if(num == 7) {
			month = "July";
		}
		else if(num == 8) {
			month = "August";
		}
		else if(num == 9) {
			month = "September";
		}
		else if(num == 10) {
			month = "October";
		}
		else if(num == 11) {
			month = "November";
		}
		else if(num == 12) {
			month = "December";
		}
		else {
			month = "Wrong month";			
		}
		return month;	
	}
}
