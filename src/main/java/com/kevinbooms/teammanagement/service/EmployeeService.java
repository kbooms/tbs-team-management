package com.kevinbooms.teammanagement.service;

import com.kevinbooms.teammanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
   Employee saveEmployee(Employee employee);
   List<Employee> getAllEmployees();
   Employee getEmployeeById(long id);
}
