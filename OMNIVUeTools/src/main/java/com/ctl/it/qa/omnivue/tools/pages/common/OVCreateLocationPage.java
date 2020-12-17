package com.ctl.it.qa.omnivue.tools.pages.common;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
 

public class OVCreateLocationPage extends OmniVuePage {

	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

		
		
		/*
		// Select the Create Type
		
		@FindBy(xpath="//label[text()='Create Type']/following-sibling::select")
		public WebElementFacade ddl_createType;
		
		
		// Select the Inventory Type
		
		@FindBy(xpath="//*[@ng-show='showInventoryType']/select")
		public WebElementFacade ddl_invntryTypeCreate ;
		
		
		// Select the Location Type
		
		@FindBy(xpath=".//*[@ng-show='showLocationType']/select")
		public WebElementFacade ddl_locationType;
		
		
		// Click on Launch Address Range Create Form
		@FindBy(xpath="html/body/form/div/div[1]/div/div[2]/div[2]/ng-include/div/div/div[3]/div/div[3]/button[1]")
		public WebElementFacade btn_LaunchCreateForm;
		
		*/
		//------------------- 	Tab section 	--------------------------//
	
	@FindBy(xpath = ".//tab-heading[contains(text(),'Create Address Range')]")
		public WebElementFacade tab_createpage_Addressrange; 
	
	@FindBy(xpath = ".//tab-heading[contains(text(),'Create Individual Location')]")
	public WebElementFacade tab_createpage_Individuallcn; 
	
	@FindBy(xpath = ".//li[@class='ng-isolate-scope']//a[@ng-click='removeTab(tab.id,$index)']/..")
	public WebElementFacade tab_inactiveheadertab; 
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Create Address Within Range')]")
	public WebElementFacade tab_createAddrswithinrange ;
	
	@FindBy(xpath="(.//tab-heading[contains(text(),'Create Address Within Range')]/../../preceding-sibling::li[1])[1]//tab-heading")
	public WebElementFacade tab_createAddrswithinrange_prvstab ;
	
	
	@FindBy(xpath=".//tab-heading[contains(text(),'Location Bulk Update')]")
	public WebElementFacade tab_Location_Bulk_Update ;
	
		//------------------- 	Alert Message 	--------------------------//
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]")
		public WebElementFacade lbl_createpage_locnalert_msg; 
	
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@ng-show='showAlert' and contains(@class,'alert alert')]/button")
		public WebElementFacade btn_createpage_locnalert_msgclsicon; 
	
		//-------------		Action buttons		-------------------------//
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createAddressRange();']")
		public WebElementFacade btn_CreateAddressRange;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createIndividualLocation();']")
		public WebElementFacade btn_CreateIndividuallcn;
		
		
		
		//=========================			Addresses Within Range Serach Page 	==================//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Low Street#']/following-sibling::span//label")
		public WebElementFacade lbl_serachpage_Addressrange_lowno; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='High Street#']/following-sibling::span//label")
		public WebElementFacade lbl_serachpage_Addressrange_highno; 
		
		
		//----------	Address Range create form fields 	-----------------------------//
		
		@FindBy(id="lowstreet")
		public WebElementFacade tbx_low_street;
		
		
		@FindBy(id="highstreet")
		public WebElementFacade tbx_high_street;
		
		
		@FindBy(id="street")
		public WebElementFacade tbx_street_name;
		
		@FindBy(id="streetType")
		public WebElementFacade ddl_streettype;
		
		@FindBy(id="indicator")
		public WebElementFacade ddl_indicator;
		
		
		@FindBy(xpath=".//*[@id='state' and @ng-show='field.display']")
		public WebElementFacade ddl_State;
		
		@FindBy(id="city")
		public WebElementFacade ddl_City;
		
		@FindBy(id="zip")
		public WebElementFacade tbx_zip;

		
		
		@FindBy(id="NewConstructionIndicator")
		public WebElementFacade ddl_NewConstructionIndicator;
		
		@FindBy(id="LegacyCompanyArea")
		public WebElementFacade ddl_LegacyCompanyArea;
		
		
		@FindBy(id="WireCenterRemarks")
		public WebElementFacade tbx_WireCenterRemarks;
		
		@FindBy(id="WireCenterCLLI")
		public WebElementFacade tbx_WireCenterCLLI;
		
		@FindBy(id="TaxCode")
		public WebElementFacade tbx_TaxCodeTAR;

		@FindBy(id="RateZone")
		public WebElementFacade tbx_RateZone;
		
		@FindBy(id="WireCenterID")
		public WebElementFacade tbx_WireCenterID;
		
		
		@FindBy(id="TTA")
		public WebElementFacade tbx_TTA;
		
		
		@FindBy(id="CALA")
		public WebElementFacade tbx_CALA;
		
		
		@FindBy(xpath = "//*[@class='ng-binding alert alert-danger']")
		public WebElementFacade lbl_error_message;
		
		
		//------------------		Addresses Within Range Create Form 	---------------------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createIndividualLocation();']")
		public WebElementFacade btn_CreateAddresses_within_Range;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='addNextAddressLocation();']")
		public WebElementFacade btn_CreateAddresses_within_Range_Addnxtaddrss;
		
		@FindBy(id="addressNumber")
		public WebElementFacade tbx_CreateAddresses_within_Range_Address_Number;		

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Location Role')]/../../following-sibling::span//select[@id='AddressRole']")
		public WebElementFacade ddl_CreateAddresses_within_Range_locnrole;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='zip2']")
		public WebElementFacade tbx_CreateAddresses_within_Range_zip2;		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='NewConstructionIndicator']")
		public WebElementFacade ddl_CreateAddresses_within_Range_newconstructionind;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='sWCCLLI']")
		public WebElementFacade tbx_CreateAddresses_within_Range_swcclli;
		
		
		//################		Create Individual Location Page ########################//	
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='locationRole']")
		public WebElementFacade ddl_create_individuallcn_lcnrole;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='clliCode']")
		public WebElementFacade tbx_create_individuallcn_ICOsite_cllicode;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[@ng-click='validateCLLI()']/i")
		public WebElementFacade btn_create_individuallcn_ICOsite_chkicon;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='addressNumber']")
		public WebElementFacade tbx_create_individuallcn_addrssno;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='street']")
		public WebElementFacade tbx_create_individuallcn_streetname;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='NewConstructionIndicator']")
		public WebElementFacade ddl_create_individuallcn_newcontrctor;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='sWCCLLI']")
		public WebElementFacade tbx_create_individuallcn_swcclli;
		
		
		
		@FindBy(xpath="//*[@id='locationRole']")
		public WebElementFacade cmb_Location_Role;
		
		@FindBy(id = "locationFullName")
		public WebElementFacade tbx_LocationFullName ;
		
		@FindBy(id = "addressPrefix")
		public WebElementFacade tbx_AddressPrefix ;
		
		@FindBy(id = "addressSuffix")
		public WebElementFacade tbx_AddressSuffix ;
		
		@FindBy(id = "streetDirectionPrefix")
		public WebElementFacade ddl_StreetDirPrefix ;
		
		@FindBy(id = "street")
		public WebElementFacade tbx_StreetName ;
		
		@FindBy(id = "streetType")
		public WebElementFacade ddl_StreetType ;
		
		@FindBy(id = "streetDirectionSuffix")
		public WebElementFacade ddl_StreetDirSuffix ;
		
		@FindBy(xpath = "//*[@ng-model='entity[field.name]' and @id ='zip']")
		public WebElementFacade tbx_Zip_1 ;
		
		@FindBy(xpath = "//*[@ng-disabled='disableZip2Text']")
		public WebElementFacade tbx_Zip_2 ;
		
		
		
		
		// Add To Range section
		
		
					@FindBy(xpath=".//*[@id='addRangeY']")
					public WebElementFacade rdb_Add_To_Range;
		
					@FindBy(xpath=".//*[@id='addrangeVal']")
					public WebElementFacade ddl_Address_Range_value;	
			
					@FindBy(xpath = "//input[@ng-click='findAddressRange();']")
					public WebElementFacade btn_Find_Address_Range;
		
		
	
	
					
			
			// End of Primary Address section
	
	
			// Secondary Address section
					
					@FindBy(xpath=".//*[@id='LocationDesignator1']")
					public WebElementFacade ddl_location_Designator_1;	
					
					@FindBy(xpath=".//*[@id='LocationDesignator1Value']")
					public WebElementFacade tbx_location_Designator_1_value;
					
					@FindBy(xpath=".//*[@id='LocationDesignator2']")
					public WebElementFacade ddl_location_Designator_2;
					
					@FindBy(xpath=".//*[@id='LocationDesignator2Value']")
					public WebElementFacade tbx_location_Designator_2_value;
					
					@FindBy(xpath=".//*[@id='LocationDesignator3']")
					public WebElementFacade ddl_location_Designator_3;
					
					@FindBy(xpath=".//*[@id='LocationDesignator3Value']")
					public WebElementFacade tbx_location_Designator_3_value;
					
					@FindBy(xpath=".//*[@id='notes']")
					public WebElementFacade tbx_location_Remarks;
					
					@FindBy(xpath=".//*[@id='NewConstructionIndicator']")
					public WebElementFacade ddl_New_Construction_Ind;
					
					@FindBy(xpath=".//*[@id='buildingclli1']")
					public WebElementFacade tbx_Building_CLLi;
					
					@FindBy(xpath=".//*[@id='sWCCLLI']")
					public WebElementFacade tbx_SWC_CLLi;
					
					@FindBy(xpath=".//*[@id='latitude']")
					public WebElementFacade tbx_Latitude;
					
					@FindBy(xpath=".//*[@id='longitude']")
					public WebElementFacade tbx_Longitude;
					
					@FindBy(xpath=".//*[@id='hcoordinates']")
					public WebElementFacade tbx_HCoordinate;
					
					@FindBy(xpath=".//*[@id='vcoordinates']")
					public WebElementFacade tbx_VCoordinate;
					
					@FindBy(xpath=".//*[@id='lATA']")
					public WebElementFacade tbx_LATA;
					
					@FindBy(xpath=".//*[@id='nPA']")
					public WebElementFacade tbx_NPa;
					
					@FindBy(xpath=".//*[@id='nXX']")
					public WebElementFacade tbx_NXX;
					
	
			// End of Secondary Location
	
					
					
			//	Create button Individual Location
					
					@FindBy(xpath=".//*[@value='Create']")
					public WebElementFacade btn_Individual_Location;
					

					
			// Individual Location Create form and 360 view
					
					
					@FindBy(xpath=".//*[@value='Add Next Address']")
					public WebElementFacade btn_Add_Next_Address;		
					
					@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[7]/div[2]/div[8]/div/div[3]/ng-include/div/label")
					public WebElementFacade lbl_Address_Range_ID;	
					
					
					@FindBy(xpath=".//*[@ng-click='onClickTab(tab)']")
					public WebElementFacade tab_Individual_location_Create_form;
					
					@FindBy(xpath=".//*[@id='0']/ng-include/div/div[1]")
					public WebElementFacade lbl_Individual_location_Create_form;	
					
					
					
					
		// Error message on SWC CLLi Field
					
		@FindBy(xpath=".//div[@ng-show='showAlert' and  @class='ng-binding alert alert-danger']")
		public WebElementFacade lbl_SWC_CLLI_Error_messge;	
					
	
		
		/*
		
		// Click on Create location button
		@FindBy(id=".//*[@id='0']/ng-include/div/div[3]/div/span/input[1]")
		public WebElementFacade btn_CreateButtonLocation;
		
		*/
		@FindBy(id = "addrange")
		public WebElementFacade btn_AddressRange_radio_button ;
		
		
		//******************** Pun form Declarations	***********************	//
		
		@FindBy(xpath=".//*[@ng-model='fileUploaded']/following-sibling::div//span[text()='Choose file']")
		public WebElementFacade btn_Pun_Choosepath;	
		
		@FindBy(xpath=".//*[@ ng-click='importPun()']")
		public WebElementFacade btn_Pun_import;	
		
		@FindBy(xpath=".//*[@ng-click='hidesuccessMsg();']")
		public WebElementFacade lbl_Pun_successmsgtag;	
		

		//############################################# ####################################### ####################################### //
		//#############################################   Location Create Sanity Validations ######################################//
		//############################################# ####################################### ####################################### //	
		
		//--------------------------------------  Create Location Action button & Tab validation ------------------------------------------//
		
		
		@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
		public WebElementFacade tab_currentlydisplayed ;		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createIndividualLocation();']")
		public WebElementFacade btn_create_Individuallocation_Create; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createAddressRange();']")
		public WebElementFacade btn_create_AddressRange_Create; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='reset();']")
		public WebElementFacade btn_createlocation_Reset;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
		public List<WebElementFacade> lbl_allXapath;
	
		
		//------------------------------------------------------------------------------------------------------------------------------------//
		
		//--------------------------------------  Location Create Primary address section ------------------------------------------//
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Primary Address']")
		public WebElementFacade lbl_location_createform_Primaryaddress ; 
		
		//------------------------------------------------------------------------------------------------------------------------------------//
		
		
		//--------------------------------------  Location CreateLocation Role Information section ------------------------------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Location Role Information']")
		public WebElementFacade lbl_location_createform_locationrole ; 
				
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='ICO Site']")
		public WebElementFacade lbl_location_createform_locationrole_icosite ; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='ICO Site']/following-sibling::input[@value='Y']")
		public WebElementFacade btn_location_createform_locationrole_icosite_yes ; 
		//------------------------------------------------------------------------------------------------------------------------------------//
				

		//--------------------------------------  Location Create Primary Address Information section ------------------------------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Primary Address Information']")
		public WebElementFacade lbl_location_createform_Primaryaddressinformation ; 
				
		//------------------------------------------------------------------------------------------------------------------------------------//
		
	//--------------------------------------  Location Create Secondary Address Information section ------------------------------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Secondary Address Information']")
		public WebElementFacade lbl_location_createform_Secondaryaddressinformation ;  
				
		//------------------------------------------------------------------------------------------------------------------------------------//
		
	//--------------------------------------  Location Create Address Range Information section ------------------------------------------//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='Address Range Information']")
		public WebElementFacade lbl_location_createform_Addressrangeinformation ; 			
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='indicator']")
		public WebElementFacade ddl_indicator_location_createform_Addressrangeinformation; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='state']")
		public WebElementFacade ddl_State_location_createform_Addressrangeinformation; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='city']")
		public WebElementFacade ddl_City_location_createform_Addressrangeinformation; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='NewConstructionIndicator']")
		public WebElementFacade ddl_NewConstructionInd_location_createform_Addressrangeinformation;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='LegacyCompanyArea']")
		public WebElementFacade ddl_LegacyCompanyArea_location_createform_Addressrangeinformation;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='RestrictedAddressCode']")
		public WebElementFacade ddl_createform_Addressrange_restrictedlocn;
		
		
		//------------------------------------------------------------------------------------------------------------------------------------//
		
		//--------------------------------------  PUN Craete Information section ------------------------------------------//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//b")			
		public List<WebElementFacade> lbl_Create_PUN_allXapath;
		
	//	.//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//div[@class='detail-section-border']
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//table//th")			
		public List<WebElementFacade> lbl_Create_PUN_table1_allXapath; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//table//td")			
		public List<WebElementFacade> lbl_Create_PUN_table2_allXapath;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//div[contains(text(),'Select PUN')]")
		public WebElementFacade lbl_CraetePUN_SelectPunsection ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//div[contains(text(),'PUN Information')]")
		public WebElementFacade lbl_CraetePUN_PUNInfosection ; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//div[contains(text(),'Full Names to Specific Address Field Mappings')]")
		public WebElementFacade lbl_CraetePUN_Specificaddresssection ; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//div[contains(text(),'Address Range Detected in Inventory')]")
		public WebElementFacade lbl_CraetePUN_Rangedetectedsection ; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='bulkAddressCreateCtrl']//div[contains(text(),'Verify/Manage Address Ranges')]")
		public WebElementFacade lbl_CraetePUN_verifysection ; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[text()='Choose file']")
		public WebElementFacade btn_CraetePUN_Section1_Choosefile ; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='importPun()']")
		public WebElementFacade btn_CraetePUN_Section1_Import ;  
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='getPUNAuditLogs();']")
		public WebElementFacade btn_CraetePUN_Section1_Auditlogs ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='saveUpdate();']")
		public WebElementFacade btn_CraetePUN_Section3_Save ;  
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='AddRange()']")
		public WebElementFacade btn_CraetePUN_Section4_AddRange ; 

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//b[contains(text(),'PUN Addresses with Available Range')]")
		public WebElementFacade lbl_CraetePUN_Section4_PUN_Availableranges ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//b[contains(text(),'PUN Addresses with No Available Range')]")
		public WebElementFacade lbl_CraetePUN_Section4_PUN_NO_Availableranges ; 
		 
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[text()='Create Address']")
		public WebElementFacade btn_CraetePUN_Section5_Createaddress ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='addNew(punInfoId)']")
		public WebElementFacade btn_CraetePUN_Section5_Addadresses ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='remove(punInfoId, punDetailIds)']")
		public WebElementFacade btn_CraetePUN_Section5_Removeaddress ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='retrySendingData()']")
		public WebElementFacade btn_CraetePUN_Section5_Retry ;
		//------------------------------------------------------------------Location Update---------------------------------------------------------
		
		@FindBy(xpath="(.//*[contains(text(),'Beginning')]/following-sibling::input)[1]")
		public WebElementFacade tbx_BeginningAddressNumber;
		@FindBy(xpath="(.//*[contains(text(),'Ending')]/following-sibling::input)[1]")
		public WebElementFacade tbx_EndingAddressNumber;
		
		@FindBy(xpath="//select[@ng-model='locbu.city']")
		public WebElementFacade ddl_City_LocationUpadate;
		
		
		@FindBy(xpath="//select[@ng-model='locbu.state']")
		public WebElementFacade ddl_State_LocationUpadate;
		
		
		@FindBy(xpath="(.//*[contains(text(),'Zip')]/following-sibling::input)[1]")
		public WebElementFacade tbx_Zip1;
		
		@FindBy(xpath="(.//*[contains(text(),'Zip')]/following-sibling::input)[2]")
		public WebElementFacade tbx_Zip2;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='street']")
		public WebElementFacade tbx_StreetName_Old;
				
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//*[@id='streetType'])[5]")
		public WebElementFacade ddl_StreetType_Old;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='streetDirectionPrefix']")
		public WebElementFacade ddl_StreetDirPrefix_Old;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='streetDirectionSuffix']")
		public WebElementFacade ddl_StreetDirSuffix_Old;
		//new Street Information section of Location update page//
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newstreetDirectionPrefix']")
        public WebElementFacade ddl_StreetDirPrefix_New;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newstreetDirectionSuffix']")
        public WebElementFacade ddl_StreetDirSuffix_New;
        
    	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newStreetType']")
		public WebElementFacade ddl_StreetType_New1;
    	
    	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='newStreet']")
		public WebElementFacade tbx_StreetName_New;

		
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//------------------------------------------------------------------------------------------------------------------------------------//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='switchToEditLink();']")
		public WebElementFacade btn_Search_Addrsrange_edit ;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='removeLocation();']")
		public WebElementFacade btn_Search_Addrsrange_delete ;
		
		@Override
		public WebElementFacade getUniqueElementInPage() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
		public void location_role_selection(String LRole,String LRoleType){
			if ("Single".equals(LRole)){
				
				if ("Central Office".equals(LRoleType)) {
				
				cmb_Location_Role.selectByVisibleText("Central Office") ;
				
				}
				
				else if ("Equipment Site".equals(LRoleType)){
					
					cmb_Location_Role.selectByVisibleText("Equipment Site") ;
				}
				
				else if ("Customer Site".equals(LRoleType)) {
					
					cmb_Location_Role.selectByVisibleText("Customer Site") ;
				}
				
				else if ("Building  site".equals(LRoleType)) {
					
					cmb_Location_Role.selectByVisibleText("Building  site") ;
				}
				
				else {
					
					cmb_Location_Role.selectByVisibleText("Remote Site") ;
				}
				
				
				
			}
			
			else {
			
				cmb_Location_Role.selectByVisibleText("Equipment Site") ;
				cmb_Location_Role.selectByVisibleText("Customer Site") ;
				
			}
		}
		
		
		

		//********************************************************************************************************************************************//
		//													Create Bulk location -- PUN Form section												  //
		//********************************************************************************************************************************************//
		
		public void punpath_selection(String punform_path) throws AWTException{
			WebDriverWait wait = new WebDriverWait(getDriver(), 100);
			try {
				jsClick(btn_Pun_Choosepath);
			
			Thread.sleep(5000);
			
			// Set the file in clipboard
			StringSelection ss=new StringSelection(punform_path);
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			// Perform  native keystrokes for CTRL+V and Enter key
			
			Robot robot = new Robot();
			//robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			//robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			Thread.sleep(15000);
			
			wait.until(ExpectedConditions.visibilityOf(btn_Pun_import));
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		public void punctions(String pun_action) throws InterruptedException{
			
			WebDriverWait wait = new WebDriverWait(getDriver(), 100);
			switch(pun_action){
			
			case "Import": jsClick(btn_Pun_import);
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOf(lbl_Pun_successmsgtag));
				Thread.sleep(5000);
				jsClick(lbl_Pun_successmsgtag);
				break;
				
			}

		}
		
		
		public void Location_create_Sanity_Validation() throws Throwable{
			Thread.sleep(5000);
			List<WebElementFacade> location_create_attribute = null;
			int j=0,i=0;
			if(!tab_currentlydisplayed.isCurrentlyVisible()){
				throw new Error("Locvation Create Form has not launched");
			}
			
			if(!tab_currentlydisplayed.getText().replaceAll("\\s+$", "").equals("Create Bulk Address")){
				
				
				if(!btn_createlocation_Reset.isCurrentlyVisible() && !btn_createlocation_Reset.isCurrentlyEnabled()){
					throw new Error("Reset button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
				}			
		
			 location_create_attribute = lbl_allXapath;
			
			} else {
				location_create_attribute = lbl_Create_PUN_allXapath;
			}
			
			ArrayList<String> locationcreate_Fieldattributelist=new ArrayList<String>();
				for( j=0;j<location_create_attribute.size();j++){
					locationcreate_Fieldattributelist.add(j, location_create_attribute.get(j).getText().trim());
						//slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+locationcreate_Fieldattributelist.get(j));
					}
				slf4jLogger.info("Fields Present List1-lbl_Create_PUN_allXapath:"+locationcreate_Fieldattributelist);
			ArrayList<String> List2compare_location_Fieldattributelist=new ArrayList<String>();
			
			//slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
			
			switch(tab_currentlydisplayed.getText().replaceAll("\\s+$", "")){
			
			case "Create Address Range": 	List2compare_location_Fieldattributelist.add(0, "Location Role");
											List2compare_location_Fieldattributelist.add(1, "Location Full Name");
											List2compare_location_Fieldattributelist.add(2, "Low Street#*");
											List2compare_location_Fieldattributelist.add(3, "High Street#*");
											List2compare_location_Fieldattributelist.add(4, "Indicator*");
											List2compare_location_Fieldattributelist.add(5, "Street Dir Prefix");
											List2compare_location_Fieldattributelist.add(6, "Street Name*");
											List2compare_location_Fieldattributelist.add(7, "Street Type");
											List2compare_location_Fieldattributelist.add(8, "Street Dir Suffix");
											List2compare_location_Fieldattributelist.add(9, "State*");
											List2compare_location_Fieldattributelist.add(10, "City*");
											List2compare_location_Fieldattributelist.add(11, "Zip*");
											List2compare_location_Fieldattributelist.add(12, "Remarks");
											List2compare_location_Fieldattributelist.add(13, "New Construction Ind*");
											
											
											if(!btn_create_AddressRange_Create.isCurrentlyVisible() && !btn_create_AddressRange_Create.isCurrentlyEnabled()){
												throw new Error("Create button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											if(!lbl_location_createform_Primaryaddress.isCurrentlyVisible()){
												throw new Error("Primary Address Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
											}
											
											WaitForPageToLoad(500);
											ddl_indicator_location_createform_Addressrangeinformation.selectByIndex(2);
											ddl_State_location_createform_Addressrangeinformation.selectByIndex(7);
											waitABit(600);
											 waitFor(ddl_City_location_createform_Addressrangeinformation);
											 ddl_City_location_createform_Addressrangeinformation.selectByIndex(3);
											
											 ddl_NewConstructionInd_location_createform_Addressrangeinformation.selectByIndex(1);
											 waitABit(600);
											 waitFor(ddl_LegacyCompanyArea_location_createform_Addressrangeinformation);
											 ddl_LegacyCompanyArea_location_createform_Addressrangeinformation.selectByIndex(2);
											
											break;
											/*List2compare_location_Fieldattributelist.add(1, "");
											List2compare_location_Fieldattributelist.add(1, "");
											List2compare_location_Fieldattributelist.add(1, "");
											List2compare_location_Fieldattributelist.add(1, "");
											List2compare_location_Fieldattributelist.add(1, "");*/
											
			case "Create Individual Location": 	List2compare_location_Fieldattributelist.add(0, "Location Role*");
												List2compare_location_Fieldattributelist.add(1, "Location Full Name");
												List2compare_location_Fieldattributelist.add(2, "Address Prefix");
												List2compare_location_Fieldattributelist.add(3, "Address#*");
												List2compare_location_Fieldattributelist.add(4, "Address Suffix");
												List2compare_location_Fieldattributelist.add(5, "Street Dir Prefix");
												List2compare_location_Fieldattributelist.add(6, "Street Name*");
												List2compare_location_Fieldattributelist.add(7, "Street Type");
												List2compare_location_Fieldattributelist.add(8, "Street Dir Suffix");
												List2compare_location_Fieldattributelist.add(9, "State*");
												List2compare_location_Fieldattributelist.add(10, "City*");
												List2compare_location_Fieldattributelist.add(11, "Zip*");
												List2compare_location_Fieldattributelist.add(12, "Location Designator 1");
												List2compare_location_Fieldattributelist.add(13, "Designator1 Value");
												List2compare_location_Fieldattributelist.add(14, "Location Designator 2");
												List2compare_location_Fieldattributelist.add(15, "Designator2 Value");
												List2compare_location_Fieldattributelist.add(16, "Location Designator 3");
												List2compare_location_Fieldattributelist.add(17, "Designator3 Value");
												List2compare_location_Fieldattributelist.add(18, "Remark");
												List2compare_location_Fieldattributelist.add(19, "New Construction Ind*");
												
												if(!btn_create_Individuallocation_Create.isCurrentlyVisible() && !btn_create_Individuallocation_Create.isCurrentlyEnabled()){
													throw new Error("Create button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
													
												
												if(!lbl_location_createform_locationrole.isCurrentlyVisible()){
													throw new Error("Location Role Information Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!lbl_location_createform_locationrole_icosite.isCurrentlyVisible()){
													throw new Error("ICO site Label is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!btn_location_createform_locationrole_icosite_yes.isCurrentlyVisible()){
													throw new Error("ICO site check boxes is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!lbl_location_createform_Primaryaddressinformation.isCurrentlyVisible()){
													throw new Error("Primary Address Information Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!lbl_location_createform_Secondaryaddressinformation.isCurrentlyVisible()){
													throw new Error("Secondary Address Information Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												}
												
												if(!lbl_location_createform_Addressrangeinformation.isCurrentlyVisible()){
													throw new Error("Address Range Information Section is not displayed:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
												} 
												
												WaitForPageToLoad(500);
												ddl_State_location_createform_Addressrangeinformation.selectByIndex(7);
												waitABit(600);
												 waitFor(ddl_City_location_createform_Addressrangeinformation);
												 ddl_City_location_createform_Addressrangeinformation.selectByIndex(3);
												 
												 ddl_NewConstructionInd_location_createform_Addressrangeinformation.selectByIndex(1);
												break;
												
			case "Create Bulk Address": List2compare_location_Fieldattributelist.add(0, "File Selected");
										List2compare_location_Fieldattributelist.add(1, "Creation Id");
										List2compare_location_Fieldattributelist.add(2, "Created By");
										List2compare_location_Fieldattributelist.add(3, "Created Date");
										List2compare_location_Fieldattributelist.add(4, "Modified Date");										
										List2compare_location_Fieldattributelist.add(5, "Eng Contact");
										List2compare_location_Fieldattributelist.add(6, "Contact#");
										List2compare_location_Fieldattributelist.add(7, "Job No(s)");
										List2compare_location_Fieldattributelist.add(8, "Total Address");
										List2compare_location_Fieldattributelist.add(9, "Total Unique Street Names");
										List2compare_location_Fieldattributelist.add(10, "Total Duplicates");
										List2compare_location_Fieldattributelist.add(11, "City");
										List2compare_location_Fieldattributelist.add(12, "State");
										List2compare_location_Fieldattributelist.add(13, "Zip");
										List2compare_location_Fieldattributelist.add(14, "WC CLLI");
										List2compare_location_Fieldattributelist.add(15, "Total Unique Addresses");
										List2compare_location_Fieldattributelist.add(16, "Total vacant Detected");
										List2compare_location_Fieldattributelist.add(17, "Sub Division Name");
										List2compare_location_Fieldattributelist.add(18, "PUN Addresses with Available Range");
										List2compare_location_Fieldattributelist.add(19, "PUN Addresses with No Available Range");
										
										
										j=locationcreate_Fieldattributelist.size();
										//System.out.println("Next J value="+j);
										location_create_attribute = null;
										location_create_attribute = lbl_Create_PUN_table1_allXapath;
										
										for(i=0 ;i<location_create_attribute.size();j++,i++){
											locationcreate_Fieldattributelist.add(j, location_create_attribute.get(i).getText().trim());
											//slf4jLogger.info("Fields Present List2:"+locationcreate_Fieldattributelist.get(j));
											}									
										
									//	slf4jLogger.info("Fields Present List2-lbl_Create_PUN_table1_allXapath:"+locationcreate_Fieldattributelist);
										
										List2compare_location_Fieldattributelist.add(20, "Full Name From PUN");
										List2compare_location_Fieldattributelist.add(21, "Prefix");
										List2compare_location_Fieldattributelist.add(22, "Suffix");
										List2compare_location_Fieldattributelist.add(23, "Dir Prefix");
										List2compare_location_Fieldattributelist.add(24, "Street Name");										
										List2compare_location_Fieldattributelist.add(25, "Type");
										List2compare_location_Fieldattributelist.add(26, "Dir Suffix");
										List2compare_location_Fieldattributelist.add(27, "Range Id");																				
										List2compare_location_Fieldattributelist.add(28, "Dir Prefix");
										List2compare_location_Fieldattributelist.add(29, "Street Name");
										List2compare_location_Fieldattributelist.add(30, "Type");
										List2compare_location_Fieldattributelist.add(31, "Dir Suffix");
										List2compare_location_Fieldattributelist.add(32, "Range");
										List2compare_location_Fieldattributelist.add(33, "Processing Status");
										List2compare_location_Fieldattributelist.add(34, "Range Info");										
										List2compare_location_Fieldattributelist.add(35, "Primary Address Information");
										List2compare_location_Fieldattributelist.add(36, "Secondary Address Information");
									
										
										
										j=locationcreate_Fieldattributelist.size();
										//System.out.println("Next2 J value="+j);
										location_create_attribute = null;
										location_create_attribute = lbl_Create_PUN_table2_allXapath;
										
										for(i=0 ;i<location_create_attribute.size();j++,i++){
											locationcreate_Fieldattributelist.add(j, location_create_attribute.get(i).getText().replaceAll("\\d","").trim());
											//slf4jLogger.info("Fields Present List3:"+locationcreate_Fieldattributelist.get(j));
											}
										
										//slf4jLogger.info("Fields Present List3-lbl_Create_PUN_table2_allXapath:"+locationcreate_Fieldattributelist);
										
										List2compare_location_Fieldattributelist.add(37, "");
										List2compare_location_Fieldattributelist.add(38, "Status");
										List2compare_location_Fieldattributelist.add(39, "Status Remarks");
										List2compare_location_Fieldattributelist.add(40, "Address ID");
										List2compare_location_Fieldattributelist.add(41, "Range ID");
										List2compare_location_Fieldattributelist.add(42, "Range");
										
										List2compare_location_Fieldattributelist.add(43, "Prefix");
										List2compare_location_Fieldattributelist.add(44, "House #");
										List2compare_location_Fieldattributelist.add(45, "Suffix");
										List2compare_location_Fieldattributelist.add(46, "Dir Prefix");
										
										List2compare_location_Fieldattributelist.add(47, "Street Name");
										List2compare_location_Fieldattributelist.add(48, "Type");
										List2compare_location_Fieldattributelist.add(49, "Dir Suffix");
										List2compare_location_Fieldattributelist.add(50, "City");
										List2compare_location_Fieldattributelist.add(51, "State");
										List2compare_location_Fieldattributelist.add(52, "Zip");
										List2compare_location_Fieldattributelist.add(53, "Lat");
										
										List2compare_location_Fieldattributelist.add(54, "Long");
										List2compare_location_Fieldattributelist.add(55, "Property");
										List2compare_location_Fieldattributelist.add(56, "Designator");
										List2compare_location_Fieldattributelist.add(57, "Designator");
										List2compare_location_Fieldattributelist.add(58, "Designator");
										List2compare_location_Fieldattributelist.add(59, "Remark");
										List2compare_location_Fieldattributelist.add(60, "PreMarket");
										List2compare_location_Fieldattributelist.add(61, "NewConst ");
										
										System.out.println("Final J value="+locationcreate_Fieldattributelist.size());
										
										
										for( j=0;j<locationcreate_Fieldattributelist.size();j++){
											
											slf4jLogger.info("Fields Present Final List:"+locationcreate_Fieldattributelist.get(j));
											}
									
										
										if(!lbl_CraetePUN_SelectPunsection.isCurrentlyVisible()){
											throw new Error("Select PUN Section is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_CraetePUN_PUNInfosection.isCurrentlyVisible()){
											throw new Error("PUN Information Section is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_CraetePUN_Specificaddresssection.isCurrentlyVisible()){
											throw new Error("Full Names to Specific Address Field Mappings Section is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_CraetePUN_Rangedetectedsection.isCurrentlyVisible()){
											throw new Error("Address Range Detected in Inventory Section is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_CraetePUN_verifysection.isCurrentlyVisible()){
											throw new Error("Verify/Manage Address Ranges Section is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										  
										
										
										if(!btn_CraetePUN_Section1_Choosefile.isCurrentlyVisible() && !btn_CraetePUN_Section1_Choosefile.isCurrentlyEnabled()){
											throw new Error("Choose file button is not Visible & enable in :"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_CraetePUN_Section1_Import.isCurrentlyVisible() && !btn_CraetePUN_Section1_Import.isCurrentlyEnabled()){
											throw new Error("Import button is not Visible & enable in :"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										
										if(!btn_CraetePUN_Section1_Auditlogs.isCurrentlyVisible() && btn_CraetePUN_Section1_Auditlogs.isCurrentlyEnabled()){
											throw new Error("Audit logs button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										
										if(!btn_CraetePUN_Section4_AddRange.isCurrentlyVisible() && btn_CraetePUN_Section4_AddRange.isCurrentlyEnabled()){
											throw new Error("Add Range button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_CraetePUN_Section4_PUN_Availableranges.isCurrentlyVisible()){
											throw new Error("PUN Addresses with Available Range label is not displayed in :"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!lbl_CraetePUN_Section4_PUN_NO_Availableranges.isCurrentlyVisible()){
											throw new Error("PUN Addresses with No Available Range label is not displayed in :"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}										
										
										if(!btn_CraetePUN_Section5_Createaddress.isCurrentlyVisible() && btn_CraetePUN_Section5_Createaddress.isCurrentlyEnabled()){
											throw new Error("Create Address button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_CraetePUN_Section5_Addadresses.isCurrentlyVisible() && btn_CraetePUN_Section5_Addadresses.isCurrentlyEnabled()){
											throw new Error("Add Address button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_CraetePUN_Section5_Removeaddress.isCurrentlyVisible() && btn_CraetePUN_Section5_Removeaddress.isCurrentlyEnabled()){
											throw new Error("Remove Address button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}
										
										if(!btn_CraetePUN_Section5_Retry.isCurrentlyVisible() && btn_CraetePUN_Section5_Retry.isCurrentlyEnabled()){
											throw new Error("Retry button is not Visible in "+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
										}break;									
										
			}
		
			
			for(i=0;i<locationcreate_Fieldattributelist.size();i++){
				if(!locationcreate_Fieldattributelist.get(i).trim().equals(List2compare_location_Fieldattributelist.get(i).trim())){
					slf4jLogger.info("locationcreate_Fieldattributelist="+locationcreate_Fieldattributelist.get(i));
					slf4jLogger.info("List2compare_location_Fieldattributelist="+List2compare_location_Fieldattributelist.get(i)+" Not matching");
					slf4jLogger.info("locationcreate_Fieldattributelist="+locationcreate_Fieldattributelist);
					throw new Error("Fields are not matching check:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
				}
			}
			slf4jLogger.info("Locatioon Create field attributes are expected as per "+tab_currentlydisplayed.getText().replaceAll("\\s+$", "")+" Location type");
		}
			
		
		public void Location_action(String action) throws Throwable {
			switch(action){
			case "Create button": if(btn_CreateAddressRange.isCurrentlyVisible()){
													jsClick(btn_CreateAddressRange);
													waitForElement(btn_Search_Addrsrange_delete);
												}
								if(btn_CreateIndividuallcn.isCurrentlyVisible()){
									jsClick(btn_CreateIndividuallcn);
									
									waitForElement(btn_Search_Addrsrange_delete);
								}
								break;
												
			case "ICOCheck":jsClick(btn_create_individuallcn_ICOsite_chkicon); Thread.sleep(5000);
				
				break;
			
			}			
		}
		
		public void verify_validation(String validation) throws Throwable {		
			String Message;int low=0;int high=0;
			switch(validation){
			case "Restricted Location dropdown list in location create page":
						verify_validation("Restricted Address Indicators is displayed Individual Location create form");
						ddl_createform_Addressrange_restrictedlocn.selectByVisibleText("Competitor Contract-No Sales");
						ddl_createform_Addressrange_restrictedlocn.selectByVisibleText("Competitor Video Contract");
						ddl_createform_Addressrange_restrictedlocn.selectByVisibleText("ENG-No Sales");
						ddl_createform_Addressrange_restrictedlocn.selectByVisibleText("Other");
						ddl_createform_Addressrange_restrictedlocn.selectByVisibleText("Pre-Market Launch");
						ddl_createform_Addressrange_restrictedlocn.selectByVisibleText("TDM Voice");				
						break;
			case "Restricted Address Indicators is displayed Individual Location create form":
						waitForElement(rdb_Add_To_Range);						
						jsClick(rdb_Add_To_Range);										
						waitForElement(ddl_createform_Addressrange_restrictedlocn);						
						break;
						
			case "Location address created successfully message should be displayed in create address range page": 
				jsClick(tab_createpage_Individuallcn);
				waitForElement(lbl_createpage_locnalert_msg);
				Message=lbl_createpage_locnalert_msg.getText().trim();
				Message = Message.toString().substring(1);		
				
				if(!Message.contains("Location address created successfully.")){
					slf4jLogger.info("Invalid message on create is displayed."+Message);
					throw new Error("Invalid message on create is displayed."+Message);
				}jsClick(tab_inactiveheadertab); break;
				
				
			case "warning message should be displayed as Please Re-enter Address# , It should fall between Low Street# - High Street#":
				
				waitForElement(lbl_createpage_locnalert_msg);Message=lbl_createpage_locnalert_msg.getText().trim();
				Message = Message.toString().substring(1);		
				
				if(!Message.contains("Please Re-enter Address# , It should fall between Low Street# - High Street#")){
					slf4jLogger.info("Invalid message on create is displayed."+Message);
					throw new Error("Invalid message on create is displayed."+Message);
				}jsClick(btn_createpage_locnalert_msgclsicon); 
				
				break;
				
			case "fill all the mandatory fields and click on create in Addresses within range create form":
													if(tab_createAddrswithinrange_prvstab.isCurrentlyVisible()){
														jsClick(tab_createAddrswithinrange_prvstab);
														Thread.sleep(2000);
														waitForElement(lbl_serachpage_Addressrange_lowno);
														
														low=Integer.parseInt(lbl_serachpage_Addressrange_lowno.getText().trim());
														high=Integer.parseInt(lbl_serachpage_Addressrange_highno.getText().trim());
														
														jsClick(tab_createAddrswithinrange);											
													}
												
													waitForElement(btn_CreateAddresses_within_Range);
														tbx_CreateAddresses_within_Range_Address_Number.type(Integer.toString(low));														
														ddl_CreateAddresses_within_Range_locnrole.selectByVisibleText("Building Site");
														ddl_CreateAddresses_within_Range_locnrole.selectByVisibleText("Customer Site");
														ddl_CreateAddresses_within_Range_locnrole.selectByVisibleText("Remote Site");
														tbx_CreateAddresses_within_Range_zip2.type("2354");
														ddl_CreateAddresses_within_Range_newconstructionind.selectByVisibleText("Yes");
														waitForElement(tbx_CreateAddresses_within_Range_swcclli);
														Thread.sleep(1000);
														tbx_CreateAddresses_within_Range_swcclli.type("GLRDFLXA");
													
														while(low<=high){
															waitForElement(btn_CreateAddresses_within_Range);
															Thread.sleep(2000);
														jsClick(btn_CreateAddresses_within_Range);
														waitForElement(btn_CreateAddresses_within_Range_Addnxtaddrss);
														Thread.sleep(3000);
														jsClick(btn_CreateAddresses_within_Range_Addnxtaddrss);
														Thread.sleep(2000);
														low++;					
													}
														if(low>high){
															if(btn_CreateAddresses_within_Range.isCurrentlyVisible()){
																jsClick(btn_CreateAddresses_within_Range);
																waitForElement(lbl_createpage_locnalert_msg);
															}
														}													
													break;
													
			case "alert message should be displayed as -Please fill in the mandatory fields when create Address range is initiated": Thread.sleep(3000);
											if(btn_CreateAddressRange.isCurrentlyVisible()){
												jsClick(btn_CreateAddressRange);
												
												waitForElement(lbl_createpage_locnalert_msg);Message=lbl_createpage_locnalert_msg.getText().trim();
												Message = Message.toString().substring(1);		
												
												if(!Message.contains("Please fill in the mandatory fields")){
													slf4jLogger.info("Invalid message on create is displayed."+Message);
													throw new Error("Invalid message on create is displayed."+Message);
												}jsClick(btn_createpage_locnalert_msgclsicon); 
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[1]"))){
													slf4jLogger.info("Low Street#* warning message is not displayed");
													throw new Error("Low Street#* warning message is not displayed");
												}
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[2]"))){
													slf4jLogger.info("High Street#* field warning message is not displayed");
													throw new Error("High Street#* field warning message is not displayed");
												}
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[3]"))){
													slf4jLogger.info("Indicator* field warning message is not displayed");
													throw new Error("Indicator* field warning message is not displayed");
												}
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[4]"))){
													slf4jLogger.info("Street Name* field warning message is not displayed");
													throw new Error("Street Name* field warning message is not displayed");
												}
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[5]"))){
													slf4jLogger.info("State* field warning message is not displayed");
													throw new Error("State* field warning message is not displayed");
												}
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[6]"))){
													slf4jLogger.info("City* field warning message is not displayed");
													throw new Error("City* field warning message is not displayed");
												}
												
												if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[7]"))){
													slf4jLogger.info("Zip* field warning message is not displayed");
													throw new Error("Zip* field warning message is not displayed");
												}				
												
											} break;
											
			case "Address Range should get created successfully message should be displayed in create address range page":
											jsClick(tab_createpage_Addressrange);
											waitForElement(lbl_createpage_locnalert_msg);
											Message=lbl_createpage_locnalert_msg.getText().trim();
											Message = Message.toString().substring(1);		
											
											if(!Message.contains("Location Address Range created successfully.")){
												slf4jLogger.info("Invalid message on create is displayed."+Message);
												throw new Error("Invalid message on create is displayed."+Message);
											}jsClick(tab_inactiveheadertab); break;
											
			case "Create Addresses Within Range create form should be displayed":waitForElement(tab_createAddrswithinrange);waitForElement(btn_CreateAddresses_within_Range);
																		Thread.sleep(3000);
																		if(!btn_CreateAddresses_within_Range.isCurrentlyVisible()){
																			slf4jLogger.info("Create Addresses Within Range create form is not displayed");
																			throw new Error("Create Addresses Within Range create form is not displayed");
																		}
																		
																		break;
																		
			case "alert message should be displayed as -Please fill in the mandatory fields when Create Addresses within range is initiated":
																	waitForElement(btn_CreateAddresses_within_Range);jsClick(btn_CreateAddresses_within_Range);
																	waitForElement(lbl_createpage_locnalert_msg);
																	Message=lbl_createpage_locnalert_msg.getText().trim();
																	Message = Message.toString().substring(1);		
																	
																	if(!Message.contains("Please enter mandatory fields.")){
																		slf4jLogger.info("Invalid message on create is displayed."+Message);
																		throw new Error("Invalid message on create is displayed."+Message);
																	}jsClick(btn_createpage_locnalert_msgclsicon); 
																	
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[1]"))){
																		slf4jLogger.info("Address#* warning message is not displayed");
																		throw new Error("Address#* warning message is not displayed");
																	}
																	
																	if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[text()='You left the field blank...'])[2]"))){
																		slf4jLogger.info("Location Role* field warning message is not displayed");
																		throw new Error("Location Role* field warning message is not displayed");
																	}
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
        
		
		public void validate_the_values_displayed_under_Street_dir_prefix_suffix() throws InterruptedException {
			//label[text()='Street Dir Prefix']/following-sibling::span/div/label
			 
			
			    Thread.sleep(5000);
				String street_dir_prefix=getDriver().findElement(By.xpath("//label[text()='Street Dir Prefix']/following-sibling::span/div/label")).getText();
				String street_dir_suffix=getDriver().findElement(By.xpath("//label[text()='Street Dir Suffix']/following-sibling::span/div/label")).getText();
				String street_type=getDriver().findElement(By.xpath("//label[text()='Street Type']/following-sibling::span/div/label")).getText();				
				String prefix=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365441").getFieldValue("ddl_StreetDirPrefix_addr_range").trim();
				System.out.println(prefix);
				prefix=street_Direction(prefix);
				Assert.assertEquals("Street Prefix not matched",street_dir_prefix,prefix);
				String suffix=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365441").getFieldValue("ddl_StreetDirSuffix_addr_range");
				suffix=street_Direction(suffix);
				System.out.println("street_Direction after reaching"+suffix);
				Assert.assertEquals("Street Suffix not matched",street_dir_suffix,suffix);
				String streettype=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365441").getFieldValue("ddl_streettype");
				System.out.println("street_Direction after reaching"+streettype);
				streettype=street_type_value(streettype);
				Assert.assertEquals("Street type not matched",street_type,streettype);			
		}
		public void validate_the_values_displayed_under_Street_dir_prefix_suffix1() throws InterruptedException {
			//label[text()='Street Dir Prefix']/following-sibling::span/div/label
			 
			
			    Thread.sleep(5000);
				String street_dir_prefix=getDriver().findElement(By.xpath("//label[text()='Street Dir Prefix']/following-sibling::span/div/label")).getText();
				String street_dir_suffix=getDriver().findElement(By.xpath("//label[text()='Street Dir Suffix']/following-sibling::span/div/label")).getText();
				String street_type=getDriver().findElement(By.xpath("//label[text()='Street Type']/following-sibling::span/div/label")).getText();				
				String prefix=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365441").getFieldValue("ddl_StreetDirPrefix_addr_range").trim();
				System.out.println(prefix);
				prefix=street_Direction(prefix);
				Assert.assertEquals("Street Prefix not matched",street_dir_prefix,prefix);
				String suffix=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365441").getFieldValue("ddl_StreetDirSuffix_addr_range");
				suffix=street_Direction(suffix);
				System.out.println("street_Direction after reaching"+suffix);
				Assert.assertEquals("Street Suffix not matched",street_dir_suffix,suffix);
				String streettype=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365441").getFieldValue("ddl_streettype");
				System.out.println("street_Direction after reaching"+streettype);
				streettype=street_type_value(streettype);
				Assert.assertEquals("Street type not matched",street_type,streettype);			
		}
		
		
		public String street_Direction(String Direction) {
			System.out.println("street_Direction"+Direction);
			switch (Direction) { 
	        case "NORTH": 
	        	Direction="N";
	            break; 
	        case "SOUTH": 
	        	Direction="S";
	            break; 
	        case "NORTHEAST": 
	        	Direction="NE";
	            break; 
	        case "SOUTHEAST": 
	        	Direction="SE";
	            break; 
	        case "NORTHWEST": 
	        	Direction="NW"; 
	            break; 
	        case "SOUTHWEST": 
	        	Direction="SW";
	            break; 
	        case "WEST": 
	        	Direction="W";
	            break;
	        case "EAST": 
	        	Direction="E";  
	            break;
	        case "EASTNORTH-TEMP VALUE": 
	        	Direction="EN";   
	            break;
	        default: 
	        	Direction="NOMATCH";
	            break; 
	        } 
	        return Direction;
	    } 
		
		public String street_type_value(String streettype) {
			
			if (streettype.length() >= 4)
			{
			    streettype = streettype.substring(0, 3);
			}
			else
			{
				System.out.println(streettype);
			}
			 
			return streettype;
		}
		
		public void validate_the_values_displayed_under_Street_dir_prefix_suffix_individual_addr() throws InterruptedException {
			//label[text()='Street Dir Prefix']/following-sibling::span/div/label
			 
			
			    Thread.sleep(5000);
				String street_dir_prefix=getDriver().findElement(By.xpath("//label[text()='Street Dir Prefix']/following-sibling::span/div/label")).getText();
				String street_dir_suffix=getDriver().findElement(By.xpath("//label[text()='Street Dir Suffix']/following-sibling::span/div/label")).getText();
				String street_type=getDriver().findElement(By.xpath("//label[text()='Street Type']/following-sibling::span/div/label")).getText();				
				String prefix=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365466-Individual Addresses").getFieldValue("ddl_StreetDirPrefix_individual_addr").trim();
				
				prefix=street_Direction(prefix);
				System.out.println("Street Prefix after reaching"+prefix);
				Assert.assertEquals("Street Prefix not matched",street_dir_prefix,prefix);
				String suffix=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365466-Individual Addresses").getFieldValue("ddl_StreetDirSuffix_individual_addr");
				suffix=street_Direction(suffix);
				System.out.println(suffix);
				System.out.println("street_Direction_suffix after reaching"+suffix);
				Assert.assertEquals("Street Suffix not matched",street_dir_suffix,suffix);
				String streettype=Page.commonData.getContainer("OVCreateLocationPage").getContainer("TC365466-Individual Addresses").getFieldValue("ddl_streettype_individual_addr");
				/*System.out.println("street_type after reaching"+streettype);
				streettype=street_type_value(streettype);
				Assert.assertEquals("Street type not matched",street_type,streettype);*/			
		}
		
		
	 
}
