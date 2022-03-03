<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import = "java.util.Date" %>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot JSP CRUD</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
 
 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 
</head>

<body>

<div class="container">
  <spring:url value="/employee/insert" var="saveURL" />
  <h2>
  Employee
  <spring:url value="/cancelInsertOrUpdate" var="cancelURL" />
  <a class="btn btn-primary" href="${cancelURL}" role="button" >Cancel</a>
  </h2>
  <form:form modelAttribute="employeeForm" method="post" action="${saveURL }" cssClass="form" >
   <form:hidden path="id"/>
   
   <div class="row">
   <div  class="col-sm-6">
   <div class="form-group">
    <label>Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   </div>
   </div>
   
   <div class="row">
   <div  class="col-sm-6">
   <div class="form-group">
    <label>Address</label>
    <form:input path="address" cssClass="form-control" id="address" />
   </div>
   </div>
   </div>
   
   <div class="row">
   <div  class="col-sm-6">
   <div class="form-group">
    <label>Phone</label>
    <form:input path="phone" cssClass="form-control" id="phone" />
   </div>
   </div>
   </div>
   
   <div class="form-group">
    <label>Gender: </label>
    <form:radiobutton path="sex" value="M"/>Male 
    <form:radiobutton path="sex" value="F"/>Female
   </div>
   
   <div class="row">
   <div  class="col-sm-6">
   <div class="form-group">
   <label>Course: </label> 
        B.Tech<form:checkbox path="course" value="B.Tech" style="margin-left: 1%;"/>  
        BSC<form:checkbox path="course" value="BSC" style="margin-left: 1%;"/>  
        MBA<form:checkbox path="course" value="MBA" style="margin-left: 1%;"/>  
   </div>
   </div>
   </div>
   
   <div class="row">
   <div  class="col-sm-6">
   <div class="form-group">
    <label>Department: </label> 
           <form:select path="department" id="department" class="form-control input-sm">
				        <form:option value="">Select Department</form:option>
			    	    <form:options items="${department}" />
				    </form:select>
   </div>
   </div>
   </div>
   <div class="form-group">
    <label>Date Of Joining: </label> 
    
   <form:input type="date" path="joiningDate"/>
   </div>
   
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  </div>
	
</body>
</html>