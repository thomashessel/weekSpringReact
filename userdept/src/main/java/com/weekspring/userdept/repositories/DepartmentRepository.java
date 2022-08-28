package com.weekspring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.weekspring.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
