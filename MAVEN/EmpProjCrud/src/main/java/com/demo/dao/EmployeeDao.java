package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean saveEmployee(Employee e1);

	List<Employee> showAll();

	

}
