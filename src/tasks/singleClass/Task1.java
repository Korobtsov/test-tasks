package tasks.singleClass;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	
	protected WebDriver driver;
	private String sourceURL = "https://focus.kontur.ru/";
	private String searchFieldInput = "Randomize";
	
	By searchField = By.xpath("//*[@id='search-field']");
	By searchButton = By.xpath("//*[@id='SearchButton']");
		
	private void clickClean(WebElement a) {
		a.clear();
		a.click();
		}
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get(sourceURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	@Test
	public void search() {
		WebElement field = driver.findElement(searchField);
		WebElement ButtonSearch = driver.findElement(searchButton);
		clickClean(field);
		field.sendKeys(searchFieldInput);
		ButtonSearch.click();
		
		if ((driver.findElements(By.xpath("//*[@class='nothingFound']")).size()) > 0){
			System.out.println("Matching companies are not found");
		} else if ((driver.findElements(By.xpath("//*[@class='clearList']")).size()) > 0){
			System.out.println("Matching companies are found");
		} else {
			Assert.fail("Search functionality doesn't work");
		} 
		}
	
	@After
	public void tearDown(){
		driver.quit();
	}	
}
