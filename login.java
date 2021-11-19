package finalproject;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DARSHANA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w= new ChromeDriver ();
		
		//open url
	   	w.get("http://tutorialsninja.com/demo/");
	   	
	   	
	   	// login
	   	w.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	    w.findElement(By.linkText("Login")).click();
	    
	    w.findElement(By.name("email")).sendKeys("dpaniya@gmail.com");
	    w.findElement(By.name("password")).sendKeys("123456");
	    w.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	    
	    //Software
	    w.findElement(By.linkText("Software")).click();
        TakesScreenshot t=(TakesScreenshot) w;
		
		File src=t.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("C:\\Users\\DARSHANA\\Desktop\\s2.png"));
		
		//Phones and PDAs
		
		w.findElement(By.linkText("Phones & PDAs")).click();
		w.findElement(By.id("list-view")).click();
		w.findElement(By.id("grid-view")).click();
		
		Select s= new Select(w.findElement(By.id("input-sort")));
		s.selectByValue("http://tutorialsninja.com/demo/index.php?route=product/category&path=24&sort=p.price&order=DESC");
		
		w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]")).click();
		
		//wishlist
		
		w.findElement(By.xpath("//*[@id=\"wishlist-total\"]")).click();
		
		
		//Camera
		
		w.findElement(By.linkText("Cameras")).click();
		w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")).click();
		
		w.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[2]")).click();
		w.navigate().back();
		w.findElement(By.linkText("Product Compare (0)")).click();
		
		  
		  //mx player
		  
		  Actions a =new Actions(w);
		  a.moveToElement(w.findElement(By.linkText("MP3 Players"))).build().perform();
		  w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  w.findElement(By.linkText("test 24 (0)")).click();
			
		w.close();
		
	}

}
