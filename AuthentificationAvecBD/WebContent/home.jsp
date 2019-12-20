<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="metier.entities.Utilisateur" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<h3>Bienvenue vous êtes Connecter</h3>
		<b>${util.getNom() }  ${util.getPrenom() }</b>
		    <br><br>
        <a href="/logout">Deconnecter</a>
		
	</body>
</html>