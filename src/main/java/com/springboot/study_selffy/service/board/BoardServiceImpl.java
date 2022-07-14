package com.springboot.study_selffy.service.board;

import org.springframework.stereotype.Service;

import com.springboot.study_selffy.web.dto.board.CreateBoardReqDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public Boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		System.out.println(createBoardReqDto);
		if(0 == 0) {
		throw new RuntimeException();
		}
		return true;
	}

	@Override
	public Boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		return null;
	}

	@Override
	public Boolean deleteBoard(int boardcode) throws Exception {
		return null;
	}

	
}