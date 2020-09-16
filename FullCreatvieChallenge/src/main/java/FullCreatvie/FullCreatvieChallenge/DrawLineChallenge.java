package FullCreatvie.FullCreatvieChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class DrawLineChallenge 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://www.htmlcanvasstudio.com");
		
		driver.findElement(By.xpath("//*[@id='editor']/div[1]/input[2]")).click();
		
		WebElement canvasElement = driver.findElement(By.id("imageTemp"));
		Actions Event = new Actions(driver);
		
		Actions builder = new Actions(driver);
        /*builder.moveToElement(canvasElement).perform();
        builder.clickAndHold(canvasElement).perform();
        builder.moveByOffset(150, 50).perform();
        builder.moveToElement(canvasElement).perform();
        builder.clickAndHold(canvasElement).perform();
        builder.moveByOffset(100, 50).perform();
        builder.moveToElement(canvasElement).perform();
        builder.click(canvasElement);
		
   
        builder.moveToElement(canvasElement).perform();
        builder.clickAndHold(canvasElement).perform();
        builder.moveByOffset(20, 150).perform();
        builder.moveToElement(canvasElement).perform();
        builder.clickAndHold(canvasElement).perform();
        builder.moveByOffset(10, 150).perform();
        builder.moveToElement(canvasElement).perform();
        builder.click(canvasElement);*/
	
        Action horizontal= builder.contextClick(canvasElement)                       
                .clickAndHold()
                .moveToElement(canvasElement,20,-50)
                .moveByOffset(50, 50)
                .moveByOffset(80,-50)
                .moveByOffset(100,50)
                .release(canvasElement)
                 .build();                       
        horizontal.perform();
         
         
         Action vertical= builder.contextClick(canvasElement)                       
                 .clickAndHold()
                 .moveToElement(canvasElement,-50,20)
                 .moveByOffset(50, 50)
                 .moveByOffset(-50,80)
                 .moveByOffset(50,10)
                 .release(canvasElement)
                  .build();                       
         vertical.perform();
		
	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());

    }
}
