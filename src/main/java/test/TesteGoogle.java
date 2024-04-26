package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.BaseTest;

public class TesteGoogle extends BaseTest {
	
	private WebDriver driver;

	@Before
	public void inicializa(){
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Projetos\\Selenium WebDriver\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().setSize(new Dimension(1200, 765));
	}
	
	@Test
	public void teste() {
		Assert.assertEquals("Google", driver.getTitle());
	}

}
