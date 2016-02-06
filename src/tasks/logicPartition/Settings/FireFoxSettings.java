package tasks.logicPartition.Settings;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSettings {
	
	protected WebDriver driver;
	
	private String sourceURL = "https://focus.kontur.ru/";
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get(sourceURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
	@After
	public void tearDown(){
		driver.quit();
	}
}
