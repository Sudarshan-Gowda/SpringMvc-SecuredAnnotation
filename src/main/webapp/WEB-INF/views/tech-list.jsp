<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
		<h2>Technology List</h2>

		<div>${technologyLst}</div>

		<br /> <br />
		<div>User Info: ${userInfo}</div>
		<form action="/logout" method="post">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" /> <input type="submit" value="Logout">
		</form>

	</div>
</body>
</html>