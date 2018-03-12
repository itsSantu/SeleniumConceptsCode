package SeleniumConcept.CompleteSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBDropdownDateMonth {
	@Test
	public void FBDropdownmonth() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/santhoshkumar/Documents/SelPract/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement month_dropdown=  driver.findElement(By.id("month"));
	Select 	month_mm = new Select (month_dropdown);
	List<WebElement> month_list=month_mm.getOptions();
	int total_days = month_list.size();
	System.out.println(total_days);
	month_mm.selectByIndex(5);
	System.out.println("Total days are" +month_mm);


ArrayList<String> MonthList = new ArrayList<String>(12);
//String[] MonthList = new String[13]; 
//MonthList.add("Month");
MonthList.add("Month");
MonthList.add("Jan");
MonthList.add("Feb");
MonthList.add("Mar");
MonthList.add("Apr");
MonthList.add("May");
MonthList.add("Jun");
MonthList.add("Jul");
MonthList.add("Aug");
MonthList.add("Sep");
MonthList.add("Oct");
MonthList.add("Nov");
MonthList.add("Dec");


for (String AvailMonth : MonthList)
{
System.out.println("Available Months are "+AvailMonth);
}

driver.findElement(By.id("u_0_c")).click();
System.out.println("Male radio button selected");
//Assert.assertSame(month_list, MonthList);
	
	driver.quit();

}

}
