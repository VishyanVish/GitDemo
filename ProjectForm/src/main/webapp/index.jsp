<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"><title>YaraGo</title>
    <link rel="icon"  href="./client_logo.jpg">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="..css/NewFile.css" rel="stylesheet" >

  </head>

<body>
  <h1 >YaraGo Login</h1>  
  <form  action="" target="_blank" method="post">
<div class="form-group" >
<label class="form-label">Name: </label>
<input type="text" class="form-control " id="FirstName" placeholder="Enter Name" maxlength="100" required><br>
<label class="form-label" > Age :</label>
<input type="number" min="0" max="100" class="form-control " id="Age" placeholder=" Age" required ><br>
<label class="form-label">Mobile: </label>
<input type="tel" class="form-control" id="mobile_number"placeholder=" +91"  maxlength="10" required><br>
<label class="form-label">Gender: </label>
<label class="form-control" ><input type="radio" id="gender" name="gender" required> Male</label>
<label class="form-control" ><input type="radio" id="gender" name="gender" required> Female</label><br>
<label class="form-label">Email: </label>
<input type="email" name="email" id="email" placeholder="email" class="form-control" required><br>
<label class="form-label">Password: </label>
<input type="text" class="form-control" id="Password"placeholder="Enter Password" maxlength="100" required><br>
<label class="form-label">DOB: </label>
<input type="date" class="form-control" id="date"placeholder="DOB" required ><br>
<input type="submit" class="form-control" id="button" value="Submit" ><br>
<input type="reset" class="form-control" name="Reset" id="Reset">
</div>
  </form>
  <script src="js/projectone.js"></script>
</body>
</html>