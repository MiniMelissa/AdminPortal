package com.xumeng.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.xumeng.adminportal.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

	
}
