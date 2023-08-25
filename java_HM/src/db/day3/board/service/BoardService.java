package src.db.day3.board.service;

import java.util.List;

import src.db.day3.board.vo.BoardVO;

public interface BoardService {

	boolean insertBoard(BoardVO board);

	List<BoardVO> getBoardList();

}
