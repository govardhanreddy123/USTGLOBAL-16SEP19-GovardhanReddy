package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class ConfigurationBook {
	
	@Bean(name = "author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Chetan Bhagat");
		author.setPetname("chetu");
		return author;
	}
	
	@Bean(name = "book")
	public Book getBook() {
		Book book = new Book();
		book.setName("City of dreams");
		book.setPrice(2000);
		book.setAuthor(getAuthor());
		return book;
		
	}

}
