package processadorGeral;

public class ProcessadorDeExpressoesNumericas {

	
	
	public static String calculaExpressaoNumerica(String expressaoNumerica){
		
		String resultado = "";
				
		String expressaoNumericaSeparada[] = separaAsPartesDaExpressao(expressaoNumerica);		
		
	    switch(expressaoNumericaSeparada[1]){
	    
	    case("+") : resultado = calculaSoma(Integer.valueOf(expressaoNumericaSeparada[0]),Integer.valueOf(expressaoNumericaSeparada[2]));	    
	    break;
	    case("-") : resultado = calculaSubtracao(Integer.valueOf(expressaoNumericaSeparada[0]),Integer.valueOf(expressaoNumericaSeparada[2]));	    
	    break;	    
	    case("*") : resultado = calculaMultiplicacao(Integer.valueOf(expressaoNumericaSeparada[0]),Integer.valueOf(expressaoNumericaSeparada[2]));	    
	    break;	    
	    case("/") : resultado = calculaDivisao(Integer.valueOf(expressaoNumericaSeparada[0]),Integer.valueOf(expressaoNumericaSeparada[2]));	    
	    break;
	    
	    default: 
	    	System.out.println("Operador Nao suportado");
	    	break;
	    
	    }		
	    
		return resultado;
	}
	
	
	private static String calculaDivisao(int primeiroNumero, int segundoNumero) {	
		
		if(segundoNumero == 0){
			return "Impossivel de fazer essa divisao";
		}
		
		return ""+(primeiroNumero/segundoNumero);
	}


	private static String calculaMultiplicacao(int primeiroNumero, int segundoNumero) {
		
		return ""+(primeiroNumero*segundoNumero);
	}


	private static String calculaSubtracao(int primeiroNumero, int segundoNumero) {
		
		return ""+(primeiroNumero-segundoNumero);
	}


	private static String calculaSoma(int primeiroNumero, int segundoNumero) {

		return ""+(primeiroNumero+segundoNumero);
	}


	public static String[] separaAsPartesDaExpressao(String expressaoNumerica){
		
		String expressaoSeparadaNasPartes[] = {expressaoNumerica,expressaoNumerica,expressaoNumerica};
		
		expressaoSeparadaNasPartes[0] = expressaoSeparadaNasPartes[0].replaceAll("(\\d*) [\\*\\+\\-/] \\d*", "$1");
		expressaoSeparadaNasPartes[1] = expressaoSeparadaNasPartes[1].replaceAll("\\d* ([\\*\\+\\-/]) \\d*", "$1");
		expressaoSeparadaNasPartes[2] = expressaoSeparadaNasPartes[2].replaceAll("(\\d*) [\\*\\+\\-/] (\\d*)", "$1");
		
		return expressaoSeparadaNasPartes;
		}
	
	
	
}
