import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationDemo {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver1 = new FirefoxDriver();
//		EdgeDriver driver2 = new EdgeDriver();
		driver.get("https://www.google.com");
//		driver1.get("https://www.google.com");
//		driver2.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath(null))

	}

}
