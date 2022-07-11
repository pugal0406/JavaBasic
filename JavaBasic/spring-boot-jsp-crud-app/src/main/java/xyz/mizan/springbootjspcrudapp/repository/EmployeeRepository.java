package xyz.mizan.springbootjspcrudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import xyz.mizan.springbootjspcrudapp.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("SELECT u.department FROM Employee u")
	public List<Employee> findByDepartment();
	
}