package day21.practice.updown.vo;

import lombok.Data;

@Data
public class Record {
	
	
	private String id;
	private int count;
	
	public Record(String id, int count) {
		this.id = id;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "[" + id + " : " + count + "]";
		
	}


}
