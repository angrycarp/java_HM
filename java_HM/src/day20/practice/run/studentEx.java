package day20.practice.run;

import day20.practice.controller.StudentController;

public class studentEx {

	public static void main(String[] args) {
		/*	Student 클래스를 이용하여 학생을 등록/수정/삭제하는 기능의 프로그램을 작성하세요
		 * 
		 * 	1. 학생추가
		 * 	2. 학생삭제
		 * 	3. 학생 수정
		 * 	4. 프로그램 종료
		 * 
		 * 	메뉴 선택 : 
		 */
		
		StudentController studentcontroller = new StudentController();
		studentcontroller.run();
	}

}
