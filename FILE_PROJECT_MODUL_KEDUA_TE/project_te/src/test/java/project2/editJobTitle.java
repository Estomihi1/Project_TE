package project2;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class editJobTitle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    //login otomatis sebagai admin
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//masuk ke halaman edit job title pada id = 27 (optional)
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/saveJobTitle?jobTitleId=27");
		//klik job edit
		driver.findElement(By.id("btnSave")).click();
		//edit job title
		driver.findElement(By.id("jobTitle_jobTitle")).clear();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Doge Astronout");
		//edit job description
		driver.findElement(By.id("jobTitle_jobDescription")).clear();
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Doge mendatangi bulan");
		//edit file job spesifikasi
		WebElement file = driver.findElement(By.xpath("//*[@id = 'jobTitle_jobSpec']"));
	    file.clear();
	    file.sendKeys("D:\\dogewow.jpg");
	    //edit job note
		driver.findElement(By.id("jobTitle_note")).clear();
		driver.findElement(By.id("jobTitle_note")).sendKeys("Doge WOW Banget!");
		//klik job save
		driver.findElement(By.id("btnSave")).click();
	}
}
