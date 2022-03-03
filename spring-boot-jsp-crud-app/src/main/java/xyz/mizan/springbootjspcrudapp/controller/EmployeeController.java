package xyz.mizan.springbootjspcrudapp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import xyz.mizan.springbootjspcrudapp.entity.Employee;
import xyz.mizan.springbootjspcrudapp.entity.EmployeeBO;
import xyz.mizan.springbootjspcrudapp.service.EmployeeServiceImp;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { // Date -
	 * dd/MM/yyyy SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	 * binder.registerCustomEditor(Date.class, new CustomDateEditor( dateFormat,
	 * false)); }
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView goIndex() {
		ModelAndView employeeModel = new ModelAndView();
		List<Employee> employees = employeeServiceImp.selectEmployee();
		employeeModel.addObject("employees", employees);
		employeeModel.setViewName("employee_list");
		return employeeModel;
	}
	
	
	@ModelAttribute("department")
	public List<String> initializeDepartment() {

		List<String> department = new ArrayList<String>();
		department.add("ECE");
		department.add("MECH");
		department.add("IT");
		department.add("CIVIL");
		return department;
	}
	
	
	@RequestMapping(value="/insertPage", method=RequestMethod.GET)
	 public ModelAndView addArticle() {
	  ModelAndView model = new ModelAndView();
	  Employee e = new Employee();
	  model.addObject("employeeForm", e);
	  model.setViewName("employee");
	  return model;
	 }
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	 public ModelAndView addArticle(@PathVariable("id") int id) {
	  ModelAndView model = new ModelAndView();
	  Employee e = employeeServiceImp.selectEmployeeById(id);
	  model.addObject("employeeForm", e);
	  model.setViewName("employee");
	  return model;
	 }
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public ModelAndView insertEmployee(			
			@ModelAttribute("employeeForm") EmployeeBO employeeBO) throws ParseException {
		ModelAndView model = new ModelAndView();
		Employee employee=new Employee();
		  employeeBO.setId(employeeBO.getId());
		  employeeBO.setName(employeeBO.getName());
		  employeeBO.setPhone(employeeBO.getPhone());
		  employeeBO.setSex(employeeBO.getSex());
		  employeeBO.setCourse(employeeBO.getCourse());
		  employeeBO.setAddress(employeeBO.getAddress());
		  employeeBO.setDepartment(employeeBO.getDepartment());
		  employeeBO.setJoiningDate(employeeBO.getJoiningDate());
		  SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String date=format.format(employeeBO.getJoiningDate());
		 employeeBO.setJoiningDate(format.parse(date));
		  
		  employee=employeeServiceImp.insertEmployee(employeeBO);
		  model.addObject("employeeForm", employee);
		  model.setViewName("employee");
		return new ModelAndView("redirect:/employee/list");
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable("id") int id) {
		employeeServiceImp.deleteEmployee(id);
		return new ModelAndView("redirect:/employee/list");
	}
	
	
}
