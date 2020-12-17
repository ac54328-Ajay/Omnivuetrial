package com.ctl.it.qa.omnivue.tools.pages.common;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
 
import net.thucydides.core.annotations.findby.By;
 import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OVfillmandatoryfields;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

@SuppressWarnings("deprecation")
public class OVManageGetNextPage extends OmniVuePage {
	
	OVLoginPage loginPage;
	ARMDB armdb;
	OmnivueDB ovdb;
	UserSteps enduser;
	OVfillmandatoryfields fillfieldscls;
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
		
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='selectedName']")
	public WebElementFacade ddl_getnextattributes;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='attribueValue']")
	public WebElementFacade tbx_getnextattributes_value;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-show='showGetNextAlert']")
	public WebElementFacade lbl_alert_msg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='searchAttributeOnCriteria();']")
	public WebElementFacade btn_search_attribute;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='addGetNextButton();']")
	public WebElementFacade btn_addGetNext;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='getAllRows();']")
	public WebElementFacade btn_view_all; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='exportToExcel();']")
	public WebElementFacade btn_export_excel;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='printGridData();']")
	public WebElementFacade btn_print;
	
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'dropdownlistWrappergridpagerlistjqxGrid')]")
	public WebElementFacade btn_pagination;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'jqxGridForGetNext')]//span[contains(text(),'Button Administrative Name')]")
	public WebElementFacade lbl_Button_Administrative_Name; 
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'jqxGridForGetNext')]//span[contains(text(),'Button Administrative Name')]/../../../preceding-sibling::div")
	public WebElementFacade lbl_auditlog_getnext_col_count; 
	
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid2')]//div/div[2]")
	public WebElementFacade lbl_Button_Administrative_Name_value; 
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']//input[@title='Edit Attribute']")
	public List<WebElement> lbl_result_count; 
	
	@FindBy(xpath="//div[contains(@id,'dropdownlistArrowgridpagerlistjqxGrid')]")
	public WebElementFacade btn_device_row_option;
	
	@FindBy(xpath="(//div[@role='option']/span)[5]")
	public WebElementFacade lbl_last_value;
	
	
	@FindBy(xpath="//*[@ng-show='showGetNextAlert']/button")
	public WebElementFacade lbl_message; 
	
	@FindBy(xpath="//input[@ng-model='attribueValue']")
	public WebElementFacade tbx_buttonAdminName_search;
	
	
	@FindBy(xpath = "(//input[@title='Edit Attribute'])[1]")
	public WebElementFacade btn_GetNext_Edit1;
	
	@FindBy(xpath = "(//input[@title='Save Attribute'])[1]")
	public WebElementFacade btn_GetNext_Save1;
	
	@FindBy(xpath = "(//input[@title='Delete Attribute'])[1]")
	public WebElementFacade btn_GetNext_Delete1;
	
	@FindBy(xpath = "//div[@ng-show='showSearchResultsAlert']")
	public WebElementFacade lbl_success_message;
	
	@FindBy(xpath="//div[@ng-show='showGetNextAlert']")
	public WebElementFacade lbl_success_message_NoDatafound;
	
	@FindBy(xpath ="//div[contains(@id,'columntablejqxGrid')]/div")
	public List<WebElement> lbl_column_count;
	
	
	
	
	
	//.....................................ManageGetNextButtons page........................................//
		@FindBy(xpath="//input[@ng-model='lookUp.buttonAdminName']")
		public WebElementFacade tbx_AdminName_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//input[@ng-model='lookUp.displayName']")
		public WebElementFacade tbx_displayName_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//input[@ng-model='lookUp.buttonColor']")
		public WebElementFacade tbx_buttonColor_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//input[@ng-model='lookUp.description']")
		public WebElementFacade tbx_description_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//input[@ng-model='lookUp.fontColor']")
		public WebElementFacade tbx_fontColor_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//input[@ng-model='lookUp.workmateRuleInvoked']")
		public WebElementFacade tbx_workmateRuleInvoked_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//button[@ng-click='addGetNextButton();']")
		public WebElementFacade btn_addGetNextButton_manageGetNextButtonsPage;
		
		@FindBy(xpath="//button[@ng-click='saveGetNextButton()']")
		public WebElementFacade btn_save_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//button[@ng-click='clearFields()']")
		public WebElementFacade btn_clear_manageGetNextButtonsPage_lookUp;
		
		@FindBy(xpath="//*[@ng-class='lookUpAlert.className']")
		public WebElementFacade alert_msg_manageGetNextButtonsPage_lookUp;
		
		
		@FindBy(xpath="(//span[text()='×'])[2]")
		public WebElementFacade  btn_close_manageGetNextButtonsPage_lookUp;  
		
		//......................................................................................................//
		
		//******************************************************************************************************//
		
		 
		@FindBy(xpath="//button[@ng-click='getNextTask(firstGetNextButton.ruleName);']")
		public  WebElementFacade  btn_getnext_first; 
		 
		@FindBy(xpath="//button[@title='More']")
		public WebElementFacade  btn_getnext_more; 
		
		@FindBy(xpath="(//a[@ng-click='getNextTask(item.ruleName);'])[index]")
		public WebElementFacade  btn_getnext_list; 
		
		@FindBy(xpath="(//a[contains(text(),'GetNext_')])")
		public List<WebElement>  btn_getnext_link_list; 
		
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-show='alert.show' and contains(@ng-class,'alert.className')]")
		public WebElementFacade  lbl_defecttask_alert_msg; 
		
		
		
		//******************************************************************************************************//
		
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	public WebElement waitForElement(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),500);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	
	
	public WebElement waitForElementclickable(WebElement elementToBeLoaded) {
	    WebDriverWait wait = new WebDriverWait(getDriver(),500);	
	    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
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
	
	public void validate_mandatory_mesasge() {
		
		if(!lbl_message.isVisible()) {
		
			slf4jLogger.error("Mandatory filed validation message is not displaced");
			throw new Error("Mandatory filed validation message is not displaced");
		}
		
		System.out.println(lbl_message.getText().trim());
		
				
		}
	
	public void fill_name(String name,String arg1) {
		ddl_getnextattributes.sendKeys(arg1);
		tbx_getnextattributes_value.sendKeys(name);		
		}
	
	public void click_button(String arg1) throws InterruptedException {
		try {
			
	switch(arg1) {
	case "Search":jsClick(btn_search_attribute);  
	Thread.sleep(1000);
	break;
	case "View All":jsClick(btn_view_all) ;break;
	case "Add GetNext Button":jsClick(btn_addGetNext) ;break;
	
	
	}
		} catch (Exception e) {
			

		}
		
		
		
		
		}
	
	

	public void validate_getnext_search_result() {
		
		int count=lbl_result_count.size();	
		
		
		for(int i=1;i<=count;i++) {
			String value_displayed = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][2]")).getText();
			System.out.println("Button Administrative name Value displayed is "+value_displayed);
			String value_displayed_workmate = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][7]")).getText();
			System.out.println("Workmate Rule invoked name is "+value_displayed_workmate);
		}
		//String taskid = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+count+"]/div[@role='gridcell'][7]")).getText();
		
		
		}
	
	public void verify_validation(String validation) throws SQLException, InterruptedException{
		 String userid;
		 List<String> actualFocusTab;
		
		switch(validation) {
		case "Search action in TRACK_USER table":
			  userid =Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx") ;
	            actualFocusTab= OmnivueDB.audit_logs_search(userid);
	            slf4jLogger.info("userid...."+userid);
	            slf4jLogger.info("actualFocusTab...."+actualFocusTab.get(0));
	            
	            
	            if (actualFocusTab.get(0).equalsIgnoreCase("Search")) {
	                  slf4jLogger.info("Audit log for search action is tracked");
	            }
	            else throw new Error("Audit log for search action is not tracked") ;
	            break;
	            
		case "Export to excel,print and pagination in manage get next buttons page":
			
			if(!btn_export_excel.isCurrentlyVisible() && !btn_export_excel.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				slf4jLogger.error("Excel export Icon button is not displayed in manage get next buttons page");
				throw new Error("Excel export Icon button is not displayed in manage get next buttons page");
			}
			

			if(!btn_print.isCurrentlyVisible() && !btn_print.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				slf4jLogger.error("Print Icon button is not displayed in manage get next buttons page");
				throw new Error("Print Icon button is not displayed in manage get next buttons page");
			}
			

			if(!btn_pagination.isCurrentlyVisible() && !btn_pagination.isCurrentlyEnabled()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				slf4jLogger.error("pagination is not displayed in manage get next buttons page");
				throw new Error("pagination is not displayed in manage get next buttons page");
			}
			break;
			
		case "look up message":
			slf4jLogger.info(">>>>>>>>"+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
			if (alert_msg_manageGetNextButtonsPage_lookUp.getTextValue().contains("Please enter the mandatory fields.")) {
				slf4jLogger.info(" validated look up message"+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
				}
			else if (alert_msg_manageGetNextButtonsPage_lookUp.getTextValue().contains("The button administrative name already exists in the table. Please retry with another name.")) {
				slf4jLogger.info(" validated look up message for duplicate "+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
			}
			 else throw  new Error(" look up message is missing administrative name "); 
			
			Thread.sleep(1000);
			jsClick(btn_close_manageGetNextButtonsPage_lookUp);
			Thread.sleep(1000); 
            
			 break; 
		case "look up message-The button administrative name already exists in the table. Please retry with another name.":
			slf4jLogger.info(">>>>>>>>"+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
			 if (alert_msg_manageGetNextButtonsPage_lookUp.getTextValue().contains("The button administrative name already exists in the table. Please retry with another name.")) {
				slf4jLogger.info(" validated look up message for duplicate "+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
			}
			 else throw  new Error(" look up message is missing administrative name "); 
			
			Thread.sleep(1000);
			jsClick(btn_close_manageGetNextButtonsPage_lookUp);
			Thread.sleep(1000); 
            
			 break; 
		case "look up message-Please enter the mandatory fields.":
			slf4jLogger.info(">>>>>>>>"+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
			if (alert_msg_manageGetNextButtonsPage_lookUp.getTextValue().contains("Please enter the mandatory fields.")) {
				slf4jLogger.info(" validated look up message"+ alert_msg_manageGetNextButtonsPage_lookUp.getTextValue());
				}
			
			 else throw  new Error(" look up message is missing administrative name "); 
			
			Thread.sleep(1000);
			jsClick(btn_close_manageGetNextButtonsPage_lookUp);
			Thread.sleep(1000); 
            
			 break; 
			 
			 
		case "Deafult value for Administrative,Color,FontColor textbox":
			slf4jLogger.info(">>>>>>>>"+ tbx_AdminName_manageGetNextButtonsPage_lookUp.getTextValue());
			if (tbx_AdminName_manageGetNextButtonsPage_lookUp.getTextValue().equalsIgnoreCase("GetNext_")&&
					tbx_buttonColor_manageGetNextButtonsPage_lookUp.getTextValue().equalsIgnoreCase("Green")&&
					tbx_fontColor_manageGetNextButtonsPage_lookUp.getTextValue().equalsIgnoreCase("White")	) 
			{
				slf4jLogger.info("verified Deafult value for Administrative,Color,FontColor textbox succsfully");
			}
			  else throw  new Error(" Administrative,Color,FontColor textbox default values are missing"); 
            
			 break; 
			
		case "Add Get Next Button Look Up Attributes": 
            
            Thread.sleep(1000);
            waitFor(tbx_AdminName_manageGetNextButtonsPage_lookUp);
           jsClick(tbx_AdminName_manageGetNextButtonsPage_lookUp);
          // tbx_AdminName_manageGetNextButtonsPage_lookUp.sendKeys("123");
            if(tbx_AdminName_manageGetNextButtonsPage_lookUp.isDisplayed()&& tbx_displayName_manageGetNextButtonsPage_lookUp.isDisplayed()
            	&&	tbx_buttonColor_manageGetNextButtonsPage_lookUp.isDisplayed() && tbx_description_manageGetNextButtonsPage_lookUp.isDisplayed()
            	&& tbx_fontColor_manageGetNextButtonsPage_lookUp.isDisplayed() && tbx_workmateRuleInvoked_manageGetNextButtonsPage_lookUp.isDisplayed() &&
            	btn_save_manageGetNextButtonsPage_lookUp.isDisplayed() && btn_clear_manageGetNextButtonsPage_lookUp.isDisplayed())
            {
            	 slf4jLogger.info("validated Add Get Next Button Look Up Attributes successfully");
            }
            else throw  new Error("Add Get Next Button Look Up Attributes are missing"); 
            break; 
       case "Event Get Next track in TRACK_USER table": 
            
             userid =Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx") ;
            actualFocusTab= ovdb.audit_logs_focus(userid);
            slf4jLogger.info("userid...."+userid);
            slf4jLogger.info("actualFocusTab...."+actualFocusTab.get(0));
            
            
            if (actualFocusTab.get(0).equalsIgnoreCase("Get Next")) {
                  slf4jLogger.info("Viewed Manage GetNext buttons page");
            }
            else throw new Error("Audit log not tracked") ;
            break; 
       case "Getnext button create action":		
			//tbx_AdminName_manageGetNextButtonsPage_lookUp.sendKeys("AUTO");
			jsClick(btn_save_manageGetNextButtonsPage_lookUp);
			
			break;
      	
    	   	
       case "Getnext button update action":
    	   Thread.sleep(1000);
    	    tbx_buttonAdminName_search.sendKeys("GetNext_AUTO");
			jsClick(btn_search_attribute);
			Thread.sleep(2000);
			jsClick(btn_GetNext_Edit1);
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div[2]/input")).sendKeys("1");
			for(int i=3; i<=7; i++){
				getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).clear();
				getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).sendKeys("AUTOUPDATE");
			}
			jsClick(btn_GetNext_Save1);
			Thread.sleep(2000);
			System.out.println(lbl_success_message.getText());	
			
			
			
			//div[contains(@id,'contenttablejqxGrid')]/div[1]/div[3]/div
			
			/*for(int i=3; i<=7; i++){
				getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).clear();
				getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).sendKeys("AUTOUPDATE");
			}*/
    	   	break;
       case "Getnext button delete action":
    	    tbx_buttonAdminName_search.sendKeys("GetNext_AUTO1");
			jsClick(btn_search_attribute);
			Thread.sleep(2000);
			jsClick(btn_GetNext_Delete1);
			Alert Deletealert = getDriver().switchTo().alert();
			Deletealert.accept();
			System.out.println(lbl_success_message_NoDatafound.getText());
			tbx_buttonAdminName_search.sendKeys("GetNext_AUTO1");
			jsClick(btn_search_attribute);
			Thread.sleep(2000);
			break;
		case "Column headers in the Get Next Attribute Search Results page":
			jsClick(btn_view_all);
			Thread.sleep(3000);
			String column_list[] = {"Edit", "Button Administrative Name","Display Name","Button Color","Font Color","Descriptions","WorkMate Rule Invoked","Created By","Modified By","Save","Delete"};
			if(lbl_column_count.size()==column_list.length){
			for(int i=0;i<=lbl_column_count.size()-1; i++){
				for(int j=0;j<=column_list.length-1;j++){
					if(lbl_column_count.get(i).getText().contains(column_list[j])){
						System.out.println(i+1+"-"+lbl_column_count.get(i).getText());
						}
					}
				}
			}
			else throw new Error("OV Columns are not match with actual columns");
			break;
		}
		
	}
	
		public void i_select_attribute_value(String arg1) {
		
			ddl_getnextattributes.sendKeys(arg1);
			
		
		
		}
	
	public  void Getnext_button_click(String button)  {
		
try {
			boolean flag=false;
	if(btn_getnext_first.isCurrentlyVisible()) {
		String name=btn_getnext_first.getText().trim();
		System.out.println("value"+name);
		if (name.equals(button)) {
			jsClick(btn_getnext_first);
		}
		else if(btn_getnext_more.isCurrentlyVisible()) {
			jsClick(btn_getnext_more);
			Thread.sleep(1000);
			
			int count=btn_getnext_link_list.size();	
			
			System.out.println("value count "+count);
			
			for(int i=1;i<=count;i++) {
				String value_displayed = loginPage.getDriver().findElement(By.xpath("(//a[contains(text(),'GetNext_')])["+i+"]")).getText().trim();
				
				if(value_displayed.equals(button)) {
					//loginPage.getDriver().findElement(By.xpath("(//a[contains(text(),'GetNext_')])["+i+"]")).click();
					
					jsClick(loginPage.getDriver().findElement(By.xpath("(//a[contains(text(),'GetNext_')])["+i+"]")));
					flag=true;
					Thread.sleep(1000);
					System.out.println("Verify for next page");
					
					
				}
				
			}
			
			if(!flag) {
					throw new Error("Get Next button "+button+ " is not present ") ;
				
					}
			}
		}
		} catch (Exception e) {
			System.out.println("Exception "+e);
			

		}
	}
	
	
	public void verify_message(String message1) {
		String Message;
		
		Message=lbl_defecttask_alert_msg.getText().trim();
		Message = Message.toString().substring(1);
		if(Message.contains(message1)){
		slf4jLogger.info("Message displayed ="+Message);
		}
		else{throw new Error(Message+ "is not displayed");
		
		}

		
		/*switch(message1) {
		case"Resource Specified not Found": Message=lbl_defecttask_alert_msg.getText().trim();
											Message = Message.toString().substring(1);		
		
											if(Message.contains("Resource Specified not Found.")){
												slf4jLogger.info("Resource Specified not Found is displayed."+Message);
			
											}  else{throw new Error("Resource Specified not Found is not displayed."+Message);
											}break;
											
		case"click Get Next button again to get the latest task":
			Message=lbl_defecttask_alert_msg.getText().trim();
			Message = Message.toString().substring(1);
			slf4jLogger.info("click Get Next button again to get the latest task------->"+Message);

			if(Message.contains(message1)){
			slf4jLogger.info("click Get Next button again to get the latest task."+Message);

			}  else{throw new Error("click Get Next button again to get the latest task."+Message);
			}break;
		case"Rule Specified Was Not Found":
			Message=lbl_defecttask_alert_msg.getText().trim();
			Message = Message.toString().substring(1);
			if(Message.contains(message1)){
			slf4jLogger.info("Message displayed ="+Message);

			}  else{throw new Error(Message+ "is not diaplayed");
			}break;
			
		
			}*/
		
		
		
		
		
	}
	
	
@SuppressWarnings({ "rawtypes", "unused" })
public void validate_getnext_search_result_db(String arg1,String arg2) throws SQLException, InterruptedException {
	btn_device_row_option.click();
	Thread.sleep(000);
	lbl_last_value.click();
	Thread.sleep(3000);
		int count=lbl_result_count.size();	
		HashMap<String,String> hmap=new HashMap<String,String>();
		//HashMap<String,String> map1=new HashMap<String,String>(); 
		HashMap<String, String> map2=new HashMap<String,String>();
		List<String> Values = new ArrayList<String>();
		
		
		for(int i=1;i<=count;i++) {
			String value_displayed = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][2]")).getText();
			System.out.println("Button Administrative name Value displayed is "+value_displayed);
			 Values.add(value_displayed);
			String value_displayed_workmate = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][7]")).getText();
			System.out.println("Workmate Rule invoked name is "+value_displayed_workmate);
			hmap.put(value_displayed, value_displayed_workmate);
		}
		//String taskid = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+count+"]/div[@role='gridcell'][7]")).getText();
		
		
	      
	      
	      Iterator iter = hmap.entrySet().iterator();
	     map2= ovdb.getnext_search_result(arg1,arg2);
	     
	     
	     Set set = map2.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("Button Administrative Name in DB: "+ mentry.getKey() + " & WorkMate Rule Invoked in DB is: ");
	         System.out.println(mentry.getValue());
	      }
	     /* while(iter.hasNext())
	      {
	            Map.Entry entry = (Map.Entry)iter.next();  
	            String key1 = (String) entry.getKey();
	            String value1 = (String) entry.getValue();
	            //entry.getKey();
	            System.out.println(entry.getKey()+" Evalue =="+entry.getValue());
	           
	            if(map2.get(key1)!=null && map2.get(value1) != null)
	            {
	            	 //System.out.println("Duplicate values");
	                       System.out.println(entry.getKey()+" value =="+entry.getValue());
	            }  
	          //  map2.containsKey(key1);
	            //map2.containsValue(value1);
	         
	      }*/
	      if(hmap.equals(map2)) {
	    	  
	    	  System.out.println("Values in DB and Search result page matched ");  
	    	  
	      }else
	      {
	    	  System.out.println("Values in DB and Search result page did not  matched ");   
	    	  slf4jLogger.error("Values in DB and Search result page did not  matched ");
				throw new Error("Values in DB and Search result page did not  matched ");
	    	  
	      }
	      
	      
	     // map1.
	  
	      
	  //    map2.containsKey(map1.g)
	/*	String device=devcreatepage.create_device_successfull_msg();
		List<String> deivce_delete_audit_value = ovdb.audit_log_details(device.trim(),arg01);
		if(arg01.equalsIgnoreCase(deivce_delete_audit_value.get(0))){
			slf4jLogger.info(arg01+" Action Type  value is avaliable in Database");
			//System.out.println(arg1+" Action Type  value is avaliable in Database");
		
		}*/
		
		
		}

public void validate_getnext1_search_result_db(String arg1) throws SQLException, InterruptedException {
	btn_device_row_option.click();
	Thread.sleep(000);
	lbl_last_value.click();
	Thread.sleep(3000);
	
	int count=lbl_result_count.size();	
	/*HashMap<String,String> hmap=new HashMap<String,String>();
	HashMap<String,String> map1=new HashMap<String,String>();
	HashMap<String, String> map2=new HashMap<String,String>();*/
	//List<String> Values = new ArrayList<String>();
	String value;
	List<String> deivce_Fieldattributelist = new ArrayList<String>();
	List<String> deivce_details_db_attributes = new ArrayList<String>();
	int i,j=0;
	String value_displayed;
	
	for(i=1;i<=count;i++) {
		 value_displayed = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][2]")).getText();
		if(value_displayed.trim().equalsIgnoreCase(arg1)) {
			System.out.println("Value found at position " +i);
			j=i;
		}
	}
	//String taskid = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+count+"]/div[@role='gridcell'][7]")).getText();
	
	
	for(int k=2;k<=9;k++){
		value=loginPage.getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div["+j+"]/div["+k+"]/div")).getText();
		
		System.out.println("value"+value);
		deivce_Fieldattributelist.add(value.trim());
			
		}
		
		
	deivce_details_db_attributes=ovdb.getnext_search_db_result(arg1);
	
	//deivce_details_db_attributes = armdb.device_details_attributes_values(value));
	//System.out.println(deivce_details_db_attributes);
	//Thread.sleep(3000);
	for(int p=0; p<=deivce_Fieldattributelist.size()-1; p++){
		for(int q=0; q<=deivce_details_db_attributes.size()-1; q++){
			if(deivce_Fieldattributelist.get(p).equalsIgnoreCase(deivce_details_db_attributes.get(q))){
				slf4jLogger.info(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
			//	System.out.println(deivce_Fieldattributelist.get(p)+" value is avaliable in Database");
				
			}
		}
	}
      
    
	
	}
public void i_update_values_in_getnext(String arg1,String arg2) throws InterruptedException {
	int i,count,j=0;
	
	String value_displayed;
	   Thread.sleep(1000);
	    tbx_buttonAdminName_search.sendKeys(arg1);
		jsClick(btn_search_attribute);
		Thread.sleep(2000);
		btn_device_row_option.click();
		Thread.sleep(000);
		lbl_last_value.click();
		Thread.sleep(3000);
		 count=lbl_result_count.size();
		//jsClick(btn_GetNext_Edit1);
		Thread.sleep(2000);/*Thread.sleep(1000);
	    tbx_buttonAdminName_search.sendKeys(arg1);
		jsClick(btn_search_attribute);
		Thread.sleep(2000);
		jsClick(btn_GetNext_Edit1);
		Thread.sleep(2000);*/
		//getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div[2]/input")).sendKeys(arg2);
		
	
	for(i=1;i<=count;i++) {
		 value_displayed = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][2]")).getText();
		if(value_displayed.trim().equalsIgnoreCase(arg1)) {
			System.out.println("Value found at position " +i);
			j=i;
			break;
		}
	}
	
	jsClick(getDriver().findElement(By.xpath("(//input[@title='Edit Attribute'])["+j+"]")));
	
	Thread.sleep(1000);
	getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div["+j+"]/div[2]/input")).sendKeys(arg2);
	
		for(i=3; i<=7; i++){
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div["+j+"]/div["+i+"]/input")).clear();
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div["+j+"]/div["+i+"]/input")).sendKeys("AUTOUPDATE");
		}
		jsClick(getDriver().findElement(By.xpath("(//input[@title='Save Attribute'])["+j+"]")));
		//jsClick(btn_GetNext_Save1);
		Thread.sleep(2000);
		System.out.println(lbl_success_message.getText());	
		
		
		
		//div[contains(@id,'contenttablejqxGrid')]/div[1]/div[3]/div
		
		/*for(int i=3; i<=7; i++){
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).clear();
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).sendKeys("AUTOUPDATE");
		}*/
	   
}
public void i_delete_record_in_getnext(String arg1) throws InterruptedException {
int i,count,j=0;
 
String value_displayed;
	   Thread.sleep(1000);
	    tbx_buttonAdminName_search.sendKeys(arg1);
		jsClick(btn_search_attribute);
		Thread.sleep(2000);
		btn_device_row_option.click();
		Thread.sleep(000);
		lbl_last_value.click();
		Thread.sleep(3000);
		 count=lbl_result_count.size();
		//jsClick(btn_GetNext_Edit1);
		Thread.sleep(2000);
			
		
		for(i=1;i<=count;i++) {
			 value_displayed = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+i+"]/div[@role='gridcell'][2]")).getText();
			if(value_displayed.trim().equalsIgnoreCase(arg1)) {
				System.out.println("Value found at position " +i);
				j=i;
				break;
			}
		}
		//String taskid = loginPage.getDriver().findElement(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div[@role='row']["+count+"]/div[@role='gridcell'][7]")).getText();
		//(//input[@title='Delete Attribute'])[1]
		
		
				getDriver().findElement(By.xpath("(//input[@title='Delete Attribute'])["+j+"]")).click();
			
		//	System.out.println("value"+value);
			
				
				Alert Deletealert = getDriver().switchTo().alert();
				Deletealert.accept();
				System.out.println(lbl_success_message_NoDatafound.getText());
				tbx_buttonAdminName_search.sendKeys(arg1);
				jsClick(btn_search_attribute);
				Thread.sleep(2000);
		
		
		
		//div[contains(@id,'contenttablejqxGrid')]/div[1]/div[3]/div
		
		/*for(int i=3; i<=7; i++){
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).clear();
			getDriver().findElement(By.xpath("//div[contains(@id,'contenttablejqxGrid')]/div[1]/div["+i+"]/input")).sendKeys("AUTOUPDATE");
		}*/
	   
}
	
	
	
}
