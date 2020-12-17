package com.ctl.it.qa.omnivue.tools.pages.common;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVQPartnerPage extends OmniVuePage{

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	@FindBy(xpath=".//*[@name='userEmail']")
	public WebElementFacade tbx_Qpartner_emailid;	
	
	@FindBy(xpath=".//*[@name='logon']")
	public WebElementFacade tbx_Qpartner_salesid;
	
	@FindBy(xpath=".//*[@name='password']")
	public WebElementFacade tbx_Qpartner_passwordid;	
	
	@FindBy(xpath=".//*[@alt='Log-in']")
	public WebElementFacade btn_Qpartner_Login;
	
	
	//##################	Welcome Page 	########################## //
	
	@FindBy(xpath=".//*[@id='tabId']/a[text()='Central']")
	public WebElementFacade lbl_Qpartner_CentralTab;
	
	@FindBy(xpath=".//div[@class='epi-horzMenu-border']/div[contains(text(),'Selling')]")
	public WebElementFacade lbl_Qpartner_SellingTab;
	
	@FindBy(xpath=".//div[@id='divCMEvent']/following-sibling::div/div[text()='Omnivue']")
	public WebElementFacade lbl_Qpartner_OV;
	
	
	//##################	OV SLC Page 	########################## //
	
	@FindBy(xpath="(.//tab-heading[contains(text(),'Service Level Check')])[1]")
	public WebElementFacade tab_Qpartner_SLC;	
	
	@FindBy(xpath=".//button[@value='Service Check']")
	public WebElementFacade btn_Qpartner_SLC_Servicecheck;
			
	@FindBy(id="deviceLockUp")
	public WebElementFacade btn_Qpartner_SLC_locnaddressLckup;
	
	@FindBy(id="slcFormAddress")
	public WebElementFacade tbx_Qpartner_SLC_locnaddress;
			
	@FindBy(xpath=".//li[@class='ng-scope active']/a")
	public WebElementFacade lbl_Qpartner_SLC_locnaddress_highlighted;	
	
	@FindBy(xpath=".//th[text()='Total']/following-sibling::td")
	public WebElementFacade lbl_Qpartner_SLC_total;	
					
	@FindBy(xpath=".//select[@ng-model='slcForm.accessType']")
	public WebElementFacade ddl_Qpartner_SLC_accesstype;
					
	@FindBy(xpath=".//select[@ng-model='slcForm.bandwidthProfile']")
	public WebElementFacade ddl_Qpartner_SLC_Bandwidthprofile;
					
	@FindBy(xpath=".//select[@ng-model='slcForm.portType']")
	public WebElementFacade ddl_Qpartner_SLC_porttype;
					
	@FindBy(xpath=".//select[@ng-model='slcForm.affiliateOwner']")
	public WebElementFacade ddl_Qpartner_SLC_affiliateowner;
					
	@FindBy(xpath=".//select[@ng-model='slcForm.diversity']")
	public WebElementFacade ddl_Qpartner_SLC_diversity;
					
	@FindBy(xpath=".//button[@value='Re-Submit']")
	public WebElementFacade btn_Qpartner_SLC_Resubmit;
					
	@FindBy(xpath=".//button[@value='Delete Selected']")
	public WebElementFacade btn_Qpartner_SLC_Deleteselected;
					
	@FindBy(xpath=".//i[@ng-click='refreshSLCResult()()']")
	public WebElementFacade btn_Qpartner_SLC_Refreshicon;
					
	@FindBy(xpath=".//i[@ng-click='exportSelectedToExcel();']")
	public WebElementFacade btn_Qpartner_SLC_excelicon;
					
	@FindBy(xpath=".//i[@ng-click='printGridData()']")
	public WebElementFacade btn_Qpartner_SLC_Printicon;
					
	@FindBy(xpath=".//div[contains(@id,'invSLCReconfg-out')]/a")
	public WebElementFacade btn_Qpartner_SLC_Configicon;
					
	@FindBy(xpath=".//input[@ng-click='gridSettings.viewServiceLevelCheck(0)']")
	public WebElementFacade btn_Qpartner_SLC_Viewicon;
					
	@FindBy(xpath=".//input[@ng-click='gridSettings.editServiceLevelCheck(0)']")
	public WebElementFacade btn_Qpartner_SLC_Editicon;
					
	@FindBy(xpath="(.//input[@ng-click='gridSettings.editServiceLevelCheck(0)']/../../following-sibling::div/div)[1]")
	public WebElementFacade lbl_Qpartner_SLC_ID;
	
	@FindBy(xpath=".//div[@id='right-content-tab']//i[@ng-click='exportDetailToPDF(tab.title)']")
	public WebElementFacade btn_Qpartner_SLC_rightside_exportpdf;
							
	@FindBy(xpath="(.//div[@id='right-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-repeat='slcDetail in tab.content']/label)[1]")
			public WebElementFacade lbl_Qpartner_SLC_rightside_location;
	

	//#######################################	Address Section Lookup validation 	######################################## //
	
	@FindBy(xpath="(.//div[@id='addShelf']//button[@ng-click='lookUp()'])[1]")
			public WebElementFacade btn_Qpartner_addresslookup;
			
	@FindBy(xpath="(.//div[@id='addShelf']//input[@ng-model='location.addressLine1'])[1]")
			public WebElementFacade tbx_Qpartner_addresslookup_addressline1;
			
	@FindBy(xpath="(.//div[@id='addShelf']//select[@id='state'])[1]")
			public WebElementFacade ddl_Qpartner_addresslookup_state;
			
	@FindBy(xpath="(.//div[@id='addShelf']//select[@id='city'])[1]")
			public WebElementFacade ddl_Qpartner_addresslookup_city;
			
	
	@FindBy(xpath="(.//a[@ng-click='setLookupData(slcLocationData);'])[1]")
			public WebElementFacade lbl_Qpartner_addresslookup_result;
	
	
	
	public String winHandleBefore;
	
	public void qpartner_loginpagevalidation() {

		waitForElement(btn_Qpartner_Login);

		if(!tbx_Qpartner_emailid.isCurrentlyVisible() && !tbx_Qpartner_emailid.isCurrentlyEnabled()){			
			slf4jLogger.debug("Email ID is not displayed in Qpartner Screen");
			throw new Error("Email ID is not displayed in Qpartner Screen");
		}
		
		if(!tbx_Qpartner_salesid.isCurrentlyVisible() && !tbx_Qpartner_salesid.isCurrentlyEnabled()){			
			slf4jLogger.debug("Sales ID is not displayed in Qpartner Screen");
			throw new Error("Sales ID is not displayed in Qpartner Screen");
		}
		
		if(!tbx_Qpartner_passwordid.isCurrentlyVisible() && !tbx_Qpartner_passwordid.isCurrentlyEnabled()){			
			slf4jLogger.debug("Password Field is not displayed in Qpartner Screen");
			throw new Error("Password Field is not displayed in Qpartner Screen");
		}
		
		if(!btn_Qpartner_Login.isCurrentlyVisible() && !btn_Qpartner_Login.isCurrentlyEnabled()){			
			slf4jLogger.debug("Login Button is not displayed in Qpartner Screen");
			throw new Error("Login Button is not displayed in Qpartner Screen");
		}		
		
		
	}
	
	public void qpartner_Login(String user) {
		
		/*IntDataContainer datacontainer = envData.getContainer(
				this.getClass().getSimpleName()).getContainer(user);	*/
		
		tbx_Qpartner_emailid.type(Page.envData.getContainer("OVLoginPage").getContainer(user).getFieldValue("EmailID"));
		tbx_Qpartner_salesid.type(Page.envData.getContainer("OVLoginPage").getContainer(user).getFieldValue("SalesID"));
		tbx_Qpartner_passwordid.type(Page.envData.getContainer("OVLoginPage").getContainer(user).getFieldValue("Password"));
		
		jsClick(btn_Qpartner_Login);
		
		
		
		
	}
	
	public void I_verify_QPartnerwelcomepage() {
		try {
		waitForElement(lbl_Qpartner_CentralTab); 
			Thread.sleep(2000);		
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void I_clickonQpartnertab() {
		waitForElement(lbl_Qpartner_CentralTab);
		jsClick(lbl_Qpartner_CentralTab);
		waitForElement(lbl_Qpartner_SellingTab);
	}
	
	public void I_clickonQpartnerSubtab() {
		jsmousehover(lbl_Qpartner_SellingTab);
		waitForElement(lbl_Qpartner_OV);
	}
	
	public void I_clickonOmnivuelink_Qpartner() { try {
		waitForElement(lbl_Qpartner_OV);
		winHandleBefore = getDriver().getWindowHandle();
		
		jsClick(lbl_Qpartner_OV);
		
		
		for(String winHandle : getDriver().getWindowHandles()){
			getDriver().switchTo().window(winHandle);
		}
		
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void I_servicecheck_Qpartner() { try {
		waitForElement(btn_Qpartner_SLC_locnaddressLckup);Thread.sleep(3000);
		
		waitForElement(getDriver().findElement(By.xpath(".//input[@ng-click='gridSettings.viewServiceLevelCheck("+(Integer.parseInt(lbl_Qpartner_SLC_total.getText())-1)+")']")));
		
		jsClick(getDriver().findElement(By.xpath(".//input[@ng-click='gridSettings.viewServiceLevelCheck("+(Integer.parseInt(lbl_Qpartner_SLC_total.getText())-1)+")']")));
		
		waitForElement(btn_Qpartner_SLC_rightside_exportpdf);
			Thread.sleep(5000);
			String[]  Fieldattributelist=lbl_Qpartner_SLC_rightside_location.getText().split(",|\\(");			
			String total=lbl_Qpartner_SLC_total.getText();
			jsClick(btn_Qpartner_SLC_locnaddressLckup);
			waitForElement(btn_Qpartner_addresslookup);
			/*String splitfield=Fieldattributelist[2];
			String[]  Fieldattributelist1=splitfield.split("(");
			Fieldattributelist[2]=Fieldattributelist1[0].replaceAll("\\s","");*/
			tbx_Qpartner_addresslookup_addressline1.type(Fieldattributelist[0].trim());
			
			ddl_Qpartner_addresslookup_state.selectByValue(Fieldattributelist[2].trim()); Thread.sleep(2000);
			
			ddl_Qpartner_addresslookup_city.selectByVisibleText(Fieldattributelist[1].trim());
			
			jsClick(btn_Qpartner_addresslookup);
			waitForElement(lbl_Qpartner_addresslookup_result);
			
			jsClick(lbl_Qpartner_addresslookup_result);
			
			Thread.sleep(2000);
			
			ddl_Qpartner_SLC_Bandwidthprofile.selectByVisibleText("1 Mbps");
			
			Thread.sleep(2000);
			
			jsClick(btn_Qpartner_SLC_Servicecheck);
			
			Thread.sleep(5000);
			
			if(total.equals(lbl_Qpartner_SLC_total.getText())){
				slf4jLogger.debug("Service didnt get submitted in Qpartner SLC Page");
				throw new Error("Service didnt get submitted in Qpartner SLC Page");
			}
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	public void I_verifySLC_Qpartner() {
		if(!isElementVisible(By.xpath(".//input[@ng-click='gridSettings.viewServiceLevelCheck("+(Integer.parseInt(lbl_Qpartner_SLC_total.getText())-1)+")']"))){
			slf4jLogger.debug("Service didnt get submitted in Qpartner SLC Page");
			throw new Error("Service didnt get submitted in Qpartner SLC Page");
		}
	}
	
	public void OVSLCQpartnerchecks() {try {
		waitForElement(btn_Qpartner_SLC_Servicecheck); 		
			Thread.sleep(5000);
			
			if(!tab_Qpartner_SLC.isCurrentlyVisible()){
				slf4jLogger.debug("Service Level Checker Tab header is not displayed in Qpartner SLC Page");
				throw new Error("Service Level Checker Tab header is not displayed in Qpartner SLC Page");
			}
			
			if(!btn_Qpartner_SLC_Servicecheck.isCurrentlyVisible() &&!btn_Qpartner_SLC_Servicecheck.isCurrentlyEnabled()){
				slf4jLogger.debug("Service Check button is not displayed in Qpartner SLC Page");
				throw new Error("Service Check button is not displayed in Qpartner SLC Page");
			}
			
			if(!tbx_Qpartner_SLC_locnaddress.isCurrentlyVisible()){
				slf4jLogger.debug("Location Addresses text field is not displayed in Qpartner SLC Page");
				throw new Error("Service Level Checker Tab header is not displayed in Qpartner SLC Page");
			}
			
			
			if(!btn_Qpartner_SLC_locnaddressLckup.isCurrentlyVisible()){
				slf4jLogger.debug("Location Addresses Look up is not displayed in Qpartner SLC Page");
				throw new Error("Location Addresses Look up is not displayed in Qpartner SLC Page");
			}
			
			
			if(!ddl_Qpartner_SLC_accesstype.isCurrentlyVisible()){
				slf4jLogger.debug("Access Type drop down is not displayed in Qpartner SLC Page");
				throw new Error("Access Type drop down is not displayed in Qpartner SLC Page");
			}
			
			if(!ddl_Qpartner_SLC_Bandwidthprofile.isCurrentlyVisible()){
				slf4jLogger.debug("Bandwidth Profile drop down is not displayed in Qpartner SLC Page");
				throw new Error("Bandwidth Profile drop down is not displayed in Qpartner SLC Page");
			}
			
			if(!ddl_Qpartner_SLC_porttype.isCurrentlyVisible()){
				slf4jLogger.debug("Port Type drop down is not displayed in Qpartner SLC Page");
				throw new Error("Port Type drop down is not displayed in Qpartner SLC Page");
			}
			
			if(!ddl_Qpartner_SLC_affiliateowner.isCurrentlyVisible()){
				slf4jLogger.debug("Affiliate Owner drop down is not displayed in Qpartner SLC Page");
				throw new Error("Affiliate Owner drop down is not displayed in Qpartner SLC Page");
			}
			
			if(!ddl_Qpartner_SLC_diversity.isCurrentlyVisible()){
				slf4jLogger.debug("Diversity Type drop down is not displayed in Qpartner SLC Page");
				throw new Error("Diversity Type drop down is not displayed in Qpartner SLC Page");
			}
			
			/*if(!btn_Qpartner_SLC_Resubmit.isCurrentlyVisible() && !btn_Qpartner_SLC_Resubmit.isCurrentlyEnabled()){
				slf4jLogger.debug("Re-Submit button is not displayed in Qpartner SLC Page");
				throw new Error("Re-Submit button is not displayed in Qpartner SLC Page");
			}
			
			if(!btn_Qpartner_SLC_Deleteselected.isCurrentlyVisible() && !btn_Qpartner_SLC_Deleteselected.isCurrentlyEnabled()){
				slf4jLogger.debug("Delete Selected button is not displayed in Qpartner SLC Page");
				throw new Error("Delete Selected button is not displayed in Qpartner SLC Page");
			}
			
			if(!btn_Qpartner_SLC_Refreshicon.isCurrentlyVisible() && !btn_Qpartner_SLC_Refreshicon.isCurrentlyEnabled()){
				slf4jLogger.debug("Refresh Icon button is not displayed in Qpartner SLC Page");
				throw new Error("Refresh Icon button is not displayed in Qpartner SLC Page");
			}
			
			if(!btn_Qpartner_SLC_excelicon.isCurrentlyVisible() && !btn_Qpartner_SLC_excelicon.isCurrentlyEnabled()){
				slf4jLogger.debug("Excel Icon button is not displayed in Qpartner SLC Page");
				throw new Error("Excel Icon button is not displayed in Qpartner SLC Page");
			}			
			
			if(!btn_Qpartner_SLC_Printicon.isCurrentlyVisible() && !btn_Qpartner_SLC_Printicon.isCurrentlyEnabled()){
				slf4jLogger.debug("Print Icon button is not displayed in Qpartner SLC Page");
				throw new Error("Print Icon button is not displayed in Qpartner SLC Page");
			}
			
			if(!btn_Qpartner_SLC_Configicon.isCurrentlyVisible() && !btn_Qpartner_SLC_Configicon.isCurrentlyEnabled()){
				slf4jLogger.debug("Configuration column Icon button is not displayed in Qpartner SLC Page");
				throw new Error("Configuration column Icon button is not displayed in Qpartner SLC Page");
			}*/
			
			if(btn_Qpartner_SLC_Viewicon.isCurrentlyVisible()){
				jsClick(btn_Qpartner_SLC_Viewicon);
				waitForElement(btn_Qpartner_SLC_rightside_exportpdf);Thread.sleep(5000);
				//.//div[@id='right-content-tab']//tab-heading[contains(text(),'149648')]
				//lbl_Qpartner_SLC_ID
				if(!isElementVisible(By.xpath(".//div[@id='right-content-tab']//tab-heading[contains(text(),'"+lbl_Qpartner_SLC_ID.getText().trim()+"')]"))){
					slf4jLogger.debug("Unable to view the Service addresses in Qpartner SLC Page");
					throw new Error("Unable to view the Service addresses in Qpartner SLC Page");
				}
			}
			
			
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
		
	    return element;
	}
	
	public void jsmousehover(WebElement element) { try {
		Actions action = new Actions(getDriver());
		
		action.moveToElement(element).build().perform();
		
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
