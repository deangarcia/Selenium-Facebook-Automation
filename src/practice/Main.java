package practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		// Creates an instance of webdriver
		WebDriver driver = new FirefoxDriver();
		synchronized (driver) {
			try {
				// Going to navigate to this site
				driver.navigate().to("https://www.facebook.com/");

				// Click on hippocamp
				driver.findElement(
						By.xpath(".//*[@id='email']"))
						.sendKeys("dean.c.garcia@gmail.com");
				driver.findElement(
						By.xpath(".//*[@id='pass']"))
						.sendKeys("006641037dg!");
				driver.findElement(
						By.xpath(".//*[@id='loginbutton']"))
						.click();
				driver.findElement(
						By.xpath(".//*[@id='u_ps_jsonp_5_0_x']/div[4]/div[2]/div/div/div[2]/div[1]/div/a"))
						.click();
				
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			} catch (IllegalMonitorStateException e) {
				System.out.println(e);
			} catch (NoSuchElementException e) {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(e);
;			} finally {
			
				// Close the driver
				driver.close();
			}
		}

	}
}
