package validacoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validacoes {

	
		
		private static final String EMAIL_PATTERN = "^(.+)@(\\S+)$";

	    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    

	    public static boolean isValidEmail(String email) {
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	        
	    }
	    
	    
	    public static boolean isValidAgencia(String agencia) {
	    	System.out.println(agencia);
	    	System.out.println(agencia.length());
	        if(agencia.length() < 4 ||  agencia.length() > 4  || !agencia.matches("^[0-9]*$")) {
	        	System.out.println("Digite 4 digitos válidos para a agencia.");
	        	return false;
	        }
	        else {
	        	return true;
	        }
	        
	    }
	    
	    public static boolean isValidConta(String conta) {
	    
	        if(conta.length() < 6 ||  conta.length() > 6  || !conta.matches("^[0-9]*$")) {
	        	System.out.println("Digite o numero da conta com o digito junto, válido...");
	        	return false;
	        }
	        else {
	        	return true;
	        }
	        
	    }
	    
	    
	  
}
