package testes;

import static org.junit.Assert.*;
import processadorGeral.Processador;

import org.junit.Test;

public class TesteParaValidarExpressaoComLetras {

	@Test
	public void testaSomaDeStrings(){
		Processador proc = new Processador();
		
		String expressaoDeSomaDeString = "Abc + Abc";
		
		assertEquals("AbcAbc", proc.processa(expressaoDeSomaDeString));
		
	}
	
	@Test
	public void testaMultiplicacaoDeNumerosComString(){
	Processador proc = new Processador();
	
	String expressaoDeMultiplicacaoDeString = "b * 5";
	
	assertEquals("bbbbb", proc.processa(expressaoDeMultiplicacaoDeString));
		
	}
	
	@Test
	public void testaMultiplicacaoDeNumerosComStringNaoRepetida(){
	Processador proc = new Processador();
	
	String expressaoDeMultiplicacaoDeString = "Abd * 4";
	
	assertEquals("AbdAbdAbdAbd", proc.processa(expressaoDeMultiplicacaoDeString));
		
	}
	
}
