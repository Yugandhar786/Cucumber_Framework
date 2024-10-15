package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By search_box =By.name("q");
	
	public void enterSearchText(String searchcontent) {
		driver.findElement(search_box).sendKeys(searchcontent);;
		
	}

}
