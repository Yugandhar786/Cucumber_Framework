package StepDefinition;

import java.time.Duration;

import javax.print.DocFlavor.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearchSteps {

//	WebDriver driver =new ChromeDriver();
	WebDriver driver = null;


	@Given("Browser is Open")
	public void browser_is_open() throws Exception {
		System.setProperty("webDrier.Chrome.Driver",".\\src\\main\\resources\\chromedriver_129.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
		
//		driver.get("https://www.google.com");
		String parent_Window=driver.getWindowHandle();
		System.out.println(parent_Window);
//		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
	
		
	}

	@And("user is on google Search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().back();
	}


	@When("user enter {string} the a text in searchbox")
	public void user_enter_the_a_text_in_searchbox(String searchContent) {
		
		driver.findElement(By.name("q")).sendKeys(searchContent);
		if(searchContent.equalsIgnoreCase("Facebook"))
		{
			hits_enter();
		}
		else {
		 hits_enter1();
		}
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
	}
	@And("hits enter1")
	public void hits_enter1() {
		
//		try {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.id("65564fef6f5df6sd4f5sdf"));
//		
//		}catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//			
//		}
//		finally {
//			user_is_navigated_to_search_results();
//			
//		}
		
		
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {

		
		driver.quit();
		
		
	}
	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
	System.out.println(driver.getCurrentUrl());
	}

	@And("user is redirected to instagram page")
	public void user_is_redirected_to_instagram_page() {
	   driver.navigate().to("https://www.instagram.com");
	}

	@Then("Browser is closed")
	public void browser_is_closed() {
		driver.quit();
	   
	}


}
