package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVModDeviceLookupPage extends OmniVuePage {
	
	//private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[15]/div[1]/div/span/input[@value='Edit']")
	public WebElementFacade btn_editInDeviceLookup;
	

	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_editInDeviceLookup;
		//return null;
	}
	
	public void click_devicelookupeditbtn() throws Exception {
		jsClick(btn_editInDeviceLookup);
		Thread.sleep(5000);
	}
	
	public void jsClick(WebElement element) {
		try {
			
			JavascriptExecutor executor = (JavascriptExecutor) getDriver();
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("unable to click by java script");
			element.click();
		}

	}

}
