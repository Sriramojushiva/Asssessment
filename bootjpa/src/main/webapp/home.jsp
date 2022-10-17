<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Idle</title>
</head>
<body>
		<form action="addomega">
		<input type="text" name ="uid"><br>
		<input type="text" name ="FirstName"><br>
		<input type="text" name ="LastName"><br>
		<input type ="text" name ="EmailAdd"><br>
		<input type ="text" name = "phNo"><br>
		<input type="submit"><br>
		</form>
		
		<form action="getomega">
		<input type="text" name ="uid"><br>
		<input type="submit"><br>
		</form>
		
		<form action="getemail">
		<input type="text" name ="eid"><br>
		<input type="submit"><br>
		</form>
		
</body>
</html>