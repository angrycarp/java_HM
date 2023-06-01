package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 75;
		// 성적(score) 80점 이상이고, 90점 미만인가?
		// score가 80보다 크거나 같다 && score가 90보다 작다
		// score >= 80 && score < 90
		System.out.println(score + " 점은 B학점인가? " + (score >= 80 && score < 90));
		
		
		int age = 15;
		// 20세 이상이면 성인
		boolean isAdult = age >= 20;
		// age살은 미짜인가?
		System.out.println("Is " + age + " years old a minor? " + !isAdult);
		
		
		// 민증 있고 운면 없음
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		// 토익 볼 수 있나? (민증이나 운면이 있으면 볼 수 있음)
		System.out.println("Can I take TOEIC? " + (hasIdCard||hasDriverCard) );
		
	}

}
