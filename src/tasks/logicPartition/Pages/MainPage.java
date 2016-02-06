package tasks.logicPartition.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tasks.logicPartition.App.Utils;

public class MainPage {
	private WebDriver driver;
	
	public MainPage(WebDriver driver){this.driver = driver;}
	
	By searchField = By.xpath("//*[@id='search-field']");
	By searchButton = By.xpath("//*[@id='SearchButton']");
	
	public SearchResultPage submitSearch(String entrydata){
		WebElement field = driver.findElement(searchField);
		Utils utils = new Utils(driver);
		utils.clickClean(field);
		field.sendKeys(entrydata);
		WebElement ButtonSearch = driver.findElement(searchButton);
		ButtonSearch.click();	
		return new SearchResultPage(driver);
	}
	}
