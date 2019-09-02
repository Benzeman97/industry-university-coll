<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>University Login</title>
<link rel="stylesheet" type="text/css" href="UniLogin.css"/>
</head>
<body>

  <div class="login-box">
  
    <img src="file:///C:/Users/NAFAZBENZEMA/Desktop/FF16/LKR/Images/box.jpg" alt="login" class="user"/>
    <h2>University Login</h2>
    <form method="post" action="authlog">
      <p>Domain Name</p>
      <input type="text" name="txtname" placeholder="Enter Name"/>
      <p>Password</p>
      <input type="password" name="pawd" placeholder="********"/>
      <input type="submit" name="btnLogin" value="Login"/>
      <a href="#">Forgot Password</a>   
    </form>
    
  
  </div>

</body>
</html>