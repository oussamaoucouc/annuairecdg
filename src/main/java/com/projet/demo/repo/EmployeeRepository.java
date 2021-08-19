package com.projet.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.demo.model.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ 

}
