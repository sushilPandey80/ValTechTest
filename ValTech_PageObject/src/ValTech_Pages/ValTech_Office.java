package ValTech_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValTech_Office {

	WebDriver driver;

	public ValTech_Office(WebDriver driver) {
		this.driver = driver;

	}
	By numofOfficesxpath = By.xpath("//h6[@class='next-block__subtitle slide-fade-in played']");

	public void NumberofOffices()

	{
		String NumberofOfficestext = driver.findElement(numofOfficesxpath).getText();
		System.out.println("Number of offices");
		for (int i = 0; i < NumberofOfficestext.length(); i++) {
			if (Character.isDigit(NumberofOfficestext.charAt(i))) {
				System.out.print(NumberofOfficestext.charAt(i));
			}
		}
		System.out.println(" ");
	}
}
