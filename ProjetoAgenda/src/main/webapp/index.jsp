<%@page import="br.com.dao.Livros"%>
<%@page import="br.com.dao.BancoDeDados"%>
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
ArrayList<Livros> livros = mySql.listLivros();


if(mySql.isConnected()) {

	out.println("conexão do Banco realizada com sucesso");
	out.print("<table border=1>");
	out.print("<thead>");
	out.print("<th>id_livro</td>");
	out.print("<th>livro</td>");
	out.print("</thead>");
	out.print("<tbody>");
		for(Livros livro: livros) {
			out.print("<tr>");
			out.print("<td>");
			out.print(livro.getId_livro());
			out.print("</td>");
			out.print("<td>");
			out.print(livro.getNome_livro());
			out.print("</td>");
			out.print("</tr>");
		}
	out.print("</tbody>");
	out.print("</table>");
	
	
}


%>

</body>
</html>