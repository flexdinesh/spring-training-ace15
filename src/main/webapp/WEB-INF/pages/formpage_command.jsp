
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html>
<head>
<title>My User Form!</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>Form Page</h1>
	<form:form action="submitform" commandName="userVo" method="POST">
		<table>
			<tbody>
				<tr>
					<td><label for="name">Name:</label></td>
					<td><input type="text" name="name"></td>
					<td><form:errors path="name" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><label for="age">Age:</label></td>
					<td><input type="text" name="age"></td>
					<td><form:errors path="age" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><label for="phone">Phone:</label></td>
					<td><input type="text" name="phone"></td>
					<td><form:errors path="phone" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><label for="email">Email:</label></td>
					<td><input type="text" name="email"></td>
					<td><form:errors path="email" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="reset" value="Reset" /><input type="submit"
						value="Submit" style="float: right"></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>