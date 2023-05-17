package com.kevinbooms.teammanagement.repository;

import com.kevinbooms.teammanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository interface includes CrudRepository and PagingAndSorting Repository
    // In this manner we have created a repository that takes Employee Objects and a Long
    // for the Id
}
