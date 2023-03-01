package pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
public WebDriver driver;
	
	public Booked_Itinerary (WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
    
	@FindBy(id = "check_all")
	private WebElement Orderid;

	public WebElement getOrderid() {
		return Orderid;
	}
	
	@FindBy(name = "cancelall")
	private WebElement cancelSelected;

	public WebElement getCancelSelected() {
		return cancelSelected;
	}
	
	@FindBy(id = "logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}
}
