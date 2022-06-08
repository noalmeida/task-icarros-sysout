<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

BancoDeDados mySql = new BancoDeDados();
mySql.conectar();

ArrayList<String> reciveData = new ArrayList<>();

if(mySql.isConnected()) {
	//sintaxeBanco.listaFiltros();
	reciveData = mySql.listLivros();
	out.println("conexão do Banco realizada com sucesso");
	
	
}
out.println("<h1>"+String.join("", reciveData)+"</h1>");

%>

</body>
</html>