<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Add the Employee Details</title>
</head>
<body>
	<h2 class ="bg-primary"> Enter the Employee Details</h2>
	<form action="saveEmployee" method="post">
		<div class="form-group">
			<label for="username">Employee Name</label> 
			<input type="text" name="username" class="form-control" required="required">

		</div>
		<div class="form-group">
			<label for="mobile">Mobile</label> 
			<input type="number" name="mobile" class="form-control" required="required">
		</div>
		<div class="form-group">
			<label for="email">Email</label> 
			<input type="email" name="email" class="form-control" required="required">
		</div>
		<div class="form-group">
			<label for="doj">Date Of Joining</label> 
			<input type="date" name="doj" class="form-control" required="required">
		</div>
		
		<hr>
		<input type="submit" value="submit" class="btn btn-primary">
	
	</form>
</body>
</html>