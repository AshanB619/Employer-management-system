package model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity //this makes this class connect to database (jpa)
public class Employee implements Serializable {
    @Id //make primary key in entity
    @GeneratedValue(strategy = GenerationType.AUTO)       //how to genarate those value(no idea)
    @Column(nullable = false,updatable = false)//this makes the id column in database cannot have null value and cant update
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone_number;
    private String image_url;
    @Column(nullable = false,updatable = false) // this makes the employee_code column in database cannot have null value and cant update
    private String employee_code;
}
