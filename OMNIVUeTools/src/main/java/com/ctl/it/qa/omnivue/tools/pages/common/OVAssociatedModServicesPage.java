package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVAssociatedModServicesPage extends OmniVuePage {
	
	//@FindBy(xpath="//div[text()='77/L1XX/785391//CTQF']/parent::div/preceding-sibling::div//input")
	//public WebElementFacade devicelookup_link;
	
	//@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/ul/li[2]/a/tab-heading/i[@title='Refresh']")
	//public WebElementFacade refresh_btn;
	
	//@FindBy(xpath="//div[text()='77/L1XX/785391//CTQF']")
	//public WebElementFacade before_servicename;
	
	//@FindBy(xpath="//div[text()='77/L1XX/785391//ABCD']")
	//public WebElementFacade after_servicename;

	@FindBy(xpath="//div[text()='77/L1XX/785391//ABCD']/parent::div/preceding-sibling::div//input")
	public WebElementFacade lnk_deviceLookup;
	
	//@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[15]/div[1]/div/span/input[@value='Edit']")
	//public WebElementFacade NewserviceEditbtn;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return lnk_deviceLookup;
	}
	
	public void click_devicelookup() throws Exception {
		jsClick(lnk_deviceLookup);
		Thread.sleep(15000);		
	}
	
	//public void click_Newdevicelookup() throws Exception {
	//	Newdevicelookup_link);
	//	Thread.sleep(15000);		
	//}
	
	//public void click_refreshbtn() throws Exception {
	//	refresh_btn);
	//	Thread.sleep(30000);
	//}
	
	//public String verify_after_servicename() {
	//	String servicenameval = after_servicename.getText();
		//return servicenameval;
	//}
	
	//public String verify_before_servicename() throws Exception {
	//	Thread.sleep(10000);
	//	String servicenameval = before_servicename.getText();
	//	return servicenameval;
	//}
	
	//public void Revertbck_name() throws Exception{
		//Newservicelookup_link);
		//Thread.sleep(20000);
	//	NewserviceEditbtn);
	//	Thread.sleep(5000);
	//}

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
