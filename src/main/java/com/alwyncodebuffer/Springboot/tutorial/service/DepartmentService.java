package com.alwyncodebuffer.Springboot.tutorial.service;

import com.alwyncodebuffer.Springboot.tutorial.entity.Department;
import com.alwyncodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   void deleteDepartmentById(Long departmentId);

   Department updateDepartment(Long departmentId, Department department);

   Department fetchDepartmentByName(String departmentName);

   Department fetchDepartmentByAddress(String departmentAddress);
}
