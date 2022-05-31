package model;

import lombok.Data;

@Data
public class Cliente {
	public int id;
	public String nome;
	public String email;
	public String telefone;
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	

}
