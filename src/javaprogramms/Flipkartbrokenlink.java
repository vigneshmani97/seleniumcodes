package javaprogramms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class Flipkartbrokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//finding tags;
		
		List<WebElement> links= driver.findElements(By.name("a"));
		System.out.println("Total links are"+ links.size());
		

		for (int i=0; i<links.size(); i++)
		{
			WebElement element=links.get(i);
			String link_url=element.getAttribute("href");
			VerifyAlllinks(link_url);
		}
		System.out.println("****All links checked*****");
		driver.quit();
		
	}


	public static void VerifyAlllinks(String linkURL) 

	{
		
		try {
			URL url= new URL(linkURL);
			HttpURLConnection httpurlconnect= (HttpURLConnection)url.openConnection();

			httpurlconnect.setConnectTimeout(4000);
			httpurlconnect.connect();
			if(httpurlconnect.getResponseCode()== 200)

			{

				System.out.println(linkURL +" is"+ httpurlconnect.getResponseMessage() + "Response code is"+ httpurlconnect.getResponseCode());

			}

			else if (httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND);
			{

				System.out.println(linkURL +" is"+ httpurlconnect.getResponseMessage() + "Response code is"+ httpurlconnect.getResponseCode());
			}
			
			//else
				
		//	System.out.println(linkURL +" is"+ httpurlconnect.getResponseMessage() + "Response code is"+ httpurlconnect.getResponseCode());
			
			
		}
		    catch(Exception e)

		{
		}
	}
}
	

	

