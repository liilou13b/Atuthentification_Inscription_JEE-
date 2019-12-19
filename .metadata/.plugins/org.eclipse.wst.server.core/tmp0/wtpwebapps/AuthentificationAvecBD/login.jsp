<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>la page de connexion</title>
	</head>
	<body>
		<form action="loginRegister">
			<table style="background-color: skyblue;margin-left: 20px;margin-top: 20px;">
				<tr><td> <h3 style="color: red;">La page de Connexion</h3> </td>  </tr>
				<tr> <td><label for="login">login</label></td>  <td> <input type="text" name="login" id ="login"> </td></tr>
				<tr> <td><label for="password">Password</label> </td>  <td> <input type="password" name="password" id="password"> </td> </tr>
				<tr> <td><input type="submit" value="Connexion"> </td> <td> <a href="register.jsp">Inscription</a> </td> </tr>
			</table>
		
		
		</form>
	</body>
</html>