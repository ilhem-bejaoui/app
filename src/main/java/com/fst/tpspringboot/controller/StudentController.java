package com.fst.tpspringboot.controller;

import com.fst.tpspringboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudent(Model model) {
        model.addAttribute("studentList", studentService.getAllStudents());
        return "students_file";
    }

    @GetMapping("/students11")
    public String listStudent_11(Model model) {
        model.addAttribute("studentList", studentService.getAllStudents()
                .stream()
                .filter(x -> x.getFirstName().equals("11"))
                .collect(Collectors.toList()));
        return "students_file";
    }

    @GetMapping("/students22")
    public String listStudent_22(Model model) {
        model.addAttribute("studentList", studentService.getAllStudents22("22"));
        return "students_file";
    }

    @GetMapping("/students33")
    public String listStudent_33(Model model) {
        model.addAttribute("studentList", studentService.getAllStudents33("33"));
        return "students_file";
    }


}
