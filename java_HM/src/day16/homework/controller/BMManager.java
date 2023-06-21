package day16.homework.controller;

import java.util.Scanner;

import day15.practice.shop.vo.Product;

public class BMManager {
	
	private Scanner sc = new Scanner(System.in);
	private int money = 0;
	private int ciderAmount, colaAmount, fantaAmount = 0;
	private String beverage = "";

	
	public void run() {		
		System.out.println("프로그램 시작!!");
		
		int menu = -1;
		final int EXIT = 4;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료!!");	
	}

	private void printMenu() {
		System.out.println("================");
		System.out.println("메뉴");
		System.out.println("1. 금액 투입");
		System.out.println("2. 음료 선택");
		System.out.println("3. 제품 입고");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");	
	}

	private void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	
			moneyIn();
			break;
		case 2:
			choiceBaverage();
			break;
		case 3:	
			stockBavaerage();
			break;
		case 4:	
			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
		
	}
	private void moneyIn() {
		System.out.println("금액을 투입해 주세요. : ");
		money += sc.nextInt();
		System.out.println("잔액은 " + money + " 입니다.");
		if(money < 0) {
			System.out.println("잘못된 금액입니다.");
			return;
		}
	}

	private void choiceBaverage() {
		// 현재 재고가 <= 0 이면 재고가 부족합니다 출력.
		System.out.println("음료를 선택해 주세요.");
		System.out.println("1. 사이다 : 1300원");
		System.out.println("2. 콜라 : 1500원");
		System.out.println("1. 환타 : 1000원");
		int num = sc.nextInt();
		switch(num) {
		case 1:	
			moreMoney(money, 1300);
			buy("사이다", 1300);
			ciderAmount--;
			break;
		case 2:
			moreMoney(money, 1500);
			buy("콜라", 1500);
			colaAmount--;
			break;
		case 3:	
			moreMoney(money, 1000);
			buy("환타", 1000);
			fantaAmount--;
			break;
		default:
			System.out.println("잘못된 메뉴 입니다.");	
		}
	}

	
	private void buy(String str, int i) {
		System.out.println(str + "을 구매하셨습니다. 잔액은 " + (money - i) + " 원 입니다." );
	}

	private void moreMoney(int money2, int i) {
		if((money - i) < 0) {
			System.out.println("금액이 부족합니다.");
			return;
		}
	}

	private void stockBavaerage() {
	
		//입고할 제품 선택
		System.out.print("입고할 제품 1. 사이다 2. 콜라 3. 환타 : ");
		int num = sc.nextInt();
		
		//입고할 제품 수량
		System.out.print("수량  : ");
		int amount = sc.nextInt();
		
		if(amount < 0) {
			System.out.println("입고 수량 오류!");
			return;
		}
		switch(num) {
		case 1:	
			ciderAmount = ciderAmount + amount;
			amount = 0;
			break;
		case 2:
			colaAmount = colaAmount + amount;
			amount = 0;
			break;
		case 3:	
			fantaAmount = fantaAmount + amount;
			amount = 0;
			break;
		case 4:	
			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
		System.out.println("현재 재고량은 사이다 " + ciderAmount + " 콜라 " + colaAmount + " 환타 " + fantaAmount " 개 입니다." );
	}
}
