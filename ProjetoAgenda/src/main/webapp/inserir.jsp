<%@page import="br.com.dao.BancoDeDados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Insert title here</title>
</head>
<body>
<body>

	<div class="container">
		<div class="row">
			<div class="col-6">
				<form id="inserir" method="get">
					<label class="form-label">Nome do Livro</label> <input type="text"
						name="nomelivro" class="form-control"
						aria-describedby="passwordHelpBlock"
						placeholder="Digite o nome do livro" required> <label
						class="form-label">Nome do Autor</label> <input type="text"
						name="nomeautor" class="form-control"
						aria-describedby="passwordHelpBlock"
						placeholder="Digite o nome do Autor" required> <label
						class="form-label">Editora</label> <input type="text"
						name="editoralivro" class="form-control"
						aria-describedby="passwordHelpBlock"
						placeholder="Digite o nome da Editora" required> <label
						class="form-label">Data Lançamento</label> <input type="date"
						name="datalivro" class="form-control"
						aria-describedby="passwordHelpBlock" required> <br>
					<button type="submit" name="submit" class="btn btn-primary">Enviar</button>

				</form>
			</div>
			<div class="col-6">
				<p>Imagem</p>
			</div>
		</div>
	</div>

	<%
	if(request.getParameter("submit") != null){
		BancoDeDados mysql = new BancoDeDados();
		mysql.conectar();
		out.print(mysql.isConnected());
			

			String nomeLivro = request.getParameter("nomelivro");
			String nomeAutor = request.getParameter("nomeautor");
			String nomeEditora = request.getParameter("editoralivro");
			String nomeDataLanc = request.getParameter("datalivro");
			out.print(nomeLivro);
			out.print(nomeAutor);
			out.print(nomeEditora);
			out.print(nomeDataLanc);
			
			mysql.insertLivros(nomeLivro, nomeDataLanc, nomeAutor, nomeEditora);
		}
		
	
	
	%>


</body>

</body>
</html>