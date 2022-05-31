package model;

import lombok.Data;

@Data
public class Conta {

	public String ag;
	public String conta;
	public double saldo;
	
	@Override
	public String toString() {
		return "Conta [ag=" + ag + ", conta=" + conta + ", saldo=" + saldo + "]";
	}
	
   
}
