package com.studentmanagement.hibstudentdemo.Repository;


import com.studentmanagement.hibstudentdemo.Entity.FacultyEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FacultyDaoImpl implements FacultyDao{
    @Autowired
    private SessionFactory sessionFactory;

    public void addFaculty(FacultyEntity faculty){
        Session session = sessionFactory.getCurrentSession();
        session.save(faculty);
    }  
}
