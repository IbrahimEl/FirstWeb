<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty pseudo }">

<a href="ClimatisationController"> saisie climatisation</a><br/>
	<form action="saisieClimatisation" method="POST">


		<div> ${pseudo} est connecté</div>

	</c:if>

	<c:forEach var="clim" items="${climatisations}">
		<!--  il appelle getPression() -->
		<h2>${clim.nomAppareil}--------${clim.temperature}</h2>
	</c:forEach>



</body>
</html>