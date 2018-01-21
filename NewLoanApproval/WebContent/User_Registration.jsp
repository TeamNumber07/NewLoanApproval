<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserLogin</title>
 <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
          <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="header">
<h3>Loan Registration Form</h3>
</div>
<div class="form" class>
	<div id="registration">   
	
	<form action="#" name="UserDetails" onSubmit="return(validate());">
		<table cellpadding="2" width="30%" align="center"
			cellspacing="2">

			<tr>
				<td colspan=2>
					<center>
						<font size=4><b></b></font>
					</center>
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type=text name=name id="textname" size="30"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female</td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><input type="date" name="dob" id="dob" size="30"></td>
			</tr>
			<tr>
				<td>Permanent Address</td><td>
				<textarea rows="5" cols="20" id="address"></textarea>
				</td>
			</tr>
			<tr>
				<td>City</td>
				<td><select name="city">
						<option value="-1" selected>select..</option>
						<option value="pandharpur">Pandharpur</option>
						<option value="nagpur">Nagpur</option>
						<option value="satara">Satara</option>
						<option value="yeola">Yeola</option>
						<option value="navimumbai">Navi Mumbai</option>
						<option value="mumbai">Mumbai</option>
				</select></td>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="text" name="pincode" id="pincode" size="30"></td>
			</tr>
			<tr>
			<td>State</td>
			<td><select Name="state">
					<option value="-1" selected>select..</option>
					<option value="maharashtra">MAHARASHTRA</option>
					<option value="goa">GOA</option>
			</select></td>
			</tr>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="emailid" id="emailid" size="30"></td>
			</tr>

			<tr>
				<td>MobileNo</td>
				<td><input type="text" name="mobileno" id="mobileno" size="30"></td>
			</tr>
			<tr>
				<td><input type="reset"></td>
				<td colspan="2"><input type="submit" value="Submit Form" /></td>
			</tr>
		</table>
	</form>
	</div>
	</div> 
</body>
</html>
