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
	public boolean isConnected() {
		if(this.connection != null ) {
			return true;
		}
		return false;
	}
	
	public void listContatos() {
		
		try {
			String query = "select * from icarros.contato";
			this.resultset=this.statement.executeQuery(query);
			this.statement=this.connection.createStatement();
			
			while(this.resultset.next()) {
				String menuID = resultset.getString("id");
				String name = resultset.getString("nome");
				String age = resultset.getString("idade");
				String email = resultset.getString("email");
				String funcao = resultset.getString("funcao");
				System.out.print("\nid: "+ menuID + "| ");
				System.out.print("nome: "+ name+ "| ");
				System.out.print("idade: "+ age + "| ");
				System.out.print("email: "+ email + "| ");
				System.out.print("funcao: "+ funcao + "| ");
				
			}
			
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
	}
   

}
