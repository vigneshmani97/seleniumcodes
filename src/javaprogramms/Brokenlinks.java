package javaprogramms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("NO of links are" + links.size());
		List<String> urlList= new ArrayList<String>();

		for(WebElement e : links) {
			String url =e.getAttribute("href");
			//urlList.add(url);
			checkBrokenLink(url);
		}
		driver.quit();
	}
	public static void checkBrokenLink(String linkUrl) {
		try {
			URL url= new URL(linkUrl);
			HttpURLConnection httpUrlconnection=(HttpURLConnection) url.openConnection();
			httpUrlconnection.setConnectTimeout(5000);
			httpUrlconnection.connect();
			if(httpUrlconnection.getResponseCode()>=400) {
				System.out.println(linkUrl+"---->" +httpUrlconnection.getResponseMessage() +" is a broken link");
			}
			else {
				System.err.println(linkUrl +"--->"+httpUrlconnection.getResponseMessage()+ " is not a broken link" );
			}
		}
		catch (Exception e) {

		}
	}

}
