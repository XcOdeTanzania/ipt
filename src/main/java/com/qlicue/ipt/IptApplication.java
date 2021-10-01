package com.qlicue.ipt;

import com.qlicue.ipt.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class IptApplication {

	public static void main(String[] args) {

		SpringApplication.run(IptApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return  List.of(
				new Student(
						1L,
						"Micheal",
						"micheal@gmail.com",
						LocalDate.of(2000, 5, 12),
						20
				),
				new Student(
						2L,
						"Christina",
						"christina@gmail.com",
						LocalDate.of(2002, 8, 20),
						20
				),
				new Student(
						3L,
						"James",
						"james@gmail.com",
						LocalDate.of(2006, 12, 2),
						20
				)
		);
	}
}
