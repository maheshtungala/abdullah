package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_PageTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        //open google
		driver.get("https://www.google.com");
	/*	String expTitle="Google";
		String actTitle=driver.getTitle();
		//compare both..
		if(actTitle.equals(expTitle)){  */
		if(driver.getTitle().equals("Google")){
			System.out.println("TC passed");
		}else{
			System.out.println("TC failed");
		}
		driver.close();
	}

}
