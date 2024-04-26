package page;

import core.DSL;
import core.DriverFactory;
import org.junit.After;
import org.junit.Before;

public class BasePage {

    protected DSL dsl;

    public BasePage(){
        dsl = new DSL();
    }

    @Before
    public void inicializa(){
        System.setProperty("webdriver.chrome.driver", "D:\\Projetos\\Selenium WebDriver\\chromedriver-win64\\chromedriver.exe");
        DriverFactory.getDriver().get("D:\\Projetos\\Selenium WebDriver\\cursoSeleniumWagnerAquino\\src\\main\\resources\\componentes.html");
    }
}
