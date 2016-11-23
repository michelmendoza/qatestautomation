package crossknowledge;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExecutarTest {
  private WebDriver driver;
  private String baseUrl;

  
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {

	System.setProperty("webdriver.gecko.driver", "libs\\webdriver\\FireFoxDriver\\geckodriver.exe");
		
	  driver = new FirefoxDriver();
    baseUrl = "https://safari2-provider.staging.na.crossknowledge.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(baseUrl);
	 
	
  }

  @Test
  public void T02AbrirVideoExec() throws Exception {
		// Chamada para os testes
		 System.out.println("Starting Script T001 Abrir Video" );	
		 T01_AbrirVideo.tstAbrirVideo(driver); 
  }
 
  
 
 

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
