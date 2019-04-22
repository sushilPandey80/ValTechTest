package ValTech_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ValTech_Pages.ValTech_HomePage;
import ValTech_Pages.ValTech_Partner;
import ValTech_Pages.ValTech_PublicSector;

//h1[@class='teaser-block__header__title']

public class ValTech_Exercise3_a {
	@Test
	public void MainHomeButton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell User\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ValTech_Partner partner = new ValTech_Partner(driver);
		driver.get("https://www.valtech.com/en-gb/partners/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Exercise3A->Validate Adode is the 2nd in the partner list a.2 CommerceTools is last in the partner list");
		partner.clickCookesbuton();
		partner.verifyAdoveIs2ndPosition();
		partner.verifyCommerceToolsIsLastPosition();
	}
}
