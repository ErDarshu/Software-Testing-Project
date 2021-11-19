package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DARSHANA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w= new ChromeDriver ();
		
	   	w.get("http://tutorialsninja.com/demo/");
	   	
	   	w.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		 w.findElement(By.linkText("Register")).click();
		 w.findElement(By.name("firstname")).sendKeys("Darshu");
		 w.findElement(By.name("lastname")).sendKeys("paniya");
		 w.findElement(By.name("email")).sendKeys("dpaniya@gmail.com");
		 w.findElement(By.name("telephone")).sendKeys("9874561230");
		 w.findElement(By.name("password")).sendKeys("123456");
		 w.findElement(By.name("confirm")).sendKeys("123456");
		 
		 w.findElement(By.name("newsletter")).click();
		 w.findElement(By.name("agree")).click();
		 
		 w.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		 w.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		 
		 
		
		 

	}

}