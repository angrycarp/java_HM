package day16.homework.vo;

import lombok.Data;

@Data
public class Beverager {
	
	private String name;
	private int price;
	private int amount;
	
	public Beverager(String name, int price) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	//메서드
	/**제품 입고 기능 => 현재 수량에 주어진 수량을 누적*/
	public void store(int amount) {
		//창고에 제품을 추가해야하는데 음수가 오면 안됨
		if(amount < 0) {
			return;
		}
		accumulate(amount);
	}
	/**제품 출고 기능 => 현주 수량에서 주어진 수량을 감소*/
	public void release(int amount) {
		if(amount < 0) {
			return;
		}
		accumulate(-amount);
	}
	private void accumulate(int amount) {
		this.amount += amount;
	}
	public void print() {
		System.out.println("제품명 : " + name);
		System.out.println("제고 : " + amount);
		System.out.println("가격 : " + price);
	}
}
