package com.studentmanagement.hibstudentdemo.Repository;

import java.util.List;

import com.studentmanagement.hibstudentdemo.Entity.DepartmentEntity;

public interface DepartmentDao {
    public List<DepartmentEntity> getAllDepartments() ;
 
    public DepartmentEntity getDepartment(int id) ;
 
    public void addDepartment(DepartmentEntity student);
 
     public void updateDepartment(DepartmentEntity student) ;
 
    public void deleteDepartment(int id) ;
}
