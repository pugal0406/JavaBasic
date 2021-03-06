package xyz.mizan.springbootjspcrudapp.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="employees")
public class Employee implements Serializable{

	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int id;
	
//	@Column( unique = true, length = 45)
//	@Transient
//	private String email;
	
//	@Column(length = 64)
//	@Size(min = 3, max = 50)
//	@Transient
//	private String password;
	
	@Column(name="employee_name")
	@Size(min=3,message="Name min 3 is required")
	@Size(message="Name is required")
	private String name;
	@Column(name="employee_address")
	@Size(min=3,message="Employee Address is required")
	private String address;
	@Column(name="employee_phone")
	@Size(min=10,message="Employee number min 10 is required")
	private String phone;
	@Column(name="sex")
	@Size(min=1,message="Gender is required")
	private String sex;
	
	@Column(name="course")
	@Size(min=1,message="Course is required")
	private String course;
	@Column(name="department")
	@Size(min=1,message="Designation is required")
	private String department;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Size(min=1,message="Joining Date is required")
	@Column(name="joining_date")	
	private String joiningDate;
	
//	@Column(name="file_upload")
	private String fileupload;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "")
	@JoinColumn(name ="admin_id")
	private EmployeeSignUp employeeSignUp;


	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getFileupload() {
		return fileupload;
	}
	public void setFileupload(String fileupload) {
		this.fileupload = fileupload;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeSignUp getEmployeeSignUp() {
		return employeeSignUp;
	}
	public void setEmployeeSignUp(EmployeeSignUp employeeSignUp) {
		this.employeeSignUp = employeeSignUp;
	}

}