package page;

import core.DriverFactory;
import core.Properties;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    @After
    public void finaliza(){
        if(Properties.FECHAR_BROWSER){
            DriverFactory.killDriver();
        }

    }
}
