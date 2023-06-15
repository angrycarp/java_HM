package day12.practice;

import java.util.Scanner;

import array.Array;

public class VocabularyNoteEx0 {

	public static void main(String[] args) {
		// 영어 단어장을 만들기 위해 필요한 객체를 만들고 테스트해보세요.
		// 배열 3개 만들자 
		// 1번 배열 영어 단어 => ex) Crab (공개)
		// 2번 배열 단어 뜻 => ex) 게 (비공개)
		// 3번 배열? 입력 칸 => ex) 게 => sysout 정답
		// 						원숭이 => sysout 오답 , 정답 공개.
		// 선택) 전체중에 몇개 맞았는지 
		
		
		String [] voca = new String [3];
		String [] mean = new String [3];
		String [] test = new String [3];
		
		Scanner sc = new Scanner(System.in);
		
		// 단어장에 단어 입력
		for(int i = 0; i < voca.length; i++) {
			System.out.println("Input English Word : ");
			voca[i] = sc.nextLine();
			System.out.println("Input Korean Meaning : ");
			mean[i] = sc.nextLine();
		}
			
		// 출력 and 단어 맞추기
		for(int i = 0; i < voca.length; i++) {
			System.out.println(voca[i]);
			System.out.println("Input Korean Meaning : ");
			test[i] = sc.nextLine();
			if(mean[i] == test[i]) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Wrong answer");
				System.out.println(voca[i] + " mean " + mean[i]);
			}
		}
	}

}
