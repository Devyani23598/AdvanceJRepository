<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h2>ADD  EMPLOYEE</h2>
<form action="addEmployee" method="post">
<table>
<tr>
<td>Employee Id:</td>
<td><input type="text" name="employeeId" /></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><input type="text" name="employeeName" /></td>
</tr>
<tr>
<td>Designation:</td>
<td><input type="text" name="designation" /></td>
</tr>
<tr>
<td>Salary:</td>
<td><input type="text" name="salary" /></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label><br>
<input type="radio" id="other" name="gender" value="other">
<label for="other">Other</label>
</td>
</tr>
<tr>
   <td> <input type="submit" value="Add Employee"/></td>
   </tr>
</table>
</form>
</body>
</html>