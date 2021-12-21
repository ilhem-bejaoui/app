package com.fst.tpspringboot.service;

import com.fst.tpspringboot.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    List<Student> getAllStudents22(String s);
    List<Student> getAllStudents33(String filtre);

}
