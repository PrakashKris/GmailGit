import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepDefinition {
  WebDriver driver;
	
@Given("I go to HDFC Bank website")
public void i_go_to_HDFC_Bank_website() {
  
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.hdfcbank.com/");
}

@Then("I should be on HDFC NetBanking page")
public void i_should_be_on_HDFC_NetBanking_page() {
 Assert.assertTrue(driver.getTitle().contains("HDFC Bank: Personal Banking Services")); 
 driver.quit();
}


@Given("^There (?:is|are) (\\d+) (?:credit?|credits) for some course in Play\\.$")
public void there_is_credit_for_some_course_in_Play(int arg1) {
}


}



