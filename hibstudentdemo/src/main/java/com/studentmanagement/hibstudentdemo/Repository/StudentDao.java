package com.studentmanagement.hibstudentdemo.Repository;

import java.util.List;

import com.studentmanagement.hibstudentdemo.Entity.StudentEntity;

public interface StudentDao {
    public List<StudentEntity> getAllStudents() ;
 
    public StudentEntity getStudent(int id) ;
 
    public void addStudent(StudentEntity student);
 
     public void updateStudent(StudentEntity student) ;
 
    public void deleteStudent(int id) ;
}
 