<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
<link rel="stylesheet" type="text/css" href="style5.css">


</head>
 
<body>
<form action="sregister" method="post"> 
<h3>STUDENT REGISTRATION FORM</h3>

 
<table align="center" cellpadding = "10">
 
<!----- First Name ---------------------------------------------------------->
<tr>
<td>NAME</td>
<td><input type="text" name="Name" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
 
<tr>
<td>Interested in:</td>  
<td>
<select name="Interested_in"> 
<option>Choose one option</option>   
<option>Data Science</option>  
<option>FullStack</option>  
<option>AIML</option>  
<option>CyberSecurity</option>
<option>Cloud</option>    
</select>
</td>
</tr>

<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>MOBILE NUMBER</td>
<td>
<input type="Number" name="Ph_Num" maxlength="10" />
(10 digit number)
</td>
</tr>
 
<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID</td>
<td><input type="text" name="Email" maxlength="100" /></td>
</tr>
 

 
<tr>
<td>PASSWORD</td>
<td><input type="password" name="Password" maxlength="20"/>
(max 20 char)
</td>
</tr>
 
<tr>
<td>Recent Degree:</td>  
<td>
<select name="Recent_Degree"> 
<option>Choose one option</option>   
<option>Class 12</option>  
<option>UG</option>  
<option>PG</option>  
</select>
</td>
</tr>

<tr>
<td>USERNAME</td>
<td><input type="text" name="Username" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 

 
<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="register">
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form>
 
</body>
</html>