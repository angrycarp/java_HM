package day21.practice.updown.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import day21.set.SetRandomEx;

public class controller {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> map = new HashMap<>();

	public static void run() {
		System.out.println("Program Start!");
		
		int menu = -1;
		final int EXIT = 3;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("Exit the program!");			
	}

	private static void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	
			play();
			break;
		case 2:
			printrecord();
			break;
		case 3:	
			break;
		default:
			System.out.println("Wrong menu!");
		}		
	}
	
	public static void printMenu() {
		System.out.println("================");
		System.out.println("menu");
		System.out.println("1. play");
		System.out.println("2. record");
		System.out.println("3. exit");
		System.out.print("select : ");			
	}
	
	private static void play() {
		int min = 1, max = 100, count = 0;
		int r = SetRandomEx.random(min, max);
		int input = 0;
		System.out.println(r); // test용
		do {
			System.out.println("Input number 1 ~ 100: ");
			input = sc.nextInt();
			if(input > 100 || input < 1) {
				System.out.println("Input 1 ~ 100");
				return;
			}
			if(r < input) {
				System.out.println("Down");
			}
			else if(r > input) {
				System.out.println("Up");
			}
			count++;
		}while(!(r == input));
		System.out.println("Congratulation! Record id : ");
		sc.nextLine();
		String id = sc.nextLine();
		map.put(id, count);
		
        List<String> keySet = new ArrayList<>(map.keySet());

        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });			
		count = 0;	
	}

	private static void printrecord() {
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String id = it.next(); // key값을 가져옴
			Integer count = map.get(id); // key값(id)를 이용해서 value값을 가져옴
			System.out.println("id : " + id + ", count : " + count);
		}
	}
}
