package testes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commons.SeleniumUtils;

public class AulaSeleniumTest {
	
	/**
	* Driver Configurations
	* - Caminho para onde o Driver foi baixado
	* - Nome do Driver a ser executado
	*/
	private static ChromeDriver driver;
	private static final String URL_G1 = "https://g1.globo.com/";
	private static final String URL_GOOGLE = "http://www.google.com/";
	private static final String NAME_INPUT_QUERY = "q";
	
	@BeforeClass
	public static void setSystemPropertyChromeWebDriver() {
		SeleniumUtils.setSystemPropertyChromeWebDriverOriginal();
	}
	
	@BeforeClass
	public static void testOpenG1() {
		driver = new ChromeDriver();
		//driver.get(URL_G1);
		
		
		driver.get(URL_GOOGLE);
		WebElement campo = driver.findElement(By.name(NAME_INPUT_QUERY));
		WebElement campo1 = driver.findElementByXPath("//*[@name='q']");
		
		campo1.sendKeys("windows");
		System.out.println("");
	}
	
	@AfterClass
	public static void testCloseG1() {
		driver.close();
	}
	
	@Test
	public void seleniunTest(){
		
	}
}