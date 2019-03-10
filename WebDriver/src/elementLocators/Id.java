package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//enter text into the email field...
		//driver.findElement(By.id("email")).sendKeys("maheshtungala");
        
		//using name attribute..
		driver.findElement(By.name("email")).sendKeys("mahesh");
	}

}
