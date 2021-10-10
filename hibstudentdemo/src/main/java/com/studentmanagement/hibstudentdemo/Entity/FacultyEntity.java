package com.studentmanagement.hibstudentdemo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity(name="Faculty")
@Table(name="Faculty")
public class FacultyEntity {
    @Id
    private int facultyId;
    @Column(nullable=false)
    private String facultyName;
    @Column(unique=true)
    private String facultyEmail;
    private int age;
    private String department;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="Faculty_Student", joinColumns={@JoinColumn(referencedColumnName="facultyId")}
                                        , inverseJoinColumns={@JoinColumn(referencedColumnName="studentId")})  
    private List<StudentEntity> students;
    public int getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public String getFacultyEmail() {
        return facultyEmail;
    }
    public void setFacultyEmail(String facultyEmail) {
        this.facultyEmail = facultyEmail;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public List<StudentEntity> getStudents() {
        return students;
    }
    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
    
    
}
