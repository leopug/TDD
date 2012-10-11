package processadorGeral;

public class ProcessadorDeExpressaoComLetras {

	
	public static String processaComLetras(String textoQueContemExpressaoComLetras){
		
		String resultado = "";
		
		String expressaoSeparada[] = separaExpressao(textoQueContemExpressaoComLetras);
		
		try{
			for(int i=0;i<Integer.parseInt(expressaoSeparada[1]);i++){
				
				resultado = resultado + expressaoSeparada[0];	
				
			}	
		}catch(NumberFormatException e){

			resultado = expressaoSeparada[0]+expressaoSeparada[1];

		}		
		
		return resultado;
	}
	
	private static String[] separaExpressao(String textoQueContemExpressaoComLetras){
		
		String expressaoSeparadaNasPartes[] = {textoQueContemExpressaoComLetras,textoQueContemExpressaoComLetras,textoQueContemExpressaoComLetras};
		
		expressaoSeparadaNasPartes[0] = expressaoSeparadaNasPartes[0].replaceAll("([A-Za-z]*) [\\+\\*] [A-Za-z|\\d]*", "$1");
		expressaoSeparadaNasPartes[1] = expressaoSeparadaNasPartes[1].replaceAll("[A-Za-z]* [\\+\\*] ([A-Za-z|\\d]*)", "$1");

		
		return expressaoSeparadaNasPartes;
	}
	
}
