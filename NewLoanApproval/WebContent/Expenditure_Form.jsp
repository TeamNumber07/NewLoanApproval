<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function ShowHideDiv() {
    var chkYes = document.getElementById("chkYes");
    var dvtext = document.getElementById("dvtext");
    dvtext.style.display = chkYes.checked ? "block" : "none";
}
</script>
<!-- <script type="text/javascript" src="js/index.js"></script>
 -->
<!--  <script type="text/javascript" src="WEB-INF/js/index.js"></script> -->
</head>
<body>
	<div class="header">
		<h2>User Expenditure</h2>
	</div>
	<div class="form">
		<div id="login">

			<form action="validate.jsp" method="post">

				<div class="field-wrap">
					<label> Previous Loan<span class="req">*</span>
					</label><input type="radio" name="own_House" value="yes" required
						autocomplete="off" />Yes <input type="radio" name="own_House"
						value="no" required autocomplete="off" />No
				</div>
				<br>
				<div class="field-wrap">
					<label> Previous Loan Amount <span class="req">*</span>
					</label> <input type="text" name="previous_Loan_Amount" required
						autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label>Loan Duration <span class="req">*</span>
					</label> <input type="text" name="loan_Duration" required
						autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label> Remaining Time Period <span class="req">*</span>
					</label> <input type="radio" name="remaining_Time_Period" value="month"
						required autocomplete="off" />Months <input type="radio"
						name="remaining_Time_Period" value="years" required
						autocomplete="off" />Years <input type="text"
						name="previous_Loan_Duration" required autocomplete="off" />
				</div>
				<br>
				
				<div class="field-wrap">
					<label> EMI<span class="req">*</span>
					</label> <label for="chkYes"> <input type="radio" id="chkYes"
						name="chk" onclick="ShowHideDiv()" /> Yes
					</label> <label for="chkNo"> <input type="radio" id="chkNo"
						name="chk" onclick="ShowHideDiv()" />No
					</label>
					<div id="dvtext" style="display: none">
						Enter Amount: <input type="text" id="emi"/>
					</div>
				</div>
				<br>
				<div class="field-wrap">
					<label> Pending Amount <span class="req">*</span>
					</label> <input type="text" name="previous_Loan_Amount" required
						autocomplete="off" />
				</div>
				<br>
				<div class="field-wrap">
					<label> Yearly Expenditure <span class="req">*</span>
					</label> <input type="text" name="yearly_Expenditure" required
						autocomplete="off" />
				</div>
				<br>
				<p class="small-login">
					<a href="User_Finacial_Details.jsp">Back</a>
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