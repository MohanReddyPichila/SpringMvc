<!DOCTYPE html>
<html>
<head>
<style>
h2 {
	text-shadow: green;
}

body {
	background-color: lightblue
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Employee Registration Form</h2>
	<form action="saveEmployee"   method="post"  >
		<Table align="center" border="1">
			<tr>
				<td>empId:</td>
				<td><input type="text" name="empId" required="required"></td>
			</tr>
			<tr>
				<td>empName:</td>
				<td><input type="text" name="empName"></td>
			</tr>
			<tr>
				<td>empAddr:</td>
				<td><input type="text" name="empAddr"></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><button>submit</button>
			</tr>
		</Table>
	</form>
	<a href="login">Login</a>
</body>
</html>