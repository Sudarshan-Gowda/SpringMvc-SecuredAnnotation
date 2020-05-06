<!DOCTYPE html>
<html>
<head>
<title>SpringMvc-SecuredAnnotation</title>
<style type="text/css">
.page-title {
	font-family: 'Open Sans', sans-serif;
	font-style: normal;
	font-weight: 600;
	font-size: 24px;
	color: #4C4C4C;
}

.mt-1 {
	margin-top: 1rem !important;
}

.mb-2, .my-2 {
	margin-bottom: 0.5rem !important;
}
</style>

</head>

<body>
	<div style="padding: 83px; margin-left: 278px;">

		<div class="container">
			<div class="row">

				<div class="col-7">
					<div class="page-title">Technology Details Form</div>
				</div>

			</div>
		</div>

		<div style="margin-top: 10px; margin-left: 20px;">
			<div class="row">

				<div style="color: blue;">User Info: ${userInfo}</div>
				<br />
				<form action="technologyAdd" method="post">
					Technology Name: <input type="text" name="techName"
						required="required" /> Rating: <input type="text" name="rating"
						required="required" /> <input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
						type="submit" value="Submit" />
				</form>
				<br /> <br />
			</div>

			<div style="margin-top: 40px;">
				<a href="/viewTechnologies">View Technologies List:</a>
			</div>

			<div style="margin-top: 30px; color: red">
				<form action="/logout" method="post">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" /> <input type="submit" value="Logout">
				</form>
			</div>


		</div>

	</div>
</body>
</html>