package com.springboot.study_selffy.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.study_selffy.service.board.BoardService;
import com.springboot.study_selffy.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/board")
public class BoardController {
	
	private final BoardService boardService;
	
	//게시글 작성
	//게시글을 작성하는 행위에는 content/1 이렇게 번호를 작성하지 않음. (데이터베이스에서 자동으로 적용함)
	//request.getParameter => @RequestParam가 대체함.
	/*
	 * 변수명이 같으면 생략이 가능하다.
	 * (@RequestParam("content") String content)
	 * 	-> (@RequestParam String content)
	 * @RequestParam이 없어도 가능하다.
	 * 그러나 이렇게 줄여도 매개변수가 많아지면 코드가 길어지기 때문에 DTO를 사용하는 것이 좋다.
	 */
	
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto) {
		
		boolean responseData = false;
		try {
			responseData = boardService.createBoard(createBoardReqDto);
			//try에서 오류가 난 것은 service 오류이기 때문에 서버 오류이다.
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
		}	
		return ResponseEntity.ok().body(responseData);
		
//		return new ResponseEntity<>(title + " 게시글 작성 성공", headers, HttpStatus.BAD_REQUEST);
				//ResponseEntity(
	}
	
	//게시글 조회
	
	
	//게시글 수정
	
	
	//게시글 삭제

}
