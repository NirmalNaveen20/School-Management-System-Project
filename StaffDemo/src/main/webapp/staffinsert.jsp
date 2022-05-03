<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="insert" method = "post">
	
		<label for="ID">ID</label>
		<input type = "text" name = "id"> <br>
		
		<label for="fullName">Full Name</label>
		<input type = "text" name = "name"> <br>
		
		<label for="academic">Assign SubjectAcademic Qualification</label>
		<input type = "text" name = "aq"> <br>
		
		<label for="subject">Assign Subject</label>
		<select name = "subject">
		
		<option name = "subject" value="Information Technology">Information Technology</option>
		<option name = "subject" value="Computer Systems & Network">Computer Systems & Network</option>
		<option name = "subject" value="Software Engineering">Information Systems Engineering</option>
		<option name = "subject" value="Cyber Security">Cyber Security</option>
		<option name = "subject" value="Civil Engineering">Civil Engineering</option>
		<option name = "subject" value="Electrical & Electronic Engineering">Electrical & Electronic Engineering</option>
		<option name = "subject" value="Mechanical Engineering">Mechanical Engineering</option>
		<option name = "subject" value="Civil & Construction Engineering">Civil & Construction Engineering</option>
		<option name = "subject" value="Marketing Management">Marketing Management</option>
		<option name = "subject" value="Business Management">Business Management</option>
		<option name = "subject" value="Business Analytics">Business Analytics</option>
		<option name = "subject" value="Accounting & Finance">Accounting & Finance</option>
		
		</select> <br>
		<label for="email">Email</label>
		<input type="text" name = "email"> <br>
		
		<label for="contactNumber">Contact Number</label>
		<input type="number" name = "phone"> <br>
		
		<label for="dateofbirth">Date Of Birth</label>
		<input type="date" name = "date"> <br>
		
		<label for="gender">Gender</label>
		<select name="gender">
		<option name="gender" value="Male">Male</option>
		<option name="gender" value="Female">Female</option>
		<option name="gender" value="Other">Other</option> 
		</select> <br>
		
		<input type="submit" name="submit" value="Add Staff">
		
	</form>
	
</body>
</html>