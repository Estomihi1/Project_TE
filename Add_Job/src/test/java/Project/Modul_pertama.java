package Project;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Modul_pertama {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		 HashMap<String, Object> map = new HashMap<String, Object>();
		    map.put("profile.default_content_setting_values.notifications", 2);
		    ChromeOptions options = new ChromeOptions();
		    options.setExperimentalOption("prefs", map);
		    WebDriver driver = new ChromeDriver(options);
		    //driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    //masuk ke halaman login
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    String actualTitle = driver.getTitle();
		    String expectedTitle = "OrangeHRM";
		    Assert.assertEquals(expectedTitle, actualTitle); 
		    Assert.assertTrue(expectedTitle.equals(actualTitle), "First hard assert before login failed");
		    Assert.assertFalse(!expectedTitle.equals(actualTitle), "Second hard assert before login failed");
		   
		    //login lalu masuk ke dashboard
		    WebElement element = driver.findElement(By.xpath("//*[@id = 'txtUsername']"));
		    element.clear();
		    element.sendKeys("admin");
		    WebElement element2 = driver.findElement(By.xpath("//*[@id = 'txtPassword']"));
		    element2.clear();
		    element2.sendKeys("admin123");
		    element2.submit();
		    
		      driver.get("  https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList");
		    driver.findElement(By.name("btnAdd")).click();
		  // WebElement element3 = driver.findElement(By.id("menu_admin_viewAdminModule"));
		   
		   // element3.click();
		   // driver.findElement(By.id("menu_admin_Job")).click();
		  //  driver.findElement(By.name("btnAdd")).click();
		   // driver.findElement(By.name("menu_admin_viewJobTitleList")).click();
		  
		    WebElement element4 = driver.findElement(By.xpath("//*[@id = 'jobTitle_jobTitle']"));
		    element4.clear();
		    element4.sendKeys(" rerere");
		    
		    WebElement element5 = driver.findElement(By.xpath("//*[@id = 'jobTitle_jobDescription']"));
		    element5.clear();
		    element5.sendKeys(" rororor");
		   
		    WebElement file = driver.findElement(By.xpath("//*[@id = 'jobTitle_jobSpec']"));
		    file.clear();
		    file.sendKeys("D:\\tes1.jpg");
		    
		    WebElement element6 = driver.findElement(By.xpath("//*[@id = 'jobTitle_note']"));
		    element6.clear();
		    element6.sendKeys("ghr");
		    
		    
		    driver.findElement(By.name("btnSave")).click();
		    
		    
		  }

		    
	}


