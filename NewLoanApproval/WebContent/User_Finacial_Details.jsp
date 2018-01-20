<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div class="header">
		<h2>User Finacial Details</h2>
	</div>
	<div class="form">
		<div id="user_finacial_detail">
			<form action="validate.jsp" method="post">

				<div class="field-wrap">
					<label> User id<span class="req">*</span>
					</label> <input type="text" name="userId" required autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label> Nature of Occupation<span class="req">*</span>
					</label> <select name="nature_of_occupation">
						<option value="-1" selected>select..</option>
						<option value="employee">Employee</option>
						<option value="business">Business</option>
					</select>
				</div>
				<br>
				<div class="field-wrap">
					<label> Employer Name<span class="req">*</span>
					</label> <input type="text" name="employer_Name" required
						autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label> Total Experience<span class="req">*</span>
					</label> <input type="text" name="total_Experience" required
						autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label> Designation<span class="req">*</span>
					</label><select name="designation">
						<option value="-1" selected>select..</option>
						<option value="manager">Manager</option>
						<option value="engineer">Engineer</option>
						<option value="doctor">Doctor</option>
						<option value="Professor">Professor</option>
					</select>
				</div>
				<br>
				<div class="field-wrap">
					<label>Yearly Income<span class="req">*</span>
					</label> <input type="text" name="yearly_Income" required
						autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>PAN Card Number<span class="req">*</span>
					</label> <input type="text" name="pan_No" required autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>Own House or Not<span class="req">*</span>
					</label> <input type="radio" name="own_House" value="yes" required
						autocomplete="off" />Yes <input type="radio" name="own_House"
						value="no" required autocomplete="off" />No

				</div>
				<br>
				<div class="field-wrap">
					<label>House Cost<span class="req">*</span>
					</label> <input type="text" name="house_Cost" required autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>Vehicle Type<span class="req">*</span>
					</label> <input type="checkbox" name="vehicle_Type" value="two_wheeler"
						required autocomplete="off" />2-Wheeler <input type="checkbox"
						name="vehicle_Type" value="four_wheeler" required
						autocomplete="off" />4-Wheeler
						
				</div>
				<br>
				<div class="field-wrap">
					<label>Vehicle Cost<span class="req">*</span>
					</label> <input type="text" name="vehicle_cost" required autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>Vehicle Purchase Date<span class="req">*</span>
					</label> <input type="date" name="vehicle_puchase_date" required autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>Fixed Deposit<span class="req">*</span>
					</label> <input type="text" name="fd" required autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>Fixed Deposit Cost<span class="req">*</span>
					</label> <input type="text" name="fd_Cost" required autocomplete="off" />
				</div>
				<br>

				<p class="small-login">
					<a href="userlogin.jsp">Back</a>
				</p>
				
				<button class="button button-block">Submit</button>
			</form>
		</div>
		<script
			src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		<script src="js/index.js"></script>
	</div>
</body>
</html>