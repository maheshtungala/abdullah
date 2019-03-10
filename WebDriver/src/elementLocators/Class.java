package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//enter some string into the search box
		//driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		
		//click the Gmail link
		//driver.findElement(By.linkText("Gmail")).click();

		//click using the partialLinkText..
		//driver.findElement(By.partialLinkText("ma")).click();
		
		//get the number of links in the homepage...
		int linkCount = driver.findElements(By.tagName("a")).size();
		
		System.out.println("The number of links in google homepage is "+linkCount);
	}

}
