package com.fst.tpspringboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Entity
@NamedQuery(name = "Student.findBy33"
        , query = "SELECT s FROM Student s WHERE s.firstName = :variable")

@Table(name = "etudiant")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "prenom", nullable = false)
    private String firstName;
    @Value("nom")
    private String lastName;

    @Value("#{'test1'+'test2'}")
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String email;

    // hibernate besoin de default constructor
    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String fullName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
