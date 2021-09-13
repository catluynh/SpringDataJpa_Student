package SpringDataJpa_Student.catluynh.SpringDataJpa_Student;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import repository.EmployeeRepository;

@SpringBootTest
public class ApplicationTests {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void getAll() {
		employeeRepository.getAll().forEach(employees -> {
			System.out.println(employees);
		});
	}
	
	@Test
	public void add(){
		employeeRepository.addEmployee("cat", "luynh", "catluynh");
	}

	@Test
	public void update(){
		employeeRepository.updateEmployee("cat", "luynh", "catluynh@gmail.com",1);
	}
	
	@Test
	public void delete(){
		employeeRepository.deleteEmployee(1);
	}
}
