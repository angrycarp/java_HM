package day15.practice.shop.vo;

import lombok.Data;

@Data
public class ProductInfo {
	private String productName[];
	private String productInfo[];
	private int productCount;
	private int productStock;
	private int productPrice;
	
	
	//메서드
	/**제품 이름과 설명을 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printProductInfo
	 */
	public void printProductInfo() {
		System.out.println("Name of Product is : " + productName);
		System.out.println("Product Infomation is : " + productInfo);
	}
	
	/**제품의 정보를 추가하는 메서드
	 * 매개변수 : 추가될 뜻 => String meaning
	 * 리턴타입 : 없음 => void
	 * 메서드명 : addMeaning
	 */
	public void addProductInfo(String productInfo) {
		//정보가 다 찼으면 다 찼다고 출력하고 종료
		if(productCount == this.productInfo.length) {
			System.out.println("It's all filled.");
			return;
		}
		this.productInfo[productCount] = productInfo;
		productCount++;
	}
	
	/**제품의 정보를 제거하고 제거 여부를 알려주는 메서드
	 * 매개변수 : 제거할 뜻의 번호 => int num
	 * 리턴타입 : 제거 여부 => boolean
	 * 메서드명 : removeProductInfo
	 */
	public boolean removeproductInfo(int num) {
		if(num > productCount || num < 1) {
			//System.out.println("I can't work.");
			return false;
		}
		//num-1번지부터 하나씩 당겨와서 덮어쓰기함.
		for(int i = num-1; i < productCount-1; i++) {
			productInfo[i] = productInfo[i+1];
		}
		//마지막에 쓸모없는 데이터를 지움
		productInfo[productCount-1] = null;
		//제거 됐으면 뜻 개수를 하나 줄임
		productCount--;
		return true;
	}
	
	/**수정할 제품 정보의 번호와 수정할 제품 정보가 주어지면 제품 정보를 수정하고 수정 여부를 알려주는 메서드
	 * 매개변수 : 수정할 제품 정보의 번호, 수정할 제품 정보 => int productInfoNum, String productInfo 
	 * 리턴타입 : 수정 여부 => boolean
	 * 메서드명 : updateProductInfo
	 * @param productInfoNum
	 * @param productInfoNum2
	 * @return
	 */
	public boolean updateProductInfo(int productInfoNum, String productInfo) {
		//수정할 뜻의 번호가 잘못된 경우 
		if(productInfoNum > productCount || productInfoNum <= 0) {
			return false;
		}
		//meaningNum는 1부터이고 번지는 0부터이기 때문에 빼기 1을 한다
		this.productInfo[productInfoNum-1] = productInfo;
		return true;
	}
}


