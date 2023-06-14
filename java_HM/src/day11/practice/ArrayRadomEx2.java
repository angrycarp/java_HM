package day11.practice;

public class ArrayRadomEx2 {

	public static void main(String[] args) {
		// 1~9 사이에 랜덤한 수를 중복되지 않게 3개를 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요.
		
		int min = 1, max = 9;
		int [] randomArray = new int[3];
				
		for(int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * (max - min + 1) + min);
			for(int j = 0; j < i; j++) {
				if(randomArray[i] == randomArray[j]) {
					i--;
					break;
				}
			}
		}
		printArray(randomArray);
		
		System.out.println("====================");
		
		int count = 0;
		createRandomArray(min, max, randomArray);
		printArray(randomArray);

	}
	/**	정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메서드
	 * 	매개변수 : 배열 => int arr[]
	 * 	리턴타입 : 없음 => void
	 * 	메서드명 : printArray
	 */
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	/**	정수 num가 배열의 0번지부터 count개만큼 확인했을 때 중복된 값이 있는지 없는지 알려주는 메서드
	 * 	매개변수 :	중복을 확인할 배열, 비교할 정수 num, 비교할 개수 count
	 * 			=> int arr[], int num, int count
	 * 	리턴타입 : 있는지 없는지 => boolean
	 * 	메서드명 : contains
	 **/
	public static boolean contains(int arr[], int num, int count) {
		for(int i = 0; i < count; i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		// 이 위칚지 왔다는 것은 return true를 못 만났다는 뜻이고, 그 말은 중복되지 않았다는 뜻.
		return false;
	}
	
	/**	min에서 max 사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 	매개변수 : int min, int max, int arr[]
	 * 	리턴타입 :	없음 => void
	 * 	메서드명 :	createRandomArray
	 **/
	public static void createRandomArray(int min, int max, int arr[]) {
		// 배열이 생성되어 있지 않으면(배열이 null이면) 메서드 종료
		if(arr == null) {
			return;
		}
		// 램덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메서드를 종료
		// 1~3 :3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음.
		if(max - min + 1 < arr.length) {
			return;
		}
		int count = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			// 중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(arr, random, count)) {
				arr[count] = random;
				count++;
			}
		}
	}
}

