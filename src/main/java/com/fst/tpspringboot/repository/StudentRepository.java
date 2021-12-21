package com.fst.tpspringboot.repository;

import com.fst.tpspringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT s FROM Student s WHERE s.firstName = ?1 and s.lastName = ?2")
    List<Student> findAllStudent22(String variable,String variable2);

    List<Student> findBy33(String variable);
}
