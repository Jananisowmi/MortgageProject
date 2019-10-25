<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

.container {
	padding: 20px;
}
</style>
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center" class="container" style="background-color: gray">
		<h1>Apply Loan Form</h1>
		<form:form action="/saveApplication" method="post"
			modelAttribute="loanApp">
			<table>
				<tr>
					<td>User Id</td>
					<td><form:input path="userId" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Loan Amount:</td>
					<td><form:input path="loanAmount" /></td>
				</tr>
				<tr>
					<td>Property Type:</td>
					<td><form:select path="propertyType">
							<option value="Land">Land</option>
							<option value="Gold">Gold</option>
						</form:select></td>
				</tr>
				<tr>
					<td>Property Amount</td>
					<td><form:input path="propertyAmount" /></td>
				</tr>
				<tr>
					<td>Civic Score</td>
					<td><form:input path="civicScore" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center" style="background-color:pink"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>