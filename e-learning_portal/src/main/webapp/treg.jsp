<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>EduTech Teacher Registration</title>
 
<link rel="stylesheet" type="text/css" href="style5.css">

</head>
 
<body>
<form action="tregister" method="post"> 
<h3>TEACHER REGISTRATION FORM</h3>

 
<table align="center" cellpadding = "10">
 
<!----- First Name ---------------------------------------------------------->
<tr>
<td>NAME</td>
<td><input type="text" name="Name" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Mobile ---------------------------------------------------------->
<tr>
<td>MOBILE</td>
<td><input type="Number" name="Mobile" maxlength="10"/>
(max 10 numbers)
</td>
</tr>

<tr>
<td>PASSWORD</td>
<td><input type="password" name="Pass" maxlength="20"/>
(max 20 char)
</td>
</tr>
 
 
<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID</td>
<td><input type="text" name="Email" maxlength="100" /></td>
</tr>
 
<!----- Qualifications ---------------------------------------------------------->
<tr>
<td>Qualifications:</td>  
<td>
<select name="Qualification">
<option>Choose one option</option>   
<option>Graduate</option>  
<option>PHD</option>  
<option>other</option> 
</select>
</td>
</tr>
 
<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="register" />
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form>
 
</body>
</html>