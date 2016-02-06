package tasks.logicPartition.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
	private WebDriver driver;
	
	public SearchResultPage(WebDriver driver){this.driver = driver;}
	
	By listOfResultsIsPrerentFlag = By.xpath("//*[@class='clearList']");
	By NoResultsFlag = By.xpath("//*[@class='nothingFound']");
	
	public void NegativeSearch(){
		Assert.assertTrue(driver.findElement(NoResultsFlag).isDisplayed());
	}
	
	public void PositiveSearch(){
		Assert.assertTrue(driver.findElement(listOfResultsIsPrerentFlag).isDisplayed());
	}
	
	
	
}
