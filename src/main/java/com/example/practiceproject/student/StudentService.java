package com.example.practiceproject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public static List<Student> getstudents(){
        return List.of(
                new Student(
                        1L,
                        "jane",
                        "jane@gmail.com",
                        LocalDate.of(2003, Month.JANUARY, 22 ),
                        22
                ) 		);
    }
}
