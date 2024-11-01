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

    public Employee() {}
    public Employee(String name, String email, String jobTitle, String phone_number, String image_url, String employee_code) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone_number = phone_number;
        this.image_url = image_url;
        this.employee_code = employee_code;
        
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public String getPhoneNumber(){
        return phone_number;
    }
    public void setPhoneNumber(String phone_number){
        this.phone_number=phone_number;

    }
    public String getImageUrl(){
        return image_url;
    }
    public void setImageUrl(String image_url){
        this.image_url=image_url;
    }
    public String getEmployeeCode(){
        return employee_code;
    }
    public void setEmployeeCode(String employee_code){
        this.employee_code=employee_code;
    }

    //when we are using tostring we can print employye object directly (coverting Employee object into string
    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id+
                ",name='"+name+'\''+
                ",email='"+email+'\''+
                ",jobtitle='"+jobTitle+'\''+
                ",phonenumber='"+phone_number+'\''+
                ",imageurl='"+image_url+'\''+'}';

    }


    
    
}
