package com.demo.SpringBootMVCBookStoreCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBootMVCBookStoreCRUD.beans.Book;
import com.demo.SpringBootMVCBookStoreCRUD.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bservice;
	
	@GetMapping("/display")
	public ModelAndView displayAll() {
		List<Book> blist = bservice.getAll();
		return new ModelAndView("displayall","blist",blist);
	}
	
	@GetMapping("/addbook")
	public String showAddBookForm(Model m) {
		m.addAttribute("Book",new Book());
		return "insertbook";
	}
	
	@PostMapping("/insertbook")
	public ModelAndView insertBook(@ModelAttribute Book book) {
		bservice.add(book);
		return new ModelAndView("redirect:/books/display");
	}
	
	@GetMapping("deletebook/{bid}")
	public ModelAndView delete(@PathVariable int bid) {
		bservice.delete(bid);
		return new ModelAndView("redirect:/books/display");
	}
	
	@GetMapping("update/{bid}")
	public ModelAndView editBook(@PathVariable int bid) {
		Book book = bservice.getById(bid);
		if(book!=null) {
			return new ModelAndView("update","book",book);
		}else {
			return new ModelAndView("redirect:/display");
		}
	}
	
	@PostMapping("/updatebook")
	public ModelAndView update(@ModelAttribute Book book) {
		bservice.update(book);
		return new ModelAndView("redirect:/books/display");
	}
	
	
}
