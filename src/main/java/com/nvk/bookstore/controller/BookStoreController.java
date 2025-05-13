/**
 * © Copyright
 * All rights reserved to Nakka Vishnu Vardhan Kumar
 */
package com.nvk.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvk.bookstore.dto.BooksDto;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/books")
public class BookStoreController {
	
	@GetMapping
	public ResponseEntity<List<BooksDto>> getBooks()
	{
		BooksDto book = BooksDto.builder()
				.bookName("Nakka the cartoon").build();
		
		List<BooksDto> books = new ArrayList<>();
		books.add(book);
		return ResponseEntity.ok(books);
		
		
	}

}
