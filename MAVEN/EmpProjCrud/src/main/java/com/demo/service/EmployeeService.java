package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	void showAllEmp();

	Employee deleteEmployee(int eid);

	boolean updateSalary(int eid, double nsal);

	boolean addEmpToPrpject(int eid, int pid);

	List<Employee> sortBySalary();

}
