package ValTech_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ValTech_Pages.ValTech_HomePage;
import ValTech_Pages.ValTech_Office;
import ValTech_Pages.ValTech_Partner;
import ValTech_Pages.ValTech_PublicSector;

//h1[@class='teaser-block__header__title']

public class ValTech_Exercise3_b {
	@Test
	public void Exc4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell User\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		ValTech_Office off = new ValTech_Office(driver);
		driver.get("https://www.valtech.com/en-gb/about/contact-us/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Exercise3B->Validate Valtech offices in total");
		off.NumberofOffices();

	}
}
