package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.model.Book;

@Controller
public class BookController {

	@GetMapping(value = { "/", "/addBook" })
	public String loadForm(Model model) {
		Book b = new Book();
		model.addAttribute("book", b);
		return "addBook";
	}

	@PostMapping(value = "/addBook")
	public String handleSubmitBtn(Book book, Model model) {
		System.out.println(book);
		return "bookDtls";
	}
}
