<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

RECORREMOS ARRAY SIN JSTL:<br>

<% Object[] array=(Object[])application.getAttribute("array"); %>

<%
  for(Object arr_temp: array)
    out.println(arr_temp + "<br/>");
%>

RECORREMOS HASHMAP SIN JSTL:<br>


<% HashMap<String, Object> mapa = (HashMap<String, Object>)application.getAttribute("mapa"); %>

<%
  for(Object map_temp: mapa.values())
    out.println(map_temp + "<br/>");
%>

RECORREMOS LIST SIN JSTL:<br>

<% ArrayList<Object> lista=(ArrayList<Object>)application.getAttribute("lista"); %>

<%
  for(Object lis_temp: lista)
    out.println(lis_temp + "<br/>");
%>

</body>
</html>