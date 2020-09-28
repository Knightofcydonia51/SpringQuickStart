package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO boardDAO;
	
	public void insertBoard(BoardVO vo) {
	}

	public void updateBoard(BoardVO vo) {
	}

	public void deleteBoard(BoardVO vo) {
		
	}

	public BoardVO getBoard(BoardVO vo) {
		return null;
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return null;
	}
	
	
	
	
}
