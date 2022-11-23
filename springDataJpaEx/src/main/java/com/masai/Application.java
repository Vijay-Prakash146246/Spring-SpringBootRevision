package com.masai;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application
{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository)
	{
		return  args -> {
			Student vijay = new Student(
					"Vijay",
					"Prakash",
					"vijayPrakash12345@gmail.com",
					21);

			//creating list of student
			Student s1 = new Student("Sonu","Kumar","sonu@gmail.com",24);
			Student s2 = new Student("Monu","Kumar","Monu@gmail.com",25);
			Student s3 = new Student("Niraj","Kumar","Niraj@gmail.com",26);
			Student s4 = new Student("Amit","Kumar","Amit@gmail.com",27);
			Student s5 = new Student("Sumit","Kumar","Sumit@gmail.com",28);
			List<Student> students = new ArrayList<Student>();
			//students.add(vijay);
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add(s4);
			students.add(s5);
			//studentRepository.save(vijay);
			studentRepository.saveAll(students);
		};
	}
}

