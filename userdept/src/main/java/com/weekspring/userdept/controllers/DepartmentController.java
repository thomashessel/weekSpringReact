package com.weekspring.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weekspring.userdept.entities.Department;
import com.weekspring.userdept.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;

	@GetMapping
	public List<Department> findAll() {
		List<Department> result = departmentRepository.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public Department findDepartmentId(@PathVariable long id) {
		Department result = departmentRepository.findById(id).get();
		return result;
	}

	@PostMapping
	public Department inserirDepartment(@RequestBody Department department) {
		Department result = departmentRepository.save(department);
		return result;
	}
}
