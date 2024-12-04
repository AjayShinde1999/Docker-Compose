package com.simple_docker_postgresql.repository;

import com.simple_docker_postgresql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
