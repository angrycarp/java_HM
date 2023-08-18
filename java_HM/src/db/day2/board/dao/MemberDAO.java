package src.db.day2.board.dao;

import src.db.day2.board.vo.MemberVO;

public interface MemberDAO {

	MemberVO getMember(String id);

	void insertMember(String id, String pw);

	void deleteMember(String id);

}
