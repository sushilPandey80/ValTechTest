package ValTech_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ValTech_Pages.ValTech_HomePage;
import ValTech_Pages.ValTech_PublicSector;

//h1[@class='teaser-block__header__title']

public class ValTech_Exercise2_a_b {
	@Test
	public void MainHomeButton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell User\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.valtech.com/en-gb");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		ValTech_HomePage vHomePage = new ValTech_HomePage(driver);
		ValTech_PublicSector publicSector = new ValTech_PublicSector(driver);
		System.out.println(" Exercise2(a):  Verify following links are displayed-> Work, Public Sector, Services, Career, Insights");
		vHomePage.clickHomebuttun();
		vHomePage.isDisplayedButtonWork(); 
		vHomePage.isDisplayedbtnPublicSector();
		vHomePage.isDisplayedbtnServices();
		vHomePage.isDisplayedbtnCareer();
		vHomePage.isDisplayedbtnbtnInsights();
		vHomePage.isDisplayedbtnbtnPartnersbtnPartners();
		vHomePage.clickPublicSector();
		System.out.println(" Exercise2(b): many Project case studies are listed b.2 The project case studies are in the order of CSHR,TFGM,DVLA,DWP");
		publicSector.CountProjectCasesAndOrder();
	}
}
