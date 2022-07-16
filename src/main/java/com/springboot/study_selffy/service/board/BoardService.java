package com.springboot.study_selffy.service.board;

import com.springboot.study_selffy.web.dto.board.CreateBoardReqDto;

public interface BoardService {

	//service는 오로지 자바로 움직이기 때문에 web패키지 밖에 패키지 만듬.
	
	public  boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
//	public  boolean getBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public  boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public  boolean deleteBoard(int boardcode) throws Exception;
	
	
	
}