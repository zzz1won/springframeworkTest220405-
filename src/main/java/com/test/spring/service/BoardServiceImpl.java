package com.test.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.dto.BoardDTO;
import com.test.spring.repository.mapper.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired BoardRepository br;
	
	@Override
	public void save(BoardDTO boardDTO) {
	System.out.println("BoardServiceImpl.save");	
	br.save(boardDTO);
	}

}
