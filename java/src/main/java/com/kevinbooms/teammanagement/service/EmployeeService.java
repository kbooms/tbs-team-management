package com.kevinbooms.teammanagement.service;

import com.kevinbooms.teammanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
   Employee saveEmployee(Employee employee);
   List<Employee> getAllEmployees();
   Employee getEmployeeById(long id);
   Employee updateEmployee(Employee employee, long id);
   void deleteEmployee(long id);
}

// Think of this Service Interface as a DAO interface
// best explanation I can think of.
// The ServiceImpl class stores the business logic implementations of these methods