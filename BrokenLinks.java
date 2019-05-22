import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
		
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Acer\\Downloads\\selenium-java\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(linkList.size());
		
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i=0 ; i<linkList.size();i++) {
			if(linkList.get(i).getAttribute("href") != null && (! linkList.get(i).getAttribute("href").contains("javascript"))){
				activeLinks.add(linkList.get(i));
			}
		}
		System.out.println(activeLinks.size());
		
		
		
		for(int j =0;j<activeLinks.size();j++) {
			
			
		HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		
		System.out.println(activeLinks.get(j).getAttribute("href")+"_________"+ response);
		}
	}

}
