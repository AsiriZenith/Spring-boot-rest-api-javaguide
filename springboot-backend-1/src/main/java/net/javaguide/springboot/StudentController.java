package net.javaguide.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Asiri", "Manjitha");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Asiri","Mnajitha"));
		students.add(new Student("Neja", "Dinujaya"));
		students.add(new Student("Supun", "Deshan"));
		students.add(new Student("Mauli", "Mathisha"));
		return students;
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable String firstName,@PathVariable String lastName) {
		return new Student(firstName, lastName);
	}
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
