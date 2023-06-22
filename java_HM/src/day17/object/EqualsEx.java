package day17.object;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer list[] = {
			new Customer("홍", "010-1234-5678"),
			new Customer("임", "010-1111-2222"),
			new Customer("유", "010-5555-5678"),
	};
	Customer customer = new Customer("홍", "010-1234-5678");
		
	//equals()가 오버라이딩 안됐을 때 고객이 명단에 있는지 조회
	/*
	for(Customer tmp : list) {
		if(tmp.getPhoneNumber().equals(customer.getPhoneNumber)) {
			System.out.println("OK");
			return;
		}
	}
	*/
}

class Customer{
	private String id;
	private String name;
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber)
	this.name = name;
	this.phoneNumber = phoneNumber;
	
}