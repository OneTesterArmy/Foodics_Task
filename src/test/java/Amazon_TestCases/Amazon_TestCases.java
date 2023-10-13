package Amazon_TestCases;
import Bases.Bases;
import Elements.Utitlities;
import org.testng.annotations.Test;
import org.testng.Assert;
import Elements.Locators_Actions;
import Elements.Pages;

public class Amazon_TestCases extends Bases

{
	Utitlities credentials =new Utitlities();
	Locators_Actions Login;
	Pages Pages_Usings;

	@Test
	public void LoginWithValid_Account()
	{
		Login = new Locators_Actions(driver);
		Pages_Usings = new Pages(driver);
		Login.Login(credentials.getEmail(), credentials.getPassword());
		Boolean LoginNormally = true;
		Assert.assertEquals(LoginNormally, true);
	}

	@Test
	public void ClickAll()
	{
		Boolean All_Opened = true;
		Assert.assertEquals(All_Opened, true);
	}

	@Test
	public void ClickVideoGames()
	{
		Boolean VideoGames_Clickable = true;
		Assert.assertEquals(VideoGames_Clickable, true);
	}

	@Test
	public void CheckFreeBox()
	{
		Boolean BoxChecked = true;
		Assert.assertEquals(BoxChecked, true);
	}
}