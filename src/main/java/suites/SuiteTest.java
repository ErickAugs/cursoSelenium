package suites;

import core.DriverFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import test.TesteCadastro;
import test.TesteCampoTreinamento;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TesteCadastro.class,
        TesteCampoTreinamento.class})
public class SuiteTest {

    @Rule
    public TestName testName = new TestName();
    @After
    public void finalizaTudo() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File file = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File(testName.getMethodName()+".jpg"));

        DriverFactory.killDriver();
    }
}
