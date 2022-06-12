<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.dao.BancoDeDados"%>
<%@page import="com.br.DTO.Cursos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<style>
.bg-light, .btn-primary {
background-color: #6c5ce7 !important;
}
.navbar-light .navbar-brand, .navbar-light .navbar-nav .nav-link.active, .navbar-light .navbar-nav .nav-link {
color: #FFFFFF !important;
}
.navbar-light .navbar-toggler{
 border: 2px solid #FFFFFF !important;
}
</style>
<title>Pesquisar Cursos</title>
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
					<br> <br>
					<!--  tabela de pesquisa -->
					<table class="table caption-top">
						<caption>Tabela de cursos</caption>
						<thead>
							<tr>
								<th scope="col">#ID</th>
								<th scope="col">Nome do curso</th>
								<th scope="col">Data do curso</th>
								<th scope="col">Hora do curso</th>
								<th scope="col">Duração</th>
								<th scope="col">Resumo</th>
							</tr>
						</thead>
						<tbody>
						<%
							if (request.getParameter("submit") != null) {
								BancoDeDados mysql = new BancoDeDados();
								mysql.conectar();
								List<Cursos> listaRetornadaMysql = new ArrayList<Cursos>();
								listaRetornadaMysql = mysql.pesquisarCursos();					
								int count =1;
								for(Cursos c : listaRetornadaMysql ){
									out.print("<tr>");
									out.print("<th scope=\"row\">"+count+"</th>");
									out.print("<td>"+c.getIdcurso()+" </td>");
									out.print("<td>"+c.getDuracaocurso()+" </td>");
									out.print("<td>"+c.getHoracurso()+" </td>");
									out.print("<td>"+c.getNomecurso()+" </td>");
									out.print("<td>"+c.getResumocurso()+" </td>");
									out.print("</tr>");
									count++;
								}
								

							}
							%>

						</tbody>


					</table>

				</div>
				<br><br>
			
				<!--  linha dois abaixo da tabela para botão pesquisar -->
				<div class="row">
				      <div class="col-5"></div>
				      <div class="col-4">
						<form method="get">
							<button type="submit" name="submit" class="btn btn-primary">Pesquisar</button>
							
							
						</form>
					</div>
				      
				      <div class="col-3"></div>
                     
				</div>

			</div>


		</div>
		</div>
			<div class=col-2></div>
	
</body>
</html>