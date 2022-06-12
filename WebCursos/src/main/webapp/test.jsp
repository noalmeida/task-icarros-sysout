<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">Controle de Cursos</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Sistema</a>
	        </li>
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            CRUD
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
	            <li><a class="dropdown-item" href="#">Pesquisar</a></li>
	            <li><a class="dropdown-item" href="#">Inserir</a></li>
	            <li><a class="dropdown-item" href="#">Modificar</a></li>
	            <li><a class="dropdown-item" href="#">Excluir</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div class="container">
		<form action="editar.jsp" method="get">
			<div class="row">
				<div class=col-2></div>
				<div class=col-8>
					<div class="input-group mb-3">
					  <label class="input-group-text" for="inputGroupSelect01">Cursos</label>
					  <select class="form-select" name="nomecursos">
					    <option >Escolha o seu curso...</option>
					    <option  value="java">JAVA</option>
					    <option  value="javascript">JavaScript</option>
					    <option  value="c++">C++</option>
					    <option  value="python">Python</option>
					    <option  value="html">HTML</option>
					    <option  value="css">CSS</option>
					
					  </select>
					</div>
				
				<label for="inputPassword5" class="form-label">Data Curso</label>
				<input type="date" name="datacurso" class="form-control"  value=">">
				
				<label for="inputPassword5" class="form-label">Hora Curso</label>
				<input type="time" name="horacurso" class="form-control"  value=">">
				
				<label for="inputPassword5" class="form-label">Duração do Curso</label>
				<input type="number" name="duracaocurso" class="form-control"  value=">">
				
				<input name="editId" type="hidden" value="">
				
				<div class="mb-3">
				  <label for="exampleFormControlTextarea1" class="form-label">Resumo do Curso</label>
				  <textarea class="form-control" name="resumocurso" rows="3">></textarea>
				</div>
				</div>
				<div class=col-2>
				</div>
				<br />
				<div class="row">
					<div class=col-2></div>
					<div class=col-8>
						<div class="d-grid gap-2 d-md-block" role="group" >
						  <button name="submit" type="submit" class="btn btn-primary">Enviar</button>
						  <button type="reset" class="btn btn-danger">Limpar</button>
						</div>							
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</body>
</html>