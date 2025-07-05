import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static com.Skillio.base.LocatorType.*;
import static com.Skillio.base.Keyword.*;

public class HomePageTests /* extends TestBase */{
	
	@Test
	public static void verifyOneStopFilterForFlight() throws InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com");
	//	Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.icClose")).click();
		
		driver.findElement(By.cssSelector("p.erPfRs")).click();
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul#autoSuggest-list>li:nth-child(1)")).click();
		
		//to
		driver.findElement(By.cssSelector("div.OmQvV")).click();
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul#autoSuggest-list>li[tabindex=\"0\"]")).click();
		
		driver.findElement(By.cssSelector("div.iiZOql div:nth-child(3)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.DayPicker-Month:nth-child(2) div.DayPicker-Week:nth-child(5) div.DayPicker-Day:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.ezNmSh")).click();
		//click on got it
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[data-testid=\"coachmark-overlay-button\"]")).click();
		Thread.sleep(2000);
		driver.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.filterWrapper:nth-child(2)>div.filtersOuter:nth-child(1)>div>div.makeFlex:nth-child(3) p.checkboxTitle")).click();
		Thread.sleep(2000);
		List<WebElement> stopInfoList =driver.findElements(By.cssSelector("div.stop-info p.flightsLayoverInfo"));
		SoftAssert softly=new SoftAssert();
		for(WebElement stopInfo : stopInfoList) {
			System.out.println(stopInfo);
			softly.assertTrue(stopInfo.getText().contains("1 stop"));
		}
		softly.assertAll();
	}
	
	@Test
	  public void verifyOneFilterForFlightsUsingKeywords() { 
	  launchurl(null);
	  clickOnElements(CSSSELECTOR,"span.icClose");
	  clickOnElements(CSSSELECTOR,"p.erPfRs"); 
	  enterText(CSSSELECTOR,"input[type=\"text\"]","\"Mumbai\"");
	  }
	 
}
