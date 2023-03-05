package javaprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	
	public static void main (String args []) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		
		WebElement drpdwn=driver.findElement(By.id("fruits"));
		Select apple=new Select(drpdwn);
		apple.selectByVisibleText("Apple");
		apple.selectByVisibleText("Mango");
		
		
		WebElement drpdwn1=driver.findElement(By.id("lang"));
		Select sprhero= new Select(drpdwn1);
		sprhero.selectByVisibleText("Batman");
		sprhero.selectByVisibleText("The Avengers");
		
		
		
		
	}		
}
	

