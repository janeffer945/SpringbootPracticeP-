package com.example.practiceproject;

import com.example.practiceproject.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class PracticeprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeprojectApplication.class, args);

	}



}
