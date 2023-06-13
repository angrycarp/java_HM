package day10.practice;

public class RectEx {

	public static void main(String[] args) {
		// 그림판의 사각형을 그리기 위한 클래스를 생성하고 테스트 하는 코드를 작성하세요.
		Rectanger rct1 = new Rectanger(1,1,2,2);
		rct1.printRectanger();

	}

}
class Rectanger{
	// 맴버변수
	private int x1, x2, y1, y2;
	
	// 생성자
	public Rectanger() {}

	public Rectanger(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// getter, setter
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	/** 두 점을 이용해 만들어진 사각형의 좌표를 출력하는 메서드
	 * 	매개변수	: 
	 * 	리턴타입	: 없음 => void
	 * 	함수명 	: printRectanger 
	 */
	public void printRectanger() {
		System.out.println("(" + x1 + " , " + y1 + ") " + "(" + x1 + " , " + y2 + ") "
	+ "(" + x2 + " , " + y1 + ") " + "(" + x2 + " , " + y2 + ")");
	}
}
