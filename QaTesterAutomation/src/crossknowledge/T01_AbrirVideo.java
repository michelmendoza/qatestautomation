package crossknowledge;


import org.openqa.selenium.*;

public class T01_AbrirVideo {


 
  public static void tstAbrirVideo(WebDriver driver) throws Exception {
    
    // TestScript
	    //driver.get(baseUrl + "/interfaces/login.php");
	   
	    driver.findElement(By.id("fldPassword")).clear();
	    driver.findElement(By.id("fldPassword")).sendKeys("qabrtestautomator");
	    driver.findElement(By.id("fldUserName")).clear();
	    driver.findElement(By.id("fldUserName")).sendKeys("qabrtestautomator");
	    driver.findElement(By.name("submitButtonName")).click();
	    Thread.sleep(1000);
	    
	    //Navegação
	    driver.findElement(By.id("tab_home")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("CrossKnowledge Leaders Videocasts")).click();
	   
	    
	    //Click no Video
	    Thread.sleep(1000);
	    driver.findElement(By.id("ext-gen1073")).click();
	    System.out.println("Select Video");
	    
	    //Assistindo
	    System.out.println("Watching");
	    Thread.sleep(20000);  	    
	    
	    
	    //Stop
 

	    WebElement video = driver.findElement(By.xpath("//video")); 

	    video.click(); 
	    System.out.println("StopVideo");
	    Thread.sleep(2000);
	
 
	    

 
	    
	   //Fechar
	   System.out.println("ClosingTest");
	   driver.findElement(By.cssSelector("i.fa.fa-caret-down")).click();
	   driver.findElement(By.linkText("Log out")).click();
   
     driver.close();
  }
  
  }
 
