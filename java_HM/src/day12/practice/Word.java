package day12.practice;

public class Word{
	// 멤버변수
	private String title;
	private String meaning[];
	private int meaningCount;
	// 생성자
	public Word(String title, String meaning) {
		this.title = title;
		this.meaning = new String[5]; // 기본 5개
		this.meaning[0] = meaning;
		meaningCount++;
	}
	public Word(String title) {
		this.title = title;
		this.meaning = new String[5]; // 기본 5개
	}
	public Word(Word w) {
		this.title = w.title;
		for(int i = 0; i < w.meaningCount; i++) {
			meaning[i] = w.meaning[i];
		}
		meaningCount = w.meaningCount;
	}
	// 메서드
	/**	단어의 뜻을 출력하는 메서드
	 * 	매개변수 : 없음
	 * 	리턴타입 : 없음 => void
	 * 	메서드명 : print
	 **/
	public void print() {
		System.out.println("word : " + title);
		System.out.println("meaning : ");
		for(int i = 0; i < meaning.length; i++) {
			if(meaning[i] != null) {
				System.out.println(i+1+". " + meaning[i]);
			}
		}
	}
	/**	뜻을 추가하는 메서드
	 * 	매개변수 : String
	 * 	리턴타입 : 없음 => void
	 * 	메서드명 : addMeaning
	 */
	public void addMeaning(String meaning) {
		// 뜻이 다 찼으면 다 찼다고 출력하고 종료
		if(meaningCount == this.meaning.length) {
			System.out.println("It's all filled.");
			return;
		}
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	}
	/** 뜻을 제거하는 메서드
	 * 	매개변수 :	제거할 뜻의 번호 => int num
	 * 	리턴타입 : 없음 => void
	 * 	메서드명 : removeMeaning
	 */
	public void removeMeaning(int num) {
		if(num > meaningCount || num < 1) {
			System.out.println("I can't work.");
			return;			
		}
		// num-1번지부터 하나씩 당겨와서 덮어쓰기함.
		for(int i = num - 1; i < meaningCount -1; i++) {
			meaning[i] = meaning[i+1];
		}
		meaningCount--;
	}
}
