package com.example.demo;

HEAD
import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
1ba734bc2b71df685df5318ddd6602d67373de43
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

HEAD
	@GetMapping
	public List<Student> hello () {
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam.jamail@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21

				)
		);
	}

1ba734bc2b71df685df5318ddd6602d67373de43
}
