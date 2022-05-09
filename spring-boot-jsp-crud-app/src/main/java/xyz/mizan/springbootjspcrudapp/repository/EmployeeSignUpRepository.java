package xyz.mizan.springbootjspcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import xyz.mizan.springbootjspcrudapp.entity.Employee;
import xyz.mizan.springbootjspcrudapp.entity.EmployeeSignUp;

public interface EmployeeSignUpRepository extends JpaRepository<EmployeeSignUp, Integer>{
	@Query("SELECT u FROM EmployeeSignUp u WHERE u.email = ?1")
	public EmployeeSignUp findByEmail(String email);
	
}
