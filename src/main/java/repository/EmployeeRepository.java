package repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query(value = "select * from employee", nativeQuery = true)
	List<Employee> getAll();
	
	@Query(value = "insert into employee value(?first_name,?last_name,?email)", nativeQuery = true)
	void addEmployee(String first_name, String last_name, String email);
	
	@Query(value = "update employee set first_name=?first_name, last_name=?last_name, email=?email where id = ?id", nativeQuery = true)
	void updateEmployee(String first_name, String last_name, String email, int id);
	
	@Query(value = "delete from employee where id=?id", nativeQuery = true)
	void deleteEmployee(int id);
	
}
