package day20.practice.controller;

import java.util.ArrayList;
import java.util.Scanner;

import day20.collection.Student;

public class StudentController implements Program{
	
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> list = new ArrayList<Student>();


	@Override
	public void run() {
		System.out.println("프로그램 시작!!");
		
		int menu = -1;
		final int EXIT = 4;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			System.out.println(list);
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료!!");	
		
	}

	@Override
	public void printMenu() {
		System.out.println("================");
		System.out.println("메뉴");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 학생 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");	
	}
		


	@Override
	public void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	
			addStudent();
			break;
		case 2:
			deleteStudent();
			break;
		case 3:	
			modifyStudent();
			break;
		case 4:	
			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
		
		
	}

	private void addStudent() {
		System.out.println("학생 정보를 추가합니다.");
		System.out.println("학년, 반, 번호, 이름을 입력해 주세요.");
		int grade = sc.nextInt();
		int classNum = sc.nextInt();
		int number = sc.nextInt();
		sc.nextLine(); // number를 입력 하고 난 뒤 엔터를 처리하기 위해
		String name = sc.nextLine();
		
		Student std = new Student(grade, classNum, number, name);
		
		// 학생이 있는지 없는지 확인(학년, 반, 번호)해서 없으면 추가
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("정보를 추가했습니다.");
			return;
		}
		
		
	}

	private void deleteStudent() {
		System.out.println("n번째 학생 정보를 제거합니다.");
		int i = sc.nextInt() - 1;
		if(i > list.size()) {
			System.out.println(i + 1 + "번째 학생 정보는 없습니다.");
			return;
		}
		list.remove(i);
		
		System.out.println(list);
		
	}

	private void modifyStudent() {
		System.out.println("수정할 학생의 이전 정보와 새 정보를 입력해 주세요.");
		int grade = sc.nextInt();
		int classNum = sc.nextInt();
		int number = sc.nextInt();
		sc.nextLine(); // number를 입력 하고 난 뒤 엔터를 처리하기 위해
		String name = sc.nextLine();
			
		Student tmp = new Student(grade, classNum, number, null);
	}




}

