package day21.practice;

import java.util.HashSet;
import java.util.Scanner;

import day21.set.SetRandomEx;

public class LottoEx {

	public static void main(String[] args) {
		//로또 프로그램을 Set을 이용하여 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		int min = 1, max = 45, count = 0;
				
		HashSet<Integer> lotto = new HashSet<>();
		HashSet<Integer> bonus = new HashSet<>();
		HashSet<Integer> user = new HashSet<>();
		
		while(lotto.size() < 6) {
			int r = SetRandomEx.random(min, max);
			lotto.add(r);
		}
		System.out.println(lotto); //
		
		
		int r = SetRandomEx.random(min, max);
		
		while(bonus.size() < 1) {
			if(!(lotto.contains(r))) {
				bonus.add(r);
			}
		}
		
		System.out.println(bonus);	
		
		System.out.println("1 ~ 45 까지의 숫자 6개를 입력하세요. : ");
		while(user.size() < 6) {
			int j = sc.nextInt();
			user.add(j);
		}
		sc.close();
		
		System.out.println(user); //
		
		for(Integer tmp : user) {
			if(lotto.contains(tmp)) {
				count++;
			}
		}
		
		switch(count) {
		case 6 :
			System.out.println("First Place!");
			break;
		case 5 :
			if(user.contains(bonus)) {
			System.out.println("Second Place!"); 
			}
		else { 
			System.out.println("Third Place");
			}
			break;
		case 4 :
			System.out.println("4th Place!");
			break;
		case 3 :
			System.out.println("5th Place!");
			break;
		default :
			System.out.println("You didn't win the lottery");
			break;
		}
	}
}
