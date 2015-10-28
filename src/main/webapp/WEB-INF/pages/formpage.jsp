
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
	<form:form action="submitform" modalAttribute="userVo"
		method="POST">
		<table>
			<tbody>
				<tr>
					<td><form:label path="name">Name:</form:label></td>
					<td><form:input path="name"></form:input></td>
					<td><form:errors path="name" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="age">Age:</form:label></td>
					<td><form:input path="age"></form:input></td>
					<td><form:errors path="age" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="phone">Phone:</form:label></td>
					<td><form:input path="phone"></form:input></td>
					<td><form:errors path="phone" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="email">Email:</form:label></td>
					<td><form:input path="email"></form:input></td>
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