package processadorGeral;

public class Processador {

	
	
    public Object processa(String string){
    	
		String resultado = "";
		
		if(validarExpressoesNumericas(string)){
		resultado = ProcessadorDeExpressoesNumericas.calculaExpressaoNumerica(string);			
		}		
		
		return resultado;
	}
	
    boolean validarExpressoesNumericas(String textoQueTalvezTenhaUmaExpressao){

    	if(textoQueTalvezTenhaUmaExpressao.matches("\\d* [\\*\\+\\-/] \\d*")){
    		return true;

    	}else{
    		return false;
    	}
    }
    
}
