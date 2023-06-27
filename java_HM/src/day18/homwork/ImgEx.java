package day18.homwork;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ImgEx {

	public static void main(String[] args) {
		/* 파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성하세요.
		 * 이미지 확장자 : jpg, bmp, png(더 있지만 간단하게 3개만 체크)
		 * 
		 * input : dog.jpg
		 * dog.jpg : Image
		 * 
		 * input dog.exe
		 * dog.exe : Not image
		 * */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input file name : ");
		String str = sc.nextLine();
		String regex = "^[\\S]+(\\.(jpg|png|bmp))$";
		boolean result = Pattern.matches(str, regex);
		
		System.out.println(str + " : " + result);
	}
}
