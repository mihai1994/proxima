package Test.Meinfoto;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class general {

	protected WebDriver driver;
	protected Logger log = Logger.getLogger(general.class);

	@BeforeTest
	public void beforeT() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Driver\\chromedriver.exe");
		
		System.out.println("Select browser 'CC' for Chrome or 'FF' for FireFox");//
		Scanner input = new Scanner(System.in); //sa intorducem date de la tastatura
		String select = input.nextLine();
		
		if(select.equals("CC")) {
		driver = new ChromeDriver();
		log.info("Chrome Browser has been open");
		System.out.println("Chrome Browser has been open");
				
		}
		if(select.equals("FF")) {
		driver = new FirefoxDriver();
		log.info("Has been opened");
		System.out.println(driver.getClass().getSimpleName() + "Has been opened");  //Ne va ce driver  fost deschs
		}
		
		driver.manage().window().maximize();
		log.info("Web page is maximize");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //cautarea elementelor pe brawser
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(70, TimeUnit.SECONDS); //timpul de incarcare a scriptului
	}
	
	@Test
	
	@AfterTest
	public void endT() throws Exception {
		screens();
		//driver.quit();
		
	}
	
	public void screens() throws Exception{
		
		File srcm = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\mihai\\Desktop\\Screenshot1\\";
		FileUtils.copyFile(srcm, new File(path + time() + driver.getPageSource().getClass() + " " +this.getClass().getSimpleName() + "png"));
	}
	public String time() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	
	}
}
