package com.masai;

import javax.persistence.*;

//if you give the name that will be good otherwise it will take as default
@Entity(name = "Student")
@Table(
        name = "Student",
        uniqueConstraints =
                {
                    @UniqueConstraint(name = "student_email_unique", columnNames = "Email")
                }

)
public class Student
{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "ID",
            updatable = false
    )
    private Long id;
    @Column(
            name = "First_Name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private  String  firstName;
    @Column(
            name = "Last_Name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private  String  lastName;
    @Column(
            name = "Email",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private  String  email;
    @Column(name = "Age")
    private  Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Student()
    {
    }
//we have not required the id for constructor because it will automatic get generated
    public Student(
                   String firstName,
                   String lastName,
                   String email,
                   Integer age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
