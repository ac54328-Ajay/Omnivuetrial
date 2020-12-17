package com.ctl.it.qa.omnivue.tools.pages.common;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class OVServiceSearchPage extends OmniVuePage {

	

		LoginPage loginPage ;
		UserSteps enduser;
		OVCreateServicePage servicecreatepage ;
		
		OVCreateDevicePage devcreatepage;
		
		
		public static String Expected_Activation_ID;
		
		public static String Expected_Corelation_ID;
		
		public static String Expected_CUID;
		
		
		
		
		
		
	
		@FindBy(xpath="//label[text()='Search Type']/following-sibling::select")
		public WebElementFacade ddl_searchType;
		
		@FindBy(xpath="//label[text()='Inventory Type']/following-sibling::select")
		public WebElementFacade ddl_invntryType;
		
		@FindBy(xpath = ".//select[@ng-model='searchParam.serviceType']")
		public WebElementFacade ddl_servicetype ;
		
		
		@FindBy(xpath =".//*[@ng-click='searchInventory();' and @ng-hide='isForWidgetCreate']")
		public WebElementFacade btn_search ;
		
		
			
			
			
			
		// HSI Service validation
		
		
		//xpath of Provisioning Status = Not Specified

				@FindBy(xpath = ".//select[@ng-model='serviceDetail. SERVICE2PROVISIONSTATUS']")
				public WebElementFacade ddl_provisioningStatus;

				//xpath of Service Profile index = 50

				@FindBy(xpath = ".//select[@ng-model='serviceDetail.SERVICE_PROFILE_INDEX']")
				public WebElementFacade ddl_serviceProfileIndex;

				//xpath of Alias2 field

				@FindBy(xpath = ".//input[@ng-model='serviceDetail.ALIAS2']")
				public WebElementFacade tbx_alias2;

				//xpath of Downstream Rate = 1500

				@FindBy(xpath = ".//select[@ng-model='serviceDetail.DOWNSTREAM_RATE']")
				public WebElementFacade ddl_DownstreamRate;

				//xpath of Provisioned Downstream Rate = 300

				@FindBy(xpath = ".//select[@ng-model='serviceDetail.PROVISIONED_DOWNSTREAM_RATE']")
				public WebElementFacade ddl_provisionedDownstreamRate;

				//xpath of  Upstream Rate  =    1500

				@FindBy(xpath = ".//select[@ng-model='serviceDetail.UPSTREAM_RATE']")
				public WebElementFacade ddl_UpstreamRate;

				//xpath of Provisioned Upstream Rate = 300

				@FindBy(xpath = ".//select[@ng-model='serviceDetail.PROVISIONED_DOWNSTREAM_RATE']")
				public WebElementFacade ddl_provisionedUpstreamRate;

				//save button

			
		
				
				@FindBy(xpath = ".//*[@id='left-content-tab']/div/div/div[1]/div/div/div/div[1]")
				public WebElementFacade lbl_message ;
				
		
		// End of HSI service validation
			
			
				@FindBy(xpath = ".//button[@ng-click='searchInventory();' and @ng-hide='isForWidgetCreate']")
				public WebElementFacade btn_searchservice ;
				
				@FindBy(xpath = ".//input[@ng-click='editServiceDetails(serviceDetail.SERVICE2SERVICETYPE)']")
				public WebElementFacade btn_edit_service ;
				
				
				
				@FindBy(xpath = ".//*[@id='left-content-tab']/div/div/div[1]/div/div/div/div[13]/div[1]/div[3]/div[2]/span[1]/label[1]")
				public WebElementFacade lbl_demo ;
				
				
				
				
				
		// HOST service 
				
				@FindBy(xpath =".//*[@id='servicesrchname1']")
				public WebElementFacade tbx_servicename ;
				
				@FindBy(xpath = "//a[@ng-click='changeMiddleTab(tab)' and contains (text(),'Subscriber')]")
				public WebElementFacade tab_reltab_Subscriber ;
				
				
				// Subscriber Name from Details Page
				
				@FindBy(xpath = ".//label[text()='Subscriber Attributes']/../div/div[1]/span/ng-include/div/span[2]/div/label")
				public WebElementFacade tab_detailsPage_Subscriber ;
				
				
		
				
				
		// xpath's on Activation of service				
				
				@FindBy(xpath=".//*[@id='activateButton']")
				public WebElementFacade btn_activate;
				
				@FindBy(xpath=".//input[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='actOrderNo.OrderNo']")
				public WebElementFacade tbx_ordernumber;
				
				@FindBy(xpath=".//*[@id='devicelookup']/div[6]//input[1]")
				public WebElementFacade btn_ActivateSubmit;
				
				@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[1]")
				public WebElementFacade  tbx_activationMsg;
				
				@FindBy(xpath = ".//*[@ng-click='changeMiddleTab(tab)' and contains(text(),'Activation')]")
				public WebElementFacade tab_reltab_Activation ;
				
				
				
			    @FindBy(xpath="//table[@class='table table-bordered table1 table2']")
			    public WebElementFacade table;
				
				
				
			    
		// Revert functionality related
			    
			    @FindBy(xpath=".//*[@id='revertButton']")
			    public WebElementFacade  btn_Revert;
			    
			    @FindBy(xpath=".//input[@ng-model='invServiceRevert.revertOrderNo']")
			    public WebElementFacade  tbx_Revert_OrderNumber;
			    
			    @FindBy(xpath=".//*[@id='devicelookup']/div[6]/textarea")
			    public WebElementFacade  tbx_Revert_Reason;
			    
			    @FindBy(xpath=".//*[@id='devicelookup']/div[7]//input[1]")
			    public WebElementFacade  btn_Revert_Submit;
			    
			    @FindBy(xpath=".//*[@class='ng-binding alert alert-success' and @ng-show='showAlert']")
			    public WebElementFacade  tbx_Revert_Message;
			    
			    
			   
			    
			    
		// Related tab EVC MEMBERS
			    
			    @FindBy(xpath=".//a[text()='EVC Members']")
				public WebElementFacade tab_EVC_Members;
			    
			    
		//###################################### Service Action Buttons ########################################// 
			    
			    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Edit']")
			    public WebElementFacade  btn_EditService;  
			    
			    @FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Save' and @class='ov-button-prime']")
			    public WebElementFacade btn_SaveService; 			    
			    
			    
			    @FindBy(xpath = "  .//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@value='Delete']")
			    public WebElementFacade btn_deleteService; 
			    
			   
			    
		
	 //##################################################################################################################// 

	//###################################### Service View fields ########################################// 
			    
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='MCO']/../../following-sibling::span//label")
			    public WebElementFacade  lbl_serviceview_mco;  
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='MCO']/following-sibling::div/label")
    public WebElementFacade  lbl_serviceview_mco2;  
			  

	//##################################################################################################################// 
	
	//###################################### Service Edit fields ########################################// 	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[contains(text(),'MCO')]/../../following-sibling::span//select")
    public WebElementFacade  ddl_serviceedit_mco;  
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@id='mcoval']")
    public WebElementFacade  ddl_serviceedit_mco1;  
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='MCO']/following-sibling::div/select")
    public WebElementFacade  ddl_serviceedit_mco2;  
	
	//##################################################################################################################// 
	
		// Add Members to a Service
			    
			    @FindBy(xpath = ".//input[@class='cmdButton' and @value='Add Member']")
			    public WebElementFacade btn_AddMember;
			    
			    @FindBy(xpath = ".//*[@class='ng-pristine ng-untouched ng-valid' and @ng-model='member.memberType']")
			    public WebElementFacade ddl_MemberType;
			    
			    @FindBy(xpath = ".//input[@ng-click='openServiceAssociationMemberLookUp()']")
			    public WebElementFacade btn_OpenLookup;
			    
			    @FindBy(xpath = ".//div[2]//div[2]//ng-include//input[@class='form-control ng-pristine ng-untouched ng-valid'][@ng-model='memberFullName']")
			    public WebElementFacade tbx_PM_UNI_MemberName;
			    
			    @FindBy(xpath = ".//div[2]//div[2]//ng-include//input[1][@Value='LookUp'][@ng-click='serviceAssociationMemberlookUp(memberFullName)']")
			    public WebElementFacade btn_MemberLookUp;
			    
			    @FindBy(xpath = ".//*[@id='serviceAssociationMember_look_up']//a")
			    public WebElementFacade lnk_membername ;
			    
			    @FindBy(xpath = ".//select[@class='ng-pristine ng-untouched ng-valid' and @ng-model='member.ParentNciCodes']")
			    public WebElementFacade ddl_PM_EVC_NCI_Code ;
			    
			    @FindBy(xpath = ".//*[@ng-click='saveMember(member)' and @value='Save Member']")
			    public WebElementFacade btn_SaveMember;

			    @FindBy(xpath = ".//div[4][@class='ng-binding alert alert-success'][@ng-show='showAlert'][@ng-class='alert.className']")
			    public WebElementFacade lbl_AddMemberMessage;
			    
			    @FindBy(xpath = ".//*[@ng-controller='subscriberAssServicesCtrl']//*[@id='serviceAssociationMember']/div[1]/div/input")
			    public WebElementFacade tbx_Non_PM_UNI_MemberName;
			    
			    @FindBy(xpath = ".//select[@class='ng-valid ng-dirty ng-touched' and @ng-model='member.ParentNciCodes']")
			    public WebElementFacade ddl_NonPM_EVC_NCI_Code ;
			    
			    
			    
			   
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
		/*
		 * Started defining Methods or Function
		 * 	    
		 */
			    
			    
			    
			    
		// Click on Related tab Tasks and get the data form the list
				
				
				public void get_Task_details_from_Rel_tab (){
					
					for(int i=3; i<=46; i++)
					{
					String taskidcolumnfinder = ".//*[contains(@id,'columntabletaskGrid')]/div["+i+"]/div/div[1]";
					String taskidnumber =".//*[contains(@id,'row0taskGrid_')]/div["+i+"]/div";
							
					if(loginPage.getDriver().findElement(By.xpath(taskidcolumnfinder)).getText().equals("Task ID")){
						
						String tasknumber = loginPage.getDriver().findElement(By.xpath(taskidnumber)).getText();
						System.out.println("Column number = "+ i +"  Task ID = "+tasknumber);
						break;
						}
					}
				}
				
				
		// Click on Related tab Subscriber and get the data from the list
				
				public String get_Subscriber_from_Rel_tab (){
					
					String Subscriber_Name_Rel_tab = "";				

					for (int i=1 ; i<10 ; i++)
					{
					String col_header = ".//*[@id='columntablegenericSubscriberGrid']/div["+i+"]/div/div[1]/span" ;
					String row_value =".//*[@id='row0genericSubscriberGrid']/div["+i+"]/div" ;

						if(loginPage.getDriver().findElement(By.xpath(col_header)).getText().equals("Subscriber Name"))
							{
							Subscriber_Name_Rel_tab = loginPage.getDriver().findElement(By.xpath(row_value)).getText();
							System.out.println("Coulumn number = "+ i +" "+"Subscriber Name = "+ Subscriber_Name_Rel_tab);
							break;
							}

					}
					
					return Subscriber_Name_Rel_tab;
				}
				
				
				// Subscriber section
				
				public void fill_Subscriber_details(){
					
					jsClick(servicecreatepage.btn_subscriberlookupicon);
					servicecreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
					jsClick(servicecreatepage.btn_lookup);
					waitFor(servicecreatepage.lnk_subcribername);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					jsClick(servicecreatepage.lnk_subcribername);
					
					String subscriber_name = servicecreatepage.tbx_subscribername.getTextValue();
					System.out.println("successfully selected the Subscriber = "+ subscriber_name);	
				}
			
				
				
				
	// Click on Activations related tab	
				
				public void click_Activation_tab(){
					
					jsClick(tab_reltab_Activation);
				}
				
			
				
	// Navigate to Edit Page
				
				public void goto_edit_page(){
					
					jsClick(btn_EditService);

					System.out.println("Clicked on Edit Button");
				}
				
				
	// Expected Values from Activation Related System Tab 
				
				public void activation_table(){
					
					List<WebElement> ele = table.findElements(By.tagName("tr"));
					
					int length = ele.size();
					
					System.out.println(length);
					
					String start ="//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[";
					
					String Aid = "1]/td[3]";
					
					String Cid = "1]/td[13]";
					
					String User = "1]/td[15]";
					
					Expected_Activation_ID = getDriver().findElement(By.xpath(start+Aid)).getText();
					
					Expected_Corelation_ID = getDriver().findElement(By.xpath(start+Cid)).getText();
					
					Expected_CUID = getDriver().findElement(By.xpath(start+User)).getText();
					
					System.out.println("Expected Activation ID = " + Expected_Activation_ID);
					
					System.out.println("Expected Corelation ID = " + Expected_Corelation_ID);
					
					System.out.println("Expected CUID = " + Expected_CUID);
					
				}		
				
				
				

		
		
		@Override
		public WebElementFacade getUniqueElementInPage() {
		
			return null;
		}
		
		public void verify_validation(String validation)throws Throwable {		
			String message=null;
			switch(validation){
			case "MCO field should be able to get updated with WNPKFLDSLM, MPLSMNDSLM, MPLSMNONT, WPKFLETHEQ & MPLSMNETHQ drop down value in Service view":
							waitForElement(btn_EditService);
							if(lbl_serviceview_mco2.isCurrentlyVisible()){
								message=lbl_serviceview_mco2.getText().trim();
							}else 
								if(lbl_serviceview_mco.isCurrentlyVisible()){
									message=lbl_serviceview_mco.getText().trim();
								}	
							
							
							
							jsClick(btn_EditService);waitForElement(btn_SaveService); Thread.sleep(5000);
							if(ddl_serviceedit_mco.isCurrentlyVisible()){
								ddl_serviceedit_mco.selectByVisibleText("WNPKFLDSLM");
							} else 
								if(ddl_serviceedit_mco2.isCurrentlyVisible()){
									ddl_serviceedit_mco2.selectByVisibleText("WNPKFLDSLM");
								} else 
									if(ddl_serviceedit_mco1.isCurrentlyVisible()){
										ddl_serviceedit_mco1.selectByVisibleText("WNPKFLDSLM");
									}
									
								
							jsClick(btn_SaveService);waitForElement(btn_EditService);
							
							if(lbl_serviceview_mco2.isCurrentlyVisible()){
								if(!lbl_serviceview_mco2.getText().trim().contains("WNPKFLDSLM")){
									throw new Error("WNPKFLDSLM value is not matching with field in service view:"+lbl_serviceview_mco2.getText().trim());
								}
							}else 
								if(lbl_serviceview_mco.isCurrentlyVisible()){
									if(!lbl_serviceview_mco.getText().trim().contains("WNPKFLDSLM")){
										throw new Error("WNPKFLDSLM value is not matching with field in service view:"+lbl_serviceview_mco.getText().trim());
									}
								}	
							
							
							jsClick(btn_EditService);waitForElement(btn_SaveService); Thread.sleep(5000);
							if(ddl_serviceedit_mco.isCurrentlyVisible()){
								ddl_serviceedit_mco.selectByVisibleText("MPLSMNDSLM");
							} else 
								if(ddl_serviceedit_mco2.isCurrentlyVisible()){
									ddl_serviceedit_mco2.selectByVisibleText("MPLSMNDSLM");
								}else 
									if(ddl_serviceedit_mco1.isCurrentlyVisible()){
										ddl_serviceedit_mco1.selectByVisibleText("MPLSMNDSLM");
									}
								
							jsClick(btn_SaveService);waitForElement(btn_EditService);
							
							if(lbl_serviceview_mco2.isCurrentlyVisible()){
								if(!lbl_serviceview_mco2.getText().trim().contains("MPLSMNDSLM")){
									throw new Error("MPLSMNDSLM value is not matching with field in service view:"+lbl_serviceview_mco2.getText().trim());
								}
							}else 
								if(lbl_serviceview_mco.isCurrentlyVisible()){
									if(!lbl_serviceview_mco.getText().trim().contains("MPLSMNDSLM")){
										throw new Error("MPLSMNDSLM value is not matching with field in service view:"+lbl_serviceview_mco.getText().trim());
									}
								}	
							
							
							jsClick(btn_EditService);waitForElement(btn_SaveService); Thread.sleep(5000);
							if(ddl_serviceedit_mco.isCurrentlyVisible()){
								ddl_serviceedit_mco.selectByVisibleText("MPLSMNETHQ");
							} else 
								if(ddl_serviceedit_mco2.isCurrentlyVisible()){
									ddl_serviceedit_mco2.selectByVisibleText("MPLSMNETHQ");
								}else 
									if(ddl_serviceedit_mco1.isCurrentlyVisible()){
										ddl_serviceedit_mco1.selectByVisibleText("MPLSMNETHQ");
									}
								
							jsClick(btn_SaveService);waitForElement(btn_EditService);
							if(lbl_serviceview_mco2.isCurrentlyVisible()){
								if(!lbl_serviceview_mco2.getText().trim().contains("MPLSMNETHQ")){
									throw new Error("MPLSMNETHQ value is not matching with field in service view:"+lbl_serviceview_mco2.getText().trim());
								}
							}else 
								if(lbl_serviceview_mco.isCurrentlyVisible()){
									if(!lbl_serviceview_mco.getText().trim().contains("MPLSMNETHQ")){
										throw new Error("MPLSMNETHQ value is not matching with field in service view:"+lbl_serviceview_mco.getText().trim());
									}
								}	
							
							
							
							jsClick(btn_EditService);waitForElement(btn_SaveService); Thread.sleep(5000);
							if(!message.isEmpty()){
							if(ddl_serviceedit_mco.isCurrentlyVisible()){
								ddl_serviceedit_mco.selectByVisibleText(message);
							} else 
								if(ddl_serviceedit_mco2.isCurrentlyVisible()){
									ddl_serviceedit_mco2.selectByVisibleText(message);
								}else 
									if(ddl_serviceedit_mco1.isCurrentlyVisible()){
										ddl_serviceedit_mco1.selectByVisibleText(message);
									}
							} else {
								if(ddl_serviceedit_mco.isCurrentlyVisible()){
									ddl_serviceedit_mco.selectByVisibleText("-Select-");
								} else 
									if(ddl_serviceedit_mco2.isCurrentlyVisible()){
										ddl_serviceedit_mco2.selectByVisibleText("-Select-");
									}else 
										if(ddl_serviceedit_mco1.isCurrentlyVisible()){
											ddl_serviceedit_mco1.selectByVisibleText("-Select-");
										}
							}
							jsClick(btn_SaveService);waitForElement(btn_EditService);break;
				
			
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
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);				   
		    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
			
		    return element;
		}	
		
	 //TEST
}
