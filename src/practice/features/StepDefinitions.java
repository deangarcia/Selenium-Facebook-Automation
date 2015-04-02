package practice.features;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	WebDriver driver = new FirefoxDriver();

	@Given("^I navigated to facebook$")
	public void navigatedToFacebook() throws Exception {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I input my user name$")
	public void inputUserName() throws Exception {
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(
				"dean.c.garcia@gmail.com");
	}

	@When("^I input my password$")
	public void inputPassword() throws Exception {
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(
				"006641037dg!");
	}

	@When("^I login$")
	public void login() throws Exception {
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

	@When("^I click on csulb boxing link$")
	public void clickCsulbBoxing() throws Exception {
		driver.findElement(
				By.xpath(".//*[@id='navItem_1431634413769364']/div/div[2]/a/div[2]/span"))
				.click();
	}

	@When("^I click on smorgasport link$")
	public void clickSmorgasport() throws Exception {
		List<WebElement> elements = driver.findElements(By
				.partialLinkText("Richard DeAvila"));
		for (WebElement element : elements) {
			if (element.getAttribute("dir").equals("ltr")) 
			{
				element.click();
				System.out.println(element.getAttribute("dir"));
			}
			else
				System.out.println("other element");
		}
		Thread.sleep(9000);

	}

	@Then("^close out browser$")
	public void closeBrowser() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}
}
