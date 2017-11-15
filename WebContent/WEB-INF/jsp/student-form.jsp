<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.error{
color:red;
}
</style>
<title>Student Form</title>
</head>
<body>
	<h1>Greet Form!</h1>

	<form:form action="process-std-form" modelAttribute="std">
		First Name: <form:input path="firstName" /><form:errors path="firstName" cssClass="error" /> <br>
		Last Name: <form:input path="lastName" /><form:errors path="lastName" cssClass="error" />
		
		<br><br>
		
		Male: <form:radiobutton path="gender" value="Male" /> &nbsp;
		Female: <form:radiobutton path="gender" value="Female" />
		<br>
		<br>
		Age: <form:input path="age" /><form:errors path="age" cssClass="error" />
		<br>
		<br>
		
		<br>
		<br>
		DOB: <form:input path="dob" /><form:errors path="dob" cssClass="error" />
		<br>
		<br>
		
		Country: 
		<form:select path="country">
		<form:option value="IN1" label="India" />
		<form:option value="AUS23472390n" label="Austrailia" />
		</form:select>
		<form:errors path="country" cssClass="error" />
		<br>
		<br>
		
		Courses: &nbsp;
		Java Module 1: <form:checkbox path="courses" value="Core Java" />&nbsp;
		Java Module 2: <form:checkbox path="courses" value="Adv Java" />&nbsp;
		Java Module 3: <form:checkbox path="courses" value="Java FW" />&nbsp;
		
		
		<br>
		<br>
		
		Are you a Graduate? <form:checkbox path="grad"/>
		
		<br>
		<br>
		
		Comment: <form:textarea path="comment"/>
		
		<br>
		<br>
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>