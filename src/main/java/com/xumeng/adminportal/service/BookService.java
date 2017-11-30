package com.xumeng.adminportal.service;

import java.util.List;

import com.xumeng.adminportal.domain.Book;

public interface BookService {

		Book save(Book book);
		
		List<Book> findAll();
		
		Book findOne(Long id);
}
