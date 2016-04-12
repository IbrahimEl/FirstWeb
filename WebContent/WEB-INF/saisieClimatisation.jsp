<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="ClimatisationController" method="POST">
	<label>nom appareil</label><input type="text" value="${appareil}" name="appareil"/><span style="color:red">${appareilErreur}</span><br/>
	<label>temperature</label><input type="text" value="${temperature}" name="temperature"/><span style="color:red">${temperatureErreur}</span><br/>
	<label>pression</label><input type="text" value="${pression}" name="pression"/><span style="color:red">${pressionErreur}</span><br/>
	<label>humidite</label><input type="text" value="${humidite}" name="humidite"/><span style="color:red">${humiditeErreur}</span><br/>
	<input type="submit" value="enregistrer" name="action"/>
</form>


</body>
</html>