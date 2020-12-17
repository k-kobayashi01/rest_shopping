package com.example.tutorial1.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

// このJpaRepositoryを定義するだけでfind()やsave()など、データの様々なやりとりができる
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
