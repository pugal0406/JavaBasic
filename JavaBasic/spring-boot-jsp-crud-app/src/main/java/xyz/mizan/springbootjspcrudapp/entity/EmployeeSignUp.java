package xyz.mizan.springbootjspcrudapp.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
@Table(name="employeesignup")
public class EmployeeSignUp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(nullable = false, unique = true, length = 45)
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	
	@Column(length = 64)
	@Size(min = 2, message="password must be minimum 2")
	private String password;
	
	@Column(name="employee_fname")
	@Size(min=3,message="First Name is required")
	private String fname;
	
	@Column(name="employee_lname")
	@Size(min=1,message="Last Name is required")
	private String lname;
	
	
//	@OneToOne(mappedBy = "employeeSignUp", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//	 
//	private Address address;
//	
	@OneToOne
	@JoinColumn(name="e_id")
	private Employee employee;
	
	
	public int getId() {
		return id;
	}
	
	public EmployeeSignUp() {
		
	}
	

	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	

}
