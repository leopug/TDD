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

	
	@Test
	public void testaMultiplicacao(){
		Processador proc = new Processador();
		
		String expressaoDeMultiplicacao = "30 * 30";
		
		assertEquals("900", proc.processa(expressaoDeMultiplicacao));
		
	}
	
	@Test
	public void testaSubtracao(){
		Processador proc = new Processador();
		
		String expressaoDeMultiplicacao = "30 - 30";
		
		assertEquals("0", proc.processa(expressaoDeMultiplicacao));
		
	}
	
	@Test
	public void testaDivisao(){
		Processador proc = new Processador();
		
		String expressaoDeMultiplicacao = "30 / 30";
		
		assertEquals("1", proc.processa(expressaoDeMultiplicacao));
		
	}
	
}
