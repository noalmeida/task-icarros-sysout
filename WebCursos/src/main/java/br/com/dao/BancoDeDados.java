package br.com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.DTO.Cursos;

public class BancoDeDados {
	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset=null;

	
	
	
	public void conectar () {
		String servidor = "jdbc:mysql://localhost/icarros";
		String usuario="root";
		String senha = "admin";
		String driverConnection = "com.mysql.cj.jdbc.Driver";
		
		
		
		try {
			Class.forName(driverConnection);
			this.connection=DriverManager.getConnection(servidor, usuario, senha);
			this.statement =  this.connection.createStatement();
		    System.out.println("Conectou");
			
		} catch (Exception e) {
			System.out.println("erro : " +  e.getMessage());
		}
	}
	public boolean isConnected() {
		if(this.connection != null ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
public void inserirCursos(String nome_curso, String data_curso, String hora_curso, String duracao_curso, String resumo_curso) {
		
	try {
		String sql = "INSERT INTO icarros.cursos(nome_curso,data_curso,hora_curso,duracao_curso,resumo_curso) VALUES("
				+ "'"+nome_curso+"',"+"'"+data_curso+"',"+"'"+hora_curso+"',"+"'"+duracao_curso+"',"+"'"+resumo_curso+"'"+");";
        System.out.println(sql);
		this.statement.executeUpdate(sql);
		System.out.println(sql);
		
		
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		
	}

	public List<Cursos> pesquisarCursos() throws SQLException {
		List<Cursos> cursosRetornados = new ArrayList<Cursos>();

		try {
			String sql = "select * from icarros.cursos ";
			ResultSet rset = this.statement.executeQuery(sql);

			while (rset.next()) {
				Cursos curso = new Cursos();
				curso.setIdcurso(rset.getInt("id_curso"));
				curso.setNomecurso(rset.getString("nome_curso"));
				curso.setDatacurso(rset.getString("data_curso"));
				curso.setHoracurso(rset.getString("hora_curso"));
				curso.setDuracaocurso(rset.getString("duracao_curso"));
				curso.setResumocurso(rset.getString("resumo_curso"));

				cursosRetornados.add(curso);

			}

		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		} 
		return cursosRetornados;

	}

}
