package Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Locators_Actions extends Pages
{
	public Locators_Actions(WebDriver driver)
	{
		super(driver);
	}

	@FindBys({
			@FindBy(id = "nav-link-accountList-nav-line-1"),
			@FindBy(css = "hm-icon-label"),
			@FindBy(xpath = "//a[@id='nav-link-accountList']/span")
	})
	WebElement SignIn_ToolTip;
	@FindBy(xpath = "//div[@id='nav-signin-tooltip']/a/span")
	WebElement Sign_in;
	@FindBy(id = "ap_email")
	WebElement Email;
	@FindBy(id = "ap_password")
	WebElement Password;
	@FindBy(id = "signInSubmit")
	WebElement SubmitButton;
	@FindBys({
			@FindBy(id = "nav-hamburger-menu"),
			@FindBy(css = "hm-icon-label"),
			@FindBy(xpath = "//a[@id='nav-hamburger-menu']/i")
	})
	WebElement AllButton;
	@FindBy(xpath =("//div[@id='hmenu-content']/ul/li[14]/a/div"))
	WebElement SeeAll;
	@FindBy(css=".hmenu-compress-section > li:nth-child(11) div")
	WebElement VideoGames;
	@FindBy(className="All Video Games")
	WebElement AllVideoGames;
	@FindBy(css =".a-section:nth-child(2) > .a-unordered-list .a-icon")
	WebElement FreeShippingBox;
	@FindBy(css ="#p_n_condition-type\\/28071525031 .a-size-base")
	WebElement ConditionNew;

	public void Login(String MailField , String PasswordField)
	{
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		{
			clickButton(SignIn_ToolTip);
			clickButton(Sign_in);
			setTextElementText(Email, MailField);
			setTextElementText(Password, PasswordField);
			clickButton(SubmitButton);
			clickButton(AllButton);
			clickButton(SeeAll);
			clickButton(VideoGames);
			clickButton(AllVideoGames);
			clickButton(FreeShippingBox);
			clickButton(ConditionNew);
		}
	}
}


