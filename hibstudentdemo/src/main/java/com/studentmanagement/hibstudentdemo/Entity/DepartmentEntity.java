package com.studentmanagement.hibstudentdemo.Entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Department")
@Table(name="Department")
public class DepartmentEntity {
    
    @Id
    private int departmentId;
    @Column(nullable=false)
    private String departmentName;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="deptId")
    private List<StudentEntity> students;

    
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public List<StudentEntity> getStudents() {
        return students;
    }
    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
