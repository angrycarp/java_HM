package src.db.day3.board.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int bo_num;
	private String bo_title;
	private String bo_me_id;
	
	
	public BoardVO(String bo_title, String bo_me_id) {
		this.bo_title = bo_title;
		this.bo_me_id = bo_me_id;
	}

}
