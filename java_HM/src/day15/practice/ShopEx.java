package day15.practice;

import day13.homework.vo.Word;
import lombok.Data;

public class ShopEx {

	public static void main(String[] args) {
		/* 가전 제품(TV, 라디오, 에어컨)을 관리하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 제품 판매 : 어떤 고객이 어떤 제품을 구매했는지 관리
		 * 2. 제품 입고 : 새 제품이 추가됨. 어떤 제품이 몇개 추가 됐는지 관리
		 * 3. 제품 조회 : 제품 정보 조회. 제품명으로 제품을 조회
		 * 4. 매출 조회 : 판매된 제품 매출 조회. 누적 매출
		 * 5. 프로그램 종류 
		 * */
		
		
	}

}
/* 필요한 클래스
 * 제품에 관한 클래스
 * 고객에 관한 클래스
 * 매출에 관한 클래스
 */
@Data
class ProductManagement{

}

@Data
class Product{
	private String productName[];
	private String productInfo[];
	private int productCount;
	private int productStock;
	private int productPrice;
	

}

@Data
class Client{
	private String name;	
}

@Data
class Sales{
	private String sales;
	

}