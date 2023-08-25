package src.db.day3.board.service;

import java.io.IOException;
import java.io.InputStream;

import src.db.day3.board.dao.BoardDAO;
import src.db.day3.board.vo.BoardVO;
import src.db.day3.board.vo.MemberVO;

public class BoardServiceImp implements BoardService {
	
	private BoardDAO boardDAO;
	private final String MYBATIS_CONFIG_PATH = "src.db/day3/board/config/mybatis-config.xml";
	
	public BoardServiceImp() {
		try {
			InputStream is = Resources.getResourceAsStream(MYBATIS_CONFIG_PATH);
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			//true의 역할 : 쿼리(insert,update,delete) 실행 후 자동 커밋되게 해줌 
			SqlSession session = sf.openSession(true);
			boardDao = session.getMapper(BoardDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean insertBoard(BoardVO board) {
		if(board == null || board.getBo_me_id() == null || board.getBo_title() == null) {
			return false;
		}
		//작성자 확인
		MemberVO member = memberDao.selectMember(board.getBo_me_id());
		//작성자가 없는 아이디이면
		if(member == null) {
			return false;
		}
		if(boardDao.insertBoard(board) != 0) {
			//게시글이 등록되면 회원이 작성한 게시글 수를 1 증가
			memeberDao.updateBoardCount(board.getBo_me_id());
			return true;
		}
		
		return false;
	}

}
