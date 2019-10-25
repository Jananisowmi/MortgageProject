<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta  name="viewport" content="width=device-width, initial-scale=1">
<style >
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
 
}


.main{
 background-color:pink;
}
.container {
  padding: 16px;
}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 20%;
  border-radius: 30%;
}
</style>
<title>Insert title here</title>
</head>
<body>
<div class="main">
<div class="imgcontainer">
    <img src="bank.jpg" alt="Avatar" class="avatar">
  </div>
 <div class="container" align="center" style="background-color:gray"">
        <h1>Login Page</h1>
        <form:form action="/home" method="post" modelAttribute="user">
        <table>
        <form:hidden path="id"/>
            <tr>
                <td>User Name:</td>
                <td><form:input path="userName" type="text" /></td>
               
            </tr>
            <tr>
                <td>Password: </td>
                <td><form:input path="passWord" type="password"/></td>
            </tr>
            <tr>
           
                <td><input type="submit" value="Login"></td>
                </tr>
                <tr>
                <td><a href="/register">Register Here</a></td>
            </tr>
        </table>
        </form:form>
    </div>
</div>
</body>
</html>