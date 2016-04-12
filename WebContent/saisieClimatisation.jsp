<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="Climatisation.js"></script>

</head>
<body>


<c:choose>
	<c:when  test="${not empty pseudo }">
	<div> ${pseudo} est connecte</div>
<a href="Deconnecter"> se deconnecter </a><br/>
	</c:when>


	
	<c:otherwise>

		<div>${pseudo} se connecté</div>
		<a href="LoginController"> se deconnecter </a><br/>
		
	</c:otherwise>
			
</c:choose>	
	
<span style="color: red"> ${sauvegardeErreur} </span><br />	

	
<a href="ListClimatisationController"> liste des climatisations</a><br/>
	<form action="ClimatisationController" method="POST">
	



		<label> nom appareil </label><input id="sourceNbId" type="text" value="${appareil}" name="appareil" />
			<span style="color: red"> ${appareilErreur} 
			<span id="nbId" style="color:blue"></span>
			
			
		</span><br /> <label>temperature</label><input type="text"
			value="${temperature}" name="temperature" /><span style="color: red">
			${temperatureErreur} </span><br /> <label>pression</label><input
			type="text" value="${pression}" name="pression" /><span
			style="color: red"> ${pressionErreur} </span><br /> <label>humidite</label><input
			type="text" value="${humidite}" name="humidite" /><span
			style="color: red"> ${humiditeErreur} </span><br /> <label></label><input
			type="submit" value="Enregistrer" name="action" />



	</form>

</body>
</html>