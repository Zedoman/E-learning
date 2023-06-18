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
<title>Teacher LOGIN</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div style="text-align: center">
        <h1>Teacher Login</h1>
        <form action="tlogin" method="post">
            <label for="Name">Name:</label>
            <input name="Name" size="30" />
            <br><br>
            <label for="Pass">Password:</label>
            <input type="password" name="Pass" size="30" />
            <br>${message}
            <br><br>           
            <button type="submit">Login</button>
        </form>
    </div>
</body>
<script type="text/javascript">
 
    $(document).ready(function() {
        $("#tloginForm").validate({
            rules: {
                Name: {
                    required: true,
                    Name: true
                },
         
                Pass: "required",
            },
             
            messages: {
                Name: {
                    required: "Please enter Name",
                    Name: "Please enter a valid Name address"
                },
                 
                Pass: "Please enter Password"
            }
        });
 
    });
</script>
</html>