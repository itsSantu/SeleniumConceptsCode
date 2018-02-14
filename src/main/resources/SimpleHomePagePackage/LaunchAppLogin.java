package main.resources.SimpleHomePagePackage;

public class LaunchAppLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
        WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "/Users/santhoshkumar/Documents/SelPract/geckodriver");
//		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in");

        driver.quit();

    }
}
