package com.studentmanagement.hibstudentdemo.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.studentmanagement.hibstudentdemo.Entity.DepartmentEntity;
import com.studentmanagement.hibstudentdemo.Repository.DepartmentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("DepartmentService")
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;
    
 
    @Transactional
    public List<DepartmentEntity> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
 
    @Transactional
    public DepartmentEntity getDepartment(int id) {
        return departmentDao.getDepartment(id);
    }
 
    @Transactional
    public void addDepartment(DepartmentEntity department) {
        departmentDao.addDepartment(department);
    }
 
    @Transactional
    public void updateDepartment(DepartmentEntity department) {
        departmentDao.updateDepartment(department);
 
    }
 
    @Transactional
    public void deleteDepartment(int id) {
        departmentDao.deleteDepartment(id);
    }
}
