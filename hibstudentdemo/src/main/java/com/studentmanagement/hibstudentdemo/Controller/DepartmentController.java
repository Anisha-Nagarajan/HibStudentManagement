package com.studentmanagement.hibstudentdemo.Controller;

import java.util.List;

import com.studentmanagement.hibstudentdemo.Entity.DepartmentEntity;
import com.studentmanagement.hibstudentdemo.Service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
 
    @GetMapping("/departmentdetails")
    public String getDepartments(Model model){
        List<DepartmentEntity> listOfDepartments = departmentService.getAllDepartments();
        model.addAttribute("department", new DepartmentEntity());
        model.addAttribute("listOfDepartments", listOfDepartments);
        return "departmentdetails";
    }

    @GetMapping("/adddepartment")
	public String registerpage(@ModelAttribute("adddepartment")DepartmentEntity department) {
		
		System.out.println("In department register Page.....");
		
		return "adddepartment";
	}

    @PostMapping("/adddepartment")
	public String register1page(@ModelAttribute("addstudent")DepartmentEntity department) {
		
		System.out.println("In department post register Page.....");
		departmentService.addDepartment(department);
		return "adddepartment";
	}
    
    @GetMapping("/departmentbyid/{id}")
    public String getDepartmentById(Model model,@PathVariable("studentId")int id){

        model.addAttribute("department",departmentService.getDepartment(id));

        return "departmentbyid";
    }
}
