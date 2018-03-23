package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoconst
{
public WebDriver driver;
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
@Parameters({"browser"})

@BeforeMethod(alwaysRun=true)

public void openApp(String browser)
{
if(browser.equals("chrome"))
{

	driver=new ChromeDriver();
}
else
{
	driver=new FirefoxDriver();
}
	String strITO = AL.getproperty("./data/settings.properties", "ITO");
	
	long ITO=Long.parseLong(strITO);
	
	
	driver.manage().timeouts().implicitlyWait(ITO ,TimeUnit.SECONDS);
}

@AfterMethod(alwaysRun=true)

public void closeApp(ITestResult res)
{
	String name = res.getName();
	
	int status= res.getStatus();
	
	if(status==2)
	{
		String imgpath =AL.getphoto(driver, "./photo.png",name);
		
	Reporter.log("imagepath:"+imgpath ,true);
	
	
	}
	driver.quit();
}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


