package day25.practice.student.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.practice.student.vo.Student;


public class StudentManager implements Program {
	Scanner sc = new Scanner(System.in);
	private final static int EXIT = 3;
	private ArrayList<Student> list = new ArrayList<>();



	@Override
	public void printMenu() {
		System.out.println("1. Insert");
		System.out.println("2. Print");
		System.out.println("3. EXIT");
		System.out.print("Select Menu : ");
		
	}

	@Override
	public void run() {
		int menu;
		load();
		do {
			System.out.println("===========");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("===========");
		}while(menu != EXIT);
		save();


		
	}

	private void save() {
		// 학생 정보를 저장 
		
		try(
				FileOutputStream fos = new FileOutputStream("src/day25/student/student.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
					for(Student std : list) {
						oos.writeObject(std);
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

	private void load() {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream("src/day25/student/student.txt"))){
				while(true) {
					Student tmp = (Student)ois.readObject();
					list.add(tmp);
				}
			} catch (FileNotFoundException e) {
				System.out.println("불러올 파일이 없습니다.");
			} catch (EOFException e) {
				System.out.println("불러오기 완료!");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("Student 클래스를 찾을 수 없습니다.");
			} 
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insert();
			break;
		case 2:
			print(list);
			break;
		case 3:
			System.out.println("EXIT!!");
			break;
		default:
			System.out.println("Wrong Menu!!");
		}		
	}
	
	private void insert() {
		//추가할 학생의 정보를 입력(학과, 이름, 학번)
		System.out.print("Major : ");
		sc.nextLine();//엔터를 처리하기 위해
		String major = sc.nextLine();
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("StudentNumber : ");
		String num = sc.next();
		
		//입력을 정보를 이용하여 학생 객체를 생성
		Student std = new Student(major, name, num);
				
		//학생리스트에 추가
		//학생이 있는지 없는지 확인(학과, 이름, 번호)해서 없으면 추가
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("Insert success!!");
			return;
		}
		
		//추가 성공하면 추가했다고, 실패하면 실패했다고 콘솔에 출력
		System.out.println("Insert fail!!");		
		sc.close();

	}

	private void print(List<Student> list) {
		for(Student std2 : list) {
			System.out.println(std2);
		}
	}


}
