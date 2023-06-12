package day9.classex;

public class CarMain {

	public static void main(String[] args) {
		/*	현대 뉴 아반떼 023년식 자동차 객체를 생성하는 코드를 작성하세요.
		 * */
		
		Car angca = new Car("The new AVANTE","Hyundai",2023);
		// 현재 내 차 조회
		angca.turn();
		angca.setGear('D');
		angca.printInfo();
		angca.speedChange(false);
		angca.speedChange(false);
		angca.speedChange(false);
		angca.printInfo();
		angca.speedChange(true);
		angca.speedChange(true);
		angca.speedChange(true);
		angca.printInfo();
		angca.speedChange(false);
		angca.printInfo();
	}
}
