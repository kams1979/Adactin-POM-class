package pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	public Select_Hotel (WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "radiobutton_0")
	private WebElement select;

	public WebElement getSelect() {
		return select;
	}
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}

}
