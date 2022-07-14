package com.springboot.study_selffy.web.dto.board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
//Board를 create할 대 사용하는 Dto 클래스
	
	private String title;
	private int usercode;
	private String content;
	
	//Servlet은 String, int 등 변수 타입을 구별하지 못한다.
	//requestDto에는 @builder가 필요 없음. setter만 있어도 된다.
	//responseDto에서는 @builder가 꼭 필요함.
	
}
