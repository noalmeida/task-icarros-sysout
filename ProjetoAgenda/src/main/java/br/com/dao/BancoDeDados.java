package br.com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BancoDeDados {
	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset=null;
	ArrayList <String> arrayIdLivros = new ArrayList<>();
	ArrayList <String> arrayNomeLivros = new ArrayList<>();
	ArrayList <String> arrayTotal = new ArrayList<>();
	ArrayList<Livros> livros = new ArrayList<Livros>();
	
	
	
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
	
	public ArrayList<Livros> listLivros() {
		
		try {
			String query = "select * from icarros.livros";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			while (this.resultset.next()) {
				int id_livro = resultset.getInt("id_livro");
				String nome_livro = resultset.getString("nome_livro");
				System.out.print("\nid: " + id_livro + "| ");
				System.out.print("nome: " + nome_livro + "| ");
				livros.add(new Livros(id_livro, nome_livro));

			}

		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		return livros;
	}
public void insertLivros(String nome_livro, String data_lancamento, String autor_livro, String editora_livro) {
		
	try {
		String sql = "INSERT INTO icarros.livros(nome_livro,data_lancamento,autor_livro,editora_livro) " + " VALUES(" + "'"
				+ nome_livro + "'" + "," + "'" + data_lancamento + "'," + "'" + autor_livro + "'" + "," + "'"
				+ editora_livro + "');";
        System.out.println(sql);
		
      
		this.statement.executeUpdate(sql);
		
		
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		
	}

}
