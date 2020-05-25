package oracle.java.s20200502.board.dao;

import java.util.List;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.java.s20200502.board.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession session;

	@Override
	public List<Board> boardList() {
		System.out.println("BoardDaoImpl boardList start");
		return session.selectList("boardList");
	}

	@Override
	public List<Board> noticeList() {
		System.out.println("BoardDaoImpl noticeList start");
		return session.selectList("noticeList");
	}

}
