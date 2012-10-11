package processadorGeral;

public class Processador {

	
	
	public Object processa(String string){



		if(validarExpressoesNumericas(string)){
			return ProcessadorDeExpressoesNumericas.calculaExpressaoNumerica(string);			
		}		

		if(validarExpressoesComLetras(string)){
			return ProcessadorDeExpressaoComLetras.processaComLetras(string);			
		}
		if(string.equals("Carro")){
			return new Carro(false);
		}
		if(string.equals("Banana")){
			return new Banana(false);
		}
		if(string.equals("CarroVelho")){
			return new Carro(true);
		}
		if(string.equals("BananaAmassada")){
			return new Banana(true);
		}
		
		return "Deu tudo errado";

	}
	
    boolean validarExpressoesNumericas(String textoQueTalvezTenhaUmaExpressao){

    	if(textoQueTalvezTenhaUmaExpressao.matches("\\d* [\\*\\+\\-/] \\d*")){
    		return true;

    	}else{
    		return false;
    	}
    }
    
    boolean validarExpressoesComLetras(String textoQueTalvezTenhaUmaExpressao){

    	if(textoQueTalvezTenhaUmaExpressao.matches("[A-Za-z]* [\\*\\+] [A-Za-z|\\d]*")){
    		return true;    		
    	}else{
    		return false;
    	}    	
    }

}
