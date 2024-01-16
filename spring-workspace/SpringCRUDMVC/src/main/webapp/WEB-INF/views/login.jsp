<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="loginPost" method="POST">
		<label for="lid">User Name: <input type="text" id="lid" name="lid" /></label>
		<label for="pwd">Password: <input type="text" id="pwd" name="pwd" /></label>
		<button>Submit</button>
	</form>
</body>
</html>