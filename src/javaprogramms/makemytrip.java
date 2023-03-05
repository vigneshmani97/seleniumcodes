package javaprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/div/a/span[1]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).sendKeys("chennai");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div[3]/div/div/p")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div")).click();


		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[2]/div[1]/div/div[1]/a")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[2]/div/ul/li[1]/div[1]/span[1]/label")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[3]/div[2]/div/a/span[2]")).click();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[3]/div[2]/div/a/span[2]")).click();


		driver.findElement(By.id("name")).sendKeys("vignesh");

		driver.findElement(By.id("age")).sendKeys("25");

		WebElement drdwn =driver.findElement(By.xpath("//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[3]/div[2]/div/form/div[3]/div/p/span[2]"));
		drdwn.click();
		driver.findElement(By.xpath("//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[3]/div[3]/button")).click();
		Select select=new Select(drdwn);
		select.selectByValue("1");

	}

}
