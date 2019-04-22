package ValTech_Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ValTech_HomePage {
	WebDriver driver;
	
	public ValTech_HomePage(WebDriver driver) {
		this.driver = driver;

	}

	// By btnMainhomepage=By.xpath("//div[@class='site-nav__icons']");
	By btnMainhomepage = By.xpath("//button[@class='icon-menu']");
	By btnWork = By.xpath("//button[contains(text(),'Work')]");
	By btnPublicSector = By.xpath("//button[contains(text(),'Public Sector')]");
	By btnUKPublicSector = By.xpath("//a[contains(text(),'UK Public Sector')]");
	By btnServices = By.xpath("//button[contains(text(),'Services')]");
	By btnCareer = By.xpath("//button[contains(text(),'Career')]");
	By btnInsights = By.xpath("//button[contains(text(),'Insights')]");
	By btnPartners = By.xpath("//button[contains(text(),'Partners')]");

	public void clickHomebuttun() {
		driver.findElement(By.xpath("//a[@class='btn btn--hollow']")).click();
		driver.findElement(btnMainhomepage).click();

	}

	public void isDisplayedButtonWork() {
		if (driver.findElement(btnWork).isDisplayed()) {
			System.out.println("Work Link is displayed");
		} else {
			System.out.println("Work Link is not  displayed");
		}
	}

	public void isDisplayedbtnPublicSector() {
		if (driver.findElement(btnPublicSector).isDisplayed()) {
			System.out.println("PublicSector Link is displayed");
		} else {
			System.out.println("PublicSector Link is not  displayed");
		}
	}

	public void isDisplayedbtnServices() {
		if (driver.findElement(btnServices).isDisplayed()) {
			System.out.println("Services Link is displayed");
		} else {
			System.out.println("Services Link is not  displayed");
		}
	}

	public void isDisplayedbtnCareer() {
		if (driver.findElement(btnCareer).isDisplayed()) {
			System.out.println("Career Link is displayed");
		} else {
			System.out.println("Career Link is not  displayed");
		}
	}

	public void isDisplayedbtnbtnInsights() {
		if (driver.findElement(btnInsights).isDisplayed()) {
			System.out.println("Insights Link is displayed");
		} else {
			System.out.println("Insights Link is not  displayed");
		}
	}

	public void isDisplayedbtnbtnPartnersbtnPartners() {
		if (driver.findElement(btnPartners).isDisplayed()) {
			System.out.println("Partners Link is displayed");
		} else {
			System.out.println("Partners Link is not  displayed");
		}
	}

	public void clickPublicSector() {
		driver.findElement(btnPublicSector).click();
		if (driver.findElement(btnUKPublicSector).isDisplayed()) {
			System.out.println("UK public Sector is displyed");
		} else {
			System.out.println("UK public Sector is not displyed");
		}

	}

	
}
