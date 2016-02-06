package tasks.logicPartition.App;

import org.openqa.selenium.*;

public class Utils {
	
	private WebDriver driver;
	
	public Utils(WebDriver driver){
		this.driver = driver;
	}
		
	public void clickClean(WebElement a) {
		a.clear();
		a.click();
		}
}
