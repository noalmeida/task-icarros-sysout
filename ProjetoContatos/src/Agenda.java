
public class Agenda {

	public static void main(String[] args) {
		
		
		BuscaContatos sintaxeBanco = new BuscaContatos();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.isConnected()) {
			//sintaxeBanco.listaFiltros();
			sintaxeBanco.inserirArray();
			System.out.println("conex?o do Banco realizada com sucesso");
			
		}
	}

}
