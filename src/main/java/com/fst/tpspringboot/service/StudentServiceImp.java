package com.fst.tpspringboot.service;

import com.fst.tpspringboot.entity.Student;
import com.fst.tpspringboot.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getAllStudents22(String s) {
        return studentRepository.findAllStudent22("22","ac");
    }

    @Override
    public List<Student> getAllStudents33(String filtre) {
        return studentRepository.findBy33(filtre);
    }
}
