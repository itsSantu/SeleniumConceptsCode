package SeleniumConcept.CompleteSelenium;

import java.util.concurrent.TimeUnit;

import javax.sound.midi.Synthesizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingPopUp {
	
	@Test
	public void fadeTransition () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/santhoshkumar/Documents/SelPract/geckodriver");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://react-bootstrap.github.io/react-overlays/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		String beforedismiss= driver.findElement(By.xpath("//div[@class=\"panel panel-default fade in\"]")).getText();
		System.out.println("Text is displayed" +beforedismiss);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'dismiss')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"panel panel-default fade\"]")).isDisplayed());	
		System.out.println("Text isn't displayed");
		driver.quit();
	
	}

}
