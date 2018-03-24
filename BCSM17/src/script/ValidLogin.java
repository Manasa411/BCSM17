package script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.Loginpage;

public class ValidLogin extends BaseTest
{
private WebDriver driver;

@Test(priority=1,groups= {"smoke","login"})

public void testvalidLogin()
{
String un= XL.getcellvalue("./data/input.xlsx", "sheet1", 1, 0);

System.out.println(un);

String pw= XL.getcellvalue("./data/input.xlsx", "sheet1", 1, 1);

System.out.println(pw);

@SuppressWarnings("unused")

String etitle= XL.getcellvalue("./data/input.xlsx", "sheet1", 1, 2);

Loginpage l= new Loginpage(driver);

l.setusername(un);

l.setpassword(pw);

l.clickloginBTN();


//l.verifyErrmsgIsDisplayed(driver);






}
}
