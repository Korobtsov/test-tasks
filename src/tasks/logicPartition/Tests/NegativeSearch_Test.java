package tasks.logicPartition.Tests;

import org.junit.*;
import tasks.logicPartition.Pages.MainPage;
import tasks.logicPartition.Pages.SearchResultPage;
import tasks.logicPartition.Settings.FireFoxSettings;

public class NegativeSearch_Test extends FireFoxSettings {
	
	private String searchFieldInput = "Randomize";
			
	@Test
	public void search() {
		MainPage mainPage = new MainPage(driver); 
		mainPage.submitSearch(searchFieldInput);
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.NegativeSearch();
		}
	}
