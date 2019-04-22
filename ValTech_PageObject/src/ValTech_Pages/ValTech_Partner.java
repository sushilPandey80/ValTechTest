package ValTech_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ValTech_Partner {
	WebDriver driver;
	
	public ValTech_Partner(WebDriver driver) {
		this.driver = driver;

	}

	By acceptCookies = By.xpath("//a[@class='btn btn--hollow']");
	By adovexpath=By.cssSelector(".logo-block__list.direction-reveal>a:nth-child(2)");
	By commercetoolsxpath=By.cssSelector(".logo-block__list.direction-reveal>a:nth-child(8)");
	String AdoveHrefValue="414faf17996d4d82babbb3ee8b04cb57.aspx?epslanguage=en-GB";
	String CommerceHrefValue="c95e6b8579f14c0f85f8250a4c72a60c.aspx?epslanguage=en-GB";
	
	public void  clickCookesbuton() throws InterruptedException
	{
		
		driver.findElement(acceptCookies).click();
		Thread.sleep(10);
		WebElement element1 = driver.findElement(By.xpath("//div[@class='text-block__container']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.perform();
	}
	
	public void verifyAdoveIs2ndPosition()
	{
		String AdoveHrefValue=driver.findElement(adovexpath).getAttribute("href");
		if(AdoveHrefValue.contains(AdoveHrefValue))
		{
			System.out.println("Adove is displayed on 2nd position");
		}
		else
		{
			System.out.println("Adove is not  displayed on 2nd position");
		}
		
	}
	public void verifyCommerceToolsIsLastPosition()
	{
		
		
		String CommercerefValue=driver.findElement(commercetoolsxpath).getAttribute("href");
		if(CommercerefValue.contains(CommerceHrefValue))
		{
			System.out.println("CommerceTools is displayed on last position");
		}
		else
		{
			System.out.println("CommerceTools is displayed on last position");
		}
		
	}
	
}
