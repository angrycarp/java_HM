package day23.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		// 정수를 1부터 10까지 파일에 저장하는 코드는 작성하세요.
		// 파일명은 output1.txt
		
		
		File file = new File("output1.txt");
		try {
			//해당 파일/폴더가 존재하지 않고, 
			//이름에 .이 들어가면(확장자가 있으면) 파일을 생성
			if(!file.exists() && file.getName().contains(".")) {		
				file.createNewFile();
				System.out.println("Create File!");
			}
				
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		try(FileWriter fw = new FileWriter("output1.txt")){
			for(int i = 1; i<=10; i++) {
				fw.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
