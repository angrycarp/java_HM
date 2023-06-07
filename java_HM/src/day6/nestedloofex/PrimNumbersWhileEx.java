package day6.nestedloofex;

public class PrimNumbersWhileEx {

	public static void main(String[] args) {
		
		int i = 1, j = 1, count = 0;
		
		
		while(i <= 100) {
			while(j <= i) {
				if(i % j == 0) {
					count++;
				}
				j++;
			}
			switch(count) {
			case 2 :
				System.out.println(i);
			break;
			}
			count = 0;
			i++;
		}
	}
}
