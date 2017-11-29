package com.xumeng.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xumeng.adminportal.domain.Book;
import com.xumeng.adminportal.repository.BookRepository;
import com.xumeng.adminportal.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private  BookRepository bookRepository;
	
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> findAll(){
		return (List<Book>) bookRepository.findAll();
	}
}
