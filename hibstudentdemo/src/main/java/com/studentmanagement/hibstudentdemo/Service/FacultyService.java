package com.studentmanagement.hibstudentdemo.Service;

import javax.transaction.Transactional;

import com.studentmanagement.hibstudentdemo.Entity.FacultyEntity;
import com.studentmanagement.hibstudentdemo.Repository.FacultyDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("FacultyService")
public class FacultyService {
    
    @Autowired
    FacultyDao facultyDao;
    @Transactional
    public void addFaculty(FacultyEntity faculty) {
        facultyDao.addFaculty(faculty);
    }
}
