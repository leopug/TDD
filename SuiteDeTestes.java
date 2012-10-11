package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteParaValidarExpressaoComLetras.class,
		TesteParaValidarExpressaoNumerica.class, TesteDeClasse.class })
public class SuiteDeTestes {

}
