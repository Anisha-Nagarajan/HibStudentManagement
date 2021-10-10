package com.studentmanagement.hibstudentdemo.Controller;

import com.studentmanagement.hibstudentdemo.Entity.FacultyEntity;
import com.studentmanagement.hibstudentdemo.Service.FacultyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FacultyController {

    @Autowired
    FacultyService facultyService;

    @GetMapping("/addfaculty")
	public String registerpage(@ModelAttribute("addfaculty")FacultyEntity faculty) {
		
		System.out.println("In faculty register Page.....");
		
		return "addfaculty";
	}

    @PostMapping("/addfaculty")
	public String register1page(@ModelAttribute("addfaculty")FacultyEntity faculty) {
		
		System.out.println("In faculty post register Page.....");
		facultyService.addFaculty(faculty);
		return "addfaculty";
	} 
}
