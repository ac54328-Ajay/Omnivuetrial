package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB; 
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchLocationPage  extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	OVCreateDevicePage devcreatepage;
	OVOrderPage orderpage;
	OVSearchCircuitpage searchcircuit;
	ARMDB armdb;
	OVCreateLocationPage createlocationpage;
	
	//##########################		Tabs section ###################################//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Create Address Within Range')]")
	public WebElementFacade tab_createAddrswithinrange ;
	
	@FindBy(xpath="(.//tab-heading[contains(text(),'Create Address Within Range')]/../../preceding-sibling::li[1])[1]//tab-heading")
	public WebElementFacade tab_createAddrswithinrange_prvmainstab ;
	
	@FindBy(xpath=".//li[@class='ng-isolate-scope active']//a[@ng-click='removeTab(tab.id,$index)']/..")
	public WebElementFacade tab_activetab ;
	
	@FindBy(xpath=".//li[@class='ng-isolate-scope active']//a[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade btn_closeactivetab_clsicon ;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Location Search Results')]")
	public WebElementFacade tab_locationsearchresult;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")			
	public WebElementFacade btn_view;
	
	//###################################   Search Location screen ####################################################//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Street Name']/following-sibling::span//label")
	public WebElementFacade lbl_location_streetname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='City']/following-sibling::span//label")
	public WebElementFacade lbl_location_city;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Zip']/following-sibling::span//label")
	public WebElementFacade lbl_location_zip;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='State']/following-sibling::span//label")
	public WebElementFacade lbl_location_state;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Address#']/following-sibling::span//label")
	public WebElementFacade lbl_location_addressno;
	
	
	//###################################   Advance Search Location screen ####################################################//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='addrange']")
	public WebElementFacade rbd_location_advancesearch_AddressRange;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='invlocation']")
	public WebElementFacade rbd_location_advancesearch_Individuallocation;
	
	@FindBy(id = "statetype")
	public WebElementFacade ddl_advancesearch_individuallocation_state;
	
	@FindBy(xpath = ".//*[@ng-click='locationAdvncSearch()'")
	public WebElementFacade btn_advancesearch_Search;
	
	@FindBy(xpath = ".//tab-heading[contains(text(),'Location Search Results')]")
	public WebElementFacade tab_location_search_result;
	
	@FindBy(xpath = ".//*[@ng-model='invLocSrch.rstate']")
	public WebElementFacade ddl_advancesearch_Addressrange_state;	
	
	@FindBy(xpath = ".//*[@ng-model='invLocSrch.rstreetName']")
	public WebElementFacade ddl_advancesearch_Addressrange_street_name;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='invLocSrch.addrLine1']")
	public WebElementFacade tbx_advancesearch_individuallocn_address1;	
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='invLocSrch.addrLine2']")
	public WebElementFacade tbx_advancesearch_individuallocn_address2;
	
	
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
	
	//###################################   Individual LocationView screen ####################################################//
	//###################################  Location View Page Tab  ####################################################//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditLink();']")
	public WebElementFacade btn_search_locationview_Edit;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='removeLocation();']")
	public WebElementFacade btn_search_locationview_Delete;
	
	//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@ng-click='addNextAddressLocation();']")
	//@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='addNextAddressLocation();']")
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Add Next Address']")
	public WebElementFacade btn_search_locationview_AddNextaddress;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Location Details')]")
	public WebElementFacade tab_search_locationview_locationdetails;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Locations Details')]")
	public WebElementFacade tab_search_Addressrange_locationdetails;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_search_locationview_Auditlogs;
	
	/*@FindBy(xpath = ".//select[@id='streetDirectionPrefix']")
	public WebElementFacade ddl_streetdirprefix_individual_addr;*/
	
	@FindBy(xpath = "(//select[contains(@name,'streetDirectionPrefix')])[2]")
	public WebElementFacade ddl_streetdirprefix_individual_addr;
	
	/*@FindBy(xpath = ".//select[@id='streetDirectionSuffix']")
	public WebElementFacade ddl_streetdirsuffix_individual_addr;*/
	
	@FindBy(xpath = "(//select[contains(@name,'streetDirectionSuffix')])[2]")
	public WebElementFacade ddl_streetdirsuffix_individual_addr;
	
	/*@FindBy(xpath = ".//select[@id='streetType' and @name='streetType']")
	public WebElementFacade ddl_streettype_individual_addr;*/
	
	@FindBy(xpath = "(//select[contains(@name,'streetType')])[2]")
	public WebElementFacade ddl_streettype_individual_addr; 
	
	@FindBy(xpath = "//button[@class='ov-button-prime' and @ng-click='switchToEditLink();']")
	public WebElementFacade btn_edit_individual_addr;
	
	
    @FindBy(xpath = "(.//select[contains(@name,'streetDirectionPrefix')])[3]\"))")
	public WebElementFacade lbl_street_prefix_individual_addr;
    
    
    @FindBy(xpath = "(.//select[contains(@name,'streetDirectionSuffix')])[3]")
	public WebElementFacade lbl_street_suffix_individual_addr;
    
    
    @FindBy(xpath = "(.//select[contains(@name,'streetType')])[3]")
	public WebElementFacade lbl_streettype_individual_addr; 
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
	
	//###################################  Address Range Action buttons  ####################################################//
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Add Next Address']")
	public WebElementFacade btn_search_Addressrange_view_ADDNXTAddress;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='addIndividualAddress();']")
	public WebElementFacade btn_search_Addressrange_view_ADDINDIVIDUALAddress;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit Address Range']")
	public WebElementFacade btn_search_Addressrange_view_EditAddressrange;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@ng-click='removeLocation();']")
	public WebElementFacade btn_search_Addressrange_view_DeleteAddressrange;	
	

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save']")
	public WebElementFacade btn_locationedit_save;
	//29/6/18------Sonalin
	@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-repeat='row in viewRows']//label/..//div[contains(@ng-switch-when,'t')])[6]")              
    public WebElementFacade lbl_streetDirectionSuffix_addressRange_value; 
	
	@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-repeat='row in viewRows']//label/..//div[contains(@ng-switch-when,'t')])[9]")              
    public WebElementFacade lbl_streetDirectionPrefix_addressRange_value; 

	
	/*@FindBy(xpath="(//*[@id='left-content-tab']/div/div/div[1]/div/div/div[5]/div[2]/div/div[2]/ng-include/div/span/div/label)[2]")              
    public WebElementFacade lbl_streetDirectionSuffix_addressRange_value_2nd_timeSearch	; 
	
	@FindBy(xpath="(//*[@id='left-content-tab']/div/div/div[1]/div/div/div[5]/div[3]/div/div[2]/ng-include/div/span/div/label)[2]")              
    public WebElementFacade lbl_streetDirectionPrefix_addressRange_value_2nd_timeSearch; */
	 
	@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-repeat='row in viewRows']//label/..//div[contains(@ng-switch-when,'t')])[6]")              
    public WebElementFacade lbl_streetDirectionSuffix_addressRange_value_2nd_timeSearch	; 
	
	@FindBy(xpath="(//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-repeat='row in viewRows']//label/..//div[contains(@ng-switch-when,'t')])[9]")              
    public WebElementFacade lbl_streetDirectionPrefix_addressRange_value_2nd_timeSearch; 
	 
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[text()='Street Dir Suffix']/../span/div/label")              
    public WebElementFacade lbl_streetDirectionSuffix_indivisualLocation_value; 
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//label[text()='Street Dir Prefix']/../span/div/label")              
    public WebElementFacade lbl_streetDirectionPrefix_indivisualLocation_value; 
	
	@FindBy(xpath="(.//*[@id='left-content-tab']//label[text()='Street Dir Suffix']/../span/div/label)[5]")              
    public WebElementFacade lbl_streetDirectionSuffix_indivisualLocation_value_2nd; 
	
	@FindBy(xpath="(.//*[@id='left-content-tab']//label[text()='Street Dir Prefix']/../span/div/label)[5]")              
    public WebElementFacade lbl_streetDirectionPrefix_indivisualLocation_value_2nd;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")              
    public WebElementFacade tab_addressRange_tab; 
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[4]/a/tab-heading")              
    public WebElementFacade tab_1stLocationCreatedfromAddressRange_tab; 
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[6]/a/tab-heading")              
    public WebElementFacade tab_2ndLocationCreatedfromAddressRange_tab;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[10]/a/tab-heading")              
    public WebElementFacade tab_addressRange_tab2;
	
	//--------------	Check with sairam whats the difference between above one and his xpaths	-------------------------------//
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@title='View Location'])[1]")
    public WebElementFacade btn_view_Individual_Address_within_range;
    
	@FindBy(xpath="(//*[contains(@id,'row0jqxGrid')]/div[1]/div/input)[3]")              
    public WebElementFacade btn_view_Individual_Address_within_range_2nd_timeSearch; 
	
    @FindBy(xpath="(//label[contains(text(),'Service Address Range id')]/..//label)[2]")
    public WebElementFacade lbl_Addressrangeid_in_addressRange_page;
    
    @FindBy(xpath="(//label[contains(text(),'Address Range ID')]/..//label)[2]")
    public WebElementFacade lbl_Addressrangeid_in_Individual_Address_page;
    
    @FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditLocation();']")
    public WebElementFacade btn_Edit_Individual_Address_within_range;

    @FindBy(xpath="//label[contains(text(),'Address Range Id')]")
    public WebElementFacade label_AddressRangeId_in_Edit_Individual_Address;

    @FindBy(xpath="//label[contains(text(),'Address Range Id')]")
	public WebElementFacade lbl_AddressRangeId_in_Edit_Individual_Address; 
    
    
    @FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveLocation();']")
    public WebElementFacade btn_Save_Editview_Individual_Address_within_range;
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Services']")
		public WebElementFacade tab_services; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='CTag Pool']")
		public WebElementFacade tab_ctag;

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Orders']")
		public WebElementFacade tab_orders;

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Contacts']")
		public WebElementFacade tab_contact;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='BAM Report']")
		public WebElementFacade tab_bamreport;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Circuit Details']")
		public WebElementFacade tab_circuitdetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='Activations']")
		public WebElementFacade tab_Activations;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='ARMOR']")
		public WebElementFacade tab_Armor;
		
		//Newly Added By MOHIT
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Subscribers']")
		public WebElementFacade tab_Subscriber;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Circuits']")
		public WebElementFacade tab_Circuits;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Tasks']")
		public WebElementFacade tab_Tasks;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Locations']")
		public WebElementFacade tab_Locations;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Devices']")
		public WebElementFacade tab_Devices;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//a[text()='Facilities']")
		public WebElementFacade tab_facilities;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Device Ports']")
		public WebElementFacade tab_Device_ports;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Service Areas']")
		public WebElementFacade tab_Service_Areas;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='TIRKS']")
		public WebElementFacade tab_TIRKS;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Performance Monitoring']")
		public WebElementFacade tab_Performance;	
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='VLAN / Virtual Ports']")
		public WebElementFacade tab_Virtual_Ports;
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	//###################################  AddreLocation View Page Tab  ####################################################//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Low Street#']/following-sibling::span//label")
		public WebElementFacade lbl_serachpage_Addressrange_lowno; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='High Street#']/following-sibling::span//label")
		public WebElementFacade lbl_serachpage_Addressrange_highno; 
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Street Name']/following-sibling::span//label")
		public WebElementFacade lbl_addressrange_view_streetname;
		
	
		
		//--------------------------		Locations Related tab in Address range  ----------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//i[@id='refreshLocationButton']")
		public WebElementFacade btn_addressrange_locnrt_refreshicon;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='alert alert-danger']")
		public WebElementFacade lbl_relatedtab_alertmsg;
		
		
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		
		//###################################   Subscriber Related tab validations ####################################################//
		
			//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Add Subscriber Association'])[1]")
				public WebElementFacade btn_SubscriberRT_AddSubsassciation_nodata;
				
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Add Subscriber Association'])[2]")
						public WebElementFacade btn_SubscriberRT_AddSubsassciation_withdata;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@ng-model='invSubscriber.subscriberName']")
		public WebElementFacade tbx_SubscriberRT_AddSubsassciation_name;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@ng-click='lookUp()']")
		public WebElementFacade btn_SubscriberRT_AddSubsassciation_lookup;
		
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@ng-click='addServiceToList(subscriberLookupData.checked,subscriberLookupData)'])[1]")
		public WebElementFacade cbx_SubscriberRT_AddSubsassciation_result;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//button[@value='Asssociate Subscribers']")
		public WebElementFacade btn_SubscriberRT_AddSubsassciation_associate;
		
		
	
	//###################################   Advance Search Location screen ####################################################//
	
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
	
	//###################################   Advance Search Location screen ####################################################//
	
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		

		//------------------- 	Alert Message 	--------------------------//
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
		public WebElementFacade lbl_createpage_locnalert_msg; 
	
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]/button")
		public WebElementFacade btn_createpage_locnalert_msgclsicon; 
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//i[contains(@class,'ov-refresh-icon')]")
		public WebElementFacade btn_RT_refreshicon; 
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
		public WebElementFacade lbl_searchpage_locnalert_msg; 
		
	
		//###########################################################	Related tab  Actions ################################################################//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")				//change the row to 0
		public WebElementFacade btn_RT_view;
		
		@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")
		 public WebElementFacade btn_OrderRT_viewicon;
		
		@FindBy(xpath = "(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetailDsp')])[1]")
				 public WebElementFacade btn_taskRT_viewicon;
		
		@FindBy(xpath = "(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@title='View Task'])[1]")
				 public WebElementFacade btn_taskRT_viewicon1;
		
	    
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')])[1]")	
				public WebElementFacade lbl_RT_alertmsg;
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]/button)[1]")	
		public WebElementFacade btn_RT_alertmsg_clsicon;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert-danger')]")
		public WebElementFacade lbl_alert_message_no_data_related_tabs;
		
		@FindBy(xpath=".//*[contains(@class,'main-tab')]//li[@class='ng-isolate-scope active']/preceding-sibling::li[1]//tab-heading")
		public WebElementFacade tab_activescreen_prvioussibling;
		
		//#######################################################################################################################################################################//
		
		//###########################################################	Individual Location Advance  Actions ################################################################//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class!='ng-hide']/div/div/label[contains(@class,'control-label')]")
		public List<WebElementFacade> lbl_individuallocn_allXapath;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@class='']/div/div/label[contains(@class,'control-label')]")
		public List<WebElementFacade> lbl_addressrange_allXapath;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='city']")
		public WebElementFacade ddl_locnedit_lcation_city;
		
		@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//*[@id='NewConstructionIndicator']")
		public WebElementFacade ddl_locnedit_lcation_newConstructionIndicator;
		
		@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//*[@id='LegacyCompanyArea']")
		public WebElementFacade ddl_locnedit_lcation_LegacyCompanyArea;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='state']")
		public WebElementFacade ddl_locnedit_lcation_state;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='indicator']")
		public WebElementFacade ddl_locnedit_lcation_indicator;
		
		//#######################################################################################################################################################################//
		
		
		//###########################################################	Audit Log validation ################################################################//
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//input[@ng-click='getOVAuditLogs()']")
		public WebElementFacade btn_locnview_auditlog_getlogs;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//span[text()='Action Type']")
		public WebElementFacade lbl_locnview_auditlog_actiontypeheader;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Logs')]/../../preceding-sibling::li//tab-heading")
		public WebElementFacade tab_locnview_auditlog_previoustab;
		
		
		
		
		//#######################################################################################################################################################################//
		
		//###########################################################	Address Range view validation ################################################################//
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Low Street#']/following-sibling::span//label")
		public WebElementFacade lbl_viewaddressrange_lowno;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='High Street#']/following-sibling::span//label")
		public WebElementFacade lbl_viewaddressrange_highno;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Street Name']/following-sibling::span//label")
		public WebElementFacade lbl_viewaddressrange_streetname;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='createBulkUpdate()' and  @class='ov-button-prime']")
        public WebElementFacade btn_update_bulk_location_update_page;

		
		
		//#######################################################################################################################################################################//
		//###########################################################	Edit Address Range validation ################################################################//
		@FindBy(xpath="//div[@class='tab-pane ng-scope active']//*[@id='streetDirectionPrefix']")              
	       public WebElementFacade ddl_streetDirectionPrefix_addressRange;
		
		@FindBy(xpath="//div[@class='tab-pane ng-scope active']//*[@id='streetDirectionSuffix']")              
	       public WebElementFacade ddl_streetDirectionSuffix_addressRange; 

		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='lowstreet']")
		public WebElementFacade tbx_editaddressrange_lowno;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='highstreet']")
		public WebElementFacade tbx_editaddressrange_highno;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='street']")
		public WebElementFacade tbx_editaddressrange_streetname;
		
		@FindBy(xpath =" .//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='streetType']")
		public WebElementFacade ddl_editaddressrange_streetype;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='state']")
		public WebElementFacade ddl_editaddressrange_state;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='city']")
		public WebElementFacade ddl_editaddressrange_city;
		
		@FindBy(xpath ="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='zip']")
		public WebElementFacade tbx_editaddressrange_zip;
		
		@FindBy(xpath="//div[@class='tab-pane ng-scope active']//*[@id='serviceRangeId']")              
	       public WebElementFacade tbx_serviceRangeId;

		//#######################################################################################################################################################################//
		
		
		//-----------------------------------Location update Create drop down--------------------------------//
        
        @FindBy(xpath=".//*[@id='basicearch']/div[9]/input[1]")
        public WebElementFacade tbx_BeginningAddressNumber; 
        
        @FindBy(xpath=".//*[@id='basicearch']/div[9]/input[2]")
        public WebElementFacade tbx_EndingAddressNumber; 
        
        @FindBy(xpath=".//*[@id='basicearch']/div[9]/select[1]")
        public WebElementFacade ddl_State_LcationUpadate; 
        
        @FindBy(xpath=".//*[@id='basicearch']/div[9]/select[2]")
        public WebElementFacade ddl_City_LcationUpadate; 
        
        @FindBy(xpath=".//*[@id='basicearch']/div[9]/input[3]")
        public WebElementFacade tbx_Zip1; 
        
        @FindBy(xpath=".//*[@id='basicearch']/div[9]/input[4]")
        public WebElementFacade tbx_Zip2;
        
        //Old Street Information section of Location update page//
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='streetDirectionPrefix']")
        public WebElementFacade ddl_StreetDirPrefix_Old;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active'].//*[@id='street']")
        public WebElementFacade tbx_StreetName_Old;     
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='streetType']")
        public WebElementFacade ddl_StreetType_Old;     
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='streetDirectionSuffix']")
        public WebElementFacade ddl_StreetDirSuffix_Old;
        
        //new Street Information section of Location update page//
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newstreetDirectionPrefix']")
        public WebElementFacade ddl_StreetDirPrefix_New;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newStreet']")
        public WebElementFacade tbx_StreetName_New;     
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newStreetType']")
        public WebElementFacade ddl_StreetType_New;     
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newstreetDirectionSuffix']")
        public WebElementFacade ddl_StreetDirSuffix_New;
//###########################################################################################################################################################		
		
		
		
		
		
		//#######################################################################################################################################################################//
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void advance_contact_search(String subtype) throws Throwable{
		ddl_advancesearch_individuallocation_state.selectByVisibleText("FL-Florida");
	}
	
	public ArrayList<String> location_advancesearch_searchslider(String searchwith) throws Throwable{
		
		ArrayList<String> name=new ArrayList<String>();
		//String[] name = null;
		slf4jLogger.info("Street Name:"+lbl_location_streetname.getText());
		slf4jLogger.info("City:"+lbl_location_city.getText());
		slf4jLogger.info("Zip:"+lbl_location_zip.getText());
		slf4jLogger.info("State:"+lbl_location_state.getText());
		
		if(!lbl_location_streetname.getText().isEmpty() && !lbl_location_city.getText().isEmpty() && !lbl_location_zip.getText().isEmpty() && !lbl_location_state.getText().isEmpty()){
			name.add(0, lbl_location_streetname.getText());
			name.add(1, lbl_location_city.getText());
			name.add(2, lbl_location_zip.getText());
			name.add(3, lbl_location_state.getText());
			//name[1]=tbx_contact_lastname.getText().replaceAll("\\s","");
		} else {
			throw new Error("Invalid Location details");
		}
		
		
		return name;		
	}
	
	public void tabname_validations() throws Throwable{
		
		Thread.sleep(5000);
		String locationname=searchcircuit.tab_search_result_details.getText().replaceAll("\\s", "");
	//	if(btn_search_locationview_Edit.isCurrentlyVisible()){
		
		
		if(!lbl_serachpage_Addressrange_lowno.isCurrentlyVisible()) {
		if(locationname.equals(lbl_location_addressno.getText().replaceAll("\\s", "")+lbl_location_streetname.getText().replaceAll("\\s", ""))){
			slf4jLogger.info("Location tab Name is matching with field name");
		} else {
			slf4jLogger.info("Invalid Location name;"+lbl_location_addressno.getText()+lbl_location_streetname.getText());
			throw new Error("Location tab Name is NOT matching with field name");
			}
		} else {		
			
			
			if(locationname.equals(lbl_serachpage_Addressrange_lowno.getText().replaceAll("\\s", "")+"-"+lbl_serachpage_Addressrange_highno.getText().replaceAll("\\s", "")+lbl_addressrange_view_streetname.getText().replaceAll("\\s", ""))){
				slf4jLogger.info("Location tab Name is matching with field name");
			} else {
				slf4jLogger.info("Location tab Name is NOT matching with field name");
				throw new Error("Location tab Name is NOT matching with field name");
			}
		}
	//	}
	}
	
	public void Location_search_Sanity_Validation() throws Throwable{
		waitForElement(tab_locationsearchresult); Thread.sleep(2000);
		
		if(!btn_search_locationview_AddNextaddress.isCurrentlyVisible()){
		if(btn_view.isCurrentlyVisible()){
			jsClick(btn_view);
			Thread.sleep(2000);
			
		}
		}
		waitForElement(btn_search_locationview_AddNextaddress);Thread.sleep(2000);
		tabname_validations();	
		
		if(!tab_search_locationview_Auditlogs.isCurrentlyVisible()){
			throw new Error("Audit logs Tab is not Visible in Location view page");
		}
		
		if(!btn_search_Addressrange_view_ADDINDIVIDUALAddress.isCurrentlyVisible()){
			
		
		if(!tab_search_locationview_locationdetails.isCurrentlyVisible()){
			throw new Error("Location Details Tab is not Visible in Individual Location view page");
		}
		
		
		
		if(!btn_search_locationview_Edit.isCurrentlyVisible() && !btn_search_locationview_Edit.isCurrentlyEnabled()){
			throw new Error("Edit button is not Visible & enabled in Individual Location view page");
		}
		
		if(!btn_search_locationview_Delete.isCurrentlyVisible() && !btn_search_locationview_Delete.isCurrentlyEnabled()){
			throw new Error("Delete button is not Visible & enabld in Individual Location view page");
		}
		
		if(!btn_search_locationview_AddNextaddress.isCurrentlyVisible()){
			throw new Error("Add Next Address button is not Visible in Individual Location view page");
			
		}
		
		//#################################		Related Tab validations  ###############################################//
		
		//################################ Related Tabs Validations in Location view ############################################//
		  
				
		if(!tab_Circuits.isCurrentlyVisible()){
			throw new Error("Circuit Related Tab is missing in Location view page");
		}
		
		if(!tab_contact.isCurrentlyVisible()){
			throw new Error("Contact Related Tab is missing in Location view page");
		}
		
		if(!tab_Devices.isCurrentlyVisible()  ){
			throw new Error("Devices Related Tab is missing in Location view page");
		}			
		
		
		if(!tab_Locations.isCurrentlyVisible()){
			throw new Error("Location Related tab is missing in Location view page");
		}
		
		if(!tab_orders.isCurrentlyVisible()){
			throw new Error("Orders Related Tab is missing in Location view page");
		}
		
		if(!tab_Service_Areas.isCurrentlyVisible()){
			throw new Error("Service Area Related Tab is missing in Location view page");
		}			
		
		if(!tab_Subscriber.isCurrentlyVisible()){
			throw new Error("Subscriber Related Tab is missing in Location view page");
		}
				
		if(!tab_Tasks.isCurrentlyVisible()){
			throw new Error("Task Related Tab is missing in Location view page");
		}
		
		if(!tab_TIRKS.isCurrentlyVisible() ){
			throw new Error("TIRKS Related Tab is missing in Location view page");
		}
				
						
		//################################ Related Tabs should not be displayed Circuit view ############################################//
				
		if(tab_Activations.isCurrentlyVisible() ){
			throw new Error("Activation Related Tab is Displayed in Location view page");
		}
		
		if(tab_Armor.isCurrentlyVisible() ){
			throw new Error("ARMOR Related Tab is Displayed in Location view page");
		}
		
		if(tab_bamreport.isCurrentlyVisible() ){
			throw new Error("BAM Report Related tab is Displayed in Location view page");
		}
		
		if(tab_circuitdetails.isCurrentlyVisible() ){
			throw new Error("Circuit Details Related tab is Displayed in Location view page");
		}		
		
		if(tab_ctag.isCurrentlyVisible()){
					throw new Error("CTAG Related Tab is Displayed in Location view page");
		}
		
		if(tab_facilities.isCurrentlyVisible()  ){
			throw new Error("Facilities Related Tab is Displayed in Location view page");
		}
			
		if(tab_services.isCurrentlyVisible()){
			throw new Error("Services Related Tab is Displayed in Location view page");
		}						
				
		if(tab_Device_ports.isCurrentlyVisible()){
			throw new Error("Audit Logs Tab is Displayed in Location view page");
		}				
			
		if(tab_Performance.isCurrentlyVisible()){
			throw new Error("Performance Related Tab is Displayed in Location view page");
		}
				
		if(tab_Virtual_Ports.isCurrentlyVisible()){
			throw new Error("Virtual VLAN Ports Related Tab is Displayed in Location view page");
		}	
		
		//#################################		 Address Range Location validations  ###############################################//
		jsClick(btn_search_locationview_Edit);
		
		} else {
			
			if(!tab_search_Addressrange_locationdetails.isCurrentlyVisible()){
				throw new Error("Location Details Tab is not Visible in Address Range Location view page");
			}
			
			if(!btn_search_Addressrange_view_ADDNXTAddress.isCurrentlyVisible()){
				throw new Error("Add Address Next range is not Visible in Address Range Location view page");
			}
			
			
			if(!btn_search_Addressrange_view_ADDINDIVIDUALAddress.isCurrentlyVisible() && !btn_search_Addressrange_view_ADDINDIVIDUALAddress.isCurrentlyEnabled()){
				throw new Error("Add Individual Addresses button is not Visible & enabld in Address Range Location view page");
			}
			
			if(!btn_search_Addressrange_view_EditAddressrange.isCurrentlyVisible() && !btn_search_Addressrange_view_EditAddressrange.isCurrentlyEnabled()){
				throw new Error("Edit Address Range button is not Visible & enabld in Address Range Location view page");
			}
			
			if(!btn_search_Addressrange_view_DeleteAddressrange.isCurrentlyVisible() && !btn_search_Addressrange_view_DeleteAddressrange.isCurrentlyEnabled()){
				throw new Error("Delete Address Range button is not Visible & enabld in Address Range Location view page");
			}	
		

			
			//#################################		Related Tab validations  ###############################################//
			
			//################################ Related Tabs Validations in Address Range ############################################//
			
			if(!tab_Locations.isCurrentlyVisible()){
				throw new Error("Location Related tab is missing in Location view page");
			}
			
			//################################ Related Tabs should not be displayed Address Range view ############################################//
			
			if(tab_Circuits.isCurrentlyVisible()){
				throw new Error("Circuit Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_contact.isCurrentlyVisible()){
				throw new Error("Contact Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_Devices.isCurrentlyVisible()  ){
				throw new Error("Devices Related Tab is Displayed in Address Range view page");
			}		
			
			if(tab_orders.isCurrentlyVisible()){
				throw new Error("Orders Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_Service_Areas.isCurrentlyVisible()){
				throw new Error("Service Area Related Tab is Displayed in Address Range view page");
			}			
			
			if(tab_Subscriber.isCurrentlyVisible()){
				throw new Error("Subscriber Related Tab is Displayed in Address Range view page");
			}
					
			if(tab_Tasks.isCurrentlyVisible()){
				throw new Error("Task Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_TIRKS.isCurrentlyVisible() ){
				throw new Error("TIRKS Related Tab is Displayed in Address Range view page");
			}	
					
			if(tab_Activations.isCurrentlyVisible() ){
				throw new Error("Activation Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_Armor.isCurrentlyVisible() ){
				throw new Error("ARMOR Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_bamreport.isCurrentlyVisible() ){
				throw new Error("BAM Report Related tab is Displayed in Address Range view page");
			}
			
			if(tab_circuitdetails.isCurrentlyVisible() ){
				throw new Error("Circuit Details Related tab is Displayed in Address Range view page");
			}		
			
			if(tab_ctag.isCurrentlyVisible()){
						throw new Error("CTAG Related Tab is Displayed in Address Range view page");
			}
			
			if(tab_facilities.isCurrentlyVisible()  ){
				throw new Error("Facilities Related Tab is Displayed in Address Range view page");
			}
				
			if(tab_services.isCurrentlyVisible()){
				throw new Error("Services Related Tab is Displayed in Address Range view page");
			}						
					
			if(tab_Device_ports.isCurrentlyVisible()){
				throw new Error("Audit Logs Tab is Displayed in Address Range view page");
			}				
				
			if(tab_Performance.isCurrentlyVisible()){
				throw new Error("Performance Related Tab is Displayed in Address Range view page");
			}
					
			if(tab_Virtual_Ports.isCurrentlyVisible()){
				throw new Error("Virtual VLAN Ports Related Tab is Displayed in Address Range view page");
			}	
			
		 
			
		jsClick(btn_search_Addressrange_view_EditAddressrange);
		
		}
		
		ddl_locnedit_lcation_city.selectByIndex(1);
		ddl_locnedit_lcation_newConstructionIndicator.selectByIndex(1);
		ddl_locnedit_lcation_state.selectByIndex(1);
		//ddl_locnedit_lcation_indicator.selectByIndex(1);
	}
	
	public void Location_action(String action) throws Throwable {
		switch(action){
		case "Add Subscriber Association button":
												if(btn_SubscriberRT_AddSubsassciation_nodata.isCurrentlyVisible()){
													jsClick(btn_SubscriberRT_AddSubsassciation_nodata);
													waitForElement(btn_SubscriberRT_AddSubsassciation_lookup);
													tbx_SubscriberRT_AddSubsassciation_name.type("TEST - JANET");
													jsClick(btn_SubscriberRT_AddSubsassciation_lookup);
													waitForElement(btn_SubscriberRT_AddSubsassciation_associate);
													jsClick(cbx_SubscriberRT_AddSubsassciation_result);Thread.sleep(1000);
													jsClick(btn_SubscriberRT_AddSubsassciation_associate);Thread.sleep(3000);
													
												}break;
		
		case "Delete button":if(btn_search_Addressrange_view_DeleteAddressrange.isCurrentlyVisible()){
							jsClick(btn_search_Addressrange_view_DeleteAddressrange); getDriver().switchTo().alert().accept();Thread.sleep(5000);
						}
							break;
							
		case "Add Individual Addresses button":jsClick(btn_search_Addressrange_view_ADDINDIVIDUALAddress);Thread.sleep(3000);waitForElement(tab_createAddrswithinrange);
												break;
												
		case "Delete-Ranges button": if(lbl_serachpage_Addressrange_lowno.isCurrentlyVisible()){
							
								while(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//input[@ng-click='gridSettings.viewTaskDetail(0)']"))){
									waitForElement(lbl_serachpage_Addressrange_lowno);
									jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//input[@ng-click='gridSettings.viewTaskDetail(0)']")));
									Thread.sleep(4000);
									waitForElement(btn_search_Addressrange_view_DeleteAddressrange);
									Thread.sleep(2000);
									Location_action("Delete button");waitForElement(lbl_createpage_locnalert_msg);
									jsClick(btn_closeactivetab_clsicon);
									Thread.sleep(3000);
									jsClick(tab_createAddrswithinrange_prvmainstab);
									waitForElement(btn_addressrange_locnrt_refreshicon);
									Thread.sleep(3000);
									jsClick(btn_addressrange_locnrt_refreshicon);
									Thread.sleep(4000);
								}
								}
								break;		
								
		case "Edit Address Range button": waitForElement(btn_search_Addressrange_view_EditAddressrange); Thread.sleep(1000);
										jsClick(btn_search_Addressrange_view_EditAddressrange);Thread.sleep(1000);
										
										waitForElement(btn_locationedit_save); 											
											break;
		case "Save button":	waitForElement(btn_locationedit_save); 	
							jsClick(btn_locationedit_save);Thread.sleep(2000);
							waitForElement(lbl_createpage_locnalert_msg);
							break;
		}
		

	}
	
	
	public void verify_validation(String validation) throws Throwable {		
		int low=0,i=0, j=0;int high=0;int diff=0; String Message=null;
		List<WebElement> attributetocompare = null;
		List<WebElementFacade> location_attribute = null;
		ArrayList<String> location_Fieldattributelist=new ArrayList<String>();
		ArrayList<String> List2compare_location_Fieldattributelist=new ArrayList<String>();
		String str_Range_id;
		int Range_id;
		long time;
		List<String> location_range_db_attributes ; 
		
		String streetDirectionPrefix_addressRange_value = null;
		String streetDirectionSuffix_addressRange_value= null; 
		
		switch(validation){
		
		case "Updated bulk location":
            
			 Thread.sleep(1000);
	            Thread.sleep(5000);
				jsClick(createlocationpage.tab_createAddrswithinrange_prvstab);
	            str_Range_id = lbl_Addressrangeid_in_addressRange_page.getText();
	            Range_id = Integer.parseInt(str_Range_id);
	            	//streetName_addressRange_value = lbl_streetName_addressRange_value.getTextValue();
	               //slf4jLogger.info("streetName_addressRange_value...."+streetName_addressRange_value+"str_Range_id -"+Range_id); 
	               
	               break;
		case "Address Range id attributes":
					            tbx_serviceRangeId.isCurrentlyVisible();
					              if (!(tbx_serviceRangeId.isCurrentlyEnabled())) {
					                    slf4jLogger.info("serviceRangeId is dissabled");
					            }
					              else throw new Error("serviceRangeId is not dissabled");
					              break;

		case "Update Editable fields in OV and validate database":
						 str_Range_id = lbl_Addressrangeid_in_addressRange_page.getText();
						 Range_id = Integer.parseInt(str_Range_id);
						System.out.println(Range_id);
						waitForElement(btn_search_Addressrange_view_EditAddressrange);
						jsClick(btn_search_Addressrange_view_EditAddressrange);Thread.sleep(2000);
						tbx_editaddressrange_lowno.type("10"); //--2
						tbx_editaddressrange_highno.type("15"); //--3
						 time = System.currentTimeMillis()/100;
						tbx_editaddressrange_streetname.type("Modify auto"+time);Thread.sleep(1000);
						ddl_editaddressrange_streetype.selectByVisibleText("ALY-Alley");
						ddl_editaddressrange_state.selectByVisibleText("AZ-Arizona");
						Thread.sleep(3000);
						ddl_editaddressrange_city.selectByVisibleText("AMADO");
						tbx_editaddressrange_zip.clear();
						tbx_editaddressrange_zip.sendKeys("12345");	
						jsClick(btn_locationedit_save);Thread.sleep(2000);
						for(int k=3;k<=12;k++){
							location_Fieldattributelist.add(getDriver().findElement(By.xpath("(//div[@ng-repeat='row in viewRows']//label/..//div[contains(@ng-switch-when,'t')])["+k+"]")).getText());
						}
						System.out.println(location_Fieldattributelist);
						Thread.sleep(2000);
						
					//	List<String> location_range_db_attributes = DBConnections.location_range_attributes_values(Range_id);
						 location_range_db_attributes = ARMDB.location_range_attributes_values(Range_id);
						System.out.println(location_range_db_attributes);
						Thread.sleep(3000);
						for(int p=0; p<=location_Fieldattributelist.size()-1; p++){
							for(int q=0; q<=location_range_db_attributes.size()-1; q++){
								if(location_Fieldattributelist.get(p).equalsIgnoreCase(location_range_db_attributes.get(q))){
									System.out.println(location_Fieldattributelist.get(p)+" value is avaliable in Database");
								}
							}
						}
					   break;
					   
		case "Update Editable fields in OV and validate database for location suffix and prefix":
			 str_Range_id = lbl_Addressrangeid_in_addressRange_page.getText();
			 Range_id = Integer.parseInt(str_Range_id);
			System.out.println(Range_id);
			waitForElement(btn_search_Addressrange_view_EditAddressrange);
			jsClick(btn_search_Addressrange_view_EditAddressrange);Thread.sleep(2000);
			tbx_editaddressrange_lowno.type("1"); //--2
			tbx_editaddressrange_highno.type("2"); //--3
			 time = System.currentTimeMillis()/100;
			tbx_editaddressrange_streetname.type("Modify auto"+time);Thread.sleep(1000);
			ddl_editaddressrange_streetype.selectByVisibleText("ALY-Alley");
			ddl_streetDirectionPrefix_addressRange.selectByIndex(1); 
			ddl_streetDirectionSuffix_addressRange.selectByIndex(1);
			
			//ddl_editaddressrange_state.selectByVisibleText("AZ-Arizona");
			Thread.sleep(3000);
			/*ddl_editaddressrange_city.selectByVisibleText("AMADO");
			tbx_editaddressrange_zip.clear();
			tbx_editaddressrange_zip.sendKeys("12345");	*/
			jsClick(btn_locationedit_save);Thread.sleep(2000);
			for(int k=3;k<=12;k++){
				location_Fieldattributelist.add(getDriver().findElement(By.xpath("(//div[contains(@ng-switch-when,'t')])["+k+"]")).getText());
			}
			System.out.println(location_Fieldattributelist);
			Thread.sleep(2000);
			
		//	List<String> location_range_db_attributes = DBConnections.location_range_attributes_values(Range_id);
			 location_range_db_attributes = ARMDB.location_range_attributes_values(Range_id);
			System.out.println(location_range_db_attributes);
			Thread.sleep(3000);
			for(int p=0; p<=location_Fieldattributelist.size()-1; p++){
				for(int q=0; q<=location_range_db_attributes.size()-1; q++){
					if(location_Fieldattributelist.get(p).equalsIgnoreCase(location_range_db_attributes.get(q))){
						System.out.println(location_Fieldattributelist.get(p)+" value is avaliable in Database");
					}
				}
			}
		   break; 

		   
		case "Newly created address rage and its values in DB":
			 /*str_Range_id = lbl_Addressrangeid_in_addressRange_page.getText();
			 Range_id = Integer.parseInt(str_Range_id);*/
			 
			 String STREET_NM =Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC287821 data").getFieldValue("tbx_StreetName_New") ;
			 
 			for(int k=3;k<=9;k++){
				location_Fieldattributelist.add(getDriver().findElement(By.xpath("(//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[contains(@ng-switch-when,'t')])["+k+"]")).getText());
			}
			System.out.println(location_Fieldattributelist);
			Thread.sleep(2000);
			
		//	List<String> location_range_db_attributes = DBConnections.location_range_attributes_values(Range_id);
			 location_range_db_attributes = ARMDB.location_range_attributes_values(STREET_NM);
			System.out.println(location_range_db_attributes);
			Thread.sleep(3000);
			for(int p=0; p<=location_Fieldattributelist.size()-1; p++){
				for(int q=0; q<=location_range_db_attributes.size()-1; q++){
					if(location_Fieldattributelist.get(p).equalsIgnoreCase(location_range_db_attributes.get(q))){
						System.out.println(location_Fieldattributelist.get(p)+" value is avaliable in Database");
					}
				}
			}
		   break; 
		case "Address id and Address range dropdown in edit Individual location page within range":
					           /* waitForElement(btn_view_Individual_Address_within_range);
					            jsClick(btn_view_Individual_Address_within_range);
					             if(lbl_Addressrangeid_in_addressRange_page.getText().equals(lbl_Addressrangeid_in_Individual_Address_page.getText())){
					                   System.out.println("Address range Id is same in Address range and Individual_Address screens");
					            } else throw new Error("Address range Id is not same in Address range and Individual_Address screens");
					            jsClick(btn_Edit_Individual_Address_within_range);
					            label_AddressRangeId_in_Edit_Individual_Address.shouldBeVisible();                
				            break;*/
					Thread.sleep(5000);
			
			waitForElement(btn_view_Individual_Address_within_range);
			jsClick(btn_view_Individual_Address_within_range);
		//	Thread.sleep(10000);
			/*if(lbl_Addressrangeid_in_Individual_Address_page.getText().contains(Range_id)){
				System.out.println("Address range Id is same in Address range and Individual_Address screens");
			} else throw new Error("Address range Id is not same in Address range and Individual_Address screens");*/
			jsClick(btn_Edit_Individual_Address_within_range);Thread.sleep(2000);
			waitForElement(btn_Save_Editview_Individual_Address_within_range);
			lbl_AddressRangeId_in_Edit_Individual_Address.shouldBeVisible();	
			//ddl_Address_Range_in_Edit_Individual_Address.shouldBeVisible();
			 break; 

		
		case "address range Tab is combination of 'Low Street no.-High Street no. Street name'":
								waitForElement(tab_search_locationview_Auditlogs);
								waitForElement(lbl_viewaddressrange_lowno);
								Message=lbl_viewaddressrange_lowno.getText().trim()+"-"+lbl_viewaddressrange_highno.getText().trim()+" "+lbl_viewaddressrange_streetname.getText().trim();
								
										if(!tab_activetab.getText().trim().contains(Message)){
											slf4jLogger.info("address range Tab is not matching combination of 'Low Street no.-High Street no. Street name'");
											throw new Error("address range Tab is not matching combination of 'Low Street no.-High Street no. Street name'");
										}
								break;
								
		case "address attributes are appearing as separate input fields while searcching for address range": 
			
								attributetocompare=getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'columntablejqxGrid')]//span"));
								
								
								for( j=0;j<attributetocompare.size();j++){
									location_Fieldattributelist.add(j, attributetocompare.get(j).getText().trim());
										//slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+locationcreate_Fieldattributelist.get(j));
									}
								//slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+location_Fieldattributelist);
							
								List2compare_location_Fieldattributelist.add(0, "View");
								List2compare_location_Fieldattributelist.add(1, "Range ID");
								List2compare_location_Fieldattributelist.add(2, "Low-High Street Number");
								
								//List2compare_location_Fieldattributelist.add(3, "High Street#*");
								List2compare_location_Fieldattributelist.add(3, "Street Name");									
								List2compare_location_Fieldattributelist.add(4, "Address Indicator");
								List2compare_location_Fieldattributelist.add(5, "City");
								List2compare_location_Fieldattributelist.add(6, "State");
								List2compare_location_Fieldattributelist.add(7, "Zip");		
							
								
								for(i=0;i<location_Fieldattributelist.size();i++){
									if(!location_Fieldattributelist.get(i).equals(List2compare_location_Fieldattributelist.get(i))){
										slf4jLogger.info("Address Range header displaced="+location_Fieldattributelist.get(i));
										slf4jLogger.info("Address Range header list="+List2compare_location_Fieldattributelist.get(i)+" Not matching");
										slf4jLogger.info("location_Fieldattributelist="+location_Fieldattributelist);
										throw new Error("Fields are not matching in  Address Range location header");
									}
								}			
								break;
		
		case "click on audit log tab to verify a log is captured for Update action in Location screen":
								waitForElement(tab_search_locationview_Auditlogs);
								jsClick(tab_search_locationview_Auditlogs);
								waitForElement(btn_locnview_auditlog_getlogs); Thread.sleep(1000);
								jsClick(btn_locnview_auditlog_getlogs);Thread.sleep(2000);
								waitForElement(lbl_locnview_auditlog_actiontypeheader);	
								
								if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//div[text()='UPDATE'])[1]"))){
									slf4jLogger.info("Create Log is not captured in the location Screen");
									throw new Error("Create Log is not captured in the location Screen");
								}								
								jsClick(tab_locnview_auditlog_previoustab); Thread.sleep(2000);
								break;
								
		case "Location address saved successfully. message should be displayed in location screen":
								waitForElement(lbl_createpage_locnalert_msg);
								//System.out.println("Error Message is displayed");
								if(!lbl_createpage_locnalert_msg.getText().trim().contains("Location address saved successfully.")){
									slf4jLogger.info("Invalid message is not displayed");
									throw new Error("Invalid message is not displayed");
									
								}
								jsClick(btn_closeactivetab_clsicon);
								
								break;
								
		case "change the range value & street name in address range page":
							waitForElement(tbx_editaddressrange_lowno);
							tbx_editaddressrange_lowno.type("25");
							tbx_editaddressrange_highno.type("31");
							tbx_editaddressrange_streetname.type("Modify auto");Thread.sleep(1000);										
										break;
										
		case "Location Removed successfully. message should be displayed in location screen":
							waitForElement(lbl_createpage_locnalert_msg);
							//System.out.println("Error Message is displayed");
							if(!lbl_createpage_locnalert_msg.getText().trim().contains("Location Removed successfully.")){
								slf4jLogger.info("Invalid message is not displayed");
								throw new Error("Invalid message is not displayed");
								
							}
							//jsClick(btn_closeactivetab_clsicon);
							
							break;
							
		case "click on audit log tab to verify a log is captured for Create action in Location screen":
					waitForElement(tab_search_locationview_Auditlogs);
					jsClick(tab_search_locationview_Auditlogs);
					waitForElement(btn_locnview_auditlog_getlogs); Thread.sleep(1000);
					jsClick(btn_locnview_auditlog_getlogs);Thread.sleep(2000);
					waitForElement(lbl_locnview_auditlog_actiontypeheader);	
					
					if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//div[text()='CREATE'])[1]"))){
						slf4jLogger.info("Create Log is not captured in the location Screen");
						throw new Error("Create Log is not captured in the location Screen");
					}
					
					
					
					jsClick(tab_locnview_auditlog_previoustab); Thread.sleep(2000);
					
					
					break;
					
		case "click on audit log tab to verify a log is captured for Delete action in Location screen":
			waitForElement(tab_search_locationview_Auditlogs);
			jsClick(tab_search_locationview_Auditlogs);
			waitForElement(btn_locnview_auditlog_getlogs); Thread.sleep(1000);
			jsClick(btn_locnview_auditlog_getlogs);Thread.sleep(2000);
			waitForElement(lbl_locnview_auditlog_actiontypeheader);	
			
			if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//div[text()='DELETE'])[1]"))){
				slf4jLogger.info("Create Log is not captured in the location Screen");
				throw new Error("Create Log is not captured in the location Screen");
			}
			
			
			
			jsClick(tab_locnview_auditlog_previoustab); Thread.sleep(2000);
			
			
			break;			
					
			
		case "search result displayed in location search result": waitForElement(tab_locationsearchresult); Thread.sleep(2000);
					waitForElement(btn_view);
			
					break;
					
		case "enter valid in address line1 and address line2 in Location Advance Search screen":
								waitForElement(tbx_advancesearch_individuallocn_address1);
								tbx_advancesearch_individuallocn_address1.type("%test%");
								
								break;
								
		case "No data found for search criteria message is displayed for invalid search": 
			
							waitForElement(tab_locationsearchresult); 
							//System.out.println("Location Search Result Tab is displayed");
							Thread.sleep(2000); 
							
							waitForElement(lbl_searchpage_locnalert_msg);
							//System.out.println("Error Message is displayed");
							if(lbl_searchpage_locnalert_msg.getText().trim().contains("No data found for search criteria")){
								System.out.println("Error Message is "+lbl_searchpage_locnalert_msg.getText().trim());
								slf4jLogger.info("Error Message is "+lbl_searchpage_locnalert_msg.getText().trim());
							} else throw new Error("Invalid message is not displayed");
							slf4jLogger.info("Invalid message is not displayed");
							jsClick(btn_closeactivetab_clsicon);
			
						break;
						
		case "enter invalid in address line1 and address line2 in Location Advance Search screen":
									waitForElement(tbx_advancesearch_individuallocn_address1);
									tbx_advancesearch_individuallocn_address1.type("test#");
									tbx_advancesearch_individuallocn_address2.type("test#");			
									break;
		
		case "all the available Address Range location fields should be displayed in Location advance screen":
			
								location_attribute=lbl_addressrange_allXapath;
									
									
									for( j=0;j<location_attribute.size();j++){
										location_Fieldattributelist.add(j, location_attribute.get(j).getText().trim());
											//slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+locationcreate_Fieldattributelist.get(j));
										}
									//slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+location_Fieldattributelist);
								
									List2compare_location_Fieldattributelist.add(0, "Low Street #");
									List2compare_location_Fieldattributelist.add(1, "High Street #");
									List2compare_location_Fieldattributelist.add(2, "Street Name %");
									
									//List2compare_location_Fieldattributelist.add(3, "High Street#*");
									List2compare_location_Fieldattributelist.add(3, "Street Type");									
									List2compare_location_Fieldattributelist.add(4, "Street Dir Prefix");
									List2compare_location_Fieldattributelist.add(5, "Street Dir Suffix");
									List2compare_location_Fieldattributelist.add(6, "City %");
									List2compare_location_Fieldattributelist.add(7, "State/Province/Region");
									List2compare_location_Fieldattributelist.add(8, "Zip/Postal Code");
									List2compare_location_Fieldattributelist.add(9, "Indicator");
									List2compare_location_Fieldattributelist.add(10, "Wire Center ID");
									List2compare_location_Fieldattributelist.add(11, "Wire Center CLLI");
									List2compare_location_Fieldattributelist.add(12, "Legacy Company Code");
									
								
									
									for(i=0;i<location_Fieldattributelist.size();i++){
										if(!location_Fieldattributelist.get(i).equals(List2compare_location_Fieldattributelist.get(i))){
											slf4jLogger.info("location_Fieldattributelist="+location_Fieldattributelist.get(i));
											slf4jLogger.info("List2compare_location_Fieldattributelist="+List2compare_location_Fieldattributelist.get(i)+" Not matching");
											slf4jLogger.info("location_Fieldattributelist="+location_Fieldattributelist);
											throw new Error("Fields are not matching in  Address Range location check");
										}
									}
									
									break;
			
		case "all the available Individual location fields should be displayed in Location advance screen": Thread.sleep(2000);
			
									location_attribute=lbl_individuallocn_allXapath;
									
									
									for( j=0;j<location_attribute.size();j++){
										location_Fieldattributelist.add(j, location_attribute.get(j).getText().trim());
											//slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+locationcreate_Fieldattributelist.get(j));
										}
									slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+location_Fieldattributelist);
								
									List2compare_location_Fieldattributelist.add(0, "Location Full Name %");							
									List2compare_location_Fieldattributelist.add(1, "Location Name");
									List2compare_location_Fieldattributelist.add(2, "Building CLLI %");
									List2compare_location_Fieldattributelist.add(3, "Subscriber Name %");
									List2compare_location_Fieldattributelist.add(4, "Street Dir Prefix");			
									List2compare_location_Fieldattributelist.add(5, "Address Prefix");			
									List2compare_location_Fieldattributelist.add(6, "Address Suffix");			
									List2compare_location_Fieldattributelist.add(7, "Street Dir Suffix");
									List2compare_location_Fieldattributelist.add(8, "Address #");
									List2compare_location_Fieldattributelist.add(9, "Street Name %");
									List2compare_location_Fieldattributelist.add(10, "Street Type");
									List2compare_location_Fieldattributelist.add(11, "Address Line 1");
									List2compare_location_Fieldattributelist.add(12, "Address Line 2");			
									List2compare_location_Fieldattributelist.add(13, "OTC");
									List2compare_location_Fieldattributelist.add(14, "City %");
									List2compare_location_Fieldattributelist.add(15, "State/Province/Region");
									List2compare_location_Fieldattributelist.add(16, "Zip/Postal Code");
									
									
									
									
											for(i=0;i<location_Fieldattributelist.size();i++){
												if(!location_Fieldattributelist.get(i).equals(List2compare_location_Fieldattributelist.get(i))){
													slf4jLogger.info("location_Fieldattributelist="+location_Fieldattributelist.get(i));
													slf4jLogger.info("List2compare_location_Fieldattributelist="+List2compare_location_Fieldattributelist.get(i)+" Not matching");
													slf4jLogger.info("location_Fieldattributelist="+location_Fieldattributelist);
													throw new Error("Fields are not matching in Individual location check");
												}
											}
											break;
											
		case "Devices table in Location screen":			
										Thread.sleep(5000);
										
										if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
											waitForElement(btn_RT_view);
										}else {
											slf4jLogger.debug("Device data is not displayed");
											throw new Error("Device data is not displayed");
										}
							
										
										
										break;
		case "Service Areas table in Location screen":
												Thread.sleep(5000);
												
												if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
													waitForElement(btn_RT_view);
													i=5;
													Message=tab_activescreen_prvioussibling.getText().trim();
													while(i!=0){
													if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
														break;
													
													}
													jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='previous']")));
													
													i--;
													
													
												}
													if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
														slf4jLogger.debug("Service data not displayed please check the data");
														throw new Error("Service data not displayed please check the data");
													}
													
												}break;
												
			
			
			
		case "Task table in Location screen":	Thread.sleep(5000);
		
											if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
												waitForElement(btn_taskRT_viewicon1);
												
											}else {
												slf4jLogger.debug("Task is not displayed");
												throw new Error("Task is not displayed");
											}
											
																						break;
			
			
			
		case "Order table in Location screen":	Thread.sleep(3000);
											if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
												waitForElement(btn_OrderRT_viewicon);
											}	else {
													slf4jLogger.debug("Order is not displayed");
													throw new Error("Order is not displayed");
												}												
												
											break;	
		case "Circuit details should be displayed in the Location Screen":
													Thread.sleep(3000);
													
													if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
														waitForElement(btn_RT_view);
														i=5;
														Message=tab_activescreen_prvioussibling.getText().trim();
														while(i!=0){
														if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
															break;
														
														}
														jsClick(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[@title='previous']")));
														
														i--;
														
														
													}
														if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
															slf4jLogger.debug("Circuit data not displayed please check the data");
															throw new Error("Circuit data not displayed please check the data");
														}
														
													}break;
			
												
		case "launch the location displayed in the Circuits screen": 
											Thread.sleep(3000);
											if(!lbl_relatedtab_alertmsg.isCurrentlyVisible()){
												
												waitForElement(btn_RT_view);
												jsClick(btn_RT_view);Thread.sleep(5000);
												
												
											} else {
												slf4jLogger.info("Check the Data is in correct not able to see location details");
												throw new Error("Check the Data is in correct not able to see location details");	
											}
											
											
											
											break;
		case "New subscriber should get associated in Subscribers related tab": 
			
			
			
			
			waitForElement(btn_RT_refreshicon);jsClick(btn_RT_refreshicon);Thread.sleep(3000);
			
			
			break;
		case "Subscriber related tab section in the Location Screen":			
																							Thread.sleep(3000);
																							if(!lbl_relatedtab_alertmsg.isCurrentlyVisible()){
																								waitForElement(btn_SubscriberRT_AddSubsassciation_withdata);
																							} else {
																								waitForElement(btn_SubscriberRT_AddSubsassciation_nodata);
																								
																								
																							}
																						
																							
																							break;
		case "Add Next Address button should be disabled for individual location":
			
			waitForElement(btn_search_Addressrange_view_DeleteAddressrange);
			if(!btn_search_locationview_AddNextaddress.isCurrentlyVisible() || btn_search_locationview_AddNextaddress.isCurrentlyEnabled()){
				slf4jLogger.info("Add Next Addresses button is enabled for individual location");
				throw new Error("Add Next Addresses button is enabled for individual location");
			}
			break;
		case "no locations should be displayed in the Address range location related tab":
										jsClick(tab_createAddrswithinrange_prvmainstab);
										waitForElement(btn_search_Addressrange_view_DeleteAddressrange);
										jsClick(tab_Locations);
										Thread.sleep(1000);
										
										waitForElement(btn_addressrange_locnrt_refreshicon);
										
										jsClick(btn_addressrange_locnrt_refreshicon);
										Thread.sleep(4000);
									/*	if(isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//input[@ng-click='gridSettings.viewTaskDetail(0)']"))){
											slf4jLogger.info("Invalid number of locations are displayed:"+low);
											throw new Error("Invalid number of locations are displayed:"+low);
										}*/
										
										if(!lbl_relatedtab_alertmsg.isCurrentlyVisible()){
											slf4jLogger.info("No message is displayed in location related tab");
											throw new Error("No message is displayed in location related tab");
										}
										
										break;
			
		case "New locations added within range should be displayed in the Address range location related tab": jsClick(tab_createAddrswithinrange_prvmainstab);
												waitForElement(btn_search_Addressrange_view_DeleteAddressrange);
												jsClick(tab_Locations);
												Thread.sleep(1000);
												
												waitForElement(btn_addressrange_locnrt_refreshicon);
												
												jsClick(btn_addressrange_locnrt_refreshicon);
												Thread.sleep(4000);
												
												low=Integer.parseInt(lbl_serachpage_Addressrange_lowno.getText().trim());
												high=Integer.parseInt(lbl_serachpage_Addressrange_highno.getText().trim());
												diff=high-low;
												low=0;
												while(diff!=0){
													if(!isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//input[@ng-click='gridSettings.viewTaskDetail("+low+")']"))){
														slf4jLogger.info("Invalid number of locations are displayed:"+low);
														throw new Error("Invalid number of locations are displayed:"+low);
													}
													low++;
													diff--;
												}
												break;
		
		case "Update Editable fields to null in OV location page and validate database":
								 str_Range_id = lbl_Addressrangeid_in_addressRange_page.getText();
								 Range_id = Integer.parseInt(str_Range_id);
								System.out.println(Range_id);
								waitForElement(btn_search_Addressrange_view_EditAddressrange);
								jsClick(btn_search_Addressrange_view_EditAddressrange);Thread.sleep(2000);
								  time = System.currentTimeMillis()/100;
								tbx_editaddressrange_streetname.type("Modify auto"+time);Thread.sleep(1000);
								ddl_editaddressrange_streetype.selectByIndex(5);
								 
								Thread.sleep(3000);
								ddl_streetDirectionPrefix_addressRange.selectByIndex(0);
								ddl_streetDirectionSuffix_addressRange.selectByIndex(0);
								jsClick(btn_locationedit_save);Thread.sleep(2000);
							/*	for(int k=3;k<=12;k++){
									location_Fieldattributelist.add(getDriver().findElement(By.xpath("(//div[@ng-repeat='row in viewRows']//label/..//div[contains(@ng-switch-when,'t')])["+k+"]")).getText());
								}
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+location_Fieldattributelist);
								Thread.sleep(2000);*/
								
							//	List<String> location_range_db_attributes = DBConnections.location_range_attributes_values(Range_id);
								  location_range_db_attributes = ARMDB.location_range_attributes_null_values(Range_id);
								System.out.println("location_range_db_attributes---------"+location_range_db_attributes);
								Thread.sleep(3000);
								 
									for(int q=0; q<=location_range_db_attributes.size()-1; q++){
										System.out.println("......................."+location_range_db_attributes.get(q));
										if((location_range_db_attributes.get(q)==null)){
											System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+location_range_db_attributes.get(q)+" Database validated null value");
										}
									
										
										/*btn_viewIconOfLocationRelativetab_addressRange.click();
										Thread.sleep(2000);
										waitFor(expectedCondition)
		*/						}
							   break; 					
		case "Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range":
	           
				Thread.sleep(5000);
			
				waitForElement(btn_view_Individual_Address_within_range);
				jsClick(btn_view_Individual_Address_within_range);
			
			jsClick(btn_Edit_Individual_Address_within_range);Thread.sleep(2000);
			waitForElement(btn_Save_Editview_Individual_Address_within_range);
			slf4jLogger.info("ddl_streetDirectionPrefix_addressRange====="+ddl_streetDirectionPrefix_addressRange.getValue());
			slf4jLogger.info("ddl_streetDirectionSuffix_addressRange---"+ddl_streetDirectionSuffix_addressRange.getValue());
				if ("".equalsIgnoreCase(ddl_streetDirectionPrefix_addressRange.getValue())&& "".equals(ddl_streetDirectionSuffix_addressRange.getValue())) {
					slf4jLogger.info(ddl_streetDirectionPrefix_addressRange.getValue()+"---Street Dir Prefix,Street Dir Suffix is null");
				}
				else	throw new Error("Street Dir Prefix,Street Dir Suffix is not null in indivisual street");
			break;  
					
			
		case "updated Street Dir Prefix,Street Type,Street Dir Suffix in edit Individual location page within range":
			 
			Thread.sleep(7000);
			/*//lbl_streetDirectionSuffix_addressRange_value.click();
			Thread.sleep(1000);
			streetDirectionPrefix_addressRange_value =lbl_streetDirectionSuffix_addressRange_value_2nd_timeSearch.getTextValue();
			//lbl_streetDirectionPrefix_addressRange_value.click();
			Thread.sleep(2000);
			streetDirectionSuffix_addressRange_value=lbl_streetDirectionPrefix_addressRange_value_2nd_timeSearch.getTextValue();*/
			Thread.sleep(1000);
				
				waitForElement(btn_view_Individual_Address_within_range_2nd_timeSearch);
				jsClick(btn_view_Individual_Address_within_range_2nd_timeSearch);
				Thread.sleep(7000);
				 
				waitForElement(btn_Edit_Individual_Address_within_range);
				 
				
				/*slf4jLogger.info("ddl_streetDirectionPrefix_addressRange=====........."+streetDirectionSuffix_addressRange_value +"lbl_streetDirectionSuffix_indivisualLocation_value..."+lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getTextValue());
				
				slf4jLogger.info("ddl_streetDirectionSuffix_addressRange---.........."+streetDirectionSuffix_addressRange_value+"lbl_streetDirectionSuffix_indivisualLocation_value..."+lbl_streetDirectionSuffix_indivisualLocation_value_2nd.getTextValue());*/
				slf4jLogger.info("lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getValue() = "+lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getTextValue()+"lbl_streetDirectionSuffix_indivisualLocation_value_2nd.getValue() = "+ lbl_streetDirectionSuffix_indivisualLocation_value_2nd.getTextValue());
				if ("".equalsIgnoreCase(lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getTextValue())&& "".equals(lbl_streetDirectionSuffix_indivisualLocation_value_2nd.getTextValue())) {
					slf4jLogger.info(lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getValue()+"---Street Dir Prefix,Street Dir Suffix is null");
				}
				else	throw new Error("Street Dir Prefix,Street Dir Suffix is not null in indivisual street");
				 
				break;  
		case "Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range":
			 
			Thread.sleep(7000);
			lbl_streetDirectionSuffix_addressRange_value.click();
			Thread.sleep(1000);
			streetDirectionPrefix_addressRange_value =lbl_streetDirectionSuffix_addressRange_value.getTextValue();
		lbl_streetDirectionPrefix_addressRange_value.click();
			Thread.sleep(1000);
			streetDirectionSuffix_addressRange_value=lbl_streetDirectionPrefix_addressRange_value.getTextValue();
			Thread.sleep(2000);
			jsClick(createlocationpage.tab_createAddrswithinrange_prvstab);
				waitForElement(btn_view_Individual_Address_within_range);
				jsClick(btn_view_Individual_Address_within_range);
				Thread.sleep(7000);
				 
				waitForElement(btn_Edit_Individual_Address_within_range);
				//waitForElement(btn_Save_Editview_Individual_Address_within_range);
				/*slf4jLogger.info("ddl_streetDirectionPrefix_addressRange.getText()====="+ddl_streetDirectionPrefix_addressRange.getText() +"ddl_streetDirectionPrefix_addressRange.selectByIndex(1).getTextValue()..."+ddl_streetDirectionPrefix_addressRange.selectByIndex(1).getTextValue());
				
				slf4jLogger.info("ddl_streetDirectionSuffix_addressRange.getText()---"+ddl_streetDirectionSuffix_addressRange.getValue()+"dl_streetDirectionSuffix_addressRange.selectByIndex(1).getTextValue()..."+ddl_streetDirectionSuffix_addressRange.selectByIndex(1).getTextValue());
				*/
				
				slf4jLogger.info("ddl_streetDirectionPrefix_addressRange=====........."+streetDirectionSuffix_addressRange_value +"lbl_streetDirectionSuffix_indivisualLocation_value..."+lbl_streetDirectionPrefix_indivisualLocation_value.getTextValue());
				
				slf4jLogger.info("ddl_streetDirectionSuffix_addressRange---.........."+streetDirectionSuffix_addressRange_value+"lbl_streetDirectionSuffix_indivisualLocation_value..."+lbl_streetDirectionSuffix_indivisualLocation_value.getTextValue());
				
				if (streetDirectionPrefix_addressRange_value.equalsIgnoreCase(lbl_streetDirectionPrefix_indivisualLocation_value.getText())&& streetDirectionSuffix_addressRange_value.equalsIgnoreCase(lbl_streetDirectionSuffix_indivisualLocation_value.getTextValue()) ){
					slf4jLogger.info(lbl_streetDirectionPrefix_indivisualLocation_value.getValue()+"---Street Dir Prefix,Street Dir Suffix is not null");
				}
				else	throw new Error("Street Dir Prefix,Street Dir Suffix is  null in indivisual street");
				
				
				/*if (ddl_streetDirectionPrefix_addressRange.getText().equalsIgnoreCase(ddl_streetDirectionPrefix_addressRange.selectByIndex(1).getTextValue())&& ddl_streetDirectionSuffix_addressRange.getText().equalsIgnoreCase(ddl_streetDirectionSuffix_addressRange.selectByIndex(1).getTextValue())) {
						slf4jLogger.info(ddl_streetDirectionPrefix_addressRange.getValue()+"---Street Dir Prefix,Street Dir Suffix is null");
					}
					else	throw new Error("Street Dir Prefix,Street Dir Suffix is not null in indivisual street");*/
				break;  
												
											 
		case "updated Street Dir Prefix,Street Dir Suffix for not null in edit Individual location page within range":
			 
			Thread.sleep(12000);
			//lbl_streetDirectionSuffix_addressRange_value.click();
			/* if(!(lbl_streetDirectionSuffix_addressRange_value_2nd_timeSearch.isCurrentlyEnabled()))
			 {
			waitFor(lbl_streetDirectionSuffix_addressRange_value_2nd_timeSearch);
			 }*/
			Thread.sleep(1000);
			streetDirectionPrefix_addressRange_value =lbl_streetDirectionSuffix_addressRange_value_2nd_timeSearch.getTextValue();
			//lbl_streetDirectionPrefix_addressRange_value.click();
			Thread.sleep(2000);
			streetDirectionSuffix_addressRange_value=lbl_streetDirectionPrefix_addressRange_value_2nd_timeSearch.getTextValue();
			Thread.sleep(1000);
				
				waitForElement(btn_view_Individual_Address_within_range_2nd_timeSearch);
				jsClick(btn_view_Individual_Address_within_range_2nd_timeSearch);
				Thread.sleep(7000);
				 
				waitForElement(btn_Edit_Individual_Address_within_range);
				 
				
				slf4jLogger.info("ddl_streetDirectionPrefix_addressRange=====........."+streetDirectionSuffix_addressRange_value +"lbl_streetDirectionSuffix_indivisualLocation_value..."+lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getTextValue());
				
				slf4jLogger.info("ddl_streetDirectionSuffix_addressRange---.........."+streetDirectionSuffix_addressRange_value+"lbl_streetDirectionSuffix_indivisualLocation_value..."+lbl_streetDirectionSuffix_indivisualLocation_value_2nd.getTextValue());
				
				if (streetDirectionPrefix_addressRange_value.equalsIgnoreCase(lbl_streetDirectionPrefix_indivisualLocation_value_2nd.getText())&& streetDirectionSuffix_addressRange_value.equalsIgnoreCase(lbl_streetDirectionSuffix_indivisualLocation_value_2nd.getTextValue()) ){
					//slf4jLogger.info(lbl_streetDirectionPrefix_indivisualLocation_value.getValue()+"---Street Dir Prefix,Street Dir Suffix is not null");
					slf4jLogger.info("---Street Dir Prefix,Street Dir Suffix is not null");
				}
				else	throw new Error("Street Dir Prefix,Street Dir Suffix is  null in indivisual street");
				
				
				/*if (ddl_streetDirectionPrefix_addressRange.getText().equalsIgnoreCase(ddl_streetDirectionPrefix_addressRange.selectByIndex(1).getTextValue())&& ddl_streetDirectionSuffix_addressRange.getText().equalsIgnoreCase(ddl_streetDirectionSuffix_addressRange.selectByIndex(1).getTextValue())) {
						slf4jLogger.info(ddl_streetDirectionPrefix_addressRange.getValue()+"---Street Dir Prefix,Street Dir Suffix is null");
					}
					else	throw new Error("Street Dir Prefix,Street Dir Suffix is not null in indivisual street");*/
				break;  


		
												
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
	    WebDriverWait wait = new WebDriverWait(getDriver(),3000);				   
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		
	    return element;
	}	
	
	public void click_on_updateButton_bulk_location_update_page(String action) throws Throwable {
        jsClick(btn_update_bulk_location_update_page);
        Thread.sleep(1000);
 }
	
	public void updates_street_dir_prefix_suffix_streettype_in_individual_address() {
		try {
			
			jsClick(btn_edit_individual_addr);
			Thread.sleep(2000);
			waitForElement(ddl_streetdirprefix_individual_addr);
			Select s1=new Select(ddl_streetdirprefix_individual_addr);
			s1.selectByIndex(2);
			waitForElement(ddl_streetdirsuffix_individual_addr);
			Select s2=new Select(ddl_streetdirsuffix_individual_addr);
			s2.selectByIndex(2);
			waitForElement(ddl_streettype_individual_addr);
			Select s3=new Select(ddl_streettype_individual_addr);
			s3.selectByIndex(2);
		}catch(Exception e) {
		e.printStackTrace();			
		}
	}

	
 
}
