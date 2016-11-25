<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Registration Page</title>
</head>
<body>

	<h1>Student Registration</h1>

	<form action="doRegister" method="post">

		<table cellpadding="8" cellspacing="8">
	
			<tr>
				<td><label>First Name</label></td>
				<td><input type="text" name="firstName"></td>
			</tr>
			
			<tr>
				<td><label>Second Name</label></td>
				<td><input type="text" name="secondName"></td>
			</tr>
			
			<tr>
				<td><label>Age</label></td>
				<td><input type="number" name="age"></td>
			</tr>
			
			<tr>
				<td><label>Email ID</label></td>
				<td><input type="text" name="emailId"></td>
			</tr>
			
			<tr>
				<td><label>DOB</label></td>
				<td><input type="date" name="dob"></td>
			</tr>
			
			<tr>
				<td><label>Contact Number</label></td>
				<td><input type="text" name="contactNumber"></td>
			</tr>
			
			<tr>
				<td><label>Qualification</label></td>
				<td>
					<select name="qualification">
						<option value="">Select Qualification</option>
						<option value="BS">BS</option>
						<option value="MS">MS</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td><label>Address</label></td>
				<td>
					<textarea cols="30" rows="5" name="address"> 
					</textarea>
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td align="right">
					<input type="submit" value="Register">
					<input type="Reset" value="Cancel">
				</td>
			</tr>
			
		</table>
	</form>
	
</body>
</html>