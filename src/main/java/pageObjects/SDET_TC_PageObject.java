package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class SDET_TC_PageObject extends Base {
	

	public SDET_TC_PageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
	private WebElement TabletsWebelement;
    
	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")
	private WebElement SamsungGalaxyTabWebelement;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"button-cart\"]")
	private WebElement AddtoCartWebelement;
	
	
  public void Tablets() {
	  
	  try {
		  TabletsWebelement.click();
      
        } catch (ElementNotInteractableException e) {

        	TabletsWebelement.sendKeys(Keys.ENTER);
     }
	  
  }
  
 public void SamsungGalaxyTab() {
	  
	  try {
		  SamsungGalaxyTabWebelement.click();
	  
        } catch (ElementNotInteractableException e) {

        	SamsungGalaxyTabWebelement.sendKeys(Keys.ENTER);
        	
        }
 }
        

 public void AddtoCart() {
	  
	  try {
		  AddtoCartWebelement.click();
	  

     
       } catch (ElementNotInteractableException e) {

    	   AddtoCartWebelement.sendKeys(Keys.ENTER);
       }
	  
 }

 
}


        
     
     