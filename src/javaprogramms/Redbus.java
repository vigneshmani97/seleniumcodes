package javaprogramms;

import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Redbus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


		WebElement frame0=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame0);

		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("88381098829");
		//driver.switchTo().defaultContent();


		WebElement frame01=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frame01);

		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();


		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("vignesh6028vicky@gmail.com");

	}
}

