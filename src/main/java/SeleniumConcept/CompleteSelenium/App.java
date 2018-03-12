package SeleniumConcept.CompleteSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
	@Test
	public void FBDropdown() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/santhoshkumar/Documents/SelPract/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement day_dropdown=  driver.findElement(By.id("day"));
		Select 	day_dd = new Select (day_dropdown);
		List<WebElement> day_list=day_dd.getOptions();
		int total_days = day_list.size();
	
		//WebElement selected_value = day_dd.getFirstSelectedOption();
		//System.out.println(selected_value.getText());
		day_dd.selectByIndex(5);
	
		//System.out.println("selected day is " +day_dd);
		System.out.println("Total days are" +day_list);
//		WebElement selected_value1 = day_dd.getFirstSelectedOption();
//		System.out.println(selected_value1.getText());
//		Assert.assertEquals(selected_value, selected_value1);
//		Thread.sleep(3000);
//		day_dd.selectByVisibleText("23");
//		Thread.sleep(3000);
		Thread.sleep(3000);
		for (WebElement ele:day_list) 
		
	{
		String day_date=ele.getText();
		System.out.println(day_date);
	}
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
}
