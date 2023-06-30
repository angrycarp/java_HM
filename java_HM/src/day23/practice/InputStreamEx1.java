package day23.practice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamEx1 {

	public static void main(String[] args) {
		// 파일에 쓰인 값 전부를 읽어서 출력하는 코드를 만드세요!
		
		
		try(FileInputStream fis = new FileInputStream("output1.txt");){
			int data;
			do {
				data = fis.read();
				if(data == 1) {
					break;
				}
				System.out.println(data);
			}while(true);
			System.out.println();
			System.out.println("");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
