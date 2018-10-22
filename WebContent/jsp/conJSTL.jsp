<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
RECORREMOS HASHMAP CON JSTL:<br>

<c:forEach var="columnHeader" items="${mapa}">
	    <td>
	        <c:out value="${columnHeader}" /><br>
	    </td>
	</c:forEach>
	
RECORREMOS ARRAY CON JSTL:<br>

<c:forEach var="columnHeader" items="${array}">
	    <td>
	        <c:out value="${columnHeader}" /><br>
	    </td>
	</c:forEach>	

RECORREMOS LISTA CON JSTL:<br>

<c:forEach var="columnHeader" items="${lista}">
	    <td>
	        <c:out value="${columnHeader}" /><br>
	    </td>
	</c:forEach>
</body>
</html>