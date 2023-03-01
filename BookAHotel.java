package pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	
	public WebDriver driver;
	
	public BookAHotel(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "first_name")
	private WebElement Fname;

	public WebElement getName() {
		return Fname;
	}
	
	@FindBy(name = "last_name")
	private WebElement Lname;

	public WebElement getLname() {
		return Lname;
	}
	
	@FindBy(name = "address")
	private WebElement BillingAddress;

	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	
	@FindBy(name = "cc_num")
	private WebElement CreditCardNo;

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}
	
	@FindBy(name = "cc_type")
	private WebElement CreditType;

	public WebElement getCreditType() {
		return CreditType;
	}
	@FindBy(name = "cc_exp_month")
	private WebElement ExpDateMonth;

	public WebElement getExpDate() {
		return ExpDateMonth;
	}
	
	@FindBy(name = "cc_exp_year")
	private WebElement ExpYear;

	public WebElement getExpYear() {
		return ExpYear;
	}
	
	@FindBy(name = "cc_cvv")
	private WebElement CVVNo;

	public WebElement getCVVNo() {
		return CVVNo;
	}
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement BookNow;

	public WebElement getBookNow() {
		return BookNow;
	}
	

}
 