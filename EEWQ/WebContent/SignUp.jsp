<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="SignUp.css"/>
</head>
<body>
  
  <div class="signup-box">
  
  <div class="left-box">
    <h2>Sign Up</h2>
  
  <form action="ulogin" method="post">
 
  <input type="text" name="txtcode" placeholder="University Code"/>
  <input type="text" name="txtuname" placeholder="Domain Name"/>
  <input type="text" name="txtemail" placeholder="Email"/>
  <input type="password" name="pawd" placeholder="Password"/>
  
  <input type="password" name="Repawd" placeholder="Re-Password"/>
  
  <input type="submit" name="btnSignup" value="Sign-Up"/>
    
  
  </form>
  
  <form action="ulog" method="post">
          <input type="submit" name="btnLogin" value="Login"/>
  </form>
       
   
   
   
  </div>
  
  <div class="right-box">
   <form action="ilogin" method="post">

  <br/><br/><br/>
   <input type="text" name="txtRno" placeholder="Indeustry Reg No"/>
   <input type="text" name="txtcname" placeholder="Company Name"/>
  <input type="text" name="txtemail2" placeholder="Email"/>
  <input type="password" name="pawd2" placeholder="Password"/>
  
  <input type="password" name="Repawd2" placeholder="Re-Password"/>
  
  <input type="submit" name="btnSignup" value="Sign-Up"/>
  
  
  </form>
  
  <form action="ilog" method="post">
   <input type="submit" name="btnLogin" value="Login"/>
  </form>
  
  </div>
  
  <div class="or">OR</div>
  </div>


</body>
</html>