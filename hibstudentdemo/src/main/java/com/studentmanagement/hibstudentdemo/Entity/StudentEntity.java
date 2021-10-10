package com.studentmanagement.hibstudentdemo.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="Student")
@Table(name="Student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int studentId;
    @Column(nullable=false)
    private String studentName;
    @Column(unique=true)
    private String studentEmail;
    private int age;
    private String department;
    private Date year;
    @ManyToOne
    private StudentEntity student;
    @ManyToMany(mappedBy="students")
    private List<FacultyEntity> faculties;
    
    public StudentEntity getStudent() {
        return student;
    }
    public void setStudent(StudentEntity student) {
        this.student = student;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
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
    public Date getYear() {
        return year;
    }
    public void setYear(Date year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", department=" + department + ", studentEmail=" + studentEmail + ", studentId="
                + studentId + ", studentName=" + studentName + ", year=" + year + "]";
    }
}

