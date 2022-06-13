<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.dao.BancoDeDados"%>
<%@page import="com.br.DTO.Cursos"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
	integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
	integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
	crossorigin="anonymous"></script>
<style>
.containerModal {
	font-family: "Roboto", sans-serif;
	padding: 0;
	margin: 0;
	background-color: #f5f5f5;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.row, body {
	background-color: #f5f5f5;
}

.close {
	margin-left: 95%
}

.cookiesContent {
	width: 320px;
	display: flex;
	flex-direction: column;
	align-items: center;
	background-color: #fff;
	color: #000;
	text-align: center;
	border-radius: 20px;
	padding: 30px 30px 70px; button .close { width : 30px;
	font-size: 20px;
	color: #c0c5cb;
	align-self: flex-end;
	background-color: transparent;
	border: none;
	margin-bottom: 10px;
}

.modal-text {
	margin-bottom: 40px;
	font-size: 18px;
}

button.accept {
	background-color: #ed6755;
	border: none;
	border-radius: 5px;
	width: 200px;
	padding: 14px;
	font-size: 16px;
	color: white;
	box-shadow: 0px 6px 18px -5px rgba(237, 103, 85, 1);
}

}
.btn-secondary {
	background-color: #546de5 !important;
}

.bg-light, .btn-primary {
	background-color: #6c5ce7 !important;
}

.navbar-light .navbar-brand, .navbar-light .navbar-nav .nav-link.active,
	.navbar-light .navbar-nav .nav-link {
	color: #FFFFFF !important;
}

.navbar-light .navbar-toggler {
	border: 2px solid #FFFFFF !important;
}
</style>
<%
String id = request.getParameter("id_curso");
out.print("<p>"+id+"</p>");


String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost/icarros";
String userid = "root";
String password = "admin";


		if(id != null) {
	
			String id_curso = request.getParameter("id_curso");
			String nome_curso=request.getParameter("nome_curso");
			String data_curso=request.getParameter("data_curso");
			String hora_curso=request.getParameter("hora_curso");
			String duracao_curso=request.getParameter("duracao_curso");
			String resumo_curso=request.getParameter("resumo_curso");
			String n = request.getParameter("nome_curso");
			out.print("<p>"+n+"</p>");
			String d = request.getParameter("data_curso");
			out.print("<p>"+d+"</p>");
			String h = request.getParameter("hora_curso");
			out.print("<p>"+h+"</p>");
			String r = request.getParameter("resumo_curso");
			out.print("<p>"+r+"</p>");
		
		Connection con = null;
		PreparedStatement ps = null;
		
	
		try
           {
			Class.forName(driver);
			con = DriverManager.getConnection(connectionUrl,userid,password);
			String sql="Update cursos set id_curso=?, nome_curso=?, data_curso=?, hora_curso=?, duracao_curso=?, resumo_curso=? where id_curso="+id;
			ps = con.prepareStatement(sql);
			ps.setString(1, id_curso);
			ps.setString(2, nome_curso);
			ps.setString(3, data_curso);
			ps.setString(4, hora_curso);
			ps.setString(5, duracao_curso);
			ps.setString(6, resumo_curso);
            int i = ps.executeUpdate();
				if(i > 0){
	                out.print("<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">");
	                out.print("<strong>Registro atualizado</strong> com sucesso!");
	                out.print("</div>");
						}
						else
						{
							 out.print("<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">");
						     out.print("<strong>Há um problema com a atualização!</strong> Não foi possível!");
						     out.print("</div>");
						} 
				}
			catch(SQLException sql)
			{
			request.setAttribute("error", sql);
			out.println(sql);
			}
		}
		else {
			try {
				Class.forName(driver);
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				}
				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
		


%>
<title>Modificar</title>
</head>
<body>
	<!-- Criando o Menu tipo NavBar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid" id="container-css">
			<a class="navbar-brand" href="#">Controle de Cursos</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Sistema</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							CRUD </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="pesquisar.jsp">Pesquisar</a></li>
							<li><a class="dropdown-item" href="inserir.jsp">Inserir</a></li>
							<li><a class="dropdown-item" href="modificar.jsp">Modificar</a></li>
							<li><a class="dropdown-item" href="excluir.jsp">Excluir</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class=col-2></div>
			<div class=col-8>
				<div class="row">
					<table class="table">
					 <thead>
						<tr>
							<th scope="col">#ID</th>
							<th scope="col">Nome do curso</th>
							<th scope="col">Data do curso</th>
							<th scope="col">Hora do curso</th>
							<th scope="col">Duração do curso</th>
							<th scope="col">Resumo do Curso</th>
							<th scope="col">Ação</th>
						</tr>
					 </thead>
					 <tbody>
					<%
					
					try{
						connection = DriverManager.getConnection(connectionUrl, userid, password);
						statement=connection.createStatement();
						String sql ="select * from cursos";
						resultSet = statement.executeQuery(sql);
						while(resultSet.next()){
                    %>
                     
                       <tr>
							<td><%=resultSet.getString("id_curso") %></td>
							<td><%=resultSet.getString("nome_curso") %></td>
							<td><%=resultSet.getString("data_curso") %></td>
							<td><%=resultSet.getString("hora_curso") %></td>
							<td><%=resultSet.getString("duracao_curso") %></td>
							<td><%=resultSet.getString("resumo_curso") %></td>
							<td><a href="inserir-update.jsp?id=<%=resultSet.getString("id_curso")%>">Modificar</a></td>
						</tr>
						<%
						}
						
						} catch (Exception e) {
						e.printStackTrace();
						}}
						%>
				</tbody>
				</table>
				</div>


			</div>
		</div>
		<div class=col-2></div>
</body>
</html>