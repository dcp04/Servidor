<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuario</title>
</head>
<body>
<h1>Valores del Usuario</h1>
	<p>
		Su nombre es:
		<%= request.getAttribute("nombre") %>
	</p>
	<p>
		Sus apellidos son:
		<%= request.getAttribute("apellidos") %>
	</p>
	<p>
		Su correo es:
		<%= request.getAttribute("mail") %>
	</p>
	<p>
		Eres:
		<%= request.getAttribute("genero") %>
	</p>
	<p>
		Sabes sobre:
		<%= request.getAttribute("java") != null ? request.getAttribute("java") : " " %>
		<%= request.getAttribute("c") != null ? request.getAttribute("c") : " "%>
		<%= request.getAttribute("basic") != null ? request.getAttribute("basic") : " " %>
		<%= request.getAttribute("html") != null ? request.getAttribute("html") : " "%></p>
	<p>
		Idioma: 
		<%= request.getAttribute("idiomas") %>
	</p>		
	<p>
		Comentarios adicionales:
		<%= request.getAttribute("comentario") %>
	</p>
</body>
</html>