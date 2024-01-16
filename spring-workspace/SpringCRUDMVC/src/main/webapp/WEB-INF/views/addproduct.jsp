<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div style="text-align:center;">Add Product</div>
	<div class="container">
		<div class="contain">
			<form action="addproduct" method="post">
		      <label for="pid">
		      	Product Id: <input type="number" name="pid" id="pid"/>
		      </label>
		      <br/>
		      <br/>
		      <label for="pname">
		      	Product Name: <input type="text" name="pname" id="pname"/>
		      </label>
		      <br/>
		      <br/>
		      <label for="qty">
		      	Product Quantity: <input type="number" name="qty" id="qty"/>
		      </label>
		      <br/>
		      <br/>
		      <label for="price">
		      	Product Price: <input type="number" name="price" id="price"/>
		      </label>
		      <br/>
		      <br/>
		      <button>Submit</button>
		    </form>
		</div>
	</div>
</body>
</html>