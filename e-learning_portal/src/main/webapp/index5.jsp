<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="//db.onlinewebfonts.com/c/a4e256ed67403c6ad5d43937ed48a77b?family=Core+Sans+N+W01+35+Light" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="form.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment Upload</title>
    </head>
    <body>
     <div class="module">
    <h1>File Upload/Download</h1>
      <form action="UploadServlet" method="post" enctype="multipart/form-data">
            <div class="body-content">
      <div class="alert alert-error"></div>
      <input type="text" placeholder="First Name" name="firstname" required />
      <input type="text" placeholder="Last name" name="lastname" required />
      <div class="file"><label>Select File : </label><input type="file" name="file" accept="image/*" required /></div>
      <input type="submit" value="submit" name="submit" class="btn btn-block btn-primary" />
    </form>
  </div>
</div>
</body>
</html>

