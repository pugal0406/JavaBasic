package xyz.mizan.springbootjspcrudapp.service;

import java.util.List;

import xyz.mizan.springbootjspcrudapp.entity.Employee;
import xyz.mizan.springbootjspcrudapp.entity.EmployeeSignUp;

public interface EmployeeSignUpService {
	public EmployeeSignUp createEmployeeSignUp(EmployeeSignUp e);
	public EmployeeSignUp updateEmployee(int id,EmployeeSignUp e);
	public EmployeeSignUp insertOrUpdateEmployee(EmployeeSignUp e);
	public boolean deleteEmployee(int id);
	
	public List<EmployeeSignUp> selectEmployee();
	public EmployeeSignUp selectEmployeeById(int id);
	public List<EmployeeSignUp> selectPatientByCriteria(EmployeeSignUp employee);
}
