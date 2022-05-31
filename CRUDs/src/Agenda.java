
public class Agenda {

	public static void main(String[] args) {
		
			
			
		    BancoDeDados sintaxeBanco = new BancoDeDados();
			sintaxeBanco.conectar();
			
			if(sintaxeBanco.isConnected()) {
				String idrecive ="";
				sintaxeBanco.recoverById(idrecive);
				
				
				System.out.println("conexão do Banco realizada com sucesso");
				
			}
		}

	

}
