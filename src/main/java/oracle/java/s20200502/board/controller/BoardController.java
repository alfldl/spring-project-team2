package oracle.java.s20200502.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import oracle.java.s20200502.board.model.Board;
import oracle.java.s20200502.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("boardList")
	public String boardList(Board board, Model model) {
		System.out.println("boardList Controller start");
		List<Board> boardList = boardService.boardList(board);
		model.addAttribute("boardList", boardList);
		
		
		return "board/boardList";
	}
	
	@RequestMapping("noticeList")
	@ResponseBody
	public List<Board> noticeBoard (Board board) {
		System.out.println("noticeBoard Controller start");
		List<Board> noticeList = boardService.noticeList(board);
		
		return noticeList;
	}
	
	@RequestMapping("studyBoardList")
	@ResponseBody
	public  List<Board> studyBoardList (Board board) {
		System.out.println("studyBoardList Controller Start");
		List<Board> studyBoardList = boardService.studyBoardList(board);
		
		return studyBoardList;
	}
	

}