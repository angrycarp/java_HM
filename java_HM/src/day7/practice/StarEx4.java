package day7.practice;

public class StarEx4 {

	public static void main(String[] args) {
		/*	    *
		 * 	   ***
		 * 	  *****
		 * 	 *******
		 * 	*********
		 */	

		char ch = '*';
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
			}
			for(j = 1; j <= (i * 2 - 1); j++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
