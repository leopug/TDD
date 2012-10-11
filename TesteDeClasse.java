package testes;

import static org.junit.Assert.*;
import processadorGeral.Processador;
import processadorGeral.Carro;
import processadorGeral.Banana;
import org.junit.Test;

public class TesteDeClasse {

	@Test
	public void testeDaClasseCarro() {

	Processador proc = new Processador();
	
	assertTrue(proc.processa("Carro") instanceof Carro);
	
	}

	@Test
	public void testeDaClasseBanana() {

	Processador proc = new Processador();
	
	assertTrue(proc.processa("Banana") instanceof Banana);
	
	}
	
	@Test
	public void testeDaClasseCarroComAtributoVelho(){
		
		Processador proc = new Processador();

		Carro car = (Carro) proc.processa("CarroVelho");
		
		assertTrue(car.isVelho());
		
	}
	
	@Test
	public void testeDaClasseBananaComAtributoAmassado() {

	Processador proc = new Processador();
	
	Banana banana = (Banana) proc.processa("BananaAmassada");
	
	assertTrue(banana.isAmassada());
	
	}
		
}
