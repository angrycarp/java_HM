package kr.kh.edu.vo;

import lombok.Data;

@Data
public class MemberVO {
	
	String me_id;
	String me_pw;
	String me_role;
	String me_email;
	
	String me_session_id;
	String me_session_limit;

}
