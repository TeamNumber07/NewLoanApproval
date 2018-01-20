<%@ page import="dto.Login" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="UTF-8">
  <title>Sign-Up/Login Form</title>
  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="css/style.css">


</head>
<body>
<div class="header">
<h2>Loan Approval System</h2>
</div>
<div class="form">
	<div id="login">   
          <h1>Hello Admin!</h1>
          
          <form action="validate.jsp" method="post">
          
            <div class="field-wrap">
          <table><tr><td>  <label>
              Admin id<span class="req">*</span>
            </label>
            <input type="text" name="adminName" required autocomplete="off"/></td>
                    <td>  <label>
              user id<span class="req">*</span>
            </label>
            <input type="text" name="adminName" required autocomplete="off"/></td></tr>
            </table>
          
          </div>
          
          <div class="field-wrap">
            <label>
              Password<span class="req">*</span>
            </label>
            <input type="password" name="adminPass" required autocomplete="off"/>
          </div>
          
          <p class="small-login"><a href="index.jsp">User Login</a></p>
          
          <button class="button button-block">Log In</button>
          
          </form>

    </div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="js/index.js"></script>
</div>
</body>
</html>