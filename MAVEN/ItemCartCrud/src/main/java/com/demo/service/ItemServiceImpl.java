package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Items;
import com.demo.dao.ItemDao;
import com.demo.dao.ItemDaoImpl;

public class ItemServiceImpl implements ItemService{
	ItemDao idao;
	Scanner sc = new Scanner(System.in);

	public ItemServiceImpl() {
		idao = new ItemDaoImpl();
	}

	@Override
	public boolean addNewItem() {
		System.out.println("Enter Item ID");
		int iid = sc.nextInt();
		System.out.println("Enter Item Name");
		String name = sc.next();
		Items i = new Items(iid,name);
		return idao.save(i);
	}
	
}
