package com.test.spring.repository.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.spring.dto.BoardDTO;

@Repository
public class BoardRepository {

	@Autowired 
	private SqlSessionTemplate sql;
	
	public void save(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		
	}

}
