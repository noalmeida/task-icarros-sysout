package gerencia_locacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

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
			
		} catch (Exception e) {
			System.out.println("erro : " +  e.getMessage());
		}
	}

}
