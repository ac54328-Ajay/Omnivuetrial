package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

public class OVCreateSubscriberPage extends OmniVuePage {
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
 //********************************Create Subcriber********************************************//	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
	public List<WebElementFacade> lbl_allXapath;
	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
	public WebElementFacade tab_currentlydisplayed;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='createSubscriber();']")
	public WebElementFacade btn_SubscriberCreate;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@value='Reset']")
	public WebElementFacade btn_SubscriberReset;
	
	//#########################  Create Subscriber create form fields ##############################//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='subscriberName']")
	public WebElementFacade tbx_Subscriber_Create_subscribername;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='accountIdentifier']")
	public WebElementFacade ddl_Subscriber_Create_identierid;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='subscriberType']")
	public WebElementFacade ddl_Subscriber_Create_subscribertype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='subscriberSubType']")
	public WebElementFacade ddl_Subscriber_Create_subscribersubtype;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='legacyNetwork']")
	public WebElementFacade ddl_Subscriber_Create_legacyntwk;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//textarea[@id='subscriberNote']")
	public WebElementFacade tbx_Subscriber_Create_subscribernotes;
	
	
	//############################################################################################//

	
	public void Sanity_SubscriberCreate_validations() throws Throwable{
		waitForElement(btn_SubscriberCreate);Thread.sleep(3000);
		
		slf4jLogger.info("Create Subscriber Validations");
		
		if(!tab_currentlydisplayed.isCurrentlyVisible()){
			throw new Error("Create form is not displayed");
		}
		if(!btn_SubscriberCreate.isCurrentlyVisible()){
			throw new Error("Create button is not displayed");
		}
		if(!btn_SubscriberReset.isCurrentlyVisible()){
			throw new Error("Reset button is not displayed");
		}
		List<WebElementFacade> Subscriber_create_attribute = lbl_allXapath;
		
		ArrayList<String> Subscribercreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<Subscriber_create_attribute.size();j++){
				Subscribercreate_Fieldattributelist.add(j, Subscriber_create_attribute.get(j).getText());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> List2compare_Subscriber_Fieldattributelist=new ArrayList<String>();
		
		slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
		
		List2compare_Subscriber_Fieldattributelist.add(0, "Subscriber Full Name *");
		List2compare_Subscriber_Fieldattributelist.add(1, "Enterprise Account ID");
		List2compare_Subscriber_Fieldattributelist.add(2, "Account Identifier ID *");
		List2compare_Subscriber_Fieldattributelist.add(3, "Subscriber Type *");
		List2compare_Subscriber_Fieldattributelist.add(4, "Subscriber Sub-Type *");
		List2compare_Subscriber_Fieldattributelist.add(5, "MCN");
		List2compare_Subscriber_Fieldattributelist.add(6, "ICSC Code");
		List2compare_Subscriber_Fieldattributelist.add(7, "HPC Subscriber Code");
		List2compare_Subscriber_Fieldattributelist.add(8, "HPC Expiration Date");
		List2compare_Subscriber_Fieldattributelist.add(9, "Category");
		List2compare_Subscriber_Fieldattributelist.add(10, "Channel");
		List2compare_Subscriber_Fieldattributelist.add(11, "Legacy Network");
		List2compare_Subscriber_Fieldattributelist.add(12, "Subscriber Notes");
		
	for(int i=0;i<Subscribercreate_Fieldattributelist.size();i++){
		if(!Subscribercreate_Fieldattributelist.get(i).equals(List2compare_Subscriber_Fieldattributelist.get(i))){
			slf4jLogger.info("Subscriber_create_attribute="+Subscribercreate_Fieldattributelist.get(i));
			slf4jLogger.info("List2compare_Subscriber_Fieldattributelist="+List2compare_Subscriber_Fieldattributelist.get(i)+" Not matching");
			throw new Error("Fields are not matching check");
		}
	  }
			waitFor(ddl_Subscriber_Create_identierid);
			ddl_Subscriber_Create_identierid.selectByIndex(2);
			waitFor(ddl_Subscriber_Create_subscribertype);
			ddl_Subscriber_Create_subscribertype.selectByIndex(2);
			waitFor(ddl_Subscriber_Create_subscribersubtype);
			ddl_Subscriber_Create_subscribersubtype.selectByIndex(2);
			
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),3000);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
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



