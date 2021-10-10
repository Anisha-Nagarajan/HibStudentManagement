package com.studentmanagement.hibstudentdemo.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.studentmanagement.hibstudentdemo.Entity.StudentEntity;
import com.studentmanagement.hibstudentdemo.Repository.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentService {
 
    @Autowired
    StudentDao studentDao;
    
 
    @Transactional
    public List<StudentEntity> getAllStudents() {
        return studentDao.getAllStudents();
    }
 
    @Transactional
    public StudentEntity getStudent(int id) {
        return studentDao.getStudent(id);
    }
 
    @Transactional
    public void addStudent(StudentEntity student) {
        studentDao.addStudent(student);
    }
 
    @Transactional
    public void updateStudent(StudentEntity student) {
        studentDao.updateStudent(student);
 
    }
 
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}
