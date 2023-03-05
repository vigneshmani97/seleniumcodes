package javaprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Dada']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"page-cta-container\"]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("wzrk-confirm")).click();
		driver.findElement(By.xpath("//div[normalize-space()='04']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"venuelist\"]/li[2]/div[2]/div[2]/div[1]/a/div[1]/div")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("btnPopupAccept")).click();
		
		driver.findElement(By.id("proceed-Qty")).click();
		
		
}
}
