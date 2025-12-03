package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean saveEmployee(Employee e1);

	List<Employee> showAll();

	Employee delete(int eid);

	boolean updateSal(int eid, double nsal);

	boolean addEmpToProj(int eid, int pid);

	List<Employee> sortBySalary();

	

}
