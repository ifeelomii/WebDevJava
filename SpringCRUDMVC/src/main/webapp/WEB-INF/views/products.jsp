<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
</head>
<body>
<div style="display:grid; align-items:center; justify-content:center;">
	
	<h1 style="text-align:center;">Product List</h1>
	<table border="1">
		<thead align="center" style="padding:3px;">
			<tr>
				<th style="padding:5px;">Product ID</th>
				<th style="padding:5px;">Product Name</th>
				<th style="padding:5px;">Product Quantity</th>
				<th style="padding:5px;">Product Price</th>
				<th style="padding:5px;">Edit</th>
				<th style="padding:5px;">Delete</th>
			</tr>
		</thead>
		<tbody align="center" style="padding:3px;">
			<c:forEach var="p" items="${plist}"> 
				<tr align="center" style="padding:3px;">
					<td style="padding:5px;">${p.pid}</td>
					<td style="padding:5px;">${p.pname}</td>
					<td style="padding:5px;">${p.qty}</td>
					<td style="padding:5px;">${p.price}</td>
					<td style="padding:5px;"><a href="edit" style="text-decoration:none; color:black;">Edit</a></td>
					<td style="padding:5px;"><a href="delete" style="text-decoration:none; color:black;">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p style="text-align:center;">${msg}</p>
	<br/>
	<br/>
	<a href="addproduct" align="center"><button>Add New Product</button></a>

</div>
</body>
</html>