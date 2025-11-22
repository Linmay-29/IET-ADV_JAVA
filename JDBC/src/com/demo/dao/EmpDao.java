package com.demo.dao;

import com.demo.beans.Employee;

public interface EmpDao {

	boolean addEmp(Employee emp);

	boolean updateSal(int eid, double sal);

	void showEmp();

	void showSalById(int eid);

	boolean deleteEmpById(int eid);

	double TotalEmpSal();

}
