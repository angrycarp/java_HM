package src.db.day3.board.controller;

import java.util.Scanner;

import src.db.day3.board.service.BoardService;
import src.db.day3.board.service.BoardServiceImp;
import src.db.day3.board.vo.BoardVO;

public class BoardController {
	
	private BoardService boardService = new BoardServiceImp();

	public void run() {
		int menu;
		final int EXIT = 5;
		Scanner sc = new Scanner(System.in);
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
		
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBoard();
			break;
		case 2:
			deleteBoard();
			break;
		case 3:
			updateBoard();
			break;
		case 4:
			selectAllBoard();
			break;
		case 5:
			System.out.println("[뒤로가기]");
			break;
		default:
			System.out.println("[잘못된 메뉴 입력]");
		}
		
		
	}

	private void selectAllBoard() {
		// 전체 게시글을 번호 제목 작성자아이디 순으로 출력
		List<BoardVO> boardList = boardService.getBoardList();
	}

	private void updateBoard() {
		// TODO Auto-generated method stub
		
	}

	private void deleteBoard() {
		// TODO Auto-generated method stub
		
	}

	private void insertBoard() {
		// 게시글 정보를 입력(제목, 작성자아이디)
		Scanner sc = new Scanner(System.in);
		System.out.println("제목 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.println("아이디 : ");
		String id = sc.next();
		
		BoardVO board = new BoardVO(title, id);
		
		if(boardService.insertBoard(board)) {
			System.out.println("[게시글 등록 성공]");
		}else {
			System.out.println("[게시글 등록 실패]");
		}
			
	}

	private void printMenu() {
		System.out.println("======회원메뉴======");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 조회");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
		
	}
	
	

}
