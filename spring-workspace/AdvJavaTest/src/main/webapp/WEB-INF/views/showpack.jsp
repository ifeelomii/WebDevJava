<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pack Table</title>
</head>
<body>

<div style="display:grid; align-items:center; justify-content:center;">
	
	<h1 style="text-align:center;">Pack List Table</h1>
	<table border="1">
		<thead align="center" style="padding:3px;">
			<tr>
				<th style="padding:5px;">Customer No.</th>
				<th style="padding:5px;">Base Pack</th>
				<th style="padding:5px;">Optional Pack</th>
				<th style="padding:5px;">Edit</th>
				<th style="padding:5px;">Delete</th>
			</tr>
		</thead>
		<tbody align="center" style="padding:3px;">
			<c:forEach var="p" items="${plist}"> 
				<tr align="center" style="padding:3px;">
					<td style="padding:5px;">${p.custNo}</td>
					<td style="padding:5px;">${p.basePack}</td>
					<td style="padding:5px;">${p.optPack}</td>
					<td style="padding:5px;"><a href="editpack" style="text-decoration:none; color:black;">Edit</a></td>
					<td style="padding:5px;"><a href="deletepack/${p.custNo}" style="text-decoration:none; color:black;">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p style="text-align:center;">${msg}</p>
	<br/>
	<br/>
	<a href="addpack" align="center"><button>Add New Pack</button></a>

</div>
</body>
</html>