package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchOrderPage extends OmniVuePage {
	
	//private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Order Advanced Search Results')]")
	public WebElementFacade tab_order_advancesearch_result;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Order Id:')]")
	public WebElementFacade tab_Orderid;
	
	@FindBy(xpath=".//li[@class='ng-isolate-scope active']//tab-heading/a")
	public WebElementFacade btn_tabcloseicon;
	
	@FindBy(xpath="//label[text()='GETO']/following-sibling::select[@id='geto']")
	public static WebElementFacade ddl_GETO_value;
	//label[text()='GETO']/following-sibling::select[@id='geto']
	
	@FindBy(xpath="//label[text()='GETO']/following-sibling::select[@id='geto']/option")
	public static WebElementFacade ddl_GETO_value_dropdown;
	
	//-------------------------------------------------------------  Orders Service Details Sections -----------------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[text()='DTN:']/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_dtn; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[text()='Down Speed:']/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Downspeed; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[text()='Up Speed:']/following-sibling::label[1]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_upspeed; 
	
	//-------------------------------------------------------------  HSI Details Sections -----------------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='Service Id:']/following-sibling::label[1]/a[contains(text(),'-HSI')]")
	public WebElementFacade lbl_vieworderpage_HSI_Service_sec_Service_Id;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'DTN(Data TN)')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_DTN;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'Downstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_downstreamrate;
					
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'Provisioned Downstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_ProvisDownstreamrate;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'Service Profile')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_Serviceprofile;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'CVOIP TN')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_cvoiptn;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'Upstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_Upstreamrate;
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'Provisioned Upstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_ProvisUpstreamrate;	
			
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[contains(text(),'Service Profile Index')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_ServicePage_serviceattributes_Serviceprofileindex;		
	
			
	
	//-------------------------------------------------------------------- ---------------------------------- ---------------------------------- // 
	
	//----------------------------------------------------  Related Services Tab  --------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
	public WebElementFacade tab_services; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[starts-with(@id,'contenttablejqxGrid')]//*[text()='HSI']/../..//input")
	public WebElementFacade btn_vieworderpage_ServicesRT_HSIView;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//*[starts-with(@id,'contenttablejqxGrid')]//*[text()='IPTV']/../..//input")
	public WebElementFacade btn_vieworderpage_ServicesRT_IPTVView;
	
	//-------------------------------------------------------------------- ---------------------------------- ---------------------------------- // 
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@src='rightContentUrl']//*[@class='tab-pane ng-scope active']//*[contains(@class,'alert alert-danger')]")
	public WebElementFacade lbl_alert_message_no_data_related_tabs;
	
	//-------------------------------------------------------------------- ---------------------------------- ---------------------------------- // 
	
	//-------------------------------------------------------------------- ---------------------------------- ---------------------------------- // 
	
	public void verify_validation(String validation) throws Throwable {		
		switch(validation){
		case "search for Order having status Pending Completeion state":
			waitForElement(tab_order_advancesearch_result);
			
			int i=1;
			while(i!=0){
				jsClick(getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[text()='PENDING COMPLETION']/../..//input)["+i+"]")));
				jsClick(tab_services);
				Thread.sleep(3000);
				if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
					break;
				}
				i++;
				jsClick(btn_tabcloseicon);
				jsClick(tab_order_advancesearch_result);
				if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//*[text()='PENDING COMPLETION']/../..//input)["+i+"]"))){
					throw new Error("No valid order is present");
				}				
					
			}
			
		case "Upstream and Downstream values of the HSI+IPTV Order and Service detail page are matching":
			if(!lbl_vieworderpage_HSI_Service_sec_Service_Id.isCurrentlyVisible()){
				waitForElement(lbl_vieworderpage_HSI_Service_sec_dtn);
				String dtn=lbl_vieworderpage_HSI_Service_sec_dtn.getText().trim().replaceAll("[^\\d.]", "");
				String downstreamrate=lbl_vieworderpage_HSI_Service_sec_Downspeed.getText().trim().replaceAll("[^\\d.]", "");			
				String Upstreamrate=lbl_vieworderpage_HSI_Service_sec_upspeed.getText().trim().replaceAll("[^\\d.]", "");
				
				
				//--HSi Validation--//
				jsClick(btn_vieworderpage_ServicesRT_HSIView);
				Thread.sleep(2000);
				waitForElement(lbl_ServicePage_serviceattributes_Serviceprofileindex);
				if(!lbl_ServicePage_serviceattributes_DTN.getText().trim().replaceAll("[^\\d.]", "").equals(dtn)){
					throw new Error(lbl_ServicePage_serviceattributes_DTN.getText().trim()+":DTn Value is not matching with"+dtn);
				}
				if(!lbl_ServicePage_serviceattributes_downstreamrate.getText().replaceAll("[^\\d.]", "").trim().equals(downstreamrate)){
					throw new Error(lbl_ServicePage_serviceattributes_downstreamrate.getText().trim()+":Down Stream Rate Value is not matching with"+downstreamrate);
				}
				
				if(!lbl_ServicePage_serviceattributes_Upstreamrate.getText().replaceAll("[^\\d.]", "").trim().equals(Upstreamrate)){
					throw new Error(lbl_ServicePage_serviceattributes_Upstreamrate.getText().trim()+":Up Stream Rate Value is not matching with"+Upstreamrate);
				}				
				
				//--IPTV Validation --//
				jsClick(tab_Orderid);
				waitForElement(lbl_vieworderpage_HSI_Service_sec_dtn);
				jsClick(btn_vieworderpage_ServicesRT_IPTVView);
				waitForElement(lbl_ServicePage_serviceattributes_Serviceprofileindex);
				if(!lbl_ServicePage_serviceattributes_DTN.getText().trim().replaceAll("[^\\d.]", "").equals(dtn)){
					throw new Error(lbl_ServicePage_serviceattributes_DTN.getText().trim()+":DTn Value is not matching with"+dtn);
				}
				if(!lbl_ServicePage_serviceattributes_downstreamrate.getText().trim().replaceAll("[^\\d.]", "").equals(downstreamrate)){
					throw new Error(lbl_ServicePage_serviceattributes_downstreamrate.getText().trim()+":Down Stream Rate Value is not matching with"+downstreamrate);
				}
				
				if(!lbl_ServicePage_serviceattributes_Upstreamrate.getText().trim().replaceAll("[^\\d.]", "").equals(Upstreamrate)){
					throw new Error(lbl_ServicePage_serviceattributes_Upstreamrate.getText().trim()+":Up Stream Rate Value is not matching with"+Upstreamrate);
				}				
			} break;
			
		}
	}
	
	public void validate_values_displayed_under_GETO_value() {
		String[] expectedvalues = {""," ","B", "D", "F","G", "H", "I","W"};
		
		try {
			waitForElement(ddl_GETO_value);
			jsClick(ddl_GETO_value);
			Select GETO_value=new Select(ddl_GETO_value);
			// List<WebElement> all_GETO_values=GETO_value.getOptions();
		List<WebElement> all_GETO_values=getDriver().findElements(By.xpath("//label[text()='GETO']/following-sibling::select[@id='geto']/option"));
	        for(String s1:expectedvalues)
	              {
	                  boolean found=false;
	                  for(WebElement ele1:all_GETO_values){
	                     //  System.out.println(ele1.getText());
	                         if(s1.equalsIgnoreCase(ele1.getText()))
	                         {
	                        	 found=true;
	                             System.out.println("GETO value : "+ s1);
	                             break;
	                         }
	                         
	                         
	                  }
	                  if(!found)
	                  {
	                         throw new Error("GETO value not found");
	                  }
	              }
		}
	   catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),300);	
	    
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
