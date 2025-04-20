import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relearnselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.getTitle();
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("akhileswarguptha1999.sfdev@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Welcome@123");
		
		driver.findElement(By.id("Login")).click();
		
		
		
		Thread.sleep(3000);
		
			driver.findElement(By.xpath("//input[@class='continue']"));
		

	}

}
