package suites;

import core.DriverFactory;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TesteCadastro;
import test.TesteCampoTreinamento;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TesteCadastro.class,
        TesteCampoTreinamento.class})
public class SuiteTest {

    @AfterClass
    public static void finalizaTudo(){
        DriverFactory.killDriver();
    }
}
