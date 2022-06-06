package gerencia_locacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	int indexGenero = 0;
	
	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset=null;

	private Object rs;

	
	
	public void conectar () {
		String servidor = "jdbc:mysql://localhost/icarros";
		String usuario="root";
		String senha = "admin";
		String driverConnection = "com.mysql.cj.jdbc.Driver";

		
		
		try {
			Class.forName(driverConnection);
			this.connection=DriverManager.getConnection(servidor, usuario, senha);
			this.statement =  this.connection.createStatement();
			
		} catch (Exception e) {
			System.out.println("erro : " +  e.getMessage());
		}
	}
	public String[] retornaGeneros () {
		String[] generos= new String [5];

		try {
			String query = "select * from icarros.genero order by genero";
			this.statement=this.connection.createStatement();
			ResultSet rs = this.statement.executeQuery(query);

			
			while (rs.next()) {
				  String generoRecv = rs.getString("genero");
				  System.out.println(generoRecv + "\n");
				  
				  generos[indexGenero] = generoRecv;
				  indexGenero++;  
				}
			
			
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		
		return generos;
	}
	public String insertDadosInDatabase(String nome_filme, String duracao_filme, Object genero_filme, String data_lancamento_filme, String sinopse_filme) {
		try {
			String query = "INSERT INTO icarros.filme (id_filme, nome_filme, duracao_filme, genero_filme, data_lancamento_filme, sinopse_filme, imagem_filme, data_modificacao_filme)"
					+ "VALUES (null,"+ "'"+nome_filme+"'"+","+"'"+ duracao_filme +"'"+ ","+"'"+genero_filme+"'"+",date_format(str_to_date('"+data_lancamento_filme+"', '%d/%m/%Y'), '%Y-%m-%d'),"+ " "+"'"+sinopse_filme+"'"+", "+"null"+ ","+ "null"+");";
			System.out.println(query);
			this.statement=this.connection.createStatement();
			int rs = this.statement.executeUpdate(query);
			while (((ResultSet) this.rs).next()) {
				  String generoRecv = this.resultset.getString("nome_filme");
				  String generoRecv2 = this.resultset.getString("duracao_filme");
				  System.out.println(generoRecv + "Duracao : "+generoRecv2);			  
				}
		
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		return "1";	
	}
	public void selectDadosDbcFilmes() {
		try {
			String query = "SELECT * FROM icarros.filme;";
			System.out.println(query);
			System.out.println("Vendo o select");
			this.statement=this.connection.createStatement();
		    this.resultset=this.statement.executeQuery(query);
			while (resultset.next()) {
				  String generoRecv = this.resultset.getString("nome_filme");
				  String generoRecv2 = this.resultset.getString("duracao_filme");
				  System.out.println(generoRecv + "Duracao : "+generoRecv2);			  
				}
		
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		
	}
	
	public boolean isConnected() {
		if(this.connection != null ) {
			return true;
		}
		return false;
	}	
		

}
