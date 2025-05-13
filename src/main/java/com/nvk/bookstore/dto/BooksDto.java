/**
 * © Copyright
 * All rights reserved to Nakka Vishnu Vardhan Kumar
 */
package com.nvk.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BooksDto {
	
	private String bookName;
	
	private String authorName;

}
