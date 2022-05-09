package xyz.mizan.springbootjspcrudapp.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.engine.internal.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.HttpResource;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import xyz.mizan.springbootjspcrudapp.entity.Employee;
import xyz.mizan.springbootjspcrudapp.exception.EmptyException;
import xyz.mizan.springbootjspcrudapp.repository.EmployeeRepository;
import xyz.mizan.springbootjspcrudapp.service.EmployeeServiceImp;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController extends HttpServlet{

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ResponseEntity<Object> goIndex() {
		List<Employee> employees = employeeServiceImp.selectEmployee();		
		employees.forEach(e->{System.out.println(e.getAddress());});

		Set<Employee> set = employees.stream() .collect(Collectors.toCollection(() ->
		new TreeSet<>(Comparator.comparing(Employee::getName))));
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	}


	@ModelAttribute("department")
	public List<String> initializeDepartment() {

		List<String> department = new ArrayList<String>();
		department.add("Software Engineer");
		department.add("Senior Software Engineer");
		department.add("Manager");
		department.add("Technica architect");
		return department;
	}


	@RequestMapping(value="/insertPage", method=RequestMethod.GET)
	public ResponseEntity<Object> addArticle() {
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public ResponseEntity<Object> addArticle(@PathVariable("id") int id) {
		
		Employee e = employeeServiceImp.selectEmployeeById(id);
		
		return new ResponseEntity<Object>(e,HttpStatus.OK);
	}

	@RequestMapping(value="/department", method=RequestMethod.GET)
	public ResponseEntity<Object> departMent() throws ParseException, IOException {
		List<Employee> employees=employeeRepository.findByDepartment();
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/insertPage", method=RequestMethod.POST)
	public ResponseEntity<Employee> insertEmployee(@Valid			
			@RequestBody Employee employeeBO,BindingResult result, HttpServletRequest request, HttpServletResponse res,HttpSession session) throws ParseException, IOException {
		if(employeeBO.getName().isEmpty() || employeeBO.getName().length()==0) {
			throw new EmptyException("601","Input field are empty");
		}
		employeeBO=employeeServiceImp.insertEmployee(employeeBO);
		return new ResponseEntity<Employee>(HttpStatus.OK);
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ResponseEntity<Object> deleteEmployee(@PathVariable("id") int id) {
	
		Employee e=employeeServiceImp.deleteEmployee(id);
		return new ResponseEntity<Object>("SUCCESS",HttpStatus.OK);
	}

	@RequestMapping(value="/logout", method=RequestMethod.GET)  
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
		if (auth != null){      
			new SecurityContextLogoutHandler().logout(request, response, auth);  
		}  
		return "redirect:/";  
	}  
}