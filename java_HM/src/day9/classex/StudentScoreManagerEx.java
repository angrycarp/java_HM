package day9.classex;

import java.util.Scanner;

public class StudentScoreManagerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		// korScore를 인스턴스, 객체
		// Score1 koreScore = new Score(1,2,"korean Language");
		Score1 korScore = new Score1();
		korScore.title = "korean Language";
		korScore.grade = 1;
		korScore.semester = 2;
		Score1 engScore = new Score1();
		System.out.println(engScore.title);
	}
}

// 성적 클래스
class Score1 {
	String title; // 과목명
	int grade; // 학년
	int semester; // 학기
	double total; // 총점수
	double midExam; // 중간
	double finalExam; // 기말
	double performance; // 수행평가 
	// Score1 클래스의 기본 생성자
	public Score1() {
		/*	title의 기본값은? null
		 * 	grade의 기본값은? 0
		 * 	total의 기본값은? 0.0
		 *	*/
		grade = 1;
		semester = 1;
		title = "";
	}
}
// 학생 클래스
class Student1 {
	String name; // 이름
	String residentNumber; // 주민번호
	int grade; // 학년
	int classNum; // 반
	int number; // 번호
	int admissionYear; // 입학년도
	Score1 korsocre, engScore, mathScore; // 국어, 영어, 수학 성적
}
