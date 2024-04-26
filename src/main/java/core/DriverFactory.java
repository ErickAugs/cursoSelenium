package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    private DriverFactory(){};
    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "D:\\Projetos\\Selenium WebDriver\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("D:\\Projetos\\Selenium WebDriver\\cursoSeleniumWagnerAquino\\src\\main\\resources\\componentes.html");
        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
        }
        driver = null;
    }


}
