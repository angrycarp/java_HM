package day17.interfaceex;

public interface RunInterface {
	/*public final static 이 자동으로 붙음. int = num; => 오류*/ 
	int NUM = 10; // 클래수 상수 => 클래스를 이용하여 호출
	/*public abstract 자동으로 붙음.*/ 
	void run();
	default void stop() {
		System.out.println("program stop!");
	}
}
