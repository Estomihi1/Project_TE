package Testing;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Aktivitas1 {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	//    driver.get("http://google.com");
	   
	    //	    HashMap<String, Object> map = new HashMap<String, Object>();
	    //	    map.put("profile.default_content_setting_values.notifications", 2);
	    //	    ChromeOptions options = new ChromeOptions();
	    //	    options.setExperimentalOption("prefs", map);
	    //	    WebDriver driver = new ChromeDriver(options);
//	    driver.manage().window().maximize();
	    //	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //    driver.get("https://www.facebook.com");
	    //    WebElement element = driver.findElement(By.xpath("//*[@id = 'email']"));
	    //    element.sendKeys("email id");
	    //    WebElement element2 = driver.findElement(By.xpath("//*[@id = 'pass']"));
	    //   element2.sendKeys("password");
	    //   element2.submit();
	    
//	    WebDriver driver = new ChromeDriver();
//	    driver.navigate().to("https://www.facebook.com");
//	    String ActualTitle = driver.getTitle();
//	    String ExpectedTitle = "Facebook - Masuk atau Daftar";
//	    Assert.assertEquals(ExpectedTitle, ActualTitle);
//	    Assert.assertNotEquals(ExpectedTitle, ActualTitle);
//	    Assert.assertNull(ExpectedTitle);
//	    Assert.assertNotNull(ExpectedTitle);
//	    Assert.assertTrue("Facebook".equals("Facebook"), "First soft assert failed");
//	    Assert.assertFalse("Facebook".equals("Facebook"), "Second soft assert failed");
//	    driver.quit();
	    
//	    WebDriver driver = new ChromeDriver();
//	    SoftAssert softAssert = new SoftAssert();
//	    driver.navigate().to("https://www.facebook.com");
//	    String getActualTitle = driver.getTitle();
//	    Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Facebook - Masuk atau Daftar");
//	    softAssert.assertEquals(getActualTitle, "Facebook - Masuk atau Daftar");
//	    softAssert.assertNotEquals(getActualTitle, "Facebook - Masuk atau Daftar");
//	    softAssert.assertNull(verifyTitle);
//	    softAssert.assertNotNull(verifyTitle);
//	    softAssert.assertTrue("Facebook".equals("Facebook"), "First soft assert failed");
//	    softAssert.assertFalse("Facebook".equals("Facebook"), "Second soft assert failed");
//	    softAssert.assertAll();
	    HashMap<String, Object> map = new HashMap<String, Object>();
	    map.put("profile.default_content_setting_values.notifications", 2);
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("prefs", map);
	    WebDriver driver = new ChromeDriver(options);
	    //driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //masuk ke halaman login
	    driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "OrangeHRM";
	    Assert.assertEquals(expectedTitle, actualTitle); //niatnya cuma buat nyari judul yang bener bu
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
	    
	    actualTitle = driver.getTitle();
	    expectedTitle = "Dashboard";
	    Assert.assertTrue(expectedTitle.equals(actualTitle), "First hard assert after login failed");
	    Assert.assertFalse(!expectedTitle.equals(actualTitle), "Second hard assert after login failed");
	    //driver.quit();
	    
	    //logout
	    driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/logout");
	    actualTitle = driver.getTitle();
	    expectedTitle = "OrangeHRM";
	    Assert.assertTrue(expectedTitle.equals(actualTitle), "First hard assert after logout failed");
	    Assert.assertFalse(!expectedTitle.equals(actualTitle), "Second hard assert after logout failed");
	  }

	  }



