package day10.practice;

public class PointEx {

	public static void main(String[] args) {
		// 좌표의 점을 관리하는 클래스를 만들고 테스트하는 코드를 작성하세요.
		// 필요한 속성과 기능을 생각해서 추가해보세요. (예: 그림판 하단의 좌표)
		
		Point1 pt1 = new Point1(25,30);
		pt1.printPoint();
		pt1.movePoint(666, 444);
		pt1.printPoint();
		
		Point1 pt2 = new Point1(24,30);
		pt2.printPoint();
		
		Point1 pt3 = new Point1(23,30);
		pt3.printPoint();
		
		Point1 pt4 = new Point1(22,30);
		pt4.printPoint();
	}
}
// 점을 관리하는 클래스
/*	클래스의 접근제어자가 public으로 올 수 있는 조건
 * 	- 파일명과 클래스명이 같이야 public을 붙일 수 있음.
 *	같은 패키지에 같은 이름의 클래스가 있으면 안됨.
 * */
class Point1{
	// 멤버변수
	private int x, y;
	
	// 생성자
	public Point1() {}
	// 생성자 오버로딩. x,y좌표가 주어졌을 때 객체를 초기화
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter와 setter(메서드에 포함)
	/*	public 리턴타입 get변수명1(){
	 * 			return 변수명;
	 * 	}
	 * 	get 변수명에서 첫 글자를 대문자
	 * 	리턴타입은 별수의 자료형
	 * 
	 * 	setter
	 * 	public void set변수명(자료형 변수명) {
	 * 			this.변수명 = 변수명;
	 * 	}
	 **/

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
	// 메서드
	/**	현재 좌표를 출력하는 기능
	 * 	매개변수 : 없음 
	 * 	리턴타입 : 없음 => void
	 * 	메서드명 : printPoint
	 * */
	public void printPoint() {
		System.out.println("x : " + x + " , " + "y : " + y );
	}
	/** 주어진 x,y좌표로 이동하는 메서드
	 * 		=> 멤버변수 x,y를 주어진 x,y로 수정하는 메서드
	 * 	매개변수 : 주어진 x,y => int x, int y
	 * 	리턴타입 : 없음 => void
	 * 	메서드명 : movePoint
	 */
	public void movePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
