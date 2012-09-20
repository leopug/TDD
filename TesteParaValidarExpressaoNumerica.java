package testes;
import static org.junit.Assert.*;

import org.junit.Test;

import processadorGeral.Processador;


public class TesteParaValidarExpressaoNumerica {

	@Test
	public void testaParaASoma() {
		
		Processador proc = new Processador();
		
		String expressaDeSoma = "1 + 1";
		
		assertEquals("2",proc.processa(expressaDeSoma));
				
	}

}
