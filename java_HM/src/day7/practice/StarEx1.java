package day7.practice;

public class StarEx1 {

	public static void main(String[] args) {
		/*	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 */	

		char ch = '*';
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}		
	}
}
