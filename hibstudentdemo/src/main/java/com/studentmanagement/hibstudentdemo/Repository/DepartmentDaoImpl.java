package com.studentmanagement.hibstudentdemo.Repository;

import java.util.List;

import com.studentmanagement.hibstudentdemo.Entity.DepartmentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
    @Autowired
    private SessionFactory sessionFactory;
 
    public List<DepartmentEntity> getAllDepartments() {
        Session session = this.sessionFactory.getCurrentSession();
        List<DepartmentEntity>  departmentList = session.createQuery("from Department").list();
        return departmentList;
    }
   
 
    public DepartmentEntity getDepartment(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DepartmentEntity department = (DepartmentEntity) session.get(DepartmentEntity.class, id);
        return department;
    }
 
    public void addDepartment(DepartmentEntity department){
        Session session = sessionFactory.getCurrentSession();
        session.save(department);
    }   
   
 
    public void updateDepartment(DepartmentEntity department) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(department);
    }
 
    public void deleteDepartment(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DepartmentEntity p = (DepartmentEntity) session.load(DepartmentEntity.class, id);
        if (null != p) {
            session.delete(p);
        }
    } 
}
