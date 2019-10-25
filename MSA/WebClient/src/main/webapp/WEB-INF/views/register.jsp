<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
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
  padding: 20px;
  background-color:pink;

}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 15%;
  border-radius: 20%;
}

.container {
  padding: 20px;
}

</style>
<title>Insert title here</title>
</head>
<body>
<div class="main">
 <div class="imgcontainer" >
    <img src="newuser.jpg" alt="Avatar" class="avatar">
  </div>
 <div class="container" align="center" style="background-color:gray">
        <h1>Register Page</h1>
        <form:form action="/saveRegister" method="post" modelAttribute="user1">
        <table>
        <form:hidden path="id"/>
            <tr>
                <td>User Name:</td>
                <td><form:input path="userName" /></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><form:input path="passWord" type="password"/></td>
            </tr>
             <tr>
            <td>Name</td>
            <td><form:input path="name" /></td>
            </tr>
            <tr>
            <td>City</td>
            <td><form:input path="city" /></td>
            </tr>
            <tr>
            <td>Country</td>
            <td><form:input path="country" /></td>
            </tr>
            <tr>
            <td>Gmail:</td>
            <td><form:input path="gmail" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>    
            </tr>
        </table>
        </form:form>
    </div>
    </div>
</body>
</html>