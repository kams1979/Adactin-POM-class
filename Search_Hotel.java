package pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	
	public WebDriver driver;
	public Search_Hotel (WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
   
	@FindBy(id = "location")
	private WebElement Location;

	public WebElement getLocation() {
		return Location;
	}
	
    @FindBy(name = "hotels")
	private WebElement Hotels;

	public WebElement getHotels() {
		return Hotels;
	}
	
	@FindBy(id = "room_type")
	private WebElement Roomtype;

	public WebElement getRoomtype() {
		return Roomtype;
	}
	
	@FindBy(id = "room_nos")
	private WebElement NumberofRooms;

	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}
	
	@FindBy(name = "datepick_in")
	private WebElement CheckinDate;

	public WebElement getCheckinDate() {
		return CheckinDate;
	}
	
	@FindBy(name = "datepick_out")
	private WebElement CheckoutDate;

	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}
	
	@FindBy(name = "adult_room")
	private WebElement Adultperroom;

	public WebElement getAdultperroom() {
		return Adultperroom;
	}
	
	@FindBy(name = "child_room")
	private WebElement Childperroom;

	public WebElement getChildperroom() {
		return Childperroom;
	}
	
	@FindBy(id = "Submit")
    private WebElement Search;

	public WebElement getSearch() {
		return Search;
	}
	
	
}
