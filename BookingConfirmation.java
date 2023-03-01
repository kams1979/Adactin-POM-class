package pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
public WebDriver driver;
	
	public BookingConfirmation (WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "my_itinerary")
	private WebElement MyItinerary;

	public WebElement getMyItinerary() {
		return MyItinerary;
	}
	

}
