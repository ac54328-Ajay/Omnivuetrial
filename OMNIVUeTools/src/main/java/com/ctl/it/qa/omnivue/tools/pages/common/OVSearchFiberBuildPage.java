package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
 
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchFiberBuildPage extends OmniVuePage {
	
//	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	@FindBy(xpath = "(.//div[@class='tab-pane ng-scope active']//button[text()='View Connectivity'])[1]")
	 public WebElementFacade btn_SerachFB_viewconnectivity;
	
	
	public void verify_validation(String validation) throws Throwable {		
		//String Messag=null;
		switch(validation){
		case "search functionality of Fiber Build from Search slider":
			waitForElement(btn_SerachFB_viewconnectivity);
			
			
			break;
		
		
		}
		
	}
	
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}

}
