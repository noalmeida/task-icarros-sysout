<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciamento de Imagens</title>
</head>
<body>
<h1>Gerenciamento de Imagens</h1>
<%ArrayList<String> listPaises = new ArrayList<>();
listPaises.add("brasil");
listPaises.add("mexico");
listPaises.add("italia");
listPaises.add("alemanha");
int count = 0;
String path = "img/";
String pathComplete = "";

%>
	<ul>
        <%
        for (String namePais : listPaises) {
            out.println("<li>"+ listPaises.get(count) + "</li><br>");
            pathComplete = path + listPaises.get(count)+".png";
            count++;
            out.println("<img src="+pathComplete+">");
        }
        %>
	<ul>
</body>
</html>