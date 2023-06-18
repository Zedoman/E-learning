<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
<meta charset="utf-8">
<title>Student LOGIN</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div style="text-align: center">
        <h1>Student Login</h1>
        <form action="slogin" method="post">
            <label for="Username">UserName:</label>
            <input name="Username" size="30" />
            <br><br>
            <label for="password">Password:</label>
            <input type="Password" name="Password" size="30" />
            <br>${message}
            <br><br>           
            <button type="submit">Login</button>
        </form>
    </div>
</body>
<script type="text/javascript">
 
    $(document).ready(function() {
        $("#sloginForm").validate({
            rules: {
            	Username: {
                    required: true,
                    Username: true
                },
         
                Password: "required",
            },
             
            messages: {
            	Username: {
                    required: "Please enter email",
                    Username: "Please enter a valid email address"
                },
                 
                Password: "Please enter password"
            }
        });
 
    });
</script>
</html>