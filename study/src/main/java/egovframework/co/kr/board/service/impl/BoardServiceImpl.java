package egovframework.co.kr.board.service.impl;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import egovframework.co.kr.board.service.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Resource(name="boardMapper")
	private BoardMapper boardMapper;
	@Override
	public List<HashMap<String, Object>> boardList() {
		// TODO Auto-generated method stub
		return boardMapper.boardList();
	}

}
