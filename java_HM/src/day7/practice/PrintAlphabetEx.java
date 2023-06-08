package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		// 반복문을 이용해서 a ~ z까지 출력
		
		int i = 0;
		char ch;
		ch = 'a';
		while(i <= 25) {
			System.out.print((char)(ch + i));
			i++;
		}	
	}
}
