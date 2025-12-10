package com.demo.SpringBootMVCBookStoreCRUD.service;

import java.util.List;

import com.demo.SpringBootMVCBookStoreCRUD.beans.Book;

public interface BookService {

	List<Book> getAll();

	void add(Book book);

	void delete(int pid);

	Book getById(int bid);

	void update(Book book);

}
