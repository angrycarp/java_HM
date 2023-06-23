package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
		// Hello world에서 l이 몇개 있는지 확인하는 코드를 작성하세요
		
		int count = 0;
		String str = "Hello world";
		String search = "l";
		int index = 0;
		
		// 반복 : 찾으면 반복
		do {
			// Hello world에 l의 위치를 찾음 => lo world에서 l의 위치를 찾음 => o world에서 l의 위치를 찾음
			// => d에서 l의 위치를 찾음
			index = str.indexOf(search, ++index);
			// 찾았으면 개수를 증
			if(index != -1) {
				count++;
			}
		}while(index != -1);
		// 개수를 출력
		System.out.println(count);
	}
}
