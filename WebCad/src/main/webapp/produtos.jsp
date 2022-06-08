<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produtos</title>
</head>
<body>
<%String[] matrizProdutos = {"mouse" , "teclado", "scanner", "impressora", "monitor"};%> 
<ul>
			<%for(int count = 0 ; count < matrizProdutos.length ;count++){
				out.print("<li>"+ matrizProdutos[count]+"<br>"+"</li>");
			}%>
				
				
</ul>	


<a href="index.html">Voltar</a>
</body>
</html>