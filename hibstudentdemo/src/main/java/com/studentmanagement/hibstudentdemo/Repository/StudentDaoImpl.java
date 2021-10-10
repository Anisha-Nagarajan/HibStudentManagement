package com.studentmanagement.hibstudentdemo.Repository;

import java.util.List;

import com.studentmanagement.hibstudentdemo.Entity.StudentEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public List<StudentEntity> getAllStudents() {
        Session session = this.sessionFactory.getCurrentSession();
        List<StudentEntity>  studentList = session.createQuery("from Student").list();
        return studentList;
    }
   
 
    public StudentEntity getStudent(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, id);
        return student;
    }
 
    public void addStudent(StudentEntity student){
        Session session = sessionFactory.getCurrentSession();
        session.save(student);
    }   
   
 
    public void updateStudent(StudentEntity student) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(student);
    }
 
    public void deleteStudent(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        StudentEntity p = (StudentEntity) session.load(StudentEntity.class, id);
        if (null != p) {
            session.delete(p);
        }
    } 
}

