package com.studentmanagement.hibstudentdemo.Controller;

import java.util.List;

import com.studentmanagement.hibstudentdemo.Entity.StudentEntity;
import com.studentmanagement.hibstudentdemo.Service.StudentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
 
    @GetMapping("/studentdetails")
    public String getStudents(Model model){
        List<StudentEntity> listOfStudents = studentService.getAllStudents();
        model.addAttribute("student", new StudentEntity());
        model.addAttribute("listOfStudents", listOfStudents);
        return "studentdetails";
    }

    @GetMapping("/addstudent")
	public String registerpage(@ModelAttribute("addstudent")StudentEntity student) {
		
		System.out.println("In student register Page.....");
		
		return "addstudent";
	}

    @PostMapping("/addstudent")
	public String register1page(@ModelAttribute("addstudent")StudentEntity student) {
		
		System.out.println("In student post register Page.....");
		studentService.addStudent(student);
		return "addstudent";
	}
    
    @GetMapping("/studentbyid/{studentId}")
    public String getStudentById(Model model,@PathVariable("studentId")int studentId){

        model.addAttribute("student",studentService.getStudent(studentId));

        return "studentbyid";
    }
    @GetMapping(value = "/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
        return "redirect:/studentdetails";
    }
}
