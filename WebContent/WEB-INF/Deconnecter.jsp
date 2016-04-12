<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="DeconnecterController" method="post">
	<span>ib : </span><input type="text" value="${ib}" name="pseudo"/>
	<span>${ibErreur}</span><br/>
	<input type="submit" value="Deconnecter" name="action"/>
</form>


</body>
</html>