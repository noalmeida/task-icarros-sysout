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
	
	public ArrayList<String> listLivros() {
		
		try {
			String query = "select * from icarros.livros";
			this.resultset=this.statement.executeQuery(query);
			this.statement=this.connection.createStatement();
			
			
			while(this.resultset.next()) {
				String id_livro = resultset.getString("id_livro");
				String nome_livro = resultset.getString("nome_livro");
				String age = resultset.getString("idade");
				String email = resultset.getString("email");
				String funcao = resultset.getString("funcao");
				System.out.print("\nid: "+ id_livro + "| ");
				System.out.print("nome: "+ nome_livro+ "| ");
				arrayIdLivros.add(id_livro);
				arrayNomeLivros.add(nome_livro);
			
			
				
			}
			arrayTotal.addAll(arrayIdLivros);
			arrayTotal.addAll(arrayNomeLivros);
			
			
			
		} catch (Exception e) {
			System.out.println("Erro:." + e.getMessage());
		}
		 return arrayTotal;
	}

}
