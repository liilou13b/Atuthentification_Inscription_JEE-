<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<form action="register" method="post">
			<table style="background-color: skyblue;margin-left: 20px;margin-top: 20px;">
				
				<tr>
					<td> <h3 style="color: red;">La page d'inscription</h3> </td> 
				</tr>
				<tr> 
					<td><label for="login">login :</label></td>
				  	<td> <input type="text" name="login" id ="login" required> </td>
				 </tr>
				<tr> 
					<td><label for="name">Nom :</label></td>  
					<td> <input type="text" name="name" id ="name"required> </td>
				</tr>
				<tr> 
					<td><label for="firstName">Prenom :</label></td>  
					<td> <input type="text" name="firstName" id ="firstName"required> </td>
				</tr>
				<tr> <td><label for="password">Password :</label> </td>
					 <td> <input type="password" name="password" id="password"required> </td> 
				</tr>
				<tr> 
					<td><label for="password2"> confirmmer le Password :</label> </td>
				 	 <td> <input type="password" name="password2" id="password2"required> </td> 
				  </tr>
				<tr> 
					<td><input type="submit" value="Inscrit"> </td> <td>  </td> 
				</tr>
			</table>
		
		
		</form>
		<br>{$message}
	</body>
</html>