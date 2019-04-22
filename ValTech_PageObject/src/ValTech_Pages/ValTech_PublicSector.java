package ValTech_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ValTech_PublicSector {

	WebDriver driver;

	public ValTech_PublicSector(WebDriver driver) {
		this.driver = driver;

	}

	By btnpubSector = By.xpath("//div[@class='site-nav__main__items active']//div[2]//a[1]");
	By UKpubSector = By.xpath("//h1[@class='teaser-block__header__title']");
	By projectCases = By.xpath("//h3[@class='teaser-block__teaser__title']");

	public void CountProjectCasesAndOrder() throws InterruptedException

	{
		driver.findElement(btnpubSector).click();
		Thread.sleep(10000L);
		WebElement element = driver.findElement(UKpubSector);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();

		// div[@class='site-nav__main__it
		Thread.sleep(30000L);
		List<WebElement> str = driver.findElements(projectCases);
		System.out.println("How many Project case studies are listed ->" + str.size());

		String[] CasesNames = new String[str.size()];

		for (int i = 0; i < str.size(); i++)

		{
			CasesNames[i] = str.get(i).getText();

		}

		if ((CasesNames.length < 4) && (CasesNames[0].equalsIgnoreCase("Transport for Greater Manchester"))
				&& (CasesNames[1].equalsIgnoreCase("DVLA"))
				&& (CasesNames[2].equalsIgnoreCase("Department for Work and Pensions"))) {

			for (int k = 0; k < CasesNames.length; k++)

			{
				System.out.println(CasesNames[k]);

			}
		}
	}

}
