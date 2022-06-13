<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

String id = request.getParameter("id");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost/icarros";
String userid = "root";
String password = "admin";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="select * from cursos where id_curso="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
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
<title>Inserir cursos</title>
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
							<li><a class="dropdown-item" href="pesquisar.jsp"">Pesquisar</a></li>
							<li><a class="dropdown-item" href="inserir.jsp">Inserir</a></li>
							<li><a class="dropdown-item" href="modificar.jsp">Modificar</a></li>
							<li><a class="dropdown-item" href="excluir.jsp">Excluir</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<br>
		<div class="container">
		<div class="row">
			<div class=col-2></div>
			<div class=col-8>
			<br>
			<br>
			<form method="post" action="modificar.jsp">
			  <input type="hidden" name="id_curso" value="<%=resultSet.getString("id_curso") %>">
				<div class="input-group mb-3">
					<label class="input-group-text" for="inputGroupSelect01">Cursos</label>
					<select class="form-select" name="nomecursos">
			
						<option selected>Escolha o seu curso...</option>
						<option <%=resultSet.getString("nome_curso").equals("java") ? "selected" : ""%> value="java">JAVA</option>
						<option <%=resultSet.getString("nome_curso").equals("javascript") ? "selected" : ""%> value="javascript">JavaScript</option>
						<option <%=resultSet.getString("nome_curso").equals("c++") ? "selected" : ""%> value="c++">C++</option>
						<option <%=resultSet.getString("nome_curso").equals("phython") ? "selected" : ""%> value="phython">Phython</option>
						<option <%=resultSet.getString("nome_curso").equals("html") ? "selected" : ""%> value="html">HTML</option>
						<option <%=resultSet.getString("nome_curso").equals("css") ? "selected" : ""%> value="css">CSS</option>
					</select>
				</div>
				<label for="inputPassword5" class="form-label">Data Curso</label><input
					type="date" name="datacurso" class="form-control" value="<%=resultSet.getString("data_curso")%>"
					aria-describedby="passwordHelpBlock"> <label
					for="inputPassword5" class="form-label">Hora Curso</label><input
					type="time" name="horacurso" class="form-control" value="<%=resultSet.getString("hora_curso")%>"
					aria-describedby="passwordHelpBlock"> <label
					for="inputPassword5" class="form-label">Duração do Curso</label><input
					type="number" name="duracaocurso" class="form-control" value="<%=resultSet.getString("duracao_curso")%>"
					aria-describedby="passwordHelpBlock">
				<div class="mb-3">
					<label for="exampleFormControlTextarea1" class="form-label">Resumo
						do Curso</label>
					<textarea class="form-control" name="resumocurso" rows="3"><%=resultSet.getString("resumo_curso")%></textarea>
				</div>
				<input type="submit" value="Enviar" class="btn btn-primary">
	        </form>
			</div>
			<div class=col-2></div>
		</div>
	</div>

	<%
	}
	connection.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
</body>
</html>