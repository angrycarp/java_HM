package src.db.day3.board.dao;

import src.db.day3.board.vo.MemberVO;
import org.apache.ibatis.annotations.Param;

public interface MemberDAO {

	MemberVO selectMember(@Param("me_id")String me_id);

	void insertMember(@Param("member")MemberVO member);

	void insertMember2(MemberVO member);
	
	void deleteMember(@Param )
}