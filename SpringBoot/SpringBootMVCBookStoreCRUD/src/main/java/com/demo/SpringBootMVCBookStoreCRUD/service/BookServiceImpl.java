package com.demo.SpringBootMVCBookStoreCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMVCBookStoreCRUD.beans.Book;
import com.demo.SpringBootMVCBookStoreCRUD.dao.BookDao;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bdao;

	@Override
	public List<Book> getAll() {
		List <Book> blist = bdao.findAll();
		return blist;
	}

	@Override
	public void add(Book book) {
		bdao.save(book);
	}

	@Override
	public void delete(int pid) {
		Book b = bdao.getById(pid);
		bdao.delete(b);
		
	}

	@Override
	public Book getById(int bid) {
		Book b = bdao.getById(bid);
		return b;
	}

	@Override
	public void update(Book book) {
		bdao.save(book);
	}
}
