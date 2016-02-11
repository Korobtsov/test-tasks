package tasks.logicPartition.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SearchResultPage {
	private WebDriver driver;
	
	public SearchResultPage(WebDriver driver){this.driver = driver;}
	
	By listOfResultsIsPrerentFlag = By.xpath("//*[@class='clearList']");
	By NoResultsFlag = By.xpath("//*[@class='nothingFound']");
	By companyLink = By.xpath("//a[@class='marR12 js-subject-link']");
	
	
	public By getCompanyLink(){
		return companyLink;
	}
	
	/* @FindBy(how=How.XPATH, xpath="//a[@class='marR12 js-subject-link']")
	private List<WebElement> companyLinksList;
	
			
	public List<WebElement> getCompanyLinksList() {
		return companyLinksList;
	}*/

	public void NegativeSearch(){
		Assert.assertTrue(driver.findElement(NoResultsFlag).isDisplayed());
	}
	
	public void PositiveSearch(){
		Assert.assertTrue(driver.findElement(listOfResultsIsPrerentFlag).isDisplayed());
	}
	
	
	
}
