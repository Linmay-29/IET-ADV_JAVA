package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Project;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService{
	Scanner sc = new Scanner(System.in);
	private ProjectDao pdao;

	public ProjectServiceImpl() {
		pdao = new ProjectDaoImpl();
	}

	@Override
	public boolean addNewProject() {
		System.out.println("Enter Project ID");
		int pid = sc.nextInt();
		System.out.println("Enter Project Name");
		String pname = sc.next();
		System.out.println("Enter Start Date (DD/MM/YYYY)");
		String sdate = sc.next();
		LocalDate ldt = LocalDate.parse(sdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Project p = new Project(pid,pname,ldt);
		return pdao.save(p);
	}

	
}
