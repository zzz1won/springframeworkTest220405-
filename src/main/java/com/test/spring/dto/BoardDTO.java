package com.test.spring.dto;

import lombok.Data;

@Data //pom.xml에 dependency 추가!
public class BoardDTO {
	
	private long board_number;
	private String board_title;
	private String board_writer;
	private String board_contents;

}
