package com.demo.test;

import java.util.Scanner;

import com.demo.service.ItemService;
import com.demo.service.ItemServiceImpl;

public class CrudTest {
	
	
	public static void main(String[] args) {
		ItemService iservice = new ItemServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.AddNewItems \n2.AddNewCart \n3.ShowCart \n4.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				boolean status = iservice.addNewItem();
				if(status) {
					System.out.println("Item Added Successfully.");
				}else {
					System.out.println("Item not Added.");
				}
			}
			case 2 -> {
				boolean status = iservice.addNewCart();
			}
			}
		}while(choice!=4);
	}

}
