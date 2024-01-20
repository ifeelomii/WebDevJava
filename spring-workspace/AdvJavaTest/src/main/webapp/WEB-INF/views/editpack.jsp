<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div align="center">
		<form action="editpack" method="post">
			Customer No: <input type="text" name="id" id="id"><br><br>
			Base Pack: <input type="text" name="bp" id="bp"><br><br>
			Optional Pack: <input type="text" name="op" id="op"><br><br>

			<button type="submit" name="btn" id="btn">Edit</button>
		</form>
	</div>
</body>
</html>