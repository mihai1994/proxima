package Test.Meinfoto;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Canvas extends general {
	String FirstName = "TEST";
	String LastName = "TEST";
	String Email = "mihaikik@mail.ru";
	String Adress = "TEST 24";
	String City = "TEST";
//	@Test(priority=1)
//	public void uload1() throws Exception {
//				driver.get("https://www.meinfoto.de/foto-in-gross/foto-auf-leinwand.jsf");
//		WebElement UploadImg = driver.findElement(By.xpath("//div[@class='info']//input[@class='js-du-file fileinput']"));
//		UploadImg.sendKeys("C:\\Users\\mihai\\Desktop\\Image\\GIF.gif");
//		driver.findElement(By.xpath("//div[@id='itemConfiguratorForm:frames']//div[2]//div[1]//label[1]")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//body[@class='ConfiguratorTemplate']/form[@id='itemConfiguratorForm']/section[@class='checkout-step-2 checkout-section -"
//				+ "alternative background-container']/div[@id='itemConfiguratorForm:formats']/div[@id='itemConfiguratorForm:formatsSection']/table[@class='table"
//				+ " -striped -centered -selection format-table']/tbody/tr[7]/td[1]/div[1]")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.id("UploadFileDesktop")).click();
//		
//		
//	}
//	
//	@Test(priority=2)
//	public void uload2() throws Exception {
//				driver.get("https://www.meinfoto.de/foto-auf-heimtextilien/foto-decke.jsf");
//		WebElement UploadImg = driver.findElement(By.xpath("//div[@class='info']//input[@class='js-du-file fileinput']"));
//		UploadImg.sendKeys("C:\\Users\\mihai\\Desktop\\Image\\GIF.gif");
//		driver.findElement(By.xpath("//body[@class='ConfiguratorTemplate']/form[@id='itemConfiguratorForm']/section"
//				+ "[@class='checkout-step-2 checkout-section -alternative background-container']/div[@id='itemConfiguratorForm:formats']"
//				+ "/div[@id='itemConfiguratorForm:formatsSection']/table[@class='table -striped -centered -selection format-table']/tbody/tr[3]/td[1]/div[1]")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.id("UploadFileDesktop")).click();
//	}
//		@Test(priority=3)
//		public void uload3() throws Exception {
//					driver.get("https://www.meinfoto.de/foto-in-gross/foto-hinter-acrylglas.jsf");
//			WebElement UploadImg = driver.findElement(By.xpath("//div[@class='upload-button']//input[@class='js-du-file fileinput']"));
//			UploadImg.sendKeys("C:\\Users\\mihai\\Desktop\\Image\\GIF.gif");
//			driver.findElement(By.xpath("//div[@id='itemConfiguratorForm:detailSpecific']//div[2]//div[1]//label[1]")).click();
//			Thread.sleep(1500);
//			driver.findElement(By.xpath("//body[@class='ConfiguratorTemplate']/form[@id='itemConfiguratorForm']/section[@class='"
//					+ "checkout-step-2 checkout-section -alternative background-container']/div[@id='itemConfiguratorForm:formats']"
//					+ "/div[@id='itemConfiguratorForm:formatsSection']/table[@class='table -striped -centered -selection format-table']/tbody/tr[2]/td[1]/div[1]")).click();
//			Thread.sleep(1500);
//			driver.findElement(By.id("UploadFileDesktop")).click();
//		
//	}
		
		@Test(priority=4)
		public void uload4() throws Exception{
			driver.get("https://www.meinfoto.de/foto-auf-heimtextilien/foto-kissen.jsf");
			WebElement UploadImg = driver.findElement(By.xpath("//div[@class='btnmlkissen']//input[@class='js-du-file fileinput']"));
			UploadImg.sendKeys("C:\\Users\\mihai\\Desktop\\Image\\GIF.gif");
			driver.findElement(By.xpath("//body[@class='ConfiguratorTemplate']/form[@id='itemConfiguratorForm']/section[@class='checkout-step-2"
					+ " checkout-section -alternative background-container']/div[@id='itemConfiguratorForm:formats']/div[@id='itemConfiguratorForm:formatsSection']"
					+ "/table[@class='table -striped -centered -selection format-table']/tbody/tr[2]/td[1]/div[1]")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("UploadFileDesktop")).click();
			Thread.sleep(1500);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1500);
			WebElement UploadImg1 = driver.findElement(By.xpath("//div[@class='btnmrkissen']//input[@class='js-du-file fileinput']"));
			UploadImg1.sendKeys("C:\\Users\\mihai\\Desktop\\Image\\GIF.gif");
			driver.findElement(By.id("UploadFileDesktop")).click();
			
			if(driver.getPageSource().contains("ODER")) {
				System.out.println("Test PASS"); }
					 
			else if(driver.getPageSource().contains("ODER")) 	 {
				
				System.out.println("Test PASS"); 
			}
			
			else { File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //Screenshot
			FileUtils.copyFile(scrFile, new File("C:\\Users\\mihai\\Desktop\\Screenshot1\\simpleconfig.png"));
			log.info("Check has been cheked");
				
			}		
	
}}
