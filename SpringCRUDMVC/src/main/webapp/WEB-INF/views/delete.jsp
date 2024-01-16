<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
</head>
<body>
	<h1 style="text-align:center;">Edit Product</h1>
	<div class="container">
		<div class="contain">
			<form action="delete" method="post">
		      <label for="pid">
		      	Product Id: <input type="number" name="pid" id="pid" />
		      </label>
		      <br/>
		      <br/>
		      <button>Submit</button>
		    </form>
		</div>
	</div>
</body>
</html>