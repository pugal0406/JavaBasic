package xyz.mizan.springbootjspcrudapp.service;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import xyz.mizan.springbootjspcrudapp.entity.Employee;
import xyz.mizan.springbootjspcrudapp.repository.EmployeeRepository;


@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public ResponseEntity<String> handleFileUpload( @RequestParam("file") MultipartFile file ) {

	    String fileName = file.getOriginalFilename();
	    try {
	      file.transferTo( new File("C:\\upload\\" + fileName));
	    } catch (Exception e) {
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    } 
	    return ResponseEntity.ok("File uploaded successfully.");
	  }
	
	
	@Override
	public Employee insertEmployee(Employee e){
		Employee emp=new Employee();
		emp.setId(e.getId());
//		emp.setEmail(e.getEmail());
//		emp.setPassword(e.getPassword());
		emp.setName(e.getName());
		emp.setPhone(e.getPhone());
		emp.setSex(e.getSex());
		emp.setAddress(e.getAddress());
		emp.setCourse(e.getCourse());
		emp.setDepartment(e.getDepartment());
		emp.setJoiningDate(e.getJoiningDate());
//		emp.setFileupload(e.getFileupload());
		
		return employeeRepository.save(emp);
	}
	
	@Override
	public Employee updateEmployee(int id,Employee e){
		Optional<Employee> empChack = employeeRepository.findById(id);
		if(!empChack.isPresent()) {
			return null;
		}
		e.setId(id);
		return employeeRepository.save(e);
	}
	
	@Override
	public Employee insertOrUpdateEmployee(Employee e){
		return employeeRepository.save(e);
	}
	
	
	
	@Override
	public List<Employee> selectEmployee(){
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee selectEmployeeById(int id){
		Employee empChack = employeeRepository.findById(id).get();
		return empChack;
		
	}

	@Override
	public List<Employee> selectPatientByCriteria(Employee employee){
		List<Employee> allEmployee = employeeRepository.findAll();
		
		if(employee.getId()== 0);
		else{
			for(Iterator<Employee> it = allEmployee.listIterator(); it.hasNext();){
				if(it.next().getId()!=employee.getId())
					it.remove();
			}
			if(allEmployee.isEmpty())
				return null;
		}
		
		if(employee.getName()=="");
		else{
			for(Iterator<Employee> it = allEmployee.listIterator(); it.hasNext();){
				if(it.next().getName().equals(employee.getName()));
				else{
					it.remove();
				}
			}
			if(allEmployee.isEmpty())
				return null;
		}
		
		if(employee.getAddress()=="");
		else{
			for(Iterator<Employee> it = allEmployee.listIterator(); it.hasNext();){
				if(it.next().getAddress().equals(employee.getAddress()));
				else{
					it.remove();
				}
			}
			if(allEmployee.isEmpty())
				return null;
		}
		
		if(employee.getPhone()=="");
		else{
			for(Iterator<Employee> it = allEmployee.listIterator(); it.hasNext();){
				if(it.next().getPhone().equals(employee.getPhone()));
				else{
					it.remove();
				}
			}
			if(allEmployee.isEmpty())
				return null;
		}
		return allEmployee;
		
	}


	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}


	
}