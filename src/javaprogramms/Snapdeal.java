package javaprogramms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\'leftNavMenuRevamp\']/div[1]/div[2]/ul/li[2]/a/span[2]")).click();

		driver.findElement(By.linkText("Casual Shoes")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//img[@title='Do Bhai White Casual Shoes']")).click();

		Set<String> handles= driver.getWindowHandles();//parent,child,subchild
		Iterator it = handles.iterator();
		String parentid=(String)it.next();
		String childid= (String)it.next();

		driver.switchTo().window(childid);
		driver.findElement(By.id("buy-button-id")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("8838108829");
		driver.findElement(By.id("login-continue")).click();


	}

}
