<%@page import="br.com.dao.BancoDeDados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<title>Inserir cursos</title>
</head>
<body>
	<!-- Criando o Menu tipo NavBar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
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
							<li><a class="dropdown-item" href="#">Pesquisar</a></li>
							<li><a class="dropdown-item" href="#">Inserir</a></li>
							<li><a class="dropdown-item" href="#">Modificar</a></li>
							<li><a class="dropdown-item" href="#">Excluir</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class=col-2></div>
			<div class=col-8>
			<form id="inserir" method="get">
				<div class="input-group mb-3">
					<label class="input-group-text" for="inputGroupSelect01">Cursos</label>
					<select class="form-select" name="nomecursos">
						<option selected>Escolha o seu curso...</option>
						<option value="java">JAVA</option>
						<option value="javascript">JavaScript</option>
						<option value="c++">C++</option>
						<option value="phython">Phython</option>
						<option value="html">HTML</option>
						<option value="css">CSS</option>

					</select>
				</div>

				<label for="inputPassword5" class="form-label">Data Curso</label> <input
					type="date" name="datacurso" class="form-control"
					aria-describedby="passwordHelpBlock"> <label
					for="inputPassword5" class="form-label">Hora Curso</label> <input
					type="time" name="horacurso" class="form-control"
					aria-describedby="passwordHelpBlock"> <label
					for="inputPassword5" class="form-label">Duração do Curso</label> <input
					type="number" name="duracaocurso" class="form-control"
					aria-describedby="passwordHelpBlock">

				<div class="mb-3">
					<label for="exampleFormControlTextarea1" class="form-label">Resumo
						do Curso</label>
					<textarea class="form-control" name="resumocurso" rows="3"></textarea>
				</div>
				<button type="submit" name="submit" class="btn btn-primary">Enviar</button>



	        </form>
			</div>
			<div class=col-2></div>


		</div>
	</div>
	<%
	if(request.getParameter("submit") != null){
		BancoDeDados mysql = new BancoDeDados();
		mysql.conectar();
		out.print(mysql.isConnected());
			

			String nomeCurso = request.getParameter("nomecursos");
			String datacurso =  request.getParameter("datacurso");
			String horacurso = request.getParameter("horacurso");
			String duracaocurso = request.getParameter("duracaocurso");
			String resumocurso = request.getParameter("resumocurso");
			
			out.print(nomeCurso);
			out.print(datacurso);
			out.print(horacurso);
			out.print(duracaocurso);
			out.print(resumocurso);

			
			mysql.inserirCursos(nomeCurso, datacurso, horacurso, duracaocurso, resumocurso);
			out.print("Insert efetuado com sucesso");
		
		}
	  
	
	%>
</body>
</html>