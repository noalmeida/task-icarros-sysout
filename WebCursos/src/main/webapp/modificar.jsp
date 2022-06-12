<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.dao.BancoDeDados"%>
<%@page import="com.br.DTO.Cursos"%>
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
					<br> <br>
					<%
					BancoDeDados mysql = new BancoDeDados();
											mysql.conectar();
											if(mysql.isConnected() && mysql.pesquisarCursos().size()!= 0){
												out.print(mysql.pesquisarCursos().size());
												List<Cursos> listaRetornadaMysql = new ArrayList<Cursos>();
												listaRetornadaMysql = mysql.pesquisarCursos();					
												int count =1;
												out.print("<table class=\"table caption-top\">");
												out.print("<caption>Tabela de cursos</caption>");
												out.print("<thead>");
												out.print("<tr>");
												out.print("<th scope=\"col\">#ID</th>");
												out.print("<th scope=\"col\">Nome do curso</th>");
												out.print("<th scope=\"col\">Data do curso</th>");
												out.print("<th scope=\"col\">Hora do curso</th>");
												out.print("<th scope=\"col\">Duração</th>");
												out.print("<th scope=\"col\">Resumo</th>");
												out.print("<th scope=\"col\">Ação</th>");
												out.print("</tr>");
												out.print("</thead>");
												out.print("<tbody>");					
												for(Cursos c : listaRetornadaMysql ){
													out.print("<tr>");
													out.print("<th scope=\"row\">"+count+"</th>");
													out.print("<td>"+c.getIdcurso()+" </td>");
													out.print("<td>"+c.getDuracaocurso()+" </td>");
													out.print("<td>"+c.getHoracurso()+" </td>");
													out.print("<td>"+c.getNomecurso()+" </td>");
													out.print("<td>"+c.getResumocurso()+" </td>");
													out.print("<td><form method=\"get\"><button type=\"submit\" name=\"submit\" class=\"btn btn-secondary\">Modificar</button></form></td>");
													out.print("</tr>");
													count++;
												}
												out.print("</tbody>");
												out.print("</table>");
												out.print("</div>");
												//  linha dois abaixo da tabela para botão
												out.print("<div class=\"row\">");
												    out.print("<div class=\"col-5\"></div>");
												    out.print("<div class=\"col-4\">");
												    out.print("<br><br>");
												    if(request.getParameter("submit") != null){
												    
												    	
												    	
												    }
												
												      
												
												} else {

													out.print("<div class=\"containerModal\">");
													out.print("<div class=\"cookiesContent\" id=\"cookiesPopup\">");
													out.print(
															"<img class=\"imagemmodal\" src=\"https://cdn-icons-png.flaticon.com/512/1047/1047711.png\" alt=\"cookies-img\"  width=\"75\" height=\"75\"/>");
													out.print("<br><br>");
													out.print("<p class=\"modal-text\">Não há cursos a serem modificados.</p>");
													out.print("</div>");
													out.print("</div>");

												}
					%>






				</div>


			</div>
		</div>
		<div class=col-2></div>
</body>
</html>