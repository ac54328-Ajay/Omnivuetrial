package com.ctl.it.qa.omnivue.tools.pages.common;

import java.awt.AWTException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.DB.ARMDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OSRDB;
import com.ctl.it.qa.omnivue.tools.steps.DB.OmnivueDB;
import com.ctl.it.qa.omnivue.tools.steps.user.FileIOTest;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVSearchServicePage extends OmniVuePage {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	OVOrderPage orderpage;
	OVLoginPage loginPage;
	FileIOTest fileiotest;
	LoginPage Loginpage;
	OVCreateServicePage servicecreatepage ;
	
	ARMDB armdb;
	OmnivueDB ovdb;
	OSRDB osrdb;
	//OVSearchDevicePage searchdevicepage;
	//OVSearchDevicePage searchdevicepage;
	   
	@FindBy(id="NAME")
	public WebElementFacade tbx_editDeviceName;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[14]/div[1]/div/span/input[@value='Save']")
	public WebElementFacade btn_save;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_device;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade tab_close;
	// close tab of service page []
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[2]")
	public WebElementFacade tab1_close;
	//close tab of service page [*]
	
	@FindBy(xpath=".//*[@id='dropdownMenu1']/img")
	public WebElementFacade img_settings;
	
	@FindBy(xpath=".//div[2]/div/label[3]/img[@ng-click='deletePoolRange(ind)']")
	public WebElementFacade btn_Ctagdelete;
		
	@FindBy(xpath="//a[text()='Logout']")
	public WebElementFacade lnk_logoutInSettings;
	
	//Order Validation
	
	@FindBy(xpath=".//label[text()='CSOF Order Number:']/following-sibling::label[1]")
	public WebElementFacade lbl_csof_id;
	
	@FindBy(xpath=".//label[text()='Subscriber:']/following-sibling::label[1]")
	public WebElementFacade lbl_subscriber;
	
	@FindBy(xpath=".//label[text()='DTN:']/following-sibling::label[1]")
	public WebElementFacade lbl_dtn;
	
	@FindBy(xpath=".//label[text()='EnsembleOrderNumber']/following-sibling::label[1]")
	public WebElementFacade lbl_EnsembleOrderNumber;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[@id='STI']/following-sibling::error-message/div[2]")
    public WebElementFacade lbl_fill_mandatory_field_STI;
	
	@FindBy(xpath=".//div[@class='ng-scope']/div/label[@for='servicename']/following-sibling::input[@ng-model='searchParam.serviceName']")
    public WebElementFacade lbl_service_name_search;


	
	// End of Order Validation
	
	//Contact validation
	@FindBy(xpath="(//span[@ng-switch-when='inputSelectOneMenu']/select[@id='STI'])[2]")
    public WebElementFacade ddl_STI_Service_edit_page;

	
	@FindBy(xpath=".//*[@value='Add Contact']")
	public WebElementFacade btn_addcontact;
	
	@FindBy(xpath="//*[@ng-show='noData']//button[text()='Add Contact']")
	public WebElementFacade btn_addcontact_nodata;
	@FindBy(xpath="//*[@ng-if='!noData'] //button[text()='Add Contact']")
	public WebElementFacade btn_addcontact_data;
	
	
		
	@FindBy(xpath="//*[contains(text(),'Create Contact')]")
	public WebElementFacade createcontacttab;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//*[@id=\"left-content-tab\"]//label[contains(text(),'Contact Information')]")
	public WebElementFacade contact_label;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")
	public WebElementFacade btn_View_active;
	
	//End of Contact validation
     
	@FindBy(xpath=".//div[@ng-controller='viewEditServiceDetailCtrl']/div[@ng-show='showAlert']")
    public WebElementFacade lbl_error_message_service_details_page;



		
	//Bam Table validation ----- 21/7/2016
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//*[@id='right-content']//*[@class='tab-pane ng-scope active']//div[@ng-hide='bamReportShow']")
	public WebElementFacade lbl_bamtable;
	
	@FindBy(xpath=".//*[@ng-show='viewDevice']")
	public WebElementFacade lbl_related_tab_device;
	
	@FindBy(xpath=".//*[text()='Content' and @class='invDeviceReconfg-out-div0_out']")
	public WebElementFacade lbl_configurecolumn;
	//End of BAM table
	
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[contains(@id,'columntabletaskGrid_')]//span[text()='View']")
	public WebElementFacade lbl_taskresulttable;
	
	
	@FindBy(xpath=".//*[text()='No Associated Services to display']")
	public WebElementFacade lbl_service_msg;
	
	

	
	@FindBy(xpath=".//*[@id='right-content']/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/input")
	public WebElementFacade btn_addSubscriber;
	
	// Action Tab + Expand button
	
	@FindBy(xpath=".//*[@id='active:1610803390']")
	public WebElementFacade btn_icon;
	
	@FindBy(xpath = ".//*[@id='data:1610803390']/td")
	public WebElementFacade lbl_TableActivationTab;
	
	//New update---9/23
	
	@FindBy(xpath="//h4[text()='Subscriber Lookup']")
	public WebElementFacade tag_SubscriberLookup;
	
	
	//************************************************************** Sliders control in view page **************************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//img[@class='expandButton'][1]")
	public WebElementFacade btn_expandbutton_left;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//img[@class='expandButton'][2]")
	public WebElementFacade btn_expandbutton_right;
	
	//**********************************************************************************************************************************************************//
	
	
	//************************************************************** Service View Page Tabs*****************************************************************************//
	
	@FindBy(xpath=".//tab-heading[contains(text(),'-HSI')]")
	public WebElementFacade lbl_HSI_service_tab;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'-IPTV_Unicast')]")
	public WebElementFacade lbl_IPTV_Unicast_service_tab;
	
	@FindBy(xpath=".//*[@class='ng-isolate-scope active']//tab-heading[contains(text(),'-HSI')]")
	public WebElementFacade tab_Active_HSI_service_tab;
	
	@FindBy(xpath=".//tab-heading[contains(text(),'-IPTV')]")
	public WebElementFacade lbl_IPTV_service_tab;
	
	@FindBy(xpath=".//*[@id='mainTab']//*[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading")
	public WebElementFacade tab_ActiveTab;	
	
	@FindBy(xpath=".//*[@id='mainTab']//*[@class='ng-isolate-scope' and @ng-repeat='tab in tabs']//tab-heading")
	public WebElementFacade tab_NON_ActiveTab;
	
	//*************************************** Service View Tabs**************************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'HSI Details')]")
	public WebElementFacade tab_service_viewpage_HSI_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Associations')]")
	public WebElementFacade tab_service_viewpage_Associations;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Facility Details')]")
	public WebElementFacade tab_service_viewpage_Facility_Details; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'Audit Log')]")
	public WebElementFacade tab_service_viewpage_Audit_Log;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Audit Log')]")
	public WebElementFacade tab_service_viewpage_leftside_Audit_Log;
	
	//********************************************************************************************************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_edit_service_viewpage;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Delete']")
	public WebElementFacade btn_delete_service_viewpage;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save' and @class='ov-button-prime']")
	public WebElementFacade btn_save_service_viewpage;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetONT(serviceDetail.CIRCUIT2ENDLOCATION)']")
	public WebElementFacade btn_reset_ont_service_viewpage;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//i[@ov-tooltip-2x='Refresh']")
	public WebElementFacade btn_refresh_service_viewpage;
	
	//**************************************************************************************************************************************************************//
	//******************************* Attributes Section ***********************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='IPTV Unicast Service']/following-sibling::div//a")
	public WebElementFacade lbl_service_viewpage_iptv_unicast;
	

	//**************************************************************************************************************************************************************//
	
	//************************************************************** UNI Service Attributes *****************************************************************************//
	
	@FindBy(xpath=".//select[@id='MONITORING_TYPE']")
	public WebElementFacade lbl_service_uni_monitoringtype;
	
	@FindBy(xpath=".//select[@id='SPECCODE']")
	public WebElementFacade lbl_service_uni_SPECcode;
	
	@FindBy(xpath=".//select[@id='NCCODE']")
	public WebElementFacade lbl_service_uni_NCcode;
	
	@FindBy(xpath=".//select[@id='NCICODE']")
	public WebElementFacade lbl_service_uni_NCIcode;
	
	@FindBy(xpath="(.//select[@id='SECNCICODE'])[2]")
	public WebElementFacade lbl_service_uni_SecNCIcode;
	
	@FindBy(xpath=".//select[@id='SERVICEMUX']")
	public WebElementFacade lbl_service_uni_serviceMUX;
	
	@FindBy(xpath=".//select[@id='BUNDLING']")
	public WebElementFacade lbl_service_uni_bundling;
	
	@FindBy(xpath=".//select[@id='ALLTO1BUNDLING']']")
	public WebElementFacade lbl_service_uni_AllTo1Bundling;
	
	@FindBy(xpath=".//select[@id='FRAMESIZE']']")
	public WebElementFacade lbl_service_uni_FramSize;
	
	@FindBy(xpath=".//select[@id='RATE_LIMIT_TYPE']']")
	public WebElementFacade lbl_service_uni_RateLimitType;
	
	@FindBy(xpath="(.//select[@id='IS_DIVERSE'])[2]")
	public WebElementFacade lbl_service_uni_IsDiverse;
	
	
							
	
		
	
	
	
	//******************************* General Section ***********************//
	
	
	
	//**************************************************************************************************************************************************************//
	
	//************************************************************** HSI Service View Page *****************************************************************************//
	
	//******************************* General Section ***********************//
	@FindBy(xpath = "(//tab-heading[contains(.,'Details')])[1]")
	 public WebElementFacade tab_serviceDetailsName;
	
	@FindBy(xpath = "(.//tab-heading [@ng-click='onClickTab(tab)'])[2]")
	public WebElementFacade tab_service_name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@name='ALIAS1']")
	public WebElementFacade tbx_Hostservice_ALIAS1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@name='ALIAS2']")
	public WebElementFacade tbx_Hostservice_ALIAS2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//textarea[@name='DESCRIPTION']")
	public WebElementFacade tbx_Hostservice_Note;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//input[@ng-model='serviceDetail.ALIAS1']")
	public WebElementFacade tbx_service_ALIAS1;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//input[@ng-model='serviceDetail.ALIAS2']")
	public WebElementFacade tbx_service_ALIAS2;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//textarea[@ng-model='serviceDetail.DESCRIPTION']")
	public WebElementFacade tbx_service_Note;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Service Type')]/..//span)[1]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_gerneral_sec_service_type;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//span[contains(text(),'-HSI')]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_gerneral_sec_name;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Alias1')]/..//span)[3]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_gerneral_sec_alias1;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Alias2')]/..//span)[3]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_gerneral_sec_alias2;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Provisioning Status')]/..//span)[1]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_gerneral_sec_provision_status;
	
	//**********************************************************************//
	
	//******************************* Subscriber Section ***********************//
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Subscriber Name')]/..//span)[1]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribername;	
	@FindBy(xpath="(//label[@class='order-data-label ng-binding'])[7]")
	public WebElementFacade lbl_service_viewpage_HOST_details_tab_Subscriber_sec_Subscribername;	
	
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Subscriber Type')]/..//span)[1]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribertype;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//label[contains(text(),'Customer ID/BAN')]/..//span)[1]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID;	
	
	//**********************************************************************//
	
	//******************************* HSI Service attribute Section ****************//
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'DTN(Data TN)')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_DTN;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Downstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Downrate;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Provisioned Downstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_provision_downrate;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Service Profile')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_service_profile;	
	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'CVOIP TN')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_CVOIP;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Upstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Uprate;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Provisioned Upstream Rate')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_provision_uprate;	
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Service Profile Index')])[1]/..//span[@ng-hide='editHsiService']")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_service_profile_index;
	
	
	
	//**********************************************************************//
	
	//******************************* Port Section **************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//*[contains(text(),'Start Device Name')]/..//a")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//*[@ng-hide='editHsiService']//*[contains(text(),'Start Device Full Name')]/../../div")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_full_name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//*[@ng-hide='editHsiService']//*[contains(text(),'Start Port')]/../..//a")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_port;
	

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//*[contains(text(),'End Device Name')]/..//a")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//*[@ng-hide='editHsiService']//*[contains(text(),'End Device Full Name')]/../../div")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_full_name;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-if=\"'HSI' == serviceDetail.SERVICE2SERVICETYPE\"]//*[@ng-hide='editHsiService']//*[contains(text(),'End Port')]/../..//a")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_port;
	
	
	//**********************************************************************//
	
	//******************************* Associated  Services & VLAN Section **************************//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@ng-if,'serviceAssociationDetail') and contains(text(),'Associated Services')]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Associated_services;
	
	@FindBy(xpath=".//div[contains(@ng-if,'vlanAssociationDetail')][1]")
	public WebElementFacade lbl_service_viewpage_hsi_details_tab_Associated_vlan;
	
	@FindBy(xpath="//*[@id='numbereditorserviceVLANGrid_1NAME']")
	public WebElementFacade tbx_CEVLAN_name_ON_relative_tab_services_edit;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[contains(@id,'row0serviceVLANGrid')]/div[2 and @class='jqx-grid-cell jqx-grid-cell-office jqx-item jqx-item-office'])[1]/div")
	public WebElementFacade tbx_CEVLAN_name_ON_relative_tab_services;
	
	
	//**********************************************************************//
	
	//************************************************************** Service-Association Tab View Page *****************************************************************************//
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-click='editAssociations()']")
	public WebElementFacade btn_service_viewpage_associations_tab_edit_associate;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-controller='serviceAssociationDetailController']//*[@class='ng-binding alert alert-danger']")
	public WebElementFacade lbl_service_viewpage_associations_tab_Associationservice_msg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='ng-binding alert alert-danger' and contains(text(),'No VLAN Data Found')]")
	public WebElementFacade lbl_service_viewpage_associations_tab_vlan_segment_no_vlan_msg;
	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(text(),'No PON circuit associated to Service')]")
	public WebElementFacade lbl_service_viewpage_facility_negative_msg;
	
	
	//**************************************************************************************************************************************************************//
	
	//************************************************************** Service-Facility Tab View Page *****************************************************************************//
	
	@FindBy(id="editFacDetailButton")
	public WebElementFacade btn_service_viewpage_facility_tab_edit_facility_details;
	
	@FindBy(id="copyClpButton")
	public WebElementFacade btn_service_viewpage_facility_tab_edit_facility_copy;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Circuit Layout')]/following-sibling::div[1]//*[@class='ov-padded-container']/label")
	public WebElementFacade lbl_service_viewpage_facility_tab_circuit_details;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Circuit Layout')]/following-sibling::div[1]//img[@ng-if=\"facility.startRole == 'OLT' \"]")
	public WebElementFacade lbl_service_viewpage_facility_tab_OLT_img;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Circuit Layout')]/following-sibling::div[1]//img[@ng-if=\"facility.startRole == 'DSLAM' \"]")
	public WebElementFacade lbl_service_viewpage_facility_tab_DSLAM_img;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Cable ID']")
	public WebElementFacade lbl_service_viewpage_facility_tab_cableidheader;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//th[text()='Strand ID']")
	public WebElementFacade lbl_service_viewpage_facility_tab_strandidheader;
	
	//**************************************************************************************************************************************************************//
	
	//************************************************************** Tirks Related Tab **************************************************************//
	@FindBy(xpath=".//*[text()='CLO List']")
	public WebElementFacade tab_tirks_clo_list;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@src='rightContentUrl']//*[@ng-controller='tirksDetailCtrl']//*[@heading='CD']/a")
	public WebElementFacade tab_order_related_tab_tirks_CD;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@src='rightContentUrl']//*[@ng-controller='tirksDetailCtrl']//*[@heading='WA']/a")
	public WebElementFacade tab_order_related_tab_tirks_WA;
			
	//**********************************************************************************************************************************************************//
	//***************************************************** Network Information 1 ************************************************//
	
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-if='viewNetwork']/div/div[2]//tbody[1]//td[1]")
		public WebElementFacade lbl_serach_device_network_details_tab_Network_Information_Source_System;
		
		
		
	
	//**************************************************************************************************************************************************************//
		
	//***************************************************** Service Related Tab on Service View Page  ************************************************//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//li[@heading='Associated Services']/a")
		public WebElementFacade tab_service360view_ServicesRT_Association_Service;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//button[@ng-click='editAssociations()']")
		public WebElementFacade btn_service360view_ServicesRT_editAssociation;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//button[@value='Associate Backhaul']")
		public WebElementFacade btn_service360view_ServicesRT_AssciateBackhaul;
		
		@FindBy(xpath="//input[@ng-disabled='false']")
		public WebElementFacade btn_service360view_ServicesRT_deleteassciation;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//button[@value='Cancel']")
		public WebElementFacade btn_service360view_ServicesRT_editassciation_cancel;
		
		@FindBy(xpath="//select[@ng-model='service.serviceType']")
		public WebElementFacade ddl_service360view_ServicesRT_AssciateBackhaul_Lookup_ServiceType;
		
		@FindBy(xpath="//h4[contains(text(),'Service Look Up')]/../..//button[@ng-click='lookUp()']")
		public WebElementFacade btn_service360view_ServicesRT_AssciateBackhaul_Lookup;
		
		@FindBy(xpath="//table[@id='subscriber_lookup_']//input")
		public List<WebElement> chk_service360view_ServicesRT_AssciateBackhaul_Lookup;
		
		@FindBy(xpath="//button[@ng-click='associateServices()']")
		public WebElementFacade btn_service360view_ServicesRT_AssciateBackhaul_associateServices;
		
		@FindBy(xpath="//div[@ng-repeat='alertMsg in alert']/div")
		public List<WebElement> lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg;
		
		@FindBy(xpath="//a[@ng-click='gridSettings.deletServiceAss(0)']")
		public WebElementFacade btn_service360view_ServicesRT_EditAssciate_Cancel;
		
		@FindBy(xpath="//button[@ng-click='closeModal(id);']")
		public WebElementFacade btn_service360view_ServicesRT_Associate_lookup_cancel;
		
		
	//**************************************************************************************************************************************************************//
		
		//***************************************************** Topology Validation  ************************************************//
		
		@FindBy(xpath=".//*[@id='right-content']//ul//a[contains(text(),'Circuits')]")
		public WebElementFacade tab_circuit_in_services;
		
		@FindBy(xpath=".//*[@id='right-content']//input[@title='View Circuit']")
		public List<WebElement> btn_circuits_count;
		
		@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='order-detail-group']/div[10]//label[1]/a")
		public WebElementFacade Link_Start_Device;

		@FindBy(xpath=".//*[@id='left-content-tab']//div[@class='order-detail-group']/div[10]//label[1]/a")
		public WebElementFacade Link_End_Device;
		
	
		//**************************************************************************************************************************************************************//
		
		//************************************************************** IPTV Service View Page *****************************************************************************//
		
		//******************************* General Section ***********************//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-hide='editIPTVService']/label[text()='IPTV']")
		public WebElementFacade lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[text()='IPTV']/following-sibling::label[contains(text(),'-IPTV')]")
		public WebElementFacade lbl_service_viewpage_iptv_details_tab_gerneral_sec_name;	
		

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'IPTV Details')]")
		public WebElementFacade tab_service_viewpage_IPTV_details;
		
		//**************************************************************************************************************************************************************//
		
		//************************************************************** IPTV Service View Page *****************************************************************************//
		
				//******************************* General Section ***********************//
		
		@FindBy(xpath="	.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@ng-hide='editIPTVUnicastService']/label[text()='IPTV Unicast']")
		public WebElementFacade lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[text()='IPTV Unicast']/following-sibling::label[contains(text(),'-IPTV_Unicast')]")
		public WebElementFacade lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_name;	
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//tab-heading[contains(text(),'IPTV Unicast Details')]")
		public WebElementFacade tab_service_viewpage_IPTVunicast_details;
		
		//**************************************************************************************************************************************************************//
		
		//***************************************************** Service action buttons  ************************************************//
		
		
		@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@value='Delete'])[1]")
		public WebElementFacade btn_Servicepage_Delete;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@value='Edit']")
		public WebElementFacade btn_Servicepage_Edit;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//span[@ov-tooltip-2x='Refresh']")
		public WebElementFacade btn_Servicepage_refresh;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//i[contains(@ng-click,'onRefresh')]")
		public WebElementFacade btn_Servicepage_refresh_old;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//button[@value='Reset ONT']")
		public WebElementFacade btn_Servicepage_Reset_ONT;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@id='activateButton']")
		public WebElementFacade btn_viewServicepage_activate;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@id='deactivateButton']")
		public WebElementFacade btn_viewServicepage_deactivate;
		
		//**************************************************************************************************************************************************************//
		
		//#######################################################	Service Sanity Section  ################################################################//
		
		
		
		
		@FindBy(xpath = ".//*[@class='nav nav-tabs']//li[@class='ng-isolate-scope active' and @ng-repeat='tab in tabs']//tab-heading[@ng-click='onClickTab(tab)']")
		public WebElementFacade tab_search_result_details;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'DSL OVC Details')]")
		public WebElementFacade tab_serviceview_DSLOVCDetails;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'ENNI Link Service Details')]")
		public WebElementFacade tab_serviceview_ENNILinkServiceDetails;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Host Service Details')]")
		public WebElementFacade tab_serviceview_HostServiceDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Local EVC')]")
		public WebElementFacade tab_serviceview_localevcServiceDetails;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'MEF ENNI Details')]")
		public WebElementFacade tab_serviceview_mefenniServiceDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'MEF EVC Details')]")
		public WebElementFacade tab_serviceview_mefevcServiceDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'MEF OVC Details') or contains(text(),'MEF EVC Details') or contains(text(),'HSI Details') or contains(text(),'IPTV Details') or contains(text(),'IPTV Details') or contains(text(),'Details')]")
		public WebElementFacade tab_serviceview_ServiceDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'MEF Service Details')]")
		public WebElementFacade tab_serviceview_mefServiceDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'MEF UNI Details')]")
		public WebElementFacade tab_serviceview_mefuniDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'MGR UNI Details')]")
		public WebElementFacade tab_serviceview_mgruniDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Mgmt EVC Details')]")
		public WebElementFacade tab_serviceview_mgmtevcDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Mgmt UNI Details')]")
		public WebElementFacade tab_serviceview_mgmtuniDetails;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//tab-heading[contains(text(),'Probe UNI Details')]")
		public WebElementFacade tab_serviceview_probeuniDetails;
		
		
		//*************************************************** Service General Sections *****************************************************************************//
		
		@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Name ')]/..//div/span[contains(@ng-hide,'Service')]")
		public WebElementFacade lbl_serviceview_generalsection_servicename;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Name']/../../following-sibling::span//label")
		public WebElementFacade lbl_hostserviceview_generalsection_servicename;
		
		@FindBy(xpath ="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Name']/../div/label")
		public WebElementFacade lbl_DSLOVCserviceview_generalsection_servicename;
		
		
		//*****************/
		//MEF ENNI
		@FindBy(xpath ="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Name']/../div/label")
		public WebElementFacade lbl_MEF_ENNIserviceview_generalsection_servicename;
		
		@FindBy(xpath ="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 1')]/..//div/label")
		public WebElementFacade lbl_MEF_ENNIserviceview_generalsection_Alias1;
		
		@FindBy(xpath ="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 2')]/..//div/label")
		public WebElementFacade lbl_MEF_ENNIserviceview_generalsection_Alias2;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Note')]/..//div/label")
		public WebElementFacade lbl_MEF_ENNIserviceview_generalsection_Note;
		
		//MEF EVC
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Name']/parent::span/parent::span/following-sibling::span//label")
		public WebElementFacade lbl_MEF_EVCserviceview_generalsection_servicename;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 1')]/../../following-sibling::span//label[@ng-show='field.display']")
		public WebElementFacade lbl_MEF_EVCserviceview_generalsection_Alias1;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 2')]/../../following-sibling::span//label[@ng-show='field.display']")
		public WebElementFacade lbl_MEF_EVCserviceview_generalsection_Alias2;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Note')]/../label[2]")
		public WebElementFacade lbl_MEF_EVCserviceview_generalsection_Note;
		
		//MEF UNI
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Name']/parent::span/parent::span/following-sibling::span//label")
		public WebElementFacade lbl_MEF_UNIserviceview_generalsection_servicename;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 1')]/../../following-sibling::span//label[@ng-show='field.display']")
		public WebElementFacade lbl_MEF_UNIserviceview_generalsection_Alias1;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 2')]/../../following-sibling::span//label[@ng-show='field.display']")
		public WebElementFacade lbl_MEF_UNIserviceview_generalsection_Alias2;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Note')]/../label[2]")
		public WebElementFacade lbl_MEF_UNIserviceview_generalsection_Note;
		
		
		
		//*****************/
		
		
		
		@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Service Type')]/../../following-sibling::span//label)[1]")
		public WebElementFacade lbl_serviceview_generalsection_servicetype;
		
		@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[contains(text(),'Service Type')]/following-sibling::div//label)[1]")
		public WebElementFacade lbl_serviceview_generalsection_servicetype_old;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[text()='Name']/parent::span/parent::span/following-sibling::span//label")
		public WebElementFacade lbl_serviceview_generalsection_servicename_old;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias1')]/following-sibling::div/span[1]")
		public WebElementFacade lbl_serviceview_generalsection_Alias1;
		
		@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias2')]/following-sibling::div/span[1]")
		public WebElementFacade lbl_serviceview_generalsection_Alias2;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 1')]/../../following-sibling::span//label[@ng-show='field.display']")
		public WebElementFacade lbl_Hostserviceview_generalsection_Alias1;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 2')]/../../following-sibling::span//label[@ng-show='field.display']")
		public WebElementFacade lbl_Hostserviceview_generalsection_Alias2;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Note')]/../label[2]")
		public WebElementFacade lbl_Hostserviceview_generalsection_Note;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 1')]/..//div/label")
		public WebElementFacade lbl_DSLOVCserviceview_generalsection_Alias1;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Alias 2')]/..//div/label")
		public WebElementFacade lbl_DSLOVCserviceview_generalsection_Alias2;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[contains(text(),'Note')]/..//div/label")
		public WebElementFacade lbl_DSLOVCserviceview_generalsection_Note;
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		//*************************************************** Service Association Section *****************************************************************************//
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='Device Name']/../../following-sibling::span//a")
		public WebElementFacade lbl_serviceview_serviceassociationsec_devicehyperlink;
		
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
		
		 
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//a[text()='ARMOR']")
		public WebElementFacade tab_Armor;
		
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
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Topology View']")
		public WebElementFacade tab_topologyview;	
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='VLAN / Virtual Ports']")		
		public WebElementFacade tab_Virtual_Ports;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Virtual Ports']")
		public WebElementFacade tab_Virtual_Ports_old;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='Service Circuit Design']")		
		public WebElementFacade tab_servicecircuitdesign;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//ul[@role='tablist']//a[text()='Topology View']")
		public WebElementFacade tab_Topologyview;
		
		@FindBy(xpath = "(.//*[@class='ng-scope']//i[@ng-click='fetchSLATemplate()'])[2]")
		public WebElementFacade SLA_template; 
		
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div[1])[1]")
		public WebElementFacade slatemplate_name; 
		
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div)[2]")
		public WebElementFacade lbl_customer_id_target;
		
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div)[3]")
		public WebElementFacade lbl_slatarget_type_target;
		 
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div)[4]")
		public WebElementFacade lbl_CosLevel_type_target; 
			
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div)[5]")
		public WebElementFacade lbl_QOS_QUALIFIER_target; 
		
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div[2])[1]")
		public WebElementFacade lbl_customer_id;
		 
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div[3])[1]")
		public WebElementFacade lbl_slatarget_type; 

		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div[4])[1]")
		public WebElementFacade lbl_CosLevel_type; 
		 
 
		@FindBy(xpath = "(.//*[@class='modal-content modelPosAlign']//div[@ng-repeat='sla in sla.slaVOtemplateList']//div[5])[1]")
		public WebElementFacade lbl_QOS_QUALIFIER; 
		
		@FindBy(xpath = "(.//*[@class='modal-header']//button[@ng-click='slaTemplatecloseModal()'])[1]")
		public WebElementFacade btn_SLAtemplate_close;
		 

		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		//********************************************* Relative TAb- Device **************************************************************//
				@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'select()')])[1]")
				public WebElementFacade tab_device_one; 
							
				 @FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[contains(@ng-click,'select()')])[2]")			 
				   public WebElementFacade tab_device_two;
		//######################################################		Audit logs Tab  #####################################################//
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[contains(text(),'ARM Audit Logs')]")
		public WebElementFacade tab_search_service_audit_log_arm_audit_log;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[text()='ARM Audit Logs']")
		public WebElementFacade tab_serviceview_auditlogs_ARM_auditlogs;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='ng-isolate-scope active']//a[text()='ARM Audit Logs']")
		public WebElementFacade tab_serviceview_auditlogs_ARM_auditlogs_Active;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-click='getDeviceAuditLog()']")
		public WebElementFacade btn_serach_service_Audit_log_tab_getlog;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//*[@ng-show='arm_audit_loader']")
		public WebElementFacade lbl_serach_service_Audit_log_tab_getlog_loader;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@ng-controller='viewAuditLogCtrl']//*[@ng-model='auditLogRequest.getLogsFromArchive']")
		public WebElementFacade cbx_serach_service_ARM_Audit_log_FromArchive;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//a[text()='OmniVue Audit Logs']")
		public WebElementFacade tab_serviceview_auditlogs_OMNIVUE_auditlogs;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='ng-isolate-scope active']//a[text()='OmniVue Audit Logs']")
		public WebElementFacade tab_serviceview_auditlogs_OMNIVUE_auditlogs_Active; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@ng-controller='auditLogCtrl']//i[@ng-click='printGridData()']")
		public WebElementFacade btn_serach_serviceview_audit_log_arm_omnivue_log_print;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-click='getOVAuditLogs()']")
		public WebElementFacade btn_serach_serviceview_Omnivue_Audit_log_tab_getlog; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row0jqxGrid')]/div[1]/div")
		public WebElementFacade lbl_serach_serviceview_Omnivue_Audit_log_tab_action; 	
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row1jqxGrid')]/div[1]/div")
		public WebElementFacade lbl_serach_serviceview_Omnivue_Audit_log_tab_action2; 
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row0jqxGrid')]/div[3]/div")
		public WebElementFacade lbl_serach_serviceview_Omnivue_Audit_log_tab_username; 		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row1jqxGrid')]/div[3]/div")
		public WebElementFacade lbl_serach_serviceview_Omnivue_Audit_log_tab_username2; 		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//*[@ng-controller='auditLogCtrl']//label[text()='From Archive']/preceding-sibling::input")
		public WebElementFacade cbx_serach_serviceview_Omnivue_Audit_log_tab_FromArchive;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//*[@ng-show='init_loader']")
		public WebElementFacade lbl_serach_serviceview_Omnivue_Audit_log_tab_getlog_loader;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[@class='tab-pane ng-scope active']//*[text()='No Audit Logs.']")
		public WebElementFacade lbl_serach_serviceview_Audit_log_tab_errormsg;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[contains(text(),'Audit Log found for selected search criteria.')]")
		public WebElementFacade lbl_serach_serviceview_ARMAudit_log_tab_errormsg;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]//div[1]/div[contains(text(),'Update')]/../following-sibling::div[1]")
		public List<WebElement> lbl_search_serviceview_OMNIVueAudit_log_tab_UpdateDetails;
		
		
		//###########################################################	DSL OVC Methods ################################################################//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-show='dslEditable']")
		public WebElementFacade btn_DSLOVC_View_Save;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//label[starts-with(text(),'Affiliate Owner')]/following-sibling::div/select")
		public WebElementFacade ddl_dslovc_affiliateowner;
		
		
		//#####################################################################################################################################################//
		
		//###########################################################	Edit Service page methods ################################################################//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='serviceDetail.DOWNSTREAM_BW_UNIT']")
		public WebElementFacade ddl_service_editpage_downstreamrate;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='serviceDetail.UPSTREAM_BW_UNIT']")
		public WebElementFacade ddl_service_editpage_upstreamrate;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='serviceDetail.autoActivate']")
		public WebElementFacade cbk_service_editpage_autoactvate;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@id='activateButton']")
		public WebElementFacade btn_service_editpage_activate;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]")
		public WebElementFacade lbl_service_alertmsg;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert')]/button")
		public WebElementFacade btn_service_alertmsg_closeicon;
		

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='PM_TYPE']")
		public WebElementFacade ddl_editservice_pmtype;
		
		

		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='IPTV Unicast Service']/following-sibling::div//input")
		public WebElementFacade tbx_editservice_iptv_unicastlink;
		

		//#####################################################################################################################################################//
		
		//###########################################################	Activations related tab ################################################################//
		
		 
		 
		
		
		//#####################################################################################################################################################//

		
		//###########################################################	Task related tab ################################################################//

		@FindBy(xpath = ".//*[contains(@id,'row0taskGrid_')]/div[5]")
		 public WebElementFacade lbl_taskid;
		
		@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[starts-with(@id,'row0jqxGrid')]/div[1]/div/input")
		 public WebElementFacade btn_OrderRT_viewicon;
		
		@FindBy(xpath = "(//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[contains(@ng-click,'gridSettings.viewTaskDetailDsp')])[1]")
				 public WebElementFacade btn_taskRT_viewicon;
				
		//#####################################################################################################################################################//
		
		//###########################################################	EVC Service Attributes ################################################################//
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//label[text()='PM Type']/../../following-sibling::span//label")
		 public WebElementFacade lbl_Serviceview_pmtype;
		
		@FindBy(xpath="//select[@name='PM_TYPE']")
		public WebElementFacade ddl_ServiceEdit_pmtype;
		
		//#####################################################################################################################################################//
		
		
		//###########################################################	Related Tab Support Icons ################################################################//
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//li[@ng-click='refreshDetails()']//i")
		 public WebElementFacade btn_RT_Supporticon_refresh;;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//i[@ng-click='printGridData()']")
		 public WebElementFacade btn_RT_Supporticon_print;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//i[@ng-click='exportToExcel()']")
		 public WebElementFacade btn_RT_Supporticon_exportexcel;
		
		@FindBy(xpath="//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[contains(text(),' of ')]")
	    public WebElementFacade lbl_relatedtab_count;
		
		 
		
		
		
		//#####################################################################################################################################################//
		
		//###########################################################	Related Tab No Data MSG ################################################################//

		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//div[contains(@class,'alert alert-danger')]")
		public WebElementFacade lbl_alert_message_no_data_related_tabs;
		
		//#####################################################################################################################################################//
		
		//###########################################################	Devices Related Tab ################################################################//
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@value='Edit Device Details']")
		public WebElementFacade btn_devicesRT_editdevicesdetails;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-controller='relatedServiceDeviceCtrl']//div[@class='tab-pane ng-scope active']//a")
		public WebElementFacade lbl_vieworderpage_related_tab_active_device_name_hyperlink;

		//#####################################################################################################################################################//
		
		
		//###########################################################	Service Circuit Design Related Tab ################################################################//
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//a[text()='Service Circuit Design']")
		public WebElementFacade tab_viewservicepage_related_tab_Service_Circuit_Design;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//h5[contains(text(),'Google')]/following-sibling::span")
		public WebElementFacade btn_viewservicepage_related_tab_Service_Circuit_Design_googlemaps;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@src='rightContentUrl']//div[@class='tab-pane ng-scope active']//label[text()='Please select Member Service']/following-sibling::div//span[@class='ui-select-match-text pull-left']")
		public WebElementFacade ddl_viewservicepage_related_tab_Service_Circuit_Design_memberservice;
		
		
		
		//#####################################################################################################################################################//
		

		//###########################################################	Port Selection Validations section  ################################################################//
		
		
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Port Selection']/following-sibling::div//label[text()='Start Device Name']/..//a")
		public WebElementFacade lbl_viewservicepage_portsection_startdevice_hyperlink;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Port Selection']/following-sibling::div//label[text()='End Device Name']/..//a")
		public WebElementFacade lbl_viewservicepage_portsection_enddevice_hyperlink;
		
		
		//MEFUNI, Mgmt UNI, MEF EVC, MEF OVC
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='SERVICE2PROVISIONSTATUS']")
        public WebElementFacade ddl_ProvisioningStatus_editServicepage_MEFUNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='REQUESTING_AFFILIATE']")
        public WebElementFacade ddl_REQUESTING_AFFILIATE_editServicepage_MEFUNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='NCCODE']")
        public WebElementFacade ddl_NCCODE_editServicepage_MEFUNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='NCICODE']")
        public WebElementFacade ddl_NCICODE_editServicepage_MEFUNI;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='SECNCICODE']")
        public WebElementFacade ddl_SECNCICODE_editServicepage_MEFUNI;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='MCO']")
        public WebElementFacade ddl_MCO_editServicepage_MEFUNI;
        
        //.//label[text()='Auto Negotiate']
        @FindBy(xpath=".//label[text()='Auto Negotiate']")
        public WebElementFacade ddl_AutoNegotiate_MEFUNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='RATE_LIMIT_TYPE']")
        public WebElementFacade ddl_RateLimitType_editServicepage_MgmtUNI;
        
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='PMFLAG']")
        public WebElementFacade ddl_PMFLAG_editServicepage_MEFEVC;
        
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='SLA_AGREEMENT_TEMPLATE']")
        public WebElementFacade ddl_SLATemplate_editServicepage_MEFEVC;
        

        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='EVCOVCNC']")
        public WebElementFacade ddl_PMFLAG_editServicepage_EVCOVCNC;
        
        
        //MEFENNI,Mgmt EVC,
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='provisionstatus']")
        public WebElementFacade ddl_ProvisioningStatus_editServicepage_MEFENNI;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='mcoval'")
        public WebElementFacade ddl_MCO_editServicepage_MEFENNI;
        
        @FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[2]/div[13]/div/div/ng-include/div[6]/div[3]/div[2]/div/input")
        public WebElementFacade ddl_MCO_editServicepage_MEFENNI2;
       
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='nccodeval']")
        public WebElementFacade ddl_NCCODE_editServicepage_MEFENNI;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='ncicodeval'")
        public WebElementFacade ddl_NCICODE_editServicepage_MEFENNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='secncicodeval']")
        public WebElementFacade ddl_SecNCICode_editServicepage_MEFENNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='reqaffli']")
        public WebElementFacade ddl_RequestingAffiliate_editServicepage_MEFENNI;
        
        @FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='evcovcnc']")
        public WebElementFacade ddl_EVC_NCCODE_editServicepage_MgmtEVC;
        

		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='provisionstatus']")
		public WebElementFacade ddl_dslovc_ProvisioningStatus_editServicepage;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='netpro']")
		public WebElementFacade ddl_dslovc_networkProtocol ;
		
		@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='supIo	']")
		public WebElementFacade ddl_dslovc_SupportedIPVersion;

		// ###################################### MEF OVC PAGE######################################

				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='MCO']/../../following-sibling::span//label")
				public WebElementFacade lbl_serviceview_mco;

				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='MCO']/following-sibling::div/label")
				public WebElementFacade lbl_serviceview_mco2;

				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='Name']/../../following-sibling::span//label")
				public WebElementFacade lbl_serviceview_name_ethernet;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//label[normalize-space(text()) = 'Name']/following::div/span")
				public WebElementFacade lbl_serviceview_name_gpon;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//label[normalize-space(text()) = 'Alias1']/following-sibling::div/span[1]")
				public WebElementFacade lbl_serviceview_alias1_gpon;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//label[normalize-space(text()) = 'Alias2']/following-sibling::div/span[1]")
				public WebElementFacade lbl_serviceview_alias2_gpon;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='Alias 1']/../../following-sibling::span//label")
				public WebElementFacade lbl_serviceview_alias1;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='Alias 2']/../../following-sibling::span//label")
				public WebElementFacade lbl_serviceview_alias2;
				/// Search MUF UNI
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='invServiceSearchValues.specCode']")
				public WebElementFacade ddl_advsearch_speccode;
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='inServiceAdvncSearch();']")
				public WebElementFacade btn_advance_service_search;
				
				@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]//div//div//div)[2]")
				public WebElementFacade lbl_uni_name;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='invServiceSearchValues.serviceType']")
				public WebElementFacade ddl_advsearch_servicetype;
				
				@FindBy(xpath = "(.//*[@ng-click='onClickTab(tab)']//a)[4]")
				public WebElementFacade tab_advsearch_result_close;
				@FindBy(xpath = "(.//*[@ng-click='onClickTab(tab)']//a)[3]")
				public WebElementFacade tab_advsearch_close;
				
				@FindBy(xpath = "(.//*[@ng-click='onClickTab(tab)']//a)[5]")
				public WebElementFacade tab_advsearch_service_details_close;
				
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='addMember()']")
				public WebElementFacade btn_addmember;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//button[@ng-click='saveMember(member)']")
				public WebElementFacade btn_savemember;
				
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//span[@ng-click='openServiceAssociationMemberLookUp()']")
				public WebElementFacade img_magnifyingglass;
				
				
				@FindBy(xpath = "(//*[@id='serviceAssociationMember']//input[@ng-model='memberFullName'])[3]")
				public WebElementFacade tbx_member_name;
				
				@FindBy(xpath = "(//*[@id='serviceAssociationMember']//button[@ng-click='serviceAssociationMemberlookUp(memberFullName)'])[3]")
				public WebElementFacade btn_addmember_lookup;
				
				@FindBy(xpath = "//*[@id='serviceAssociationMember_look_up']/tbody/tr/td[1]/a")
				public WebElementFacade lnk_addmember;
				
				@FindBy(xpath = "//*[@ng-show='mef_evc_loader']")
				public WebElementFacade lbl_addmember_loader;
				
				@FindBy(xpath = "//*[@ng-show='device_inventory_adnc_loader']")
				public WebElementFacade lbl_servicesearch_loader;
				
				
				
				@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//select[contains(@ng-model,'member.ParentNciCodes') or contains(@ng-model,'association.parentNciCodes')]")
				public WebElementFacade ddl_addmember_NCI;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//div[@ng-show='showAlert']")
				public WebElementFacade lbl_add_members_msg;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//*[@class='tab-pane ng-scope active']//*[text()='PM Type']/../../following-sibling::span//label")
				public WebElementFacade lbl_pmtype;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='right-content']//i[@ng-click='fetchSlaTemplate()']")
				public WebElementFacade lbl_slatemplate;
				
				@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//button[@ng-click='slaTemplatecloseModal()'])[1]")
				public WebElementFacade btn_slatemplate_close;
				@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//*[@id=\"right-content\"]//div[@ng-repeat='sla in sla.slaVOtemplateList']//div)[1]")
				public WebElementFacade lbl_slatemplate_name;
				
				@FindBy(xpath = "(.//*[@class='tab-pane ng-scope active']//*[@id='right-content']//div[@ng-repeat='slaMile in sla.slaMileage']//div[6])[1]")
				public WebElementFacade lbl_slatemplate_targetvalue;
			////Edit MEF OVC page
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//input[@id='NAME']")
				public WebElementFacade tbx_serviceview_name;

				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//input[@id='ALIAS1']")
				public WebElementFacade tbx_serviceview_alias1;

				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//input[@id='ALIAS2']")
				public WebElementFacade tbx_serviceview_alias2;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='MCO']")
				public WebElementFacade ddl_serviceview_mco;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='PM_TYPE']")
				public WebElementFacade ddl_pmtype;
				
				@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//ul[@role='tablist']//a[text()='OVC Members' or text()='EVC Members']")
				public WebElementFacade tab_ovcmembers;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='PMFLAG']")
				public WebElementFacade ddl_pmflag;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='SLA_AGREEMENT_TEMPLATE']")
				public WebElementFacade ddl_leftslatemplate;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='service.name']")
				public WebElementFacade tbx_assocoiate_service;
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='service.serviceType']")
				public WebElementFacade ddl_assocoiate_service_type;
				
				@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@ng-model='service.deviceName']")
				public WebElementFacade tbx_assocoiate_device_name;
				

				@FindBy(xpath=".//*[@id='activateButton']")
				public WebElementFacade btn_activate;
//			String x="abc";
//				@FindBy(xpath=".//*[@id='activateButton']")
//				public WebElementFacade btn_activate;
//				
			
				
				@FindBy(xpath=".//input[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='actOrderNo.OrderNo']")
				public WebElementFacade tbx_ordernumber;
				
				@FindBy(xpath=".//*[@ng-click='activateParticularService(actOrderNo.OrderNo)']")
				public WebElementFacade btn_ActivateSubmit;
				
				@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[1]")
				public WebElementFacade  tbx_activationMsgUNI;
				
				@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[2]/div[1]")
				public WebElementFacade  tbx_activationMsgENNI;
				
				
				@FindBy(xpath = ".//*[@ng-click='changeMiddleTab(tab)' and contains(text(),'Activation')]")
				public WebElementFacade tab_reltab_Activation ;
				
				
				
			    @FindBy(xpath="//table[@class='table table-bordered table1 table2']")
			    public WebElementFacade table;
				
				
				
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return null;
	}
	public void SelectPMType(String value) throws Exception {
		ddl_ServiceEdit_pmtype.selectByVisibleText(value);
	}
	public void ValidatePMType_of_service() throws Exception{
		String servicename = lbl_serviceview_name_ethernet.getText();
		List<String> PMTypevalues = new ArrayList<String>();
		PMTypevalues = ARMDB.Validate_PMType_Values_in_Service(servicename);
		System.out.println("PMTypevalues are "+PMTypevalues);
		
			if(PMTypevalues==null){
				System.out.println("PMType value is Null");
			} else throw new Error("PMType value is Not Null");
		
		/*for(int i=0; i<=PMTypevalues.size()-1;i++){
			if(PMTypevalues.get(i).length()==0){
				System.out.println("PMType value is Null");
			} else throw new Error("PMType value is Not Null");
		}*/	
	}
		
	public void click_savebtn() throws Exception {
		jsClick(btn_save);
		Thread.sleep(5000);
	}
	


public void serviceactivation(String Order_Num){


waitFor(btn_activate);

jsClick(btn_activate);

waitFor(tbx_ordernumber);

tbx_ordernumber.sendKeys(Order_Num);

jsClick(btn_ActivateSubmit);

System.out.println("Successfully clicked on Activation Botton");

			
	}

public void Validate_activationmessage(String ServiceType){
	


	String Expected_Message = "Activation process initiated successfully.";
	
	//btn_ActivateSubmit.waitUntilNotVisible();
if (ServiceType.equals("MEF UNI")) {
	
	waitForElement(tbx_activationMsgUNI);
	
	if(tbx_activationMsgUNI.isCurrentlyVisible()){
		
		if (tbx_activationMsgUNI.getText().trim().contains(Expected_Message)) {
			System.out.println("Activation initiated successfully");
		}
		else {
			System.out.println("Activation Failed");
			Assert.fail();}
}
	
}
else if (ServiceType.equals("MEF ENNI")) {
		waitForElement(tbx_activationMsgENNI);
		
if (tbx_activationMsgENNI.isCurrentlyVisible()){
			
			if (tbx_activationMsgENNI.getText().trim().contains(Expected_Message)) {
				System.out.println("Activation initiated successfully");
			}		

			else {
				System.out.println("Activation Failed");

				Assert.fail();}		

}
}
}



	public void click_devicetab() throws Exception {
		//close_tab);
		//Thread.sleep(5000);
		jsClick(tab_device);
	}
	
	
	public void click_closetab(){
	
		// trying to click on close button .As it have 2image of close , we kept it in nested try.
		try {
			jsClick(tab_close);
			Thread.sleep(2000);
		}
			catch (Exception  e) {
				e.printStackTrace();
		try { 
			jsClick(tab1_close);
			//Thread.sleep(2000);
		}
		catch (Exception e1) {	
		// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
			}
	
	}
	public void Revertname(){
		tbx_editDeviceName.sendKeys("77/L1XX/785391//CTQF");	
	}
	
	public void click_logoutinsettings() throws Exception {
		jsClick(img_settings);
		Thread.sleep(2000);
		jsClick(lnk_logoutInSettings);
		Thread.sleep(15000);
	}

	public void click_Ctagdelete() {
		jsClick(btn_Ctagdelete);
	}
	
	//Validating the Add contact present in location search
		public void validateaddcontactbutton(){
			try {
			if(btn_addcontact.isVisible()){
				jsClick(btn_addcontact);
				Thread.sleep(3000);
				if(createcontacttab.isVisible()){
					slf4jLogger.info("Valiadted Add contact button successfully");
					Thread.sleep(3000);
				}
				
			}				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		public void Locationaddcontactbutton(){
			
			try {
				if(btn_View_active.isVisible()){
				jsClick(btn_View_active);
				Thread.sleep(3000);
				if(contact_label.isVisible()){
					slf4jLogger.info("Contact page is displaed");
					Thread.sleep(3000);
				}
				} 
											
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		public void Validation_Usabilites(String serviceType,String serviceCapabilityType1,String serviceCapabilityType2) throws InterruptedException {
			//int validation=0;
			
			int i=1;
			while(i!=0){
				
				if(getDriver().findElement(By.xpath("//div[contains(@id,'row"+i+"serviceGrid_')]/div[3]/div")).getText().equals(serviceType)){
					
					if(getDriver().findElement(By.xpath("//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div")).getText().equals(serviceCapabilityType1) || getDriver().findElement(By.xpath("//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div")).getText().equals(serviceCapabilityType2)){
						 slf4jLogger.info("As expected for  Service type as "+serviceType+" when service capability types as "+serviceCapabilityType1+" & "+serviceCapabilityType2);
					break;
					}
				}
				
				i++;
				if(!getDriver().findElement(By.xpath("//div[contains(@id,'row"+i+"serviceGrid_')]/div[3]/div")).isDisplayed()){
					 slf4jLogger.info("End of the row");
					 break;
				}
				
				
			}
			
			/*List<WebElementFacade> serviceList = devcreatepage.lbl_allServiceXapath;
			ArrayList<String> services=new ArrayList<String>();
			for(int j=0;j<serviceList.size();j++){
				services.add(j, serviceList.get(j).getText());
						
			}
			for(int i=0;i<services.size();i++){
				
				 if(services.get(i).equals(serviceType))
				 {				
					String actualServiceCapabilityTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div";
					 
					 String actualServiceCapabilityType=find(By.xpath(actualServiceCapabilityTypeXpath)).getText();
					 slf4jLogger.info("check wat is this next"+actualServiceCapabilityType);
					 if(actualServiceCapabilityType.equals(serviceCapabilityType1)||actualServiceCapabilityType.equals(serviceCapabilityType2))
					 {
						 slf4jLogger.info("Successfully validated");						 
						 slf4jLogger.info(services.get(i));
						 slf4jLogger.info(actualServiceCapabilityType);
						 validation=1;
					}
					 
				}
			}
			if(validation==1){
				return true;
				}
				else {				
				return false;
				}*/
			//return true;
		}
		
		public void validate_servicetab(){
			if(lbl_service_msg.isVisible())
			{
				slf4jLogger.info("No service is present");
			}
			else throw new Error("Service is prsent");
			
		}
		
		public void bam_log_validation(String logs) throws Throwable{	//I am validating related tab to display
			
			String sheetname=orderpage.search_type_sheet();
			int column_count=0;
			String ValidationStatus=null,header_column=null;
			slf4jLogger.info("Logs:"+logs);
			switch(logs){
			case "Devices": if(!devcreatepage.tab_serach_device_Device_details.isCurrentlyVisible()){
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
							
								slf4jLogger.info("Devices are displayed");
								ValidationStatus="Pass";
							}/*else if(!orderpage.lbl_vieworderpage_order_status.getText().contains("COMPLETED")){
								ValidationStatus=orderpage.lbl_alert_message_no_data_related_tabs.getText()+"-As expected since Order status:"+orderpage.lbl_vieworderpage_order_status.getText();
							}*/else { 
							
								slf4jLogger.info("Devices is not Displayed getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
									ValidationStatus="Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
							}
							if(!lbl_serach_device_network_details_tab_Network_Information_Source_System.isCurrentlyVisible()){
								
							header_column="Devices Related Tab";
							}
							
								}break;
		
			case "BAM event logs": if(lbl_bamtable.isCurrentlyVisible()){
									slf4jLogger.info("BAM Table is present");
									ValidationStatus="Pass";
								}
								else { 
									slf4jLogger.info("BAM Table is not Present getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
									ValidationStatus="Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
								}
								header_column="BAM Related Tab";
						break;
				
				
			case "Configure columns": if(lbl_configurecolumn.isEnabled()){
								jsClick(lbl_configurecolumn);
											ValidationStatus="Pass";
										} else { 
											slf4jLogger.info("Configure column is not Present getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
											ValidationStatus="Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
										
										}break;
										
										
			case "Task details":if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){ 
								if(lbl_taskresulttable.isCurrentlyVisible()){
										slf4jLogger.info("Task is present");
										ValidationStatus="Pass";
									}} else  { 
										slf4jLogger.info("Task is not Present getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
										ValidationStatus="Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
									}
			
										header_column="Tasks Related Tab";
									/*if(orderpage.btn_order_search_results_tab.isCurrentlyVisible() && orderpage.btn_order_tab_search_view_page.getText().replaceAll("\\s","").contains(("Order Id:"+orderpage.gfast_order_id_search()))){
										column_count=orderpage.search_hearder_excel(sheetname,"Task Related Tab");
										orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, ValidationStatus);
										}*/break;
									
			case "Services Details": if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
								slf4jLogger.info("Service is present");
								ValidationStatus="Pass";
							} else { 
								slf4jLogger.info("Service is not Present getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
								ValidationStatus="Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
							}
			
			
							header_column="Services Related Tab";
								break;
							
			case "Circuit columns": 		jsClick(btn_expandbutton_left);
										waitForElement(orderpage.btn_related_tab_refresh_icon);
											if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
												circuit_Tab_column_header_validation(); 
												ValidationStatus="Pass";
												
												}else { 
							
														slf4jLogger.info("Devices is not Displayed getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
														ValidationStatus="Fail- getting the message as"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
														header_column="Circuits Related Tab";
													}
								
								//orderpage.btn_related_tab_refresh_icon);
								//Thread.sleep(3000);
								//waitForElement(orderpage.btn_related_tab_refresh_icon);
								
								
								
											jsClick(btn_expandbutton_right);
								waitForElement(btn_expandbutton_left);
								
								break;
								
			case "G.Fast port & Serives associated": jsClick(btn_expandbutton_left);
								Thread.sleep(2000);
								device_ports_related_tab_gfast_validation(); 
								jsClick(btn_expandbutton_right);
								waitForElement(btn_expandbutton_left);
								break;
			
			case "Subscribers Details": ValidationStatus=device_subscriber_tab(); header_column="Subscribers Related Tab";break;
			
			case "Service Areas columns":service_Area_colums();break;
			
			case "CLO List tab": tirks_colums_validation();break;
			
			case "CD and WA tabs": if(tab_order_related_tab_tirks_CD.isCurrentlyVisible() && tab_order_related_tab_tirks_WA.isCurrentlyVisible()){
									slf4jLogger.info("CD & WA Tabs are displayed in orders Related tab");
									if(!orderpage.lbl_alert_message_no_data_tirks_CD.isCurrentlyVisible()){ 
										ValidationStatus="Pass";
									} else {
										ValidationStatus="Fail-Getting message as "+orderpage.lbl_alert_message_no_data_tirks_CD.getText();
									}
									
									} else {
										slf4jLogger.info("CD & WA are not Displayeds");
										ValidationStatus="Fail-CD & WA are not Displayeds";
									} header_column="TIRKS Related Tab";  break;
			
			case "Virtual Ports columns": jsClick(btn_expandbutton_left);
								waitForElement(orderpage.btn_related_tab_refresh_icon);
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									if(orderpage.btn_related_tab_excel_icon.isCurrentlyVisible()){
										ValidationStatus="Pass";
									}
									
								} else {
									ValidationStatus="Fail- Getting this message:"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
								}
				
								header_column="Virtual Ports Related Tab"; 
									break;	
									
			case "Associated Services Tab": if(Page.envData.getName().equals("E2E")){
										if(tab_service360view_ServicesRT_Association_Service.isCurrentlyVisible()){
												ValidationStatus="Pass";
														} else {
															ValidationStatus="Fail- Association Service Tab is not displayed in Service RT";
															}
										} else {
											ValidationStatus="Pass";
											}
									header_column="Services Related Tab"; 
									break;	
			
					}
		
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				slf4jLogger.info("header_column:"+header_column);
				if(header_column!=null){
				column_count=orderpage.search_hearder_excel(sheetname,header_column);
				slf4jLogger.info(header_column+" Status as:"+ValidationStatus+" "+": Position="+column_count+" , of the sheet:"+sheetname);
				orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column_count, ValidationStatus);
				if(logs.equals("BAM event logs")){
				orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);
				}	
				 			
			
			if(ValidationStatus.contains("Fail") && !logs.equals("Subscribers Details")){
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					if(logs.equals("Circuit columns") || logs.equals("CD and WA tabs")){
						orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);
						}
				}
				throw new Error(ValidationStatus+" for the validation of "+logs);
				
			}
				}
			}
			
			/*if(logs.equals("BAM event logs")){
			if(lbl_bamtable.isDisplayed()){
				slf4jLogger.info("BAM Table is present");
			}
			else throw new Error("BAM Table is not Present");
			}
			else if(logs.equals("Configure columns")){
				if(lbl_configurecolumn.isEnabled()){
					lbl_configurecolumn);
				} else throw new Error("Configure column is not Present");
			} else if(logs.equals("Task details")){
				if(lbl_taskresulttable.isDisplayed()){
					slf4jLogger.info("Task is present");
				} else throw new Error("Task is not Present");
			}*/
		}
		
		/*public String viewpagesearch() throws Throwable{
			
			if(orderpage.lbl_vieworderpage_csof_order_no.isCurrentlyVisible()){
				return "GFast_OrderView_RelatedTab";
			} else if(lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.isCurrentlyVisible()){
				return "GFast_ServiceView_RelatedTab";
			} else 
				return "GFast_DeviceView_RelatedTab";			
		}*/
		
		public void tirks_colums_validation() throws Throwable{
			if(tab_tirks_clo_list.isCurrentlyVisible()){
				slf4jLogger.info("CLO List Tab Is present");
			} else {
				slf4jLogger.info("CLO List Tab Is not present");
			}
		}
		
		public void service_Area_colums() throws Throwable{
			int column_count=orderpage.search_hearder_excel(orderpage.search_type_sheet(),"Service Area Related Tab");
			if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			if(orderpage.btn_related_tab_excel_icon.isCurrentlyVisible()){
				
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			
	
				orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, "Pass");
				
				
			}
			
			} else {
				
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, "Fail");
					orderpage.gfast_Automation_status_update("GFast-Sheet", orderpage.search_type_sheet());
				}
				throw new Error("No data ia Present");
				
			}
			
			slf4jLogger.info("Service Areas Table is displayed");
			/*if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				
				orderpage.gfast_Automation_status_update("GFast-Sheet", orderpage.search_type_sheet());
			}*/
			
			} else {
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, "Fail- getting the message as:"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
					orderpage.gfast_Automation_status_update("GFast-Sheet", orderpage.search_type_sheet());
				}
				throw new Error("No data ia Present");
			}
		}
		
		public String device_subscriber_tab() throws Throwable{
			if(orderpage.btn_related_tab_excel_icon.isCurrentlyVisible()){
				slf4jLogger.info("Subscriber Table is displayed");
				return "Pass";
			} else 
				return "Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText();
		}
		
		
		public void device_ports_related_tab_gfast_validation() throws Throwable{
		
			
			int port_column=0,status_column=0,type_column=0,service_column=0,i=2;
			String Service_name=null;
			String[] device_port_table_header={"Shelf","Slot","ParentCardName","SubSlot","ChildCardName","Port","Status","Circuit","Shelftype","Slottype","Type","Service"," "," "," "};
			int column_count=orderpage.search_hearder_excel(orderpage.search_type_sheet(),"Device Ports Related Tab");
			String validation=null,validation_gfast=null;
			while(i!=0){
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//thead[2]//th["+i+"]")).getText().replaceAll("\\s","")){
				case "Port":port_column=i; break;
				case "Status": status_column=i; break;
				case "Type": type_column=i; break;
				case "Service": service_column=i; break;				
				}
				
				slf4jLogger.info(port_column+"=port_column "+status_column+"=status_column "+type_column+"=type_column"+service_column+"=service_column");
				if(loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//thead[2]//th["+i+"]")).getText().replaceAll("\\s","").equals(device_port_table_header[i-2])){
					slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//thead[2]//th["+i+"]")).getText().replaceAll("\\s",""));
				} else {
					slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//thead[2]//th["+i+"]")).getText().replaceAll("\\s",""));
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//thead[2]//th["+i+"]"))){
					slf4jLogger.info("Not visible");
					break;
				}
			}
			
			i=1;
			
			// ************************************************* Check if the Order Tab is present ****************************************************************************//
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				String device_tab=loginPage.getDriver().findElement(By.xpath(".//*[@class='ng-isolate-scope active']//*[@draggable='true']//tab-heading")).getText().replaceAll("\\s","");
				slf4jLogger.info("Device Tab name:"+device_tab);
				jsClick(orderpage.btn_order_tab_search_view_page);
				waitForElement(orderpage.btn_dispatch);
				Service_name=orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
				slf4jLogger.info("Service details:"+Service_name);
				jsClick(loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+device_tab+"')]")));
				waitForElement(btn_expandbutton_right);
				
			}
			
			//*********** Searching for G Fast Port **********************************//
			while(i!=0){
				if(loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+port_column+"]")).getText().replaceAll("\\s","").contains("gfast")){
				
				slf4jLogger.info("Port is displayed correctly as Gfast");
				
				validation_gfast="Pass";
				validation="Pass";
				
				if(!loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+service_column+"]")).getText().isEmpty()){
					slf4jLogger.info("Service is displayed correctly"+loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+service_column+"]")).getText().replaceAll("\\s",""));
					
				
						if(loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+service_column+"]")).getText().replaceAll("\\s","").equals(Service_name)){
							
						slf4jLogger.info("Service name is matching="+Service_name);
					
						
				
					if(loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+status_column+"]")).getText().replaceAll("\\s","").equals("IS")){
						slf4jLogger.info("Status is displayed correctly as IS");
					}
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+type_column+"]")).getText().replaceAll("\\s","").equals("G.fast")){
						slf4jLogger.info("Type is displayed correctly as G.fast");
					}
				
						}
				}	
				
				}
				i=i+2;
				
				if(!loginPage.isElementVisible(By.xpath(".//*[@ng-controller='deviceTreeDetailCtrl']//*[@class='row order-detail-group table_row treeClass']//tbody/tr["+i+"]/td["+port_column+"]"))){
					slf4jLogger.info("Not visible columns");
					break;
				}
			}		
			
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				
				if(validation==null){
					orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, "Fail- Not an GFast device");
				} else {
					orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, validation);
				}
				
				column_count+=2;
				if(validation_gfast==null){
					
					orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, "Fail- GFast Port is not diaplayed correvtly");
				} else {
					orderpage.gfast_write_data_inexcel("GFast-Sheet", orderpage.search_type_sheet(), column_count, validation_gfast);
				}
				orderpage.gfast_Automation_status_update("GFast-Sheet", orderpage.search_type_sheet());
			}
			
		}
		
		public void circuit_Tab_column_header_validation() throws Throwable{
			int i=1;
			String sheetname=orderpage.search_type_sheet();
			int column=orderpage.search_hearder_excel(sheetname, "Circuits Related Tab");
			int View_column=0,ProvisioningStatus_column=0,Name_column=0,CircuitType_column=0,StartDevice_column=0,EndDevice_column=0,NCCode_column=0,NCICode_column=0;
			String Name_value=null,ProvisioningStatus_value=null,CircuitType_value=null,StartDevice_value=null,EndDevice_value=null,NCCode_value=null,NCICode_value=null,View_status=null;;
			slf4jLogger.info("Sheetname="+sheetname);
			slf4jLogger.info("Column no="+column);
			if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
			//	btn_expandbutton_left);
			String[] circuittable={"View","Provisioning Status","Name","Circuit Type","Start Device","End Device","NC Code","NCI Code"};
			while(i!=0){
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span")).getText().contains(circuittable[i-1])){
					slf4jLogger.info("Column is displayed as expected"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				} else {
					slf4jLogger.info("Column is not displayed= "+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				}
				
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span")).getText()){
				case "View":View_column=i; break;
				case "Provisioning Status": ProvisioningStatus_column=i; break;
				case "Name":Name_column=i; break;
				case "Circuit Type":CircuitType_column=i; break;
				case "Start Device":StartDevice_column=i; break;
				case "End Device":EndDevice_column=i; break;
				case "NC Code":NCCode_column=i; break;
				case "NCI Code":NCICode_column=i; break;
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]/div/div[1]/span"))){
					slf4jLogger.info("Not visible");
					break;
				}

				
			}
			
			slf4jLogger.info("View_column="+View_column+" ,ProvisioningStatus_column="+ProvisioningStatus_column+" ,Name_column="+Name_column+" ,CircuitType_column="+CircuitType_column+" ,StartDevice_column="+StartDevice_column+" ,EndDevice_column="+EndDevice_column+" ,NCCode_column="+NCCode_column+" ,NCICode_column="+NCICode_column);
			
			i=1;
			while(i!=0){
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+View_column+"]/div")).isEnabled()){
					View_status="Pass";
				} else {
					View_status="Fail-View Icon is not enabled";
				}
					
					if(Name_value==null){
						Name_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Name_column+"]/div")).getText();
						ProvisioningStatus_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ProvisioningStatus_column+"]/div")).getText();
						CircuitType_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CircuitType_column+"]/div")).getText();
						StartDevice_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+StartDevice_column+"]/div")).getText();
						EndDevice_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+EndDevice_column+"]/div")).getText();
						NCCode_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+NCCode_column+"]/div")).getText();
						NCICode_value=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+NCICode_column+"]/div")).getText();					
					} else {
						Name_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Name_column+"]/div")).getText());
						ProvisioningStatus_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+ProvisioningStatus_column+"]/div")).getText());
						CircuitType_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+CircuitType_column+"]/div")).getText());
						StartDevice_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+StartDevice_column+"]/div")).getText());
						EndDevice_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+EndDevice_column+"]/div")).getText());
						NCCode_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+NCCode_column+"]/div")).getText());
						NCICode_value+=orderpage.to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+NCICode_column+"]/div")).getText());
					}
				
				
				
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+View_column+"]/div"))){
					slf4jLogger.info("Not visible");
					break;
				}
							
			}
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			//slf4jLogger.info("Viw column:"+column);
			//slf4jLogger.info("Sheet name column:"+sheetname);
			//slf4jLogger.info(View_status+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Pass");
			column+=2;
			//slf4jLogger.info(View_status+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, View_status);
			column++;
			//slf4jLogger.info(ProvisioningStatus_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, ProvisioningStatus_value);
			column++;
			//slf4jLogger.info(Name_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, Name_value);
			column++;
			//slf4jLogger.info(CircuitType_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, CircuitType_value);
			column++;
			//slf4jLogger.info(StartDevice_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, StartDevice_value);
			column++;
			//slf4jLogger.info(EndDevice_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, EndDevice_value);
			column++;
			//slf4jLogger.info(NCCode_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, NCCode_value);
			column++;
			//slf4jLogger.info(NCICode_value+" Column:"+column);
			orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, NCICode_value);
			
			orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);
			}
			} else { 
				slf4jLogger.info("Dispalyed error as "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					
					for(int k=0;k<10;k++){
					orderpage.gfast_write_data_inexcel("GFast-Sheet", sheetname, column, "Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
					
					column++;
					}
					orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);
				}
				
				throw new Error("Getting this Message: "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
				
			}
			//btn_expandbutton_right);
			//waitForElement(btn_expandbutton_left);
		
		}
		
	
		
		
		
		public void click_expandicon(String tab) throws InterruptedException {
//			if(tab.equals("Activations")){
//				jsClick(btn_icon);
//			}
			
			Thread.sleep(3000);
				
		}
		
		public void validateActivationTab(){
			
			WebDriverWait wait = new WebDriverWait(getDriver(),10);
			
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("lbl_TableActivationTab")));
			
			wait.until(ExpectedConditions.visibilityOf(lbl_TableActivationTab));
			
			
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Activations']")));
			
			//String activationIdXpath = ".//*[@id='data:1610803390']/td";
			//String activationId = find(By.xpath(activationIdXpath)).getText();

			//boolean activationIdXpath = getDriver().findElement(By.xpath("lbl_TableActivationTab")).isDisplayed();
			
			boolean activationIdXpath = lbl_TableActivationTab.isDisplayed();
			
			if(activationIdXpath){
				
				slf4jLogger.info("Verification to activations tab is Passed");
				
			}else{
				
				slf4jLogger.info("Verification to activations tab is Failed");
			}
		}
		
		
		
		public void validate_subscriberLookupPage() {
			String fieldValue = tag_SubscriberLookup.getText();
			Assert.assertEquals("Page is not present", "Subscriber Lookup", fieldValue);
			slf4jLogger.info("subscriber Lookup Page is present");
			}
		
		
		public void service_new_tab(String Type) throws Throwable{
			
			switch(Type){
			case "IPTV_Unicast":waitForElement(lbl_IPTV_Unicast_service_tab); waitForElement(btn_edit_service_viewpage);			
												break;
			case "HSI Service":waitForElement(lbl_HSI_service_tab); waitForElement(btn_edit_service_viewpage);
			
			
								break;
			case "HSI": waitForElement(lbl_HSI_service_tab);
						slf4jLogger.info("New Tab has opened with Service - HSI");
						if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
							if(lbl_HSI_service_tab.isCurrentlyVisible()){
								//slf4jLogger.info("New Tab has opened with Service - HSI");
							// Check is it disturbing other codes
						} else 	if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
							slf4jLogger.info("Orders Tab is Present");
							jsClick(orderpage.btn_order_tab_search_view_page);
							waitForElement(orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id);
							String order_service_id=orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
							jsClick(lbl_HSI_service_tab);
							waitForElement(btn_edit_service_viewpage);
							if(order_service_id.contains(lbl_HSI_service_tab.getText().replaceAll("\\s",""))){
								slf4jLogger.info("Service is matching with order service");
							} else {
								slf4jLogger.info("Not matching the Service tab with order service");
							}
						} }break;
						
			case "IPTV": waitForElement(lbl_IPTV_service_tab);
							slf4jLogger.info("New Tab has opened with Service - IPTV");break;
				
			case "IPTV-Unicast": waitForElement(lbl_IPTV_Unicast_service_tab);
									slf4jLogger.info("New Tab has opened with Service - IPTV Unicast");break;
			}
			/*waitForElement(lbl_HSI_service_tab);
			slf4jLogger.info("New Tab has opened with Service - HSI");
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				if(lbl_HSI_service_tab.isCurrentlyVisible()){
					//slf4jLogger.info("New Tab has opened with Service - HSI");
				}
			} else 	if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
				slf4jLogger.info("Orders Tab is Present");
				orderpage.btn_order_tab_search_view_page);
				waitForElement(orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id);
				String order_service_id=orderpage.lbl_vieworderpage_HSI_Service_sec_Service_Id.getText().replaceAll("\\s","");
				lbl_HSI_service_tab);
				waitForElement(btn_edit_service_viewpage);
				if(order_service_id.contains(lbl_HSI_service_tab.getText().replaceAll("\\s",""))){
					slf4jLogger.info("Service is matching with order service");
				} else {
					slf4jLogger.info("Not matching the Service tab with order service");
				}
			}*/
			
		}
		
		public void Service_tabs_section_click(String service_view_tabs) throws Throwable{
			switch(service_view_tabs){
			
			case "HSI Details":jsClick(tab_service_viewpage_HSI_details); 
								waitForElement(lbl_service_viewpage_hsi_details_tab_gerneral_sec_name); break;
								
			case "Associations":	if(!Page.envData.getName().equals("E2E")){				
										jsClick(tab_service_viewpage_Associations);
										waitForElement(btn_service_viewpage_associations_tab_edit_associate); break;
									} else if(Page.envData.getName().equals("E2E")){	
										if(tab_service_viewpage_Associations.isCurrentlyVisible()){
											if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
												orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Association Tab is still displayed but as per the code change it should have got removed");
											}
										 throw new Error("Association Tab is still displayed but as per the code change it should have got removed");	
										} else {
											if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
												orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Association Tab is removed as expected");
												 throw new Error("Association Tab is removed as expected");	
											}
											slf4jLogger.info("As expected- Association tab is removed from the Service page");
										}
									}
								
								
			case "Facility Details": jsClick(tab_service_viewpage_Facility_Details); Thread.sleep(2000);
									if(!lbl_service_viewpage_facility_negative_msg.isCurrentlyVisible()){
										waitForElement(btn_service_viewpage_facility_tab_edit_facility_details); 
									} else {
										Thread.sleep(1000);
									}
														break;
								
			case "Audit logs": waitForElement(tab_service_viewpage_Audit_Log);
				jsClick(tab_service_viewpage_Audit_Log);
								Thread.sleep(3000); break;
			}
		}
		
		public void service_section_validations(String service_section) throws Throwable{
			switch(service_section){
			
			case "HSI General": HSI_service_general_section_validation(); break;
			case "Associated Services":hsi_details_tab_Associated_Services_section_validation(); break;
			case "Association Details":Association_tab_Associated_Services_section_validation(); break;
			case "Facility Circuit Layout":Facility_Circuit_Layout_Services_section_validation(); break;
			case "Associated Vlan":hsi_details_tab_Associated_vlan_section_validation(); break;
			case "Associated Vlan Segments":Association_tab_Associated_Vlan_Segments_validation(); break;
					
			}
			
		}
		
		
		public void Association_tab_Associated_Vlan_Segments_validation() throws Throwable{
			//slf4jLogger.info("Pending need to update");
			int column_count=orderpage.search_hearder_excel("GFast_ServiceView360","CE-VLAN NAME(HSI Details Tab- Associated VLAN Segment Section)");
			String Validation_status=null;
			if(!lbl_service_viewpage_associations_tab_vlan_segment_no_vlan_msg.isCurrentlyVisible()){
				
				String[] associated_vlan_header={" ","VLANNAME","Function","NumberType","ProvisioningStatus"};
				int i=1, VLANNAME_columnheader=0, Function_columnheader=0, NumberType_columnheader=0, ProvisioningStatus_columnheader=0;
				
				if(!Page.envData.getName().equals("E2E")){					
				
				while(i!=0){
					switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntableserviceVLANGrid']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
					case "VLANNAME":VLANNAME_columnheader=i; break;
					case "Function": Function_columnheader=i; break;
					case "NumberType": NumberType_columnheader=i; break;
					case "ProvisioningStatus": ProvisioningStatus_columnheader=i; break;	
						}
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntableserviceVLANGrid']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","").contains(associated_vlan_header[i])){
						slf4jLogger.info("Headers are Matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntableserviceVLANGrid']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
					}else{
						slf4jLogger.info("Headers are not matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntableserviceVLANGrid']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
					}
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntableserviceVLANGrid']/div["+i+"]/div/div[1]/span"))){
						slf4jLogger.info("Not visible");
						break;
					}		
					
				}
				slf4jLogger.info("VLANNAME="+VLANNAME_columnheader+" Function="+Function_columnheader+" NumberType="+NumberType_columnheader+" ProvisioningStatus="+ProvisioningStatus_columnheader);
				
				i=1;
				while(i!=0){
					
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText());
					column_count++;
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+Function_columnheader+"]/div")).getText());
					column_count++;
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+NumberType_columnheader+"]/div")).getText());
					column_count++;
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div")).getText());				
					column_count++;
					
					
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div"))){
						slf4jLogger.info("Not visible");
						break;
					}
					column_count++;
				}
				
			
			Validation_status="Pass";
			
				/*i=1;
				int k=55;
				while(i!=0){
					if(k==59){
						k++;
					}
					
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k, 
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k++, 
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k++, 
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k++, 
					k++;
					
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div")).getText().equals("In Service")){
						
						orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText(),"3","VLAN NAME");
						orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+Function_columnheader+"]/div")).getText(),"CE-VLAN","Function");
						orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+NumberType_columnheader+"]/div")).getText(),"VLAN","Number Type");
						
					} else {
						slf4jLogger.info("Not in-service for VLAN name="+loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttableserviceVLANGrid']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText());
					}
					
					i++;
					
						slf4jLogger.info("Not visible");
						break;
					}
				}
				Validation_status="Pass";356*/
			
				
				
			} else {
				
				Validation_status="Fail-"+lbl_service_viewpage_associations_tab_vlan_segment_no_vlan_msg.getText();
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					for(i=0;i<9;i++){
						if(i!=4){
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, Validation_status);
						}
						column_count++;
					}
					
				}
				
			}
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
				}
				if(Validation_status.contains("Fail")){
					throw new Error("Getting this Message: "+lbl_service_viewpage_associations_tab_vlan_segment_no_vlan_msg.getText());
				}
					/*if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					
					for(int k=0;k<10;k++){
					orderpage.gfast_write_data_inexcel("GFast-Sheet", "GFast_ServiceView360", column_count, "Fail-"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
					
					column_count++;
					}
				}
			Validation_status="Fail"
				throw new Error("Getting this Message: "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
				
			}
			//btn_expandbutton_right);
			//waitForElement(btn_expandbutton_left);
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				orderpage.gfast_Automation_status_update("GFast-Sheet", sheetname);
			}
				
				234
				throw new Error("No VLAN Segment in Assoication Tab in HSI Service getting this message "+lbl_service_viewpage_associations_tab_vlan_segment_no_vlan_msg.getText());
			}*/
				
				
				
			} else if(Page.envData.getName().equals("E2E")){
				slf4jLogger.info("Code got changed, Association Tab got removed");

				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					for(int i=0;i<9;i++){
						
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Code got changed, Association Tab got removed");
					
					column_count++;
				}
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
					throw new Error("Fail -Code got changed, Association Tab got removed");
				}
				
				slf4jLogger.info("As expected with respect to the US");
			}
				
			
		}
		
		
		public void Facility_Circuit_Layout_Services_section_validation() throws Throwable{
			String Validation_status=null;
			int column_count=0;
			if(!lbl_service_viewpage_facility_negative_msg.isCurrentlyVisible()){
				slf4jLogger.info("Facility Details are displayed");
				Validation_status="Pass";
			
			if(btn_service_viewpage_facility_tab_edit_facility_details.isCurrentlyEnabled()){
				slf4jLogger.info("Edit Facility Details button is enabled");
			} else {
				slf4jLogger.info("Edit Facility Details button is not enabled");
			}
			
			if(btn_service_viewpage_facility_tab_edit_facility_copy.isCurrentlyEnabled()){
				slf4jLogger.info("Facility Copy button is enabled");
			} else {
				slf4jLogger.info("Facility Copy button is not enabled");
			}
			
			if(lbl_service_viewpage_facility_tab_circuit_details.isCurrentlyVisible()){
				slf4jLogger.info("Circuit name :"+lbl_service_viewpage_facility_tab_circuit_details.getText());
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
					column_count=orderpage.search_hearder_excel("GFast_ServiceView360","Gfast-Circuit Details");
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, lbl_service_viewpage_facility_tab_circuit_details.getText());
					
					
					column_count=orderpage.search_hearder_excel("GFast_ServiceView360","Starts with OLT-Ends with Dslam Device Icon validations");
				}
				
				
				int i=2;
				
				while(i!=0){
					
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Circuit Layout')]/following-sibling::div[1]/div["+i+"]//img[1]"))){
						break;
					}
					i++;
				}
				
				slf4jLogger.info("Total Device displayed:"+(i-1));
				
				while(i!=0){
				
				if(lbl_service_viewpage_facility_tab_OLT_img.isCurrentlyVisible() && loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Circuit Layout')]/following-sibling::div[1]/div[2]//img[@ng-if=\"facility.startRole == 'OLT' \"]")).isDisplayed()){
					slf4jLogger.info("Start device - OLT img Icon is displayed");
				} else {
					slf4jLogger.info("Start device -OLT device is not displayed");
					Validation_status="Fail-OLT Device is not at the start"; break;
				}
				
				if(lbl_service_viewpage_facility_tab_DSLAM_img.isCurrentlyVisible() && loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Circuit Layout')]/following-sibling::div[1]/div["+(i-1)+"]//img[@ng-if=\"facility.startRole == 'DSLAM' \"]")).isDisplayed()){
					slf4jLogger.info("End device - DSLAM device img Icon is displayed");
				} else {
					slf4jLogger.info("End device - DSLAM device img is not displayed");
					Validation_status+="Fail-DSLAM Device is not at the END"; break;
				}
				
				
				break;
				}
				if(!Validation_status.contains("Fail")){
					if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Pass");
					}
					
				} else {
					if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, Validation_status);
						orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");						
					}
					throw new Error("Devices are not displayed validation result:"+Validation_status);
				}
				
				
				
				String[] facility_header={"Start Role","Start Device Name","Start Port & Pluggable Type","Cable Name","Fiber Strand","End Role","End Device Name","End Port"};
				
				String OLT_Device=null,DSLAM_device=null;
				int j=1,start_device_name_header=0,Start_Role_header=0,port_header=0;
				
				while(j!=0){
					switch(loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/thead//th["+j+"]")).getText()){
					case "Start Device Name": start_device_name_header=j;break;
					case "Start Role": Start_Role_header=j; break;
					case "Start Port & Pluggable Type":port_header=j; break;
					
					}
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/thead//th["+j+"]")).getText().contains(facility_header[j-1])){
						slf4jLogger.info("Headers are Matching="+loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/thead//th["+j+"]")).getText());
					}else{
						slf4jLogger.info("Headers are not matching="+loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/thead//th["+j+"]")).getText());
					}
					j++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@id='facilityDeviceDetail']/thead//th["+j+"]"))){
						slf4jLogger.info("Not visible");
						break;
					}
				}
				
				slf4jLogger.info("Start Device Name="+start_device_name_header+"  Start Role="+Start_Role_header);
				i=1;
				
				while(i!=0){
					switch(loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+Start_Role_header+"]")).getText()){
					case "OLT": OLT_Device=loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+start_device_name_header+"]")).getText();
										if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
											column_count=orderpage.search_hearder_excel("GFast_ServiceView360","OLT Device");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+start_device_name_header+"]")).getText()); column_count++;
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+port_header+"]")).getText()); 
										}
										break;
					case "DSLAM":DSLAM_device=loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+start_device_name_header+"]")).getText(); 
										if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
											column_count=orderpage.search_hearder_excel("GFast_ServiceView360","DSLAM Device");
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+start_device_name_header+"]")).getText()); column_count++;
											orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+port_header+"]")).getText()); break;
										}
					
					}
					
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@id='facilityDeviceDetail']/tbody//tr["+i+"]/td["+start_device_name_header+"]"))){
						slf4jLogger.info("Not visible");
						break;
					}
					
					
				}
				
				slf4jLogger.info("OLT Device="+OLT_Device+" DSLAM="+DSLAM_device);
				
				if(OLT_Device.isEmpty() || DSLAM_device.isEmpty()){
					if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){			
							column_count=orderpage.search_hearder_excel("GFast_ServiceView360","OLT Location ID");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail-OLT Device details are not displayed at location section");
							column_count=orderpage.search_hearder_excel("GFast_ServiceView360","DSLAM Location ID");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail-DSLAM Device details are not displayed at location section");
					}
					throw new Error("OLT & DSLAM Devices are not displayed at the Location Details dection");
				}
				
				i=1;
				String[] location_details_header={"Device Name","Location","Device CLLI"};
				int device_name_column=0,Location_column=0;
				
				while(i!=0){
					switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//th["+i+"]")).getText()){
					case "Device Name": device_name_column=i;break;	
					case "Location": Location_column=i;break;
					
					}
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//th["+i+"]")).getText().contains(location_details_header[i-1])){
						slf4jLogger.info("Headers are Matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//th["+i+"]")).getText());
					}else{
						slf4jLogger.info("Headers are not matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//th["+i+"]")).getText());
					}
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//th["+i+"]"))){
						slf4jLogger.info("Not visible");
						break;
					}
				}
				
				i=1;
				
				while(i!=0){
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+device_name_column+"]")).getText().contains(OLT_Device)){
						slf4jLogger.info("OLT Device is Matching with Facility details in POS:"+i);
						if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
							column_count=orderpage.search_hearder_excel("GFast_ServiceView360","OLT Location ID");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+Location_column+"]")).getText());
						}
					
					/*	if(!loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+Location_column+"]")).getText().isEmpty()){
							if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+Location_column+"]")).getText());
							}
						} else {
							if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail- Location for OLT is not displayed");
							}
							Validation_status="Fail";
						}*/
						
						
					} else 					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+device_name_column+"]")).getText().contains(DSLAM_device)){
						slf4jLogger.info("DSLAM Device is Matching with Facility details in POS:"+i);
						if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
							column_count=orderpage.search_hearder_excel("GFast_ServiceView360","DSLAM Location ID");
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+Location_column+"]")).getText());
						}
					
						/*if(!loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+Location_column+"]")).getText().isEmpty()){
							if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
								orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+Location_column+"]")).getText());
							} else {
								if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
									orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail- Location for DSLAM is not displayed");
								}
								Validation_status="Fail";
						}*/
						
						
					} else {
						slf4jLogger.info("Device details in POS:"+i+" = "+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+device_name_column+"]")).getText());
					
					}
					
					
					
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[contains(text(),'Location Details')]/following-sibling::div[1]//tr["+i+"]/td["+device_name_column+"]"))){
						slf4jLogger.info("Not visible");
						break;
					}
					
					}
				
				
				
				
			} else {
				slf4jLogger.info("No circuit is present");
				
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
					column_count=orderpage.search_hearder_excel("GFast_ServiceView360","Gfast-Circuit Details");
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail-No Circuit details are displayed");
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
					
			}
				throw new Error("No Circuit is displayed");
				
			
		}
			}else {
				slf4jLogger.info("Facility Details are NOT displayed");
				 Validation_status="Fail- "+lbl_service_viewpage_facility_negative_msg.getText();
				 if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){	
					 column_count=orderpage.search_hearder_excel("GFast_ServiceView360","Gfast-Circuit Details");
					 for(int i=0;i<8;i++){
							
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, Validation_status);
						
						column_count++;
					} 
				 }				
			}
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
				}
				if(Validation_status.contains("Fail")){
					throw new Error(Validation_status);
				}
				
			
		}
		
		public void Association_tab_Associated_Services_section_validation() throws Throwable{
			String[] associate_service_header={"SERVICENAME","SubscriberName","ServiceTYPE","USAGETYPE","MCO","DELETE"};
			String Validation_status="Pass";
			int i=1, service_name_columnheader=0, Subscriber_Name_columnheader=0, Service_Type_columnheader=0, USAGE_TYPE_columnheader=0, mco_columnheader=0,Delete_columnheader=0;
			int column_count=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"SERVICE NAME(Association Tab- Associated Service Section)");
		
			if(!Page.envData.getName().equals("E2E")){
						
			if(!lbl_service_viewpage_associations_tab_Associationservice_msg.isCurrentlyVisible()){
			while(i!=0){
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntableserviceGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
				case "SERVICENAME":service_name_columnheader=i; break;
				case "SubscriberName": Subscriber_Name_columnheader=i; break;
				case "ServiceTYPE": Service_Type_columnheader=i; break;
				case "USAGETYPE": USAGE_TYPE_columnheader=i; break;	
				case "MCO": mco_columnheader=i; break;
				case "DELETE": Delete_columnheader=i; break;
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntableserviceGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").contains(associate_service_header[i-1])){
					slf4jLogger.info("Headers are Matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntableserviceGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
				}else{
					slf4jLogger.info("Headers are not matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntableserviceGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntableserviceGrid')]/div["+i+"]//span"))){
					slf4jLogger.info("Not visible");
					break;
				}
				
			}
			
			slf4jLogger.info("ServiceName="+service_name_columnheader+"SubscriberName="+Subscriber_Name_columnheader+"ServiceType="+Service_Type_columnheader+"USAGETYPE="+USAGE_TYPE_columnheader+"MCO="+mco_columnheader+"Delete Column="+Delete_columnheader);
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			i=1;
			//while(i!=0){
				
				//******************************   Check each row ***********************************************//
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+service_name_columnheader+"]/div")).getText(),"GFASTEGGHUN.780_1.2","Service Name");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+service_name_columnheader+"]/div")).getText());
					
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Subscriber_Name_columnheader+"]/div")).getText(),"CTL INFRASTRUCTURE","Subscriber Name");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Subscriber_Name_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Type_columnheader+"]/div")).getText(),"DSL OVC","Service Type");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Type_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+USAGE_TYPE_columnheader+"]/div")).getText(),"IPTV-DATA","USAGE TYPE");	
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+USAGE_TYPE_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+mco_columnheader+"]/div")).getText(),"","MCO");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+mco_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Delete_columnheader+"]/div")).getText(),"","DELETE");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Delete_columnheader+"]/div")).getText());
			//}
			
			//*************************  Delete Button should not be enabled until edit *************************************************//
				
				if(!loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Delete_columnheader+"]/div/a")).isEnabled()){
					slf4jLogger.info("Delete is not enable as expected");
				} else {
					slf4jLogger.info("Delete is enable which is not expected");
				}
				
			} } else {
				
				Validation_status="Fail-No Data displayed";
					for(i=0;i<6;i++){
						
							orderpage.gfast_write_data_inexcel("GFast-Sheet",fileiotest.readFile("Sheet_name").replaceAll("\\s",""), column_count, Validation_status);
						
						column_count++;
					}
					
				
				
			}
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
				}
				if(Validation_status.contains("Fail")){
					throw new Error("No VLAN Associated Services");
				}
			
			} else if(Page.envData.getName().equals("E2E")){
				
				slf4jLogger.info("Code got changed, Association Tab got removed");

				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					for(i=0;i<6;i++){
						
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Code got changed, Association Tab got removed");
					
					column_count++;
				}
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
					throw new Error("Fail -Code got changed, Association Tab got removed");
				}
				
				slf4jLogger.info("As expected with respect to the US");
			}
			
			}
		
		public void hsi_details_tab_Associated_vlan_section_validation() throws Throwable{
			String[] associated_vlan_header={" ","VLANNAME","Function","NumberType","ProvisioningStatus"};
			int i=1, VLANNAME_columnheader=0, Function_columnheader=0, NumberType_columnheader=0, ProvisioningStatus_columnheader=0;
			int column_count=orderpage.search_hearder_excel("GFast_ServiceView360","CE-VLAN NAME(HSI Details Tab- Associated VLAN Section)");
			
			String Validation_status=null;
			if(!Page.envData.getName().equals("E2E")){				
			
			if(lbl_service_viewpage_hsi_details_tab_Associated_vlan.isCurrentlyVisible()){
			
			
			while(i!=0){
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntablegridHSIVLANAssoDtlsId']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
				case "VLANNAME":VLANNAME_columnheader=i; break;
				case "Function": Function_columnheader=i; break;
				case "NumberType": NumberType_columnheader=i; break;
				case "ProvisioningStatus": ProvisioningStatus_columnheader=i; break;	
					}
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntablegridHSIVLANAssoDtlsId']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","").contains(associated_vlan_header[i])){
					slf4jLogger.info("Headers are Matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntablegridHSIVLANAssoDtlsId']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				}else{
					slf4jLogger.info("Headers are not matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntablegridHSIVLANAssoDtlsId']/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='columntablegridHSIVLANAssoDtlsId']/div["+i+"]/div/div[1]/span"))){
					slf4jLogger.info("Not visible");
					break;
				}		
				
			}
			slf4jLogger.info("VLANNAME="+VLANNAME_columnheader+" Function="+Function_columnheader+" NumberType="+NumberType_columnheader+" ProvisioningStatus="+ProvisioningStatus_columnheader);
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				i=1;
				while(i!=0){
					
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText());
					column_count++;
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+Function_columnheader+"]/div")).getText());
					column_count++;
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+NumberType_columnheader+"]/div")).getText());
					column_count++;
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div")).getText());				
					column_count++;
					
					
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div"))){
						slf4jLogger.info("Not visible");
						break;
					}
					column_count++;
				}
				
			}
			Validation_status="Pass";
			/*i=1;
			int k=38;
			while(i!=0){
				if(k==42){
					k++;
				}
				
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText());
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k++, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+Function_columnheader+"]/div")).getText());
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k++, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+NumberType_columnheader+"]/div")).getText());
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", k++, loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div")).getText());
				k++;
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div")).getText().equals("In Service")){
					
					orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText(),"3","VLAN NAME");
					orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+Function_columnheader+"]/div")).getText(),"CE-VLAN","Function");
					orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+NumberType_columnheader+"]/div")).getText(),"VLAN","Number Type");
					
				} else {
					slf4jLogger.info("Not in-service for VLAN name="+loginPage.getDriver().findElement(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+VLANNAME_columnheader+"]/div")).getText());
				}
				
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@id='contenttablegridHSIVLANAssoDtlsId']/div["+i+"]/div["+ProvisioningStatus_columnheader+"]/div"))){
					slf4jLogger.info("Not visible");
					break;
				}
			}*/
		} else {
			
			Validation_status="Fail-No Data displayed";
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
				
			
				for(i=0;i<9;i++){
					if(i!=4){
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, Validation_status);
					}
					column_count++;
				}
				
			}
			
		}
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
			}
			if(Validation_status.contains("Fail")){
				throw new Error("No VLAN Associated");
			}
			
			} else if(Page.envData.getName().equals("E2E")){	
				
				slf4jLogger.info("Code got changed, VLAN Association Section has moved to Related Tab");

				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					for(i=0;i<5;i++){
						
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail -No VLAN Association as expected, it got moved to Related Tab");
					
					column_count++;
				}
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
					throw new Error("Fail -No VLAN Association as expected, it got moved to Related Tab");
				}
				
				slf4jLogger.info("As expected with respect to the US");
			}
			
			
		}
		
		@SuppressWarnings("unused")
		public void hsi_details_tab_Associated_Services_section_validation() throws Throwable{
			String[] associate_service_header={" ","ServiceName","SubscriberName","ServiceType","USAGETYPE","MCO"};
			int i=1, service_name_columnheader, Subscriber_Name_columnheader, Service_Type_columnheader, USAGE_TYPE_columnheader, mco_columnheader;
			service_name_columnheader=0;
			Subscriber_Name_columnheader=0;
			Service_Type_columnheader=0;
			USAGE_TYPE_columnheader=0;
			mco_columnheader=0;
			String ServiceName=null,SubscriberName=null,ServiceType=null,USAGETYPE=null,MCO=null,Validation_status=null;
			int column_count=0;
			
			column_count=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Service Name(HSI Details Tab- Associated Service Section)");
			//System.out.println(Page.envData.getName()+"Field name");
			if(!Page.envData.getName().equals("E2E")){				
			
			//if(getDriver().getCurrentUrl().equals(arg0))
			if(lbl_service_viewpage_hsi_details_tab_Associated_services.isCurrentlyVisible()){
			while(i!=0){
				switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","")){
				case "ServiceName":service_name_columnheader=i; break;
				case "SubscriberName": Subscriber_Name_columnheader=i; break;
				case "ServiceType": Service_Type_columnheader=i; break;
				case "USAGETYPE": USAGE_TYPE_columnheader=i; break;	
				case "MCO": mco_columnheader=i; break;	
				}
				
				if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s","").contains(associate_service_header[i-1])){
					slf4jLogger.info("Headers are Matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
				}else{
					slf4jLogger.info("Headers are not matching="+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span")).getText().replaceAll("\\s",""));
				}
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'columntablejqxGrid')]/div["+i+"]//span"))){
					slf4jLogger.info("Not visible");
					break;
				}				
			}		
			
			
			slf4jLogger.info("ServiceName="+service_name_columnheader+"SubscriberName="+Subscriber_Name_columnheader+"ServiceType="+Service_Type_columnheader+"USAGETYPE="+USAGE_TYPE_columnheader+"MCO="+mco_columnheader);
			
			i=1;
			while(i!=0){
				
				//******************************   Check each row ***********************************************//
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name_columnheader+"]/div")).getText(),"GFASTEGGHUN.780_1.2","Service Name");
				column_count=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Service Name(HSI Details Tab- Associated Service Section)");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+service_name_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Subscriber_Name_columnheader+"]/div")).getText(),"CTL INFRASTRUCTURE","Subscriber Name");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Subscriber_Name_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Service_Type_columnheader+"]/div")).getText(),"DSL OVC","Service Type");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+Service_Type_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+USAGE_TYPE_columnheader+"]/div")).getText(),"IPTV-DATA","USAGE TYPE");	
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+USAGE_TYPE_columnheader+"]/div")).getText());
				
				//orderpage.compare_filed_values_with_expected(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+mco_columnheader+"]/div")).getText(),"","MCO");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div["+mco_columnheader+"]/div")).getText());
				
			
				i++;
				if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//*[contains(@id,'contenttablejqxGrid')]/div["+i+"]/div[1]/div"))){
					slf4jLogger.info("Not visible");
					break;
				}
			
			}
			}
			else {
				
				Validation_status="Fail-No Data displayed";
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					for(i=0;i<5;i++){
						
							orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, Validation_status);
						
						column_count++;
					}
					
				}
				
			}
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
						orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
				}
				if(!(Validation_status==null)){
				if(Validation_status.contains("Fail")){
					throw new Error("No VLAN Associated Services");
				}
				}
			
			//orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
			
			} else	if(Page.envData.getName().equals("E2E")){		
				
				slf4jLogger.info("Code got changed, Association Service Section has moved to Related Tab");
				if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
					for(i=0;i<5;i++){
						
						orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count, "Fail -No Association Services as expected, it got moved to Related Tab");
					
					column_count++;
				}
					orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
					throw new Error("Fail -No Association Services as expected, it got moved to Related Tab");
				}
				
				slf4jLogger.info("As expected with respect to the US");
			} 
			
			}
			
		
		
		public void HSI_service_general_section_validation() throws Throwable{
			int column_count=0;
			if(orderpage.btn_order_tab_search_view_page.getText().contains(("Order Id:"+orderpage.gfast_order_id_search()))){
			//********************* General Section *****************************//
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_gerneral_sec_service_type.getText(), "HSI" , "Service Type");
				column_count=orderpage.search_hearder_excel(fileiotest.readFile("Sheet_name").replaceAll("\\s",""),"Service Type");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_gerneral_sec_service_type.getText());
			
			
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText(), "1000009567-HSI" , "Service Name");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_gerneral_sec_alias1.getText(), "1000009567" , "alias1");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_gerneral_sec_alias1.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_gerneral_sec_alias2.getText(), " " , "alias2");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_gerneral_sec_alias2.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_gerneral_sec_provision_status.getText(), "In Service" , "provision_status");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_gerneral_sec_provision_status.getText());
		
			column_count++;
			//******************************* Subscriber Section ***********************//
		
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribername.getText(), "BEGINNINGS, NEW" , "Subscribername");	
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribername.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribertype.getText(), "External" , "Subscribertype");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribertype.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID.getText(), "A007393" , "custID");
			
			
			if(lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID.isEnabled()){
				slf4jLogger.info("Subscriber custID is hyperlinked");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID.getText());
			} else {
				slf4jLogger.info("Subscriber custID is not hyperlinked");
				orderpage.gfast_write_data_inexcel("GFast-Sheet",fileiotest.readFile("Sheet_name"), column_count++, "Fail- Subcriber CUID is not hyperlink "+lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID.getText());
				//orderpage.gfast_sheet_update("GFast-Sheet",fileiotest.readFile("Sheet_name"), "Fail", "Fail- Subcriber CUID is not hyperlink "+lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID.getText());
			//throw new Error("Fail- Subcriber CUID is not hyperlink "+lbl_service_viewpage_hsi_details_tab_Subscriber_sec_custID.getText());
			}
			
			column_count++;
			//******************************* HSI Service attribute Section ****************//
			
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_DTN.getText(), "1000009567" , "DTN(Data TN)");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_DTN.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Downrate.getText(), "40000" , " Downstream Rate");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Downrate.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_provision_downrate.getText(), "1000000" , "Provisioned Downstream Rate");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_provision_downrate.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_service_profile.getText(), "40Mbps_X_2Mbps" , "Service Profile");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_service_profile.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_CVOIP.getText(), "" , "CVOIP TN");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_CVOIP.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Uprate.getText(), "2000" , "Upstream Rate");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Uprate.getText());
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_provision_uprate.getText(), "200000" , "Provisioned Upstream Rate");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "NA");
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_service_profile_index.getText(), "" , "Service Profile Index");
			orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "NA");
			
			column_count++;
			//******************************* Port Section **************************//
			
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name.getText(), "LTTNCOMLH01-10CAB01A" , "Start Device Name");
			if(!lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name.getText().isEmpty()){			
			if(lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name.isEnabled()){
				slf4jLogger.info("Start device name is hyperlinked");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name.getText());
				
			} else {
				slf4jLogger.info("Start device name is not hyperlinked");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- Start Device is not hyperlinked "+lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name.getText());
			}
			} else {
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- No Start device is displayed");
				//orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- No Start device is displayed");
				//throw new Error("Fail- No Start device is displayed");
			}
			
			
			if(!lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_full_name.getText().isEmpty()){	
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_full_name.getText());
			} else {
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- No Start device full name is displayed");
			}
			
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_full_name.getText(), "LTTNCOMLH01-CAE72-OLT" , "Start Device Full Name");
			
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_port.getText(), "GPON-P.1.1.2" , "Start Port");
			
			if(!lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_port.getText().isEmpty()){				
			
			
			if(lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_port.isEnabled()){
				slf4jLogger.info("Start Port is hyperlinked");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_port.getText());
			} else {
				slf4jLogger.info("Start Port is not hyperlinked");
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- Start port is not enabled:"+lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_port.getText());
			}
			}else {
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- No Port of Start device is displayed");
				//orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- No Port of Start device is displayed");
				//throw new Error("Fail- No Port of Start device is displayed");
			}
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_name.getText(), "GFASTEGGHUN-T.01" , "End Device Name");
			
			if(!lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_name.getText().isEmpty()){			
				
				if(lbl_service_viewpage_hsi_details_tab_Port_sec_Start_device_name.isEnabled()){
					slf4jLogger.info("End device name is hyperlinked");
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_name.getText());
				} else {
					slf4jLogger.info("End device name is not hyperlinked");
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- End Device is not enabled:"+lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_name.getText());
				}
			}else {
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- No End device is displayed");
				//orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- No Port of Start device is displayed");
				//throw new Error("Fail- No Port of Start device is displayed");
			}
			
			//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_full_name.getText(), "GFASTEGGHUN-CA316-DSLAM" , "End Device Full Name");
			
			if(!lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_full_name.getText().isEmpty()){	
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_full_name.getText());
				//orderpage.compare_filed_values_with_expected(lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_port.getText(), "G.fast.1" , "End Port");
				
			} else {
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- End Device fullname is not displayed");
			}
				
			if(!lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_port.getText().isEmpty()){					
				
				if(lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_port.isEnabled()){
					slf4jLogger.info("End Port is hyperlinked");
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_port.getText());
				} else {
					slf4jLogger.info("End Port is not hyperlinked");
					orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- End Device port is hyperlinked "+lbl_service_viewpage_hsi_details_tab_Port_sec_End_device_port.getText());
				}
			} else {
				orderpage.gfast_write_data_inexcel("GFast-Sheet","GFast_ServiceView360", column_count++, "Fail- No Port of End device is displayed");
				//orderpage.gfast_sheet_update("GFast-Sheet", fileiotest.readFile("Sheet_name"), "Fail", "Fail- No Port of End device is displayed");
				//throw new Error("Fail- No Port of Start device is displayed");
			}
			
			}
			
			orderpage.gfast_Automation_status_update("GFast-Sheet","GFast_ServiceView360");
			
		}
	
		//--------------------------------------------ANKIT--------------------------------------------------
		//TC39223
		@FindBy(xpath="//div[contains(text(),'DSL OVC Service Attributes')]/..//div[7]//div[2]//label[2]")
		public WebElementFacade ver_supportedversion; 
		
		@FindBy(id="nameval")
		public WebElementFacade tbx_name;
		
		@FindBy(id="subsc")
		public WebElementFacade tbx_subsname;
		
		@FindBy(xpath="//select[@id='netpro']")
		public WebElementFacade ddl_networkprotocol;
		
		@FindBy(id="supIo")
		public WebElementFacade ddl_supportipversion;
		
		@FindBy(xpath="//input[@id='vlan']")
		public WebElementFacade tbx_vlan;
		
		
		
		
		public WebElement waitForElement(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
		    
		    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));  
			
		    return element;
		}
		
		public WebElement waitForElementclickable(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
		    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		    
			
		    return element;
		}		
		
		public void Validate_circuits_in_service() throws InterruptedException{
					ArrayList<String> al = new ArrayList<String>();
					jsClick(tab_circuit_in_services);
					Thread.sleep(3000);
					for(int i=1;i<=6;i++){
					String Coloumname = Loginpage.getDriver().findElement(By.xpath("//div[@id='right-content']//*[@role='columnheader']["+i+"]//span")).getText();
					if(Coloumname.contains("Name"))
					for(int j=0;j<=btn_circuits_count.size()-1;j++){
						String circuit = Loginpage.getDriver().findElement(By.xpath("//*[@id='right-content']//*[contains(@id,'row"+j+"jqxGrid')]/div["+i+"]/div")).getText();
						al.add(circuit);
						 slf4jLogger.info("Circuitname"+circuit);
					    }
					}
					System.out.println(al);		
					
					jsClick(Link_Start_Device);
					
				
			}
				
				
		@SuppressWarnings("unused")
		public void	validate_associationtab_serviceview(String newfieldchange)throws Throwable{
			String[] Association_service_header={"SERVICENAME", "SubscriberName", "ServiceTYPE", "USAGETYPE", "MCO", "DELETE"};
			switch(newfieldchange){
			case "Associations tab":if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
										 slf4jLogger.info("Association Tab is not displayed as expecetd");
									} else {
										 slf4jLogger.info("Association Tab is displayed which is not as expected with US165583");
										 throw new Error("Fail- Association Tab is displayed which is not as expected with US165583");
									} break;
									
			case "Associated Service section": if(!lbl_service_viewpage_hsi_details_tab_Associated_services.isCurrentlyVisible()){
																 slf4jLogger.info("Association Service section is not displayed as expecetd");
															} else {
																 slf4jLogger.info("Association Service section is displayed which is not as expected with US165583");
																 throw new Error("Fail- Association Service section is displayed which is not as expected with US165583");
															} break;
				
			case "Associated VLAN section": if(!lbl_service_viewpage_hsi_details_tab_Associated_vlan.isCurrentlyVisible()){
													slf4jLogger.info("Association VLAN section is not displayed as expecetd");
												} else {
													 slf4jLogger.info("Association VLAN section is displayed which is not as expected with US165583");
													 throw new Error("Fail- Association VLAN section is displayed which is not as expected with US165583");
												} break;

			case "Services": if(tab_services.isCurrentlyVisible() && tab_services.isCurrentlyEnabled()){
												slf4jLogger.info("Services Related Tab is displayed & clickable");
											} else {
												slf4jLogger.info("Services Related Tab is not displayed");
												 throw new Error("Fail- Services Related Tab is not displayed");
											} break;
											
			case "VLAN/Virtual Ports":if(tab_Virtual_Ports.getText().equals("VLAN / Virtual Ports")){
											slf4jLogger.info("Virtual port is displayed as:"+tab_Virtual_Ports.getText()+" as expected");
										} else {
											slf4jLogger.info("Fail- Virtual port is wrongly displayed as:"+tab_Virtual_Ports.getText());
											 throw new Error("Fail- Virtual port is wrongly displayed as:"+tab_Virtual_Ports.getText());
										} break;
											
			case "Delete Association button": waitFor(btn_service360view_ServicesRT_deleteassciation);
			jsClick(btn_service360view_ServicesRT_deleteassciation); 
			getDriver().switchTo().alert().accept(); break;
			
			
			case "Association Service Tab in Service Related Tab":if(tab_service360view_ServicesRT_Association_Service.isCurrentlyVisible()){
																	slf4jLogger.info("Association Service Tab is Displayed as expected");
																	} else {
																		slf4jLogger.info("Association Service Tab is NOT Displayed");
																		 throw new Error("Fail- Association Service Tab is NOT Displayed");
																	} break;
																	
			case "Edit Association button in Service Related Tab": if(btn_service360view_ServicesRT_editAssociation.isCurrentlyVisible() && btn_service360view_ServicesRT_editAssociation.isCurrentlyEnabled()){
																		slf4jLogger.info("Edit Association button is Displayed as expected");
																	} else {
																		slf4jLogger.info("Edit Association button is NOT Enabled");
																		 throw new Error("Fail- Edit Association button is NOT Enabled");
																	} break;
																	
			case "Association Services Table": orderpage.validate_Associated_service_related_tab_validations("FTT");  break;
			
			case "Click on Edit Association button":jsClick(btn_service360view_ServicesRT_editAssociation); waitForElement(btn_service360view_ServicesRT_AssciateBackhaul); break;
			case "Click on Associate Backhaul button":jsClick(btn_service360view_ServicesRT_AssciateBackhaul); waitForElement(tbx_assocoiate_service); break;
			
			
			case "Associate Backhaul button validation":if(btn_service360view_ServicesRT_AssciateBackhaul.isCurrentlyVisible() && btn_service360view_ServicesRT_AssciateBackhaul.isCurrentlyEnabled()){
																slf4jLogger.info("Associate Backhaul button is displayed");
															} else {
																slf4jLogger.info("Associate Backhaul button is not displayed");
															}jsClick(btn_service360view_ServicesRT_editassciation_cancel); Thread.sleep(1000);
															
																break;
																
			case "Associate Backhaul and cancel button validation":if(btn_service360view_ServicesRT_AssciateBackhaul.isCurrentlyVisible() && btn_service360view_ServicesRT_editassciation_cancel.isCurrentlyVisible()){
				slf4jLogger.info("Associate Backhaul and cancel buttons are displayed");
			} else {
				slf4jLogger.info("Associate Backhaul and cancel buttons are not displayed");
			}
			
				break;
				
			case "Service Name,Service Type and Device name":
				if(tbx_assocoiate_device_name.isCurrentlyVisible() && tbx_assocoiate_service.isCurrentlyVisible() && ddl_assocoiate_service_type.isCurrentlyVisible()){
				slf4jLogger.info("Service Name,Service Type and Device name fields are displayed");
			} else {
				slf4jLogger.info("Service Name,Service Type and Device name fields are not displayed");
			}jsClick(btn_service360view_ServicesRT_editassciation_cancel); Thread.sleep(1000);
				break;
												
			case "Search DSL OVC Services in LookUp":
				ddl_service360view_ServicesRT_AssciateBackhaul_Lookup_ServiceType.selectByVisibleText("DSL OVC");
				jsClick(btn_service360view_ServicesRT_AssciateBackhaul_Lookup);Thread.sleep(5000);
				break;
				
			case "Select all services and click on Associate service buttons":
				Thread.sleep(10000);	
				if(btn_service360view_ServicesRT_AssciateBackhaul_associateServices.isCurrentlyVisible()){
				for(int i=0;i<=chk_service360view_ServicesRT_AssciateBackhaul_Lookup.size()-1;i++){
					jsClick(chk_service360view_ServicesRT_AssciateBackhaul_Lookup.get(i));
				}
				jsClick(btn_service360view_ServicesRT_AssciateBackhaul_associateServices);
				}else throw new Error("DSL OVC services are not available for selected device");
			
				break;
			case "Validate success and error messages":
				Thread.sleep(5000);
				for(int i=0; i<=lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.size()-1;i++){
					if(lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.get(i).getText().contains("success")){
						System.out.println("Getting success message like: "+lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.get(i).getText());
					}else if(lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.get(i).getText().contains("Usage type is not matching")){
						System.out.println("If Usage type is not sutable to matching and getting messgage like"+lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.get(i).getText());
					}else if(lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.get(i).getText().contains("error")){
						System.out.println("Getting Error message like: "+lbl_service360view_ServicesRT_AssciateBackhaul_associateServices_msg.get(i).getText());
					}
				}
				Thread.sleep(3000);
				jsClick(btn_service360view_ServicesRT_Associate_lookup_cancel);
				break;
			case "Remove associated service":
				Thread.sleep(5000);
				if(btn_service360view_ServicesRT_EditAssciate_Cancel.isDisplayed()){
					jsClick(btn_service360view_ServicesRT_EditAssciate_Cancel);
					slf4jLogger.info("click on Cancel icon");
				}else{
					slf4jLogger.info("Cancel icon is not avaliable or not clickable");
				}
				Alert a = loginPage.getDriver().switchTo().alert();
				slf4jLogger.info("ALert message is "+a.getText());
				a.accept();
				break;
			
			case "Validate Update OMNIVue Audit logs":
				Thread.sleep(3000);
				jsClick(tab_service_viewpage_leftside_Audit_Log);
				Thread.sleep(3000);
				jsClick(tab_serviceview_auditlogs_OMNIVUE_auditlogs);
				Thread.sleep(3000);
				if(lbl_search_serviceview_OMNIVueAudit_log_tab_UpdateDetails.get(0).isDisplayed()){
				for(int i=0;i<=lbl_search_serviceview_OMNIVueAudit_log_tab_UpdateDetails.size()-1 ;i++){
					if(lbl_search_serviceview_OMNIVueAudit_log_tab_UpdateDetails.get(i).getText().contains("associated successfully")){
						System.out.println("Update Omnivue Audit logs for successfully associated service is like:"+lbl_search_serviceview_OMNIVueAudit_log_tab_UpdateDetails.get(i).getText());
						slf4jLogger.info("Update Omnivue Audit logs for successfully associated service is like:"+lbl_search_serviceview_OMNIVueAudit_log_tab_UpdateDetails.get(i).getText());
						}
					}
				}else{
						System.out.println("Update Audit logs are not Avaliable");
						slf4jLogger.info("Update Audit logs are not Avaliable");
				}
			}	
		}	
		@SuppressWarnings("unused")
		public void validate_Associated_service_related_tab_validations() throws Throwable{
			String[] Association_service_header={"SERVICENAME", "SubscriberName", "ServiceTYPE", "USAGETYPE", "MCO", "DELETE"};
			String Validation_status=null, delete_validation=null, service_name_hyperlink_validation=null;
			String Service_Name=null,Subscriber_name=null,Service_type=null,Usage_type=null,MCO=null;
			
			waitForElement(btn_RT_Supporticon_exportexcel);
			if(!lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
				
				int i=1,Service_Name_column=0,Subscriber_name_column=0,Service_type_column=0,Usage_type_column=0,MCO_column=0,Delete_column=0;
				while(i!=0){
					
					switch(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","")){
					case "SERVICENAME":Service_Name_column=i; break;
					case "SubscriberName":Subscriber_name_column=i; break;
					case "ServiceTYPE":Service_type_column=i; break;
					case "USAGETYPE":Usage_type_column=i; break;
					case "MCO":MCO_column=i; break;
					case "DELETE":Delete_column=i; break;
					}
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s","").equals(Association_service_header[i-1])){
						slf4jLogger.info("Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
					} else {
						slf4jLogger.info("Not Matching Header"+loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span")).getText().replaceAll("\\s",""));
					}
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'columntableserviceGrid')]/div["+i+"]/div/div[1]/span"))){
						slf4jLogger.info("Not visible");
						break;
					}
					
				}
				
				i=1;
				while(i!=0){
					
					if(!loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Delete_column+"]//input")).isEnabled()){
						delete_validation="Pass";
					} else {
						delete_validation="Fail- Delete button is enabled without clicking on edit";
					}
					
					if(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]//a")).isEnabled()){
						service_name_hyperlink_validation="Pass";
					} else {
						service_name_hyperlink_validation="Fail- Service name is not hyperlinked";
					}
					
					if(Service_Name==null){
						Service_Name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]")).getText();
						Subscriber_name=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Subscriber_name_column+"]")).getText();
						Service_type=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_type_column+"]")).getText();
						Usage_type=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Usage_type_column+"]")).getText();
						MCO=loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+MCO_column+"]")).getText();
					
					} else {
						Service_Name+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]")).getText());
						Subscriber_name+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Subscriber_name_column+"]")).getText());
						Service_type+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_type_column+"]")).getText());
						Usage_type+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Usage_type_column+"]")).getText());
						MCO+=to_check_value_isempty(loginPage.getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+MCO_column+"]")).getText());
					
					}
					
					i++;
					if(!loginPage.isElementVisible(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@ng-controller='gponServiceAssociationDetailsCtrl']//div[contains(@id,'contenttableserviceGrid')]/div["+i+"]/div["+Service_Name_column+"]//a"))){
						slf4jLogger.info("Not visible");
						break;
					}
					
				}
				
				slf4jLogger.info("Service Name hyperlink status:"+service_name_hyperlink_validation);
				slf4jLogger.info("Service Name:"+Service_Name);
				slf4jLogger.info("Subscriber name:"+Subscriber_name);
				slf4jLogger.info("Service Type:"+Service_type);
				slf4jLogger.info("Usage Type"+Usage_type);
				slf4jLogger.info("MCO"+MCO);
				slf4jLogger.info("Delete Button Status: "+delete_validation);
				
			} else {
				slf4jLogger.info("No Service is assciated with this Service");
			}
		}
		
		public String to_check_value_isempty(String valvalue){
			if(valvalue.isEmpty() || valvalue.length()<1){
				return "";
			}
			return ":"+"\n"+valvalue;
		}
		
		public void Servicettab_namevalidation() throws Throwable {
			waitForElementclickable(btn_Servicepage_Edit);
			
			 
			 String Servicename=tab_search_result_details.getText().replaceAll("\\s","");
				
			 if(lbl_serviceview_generalsection_servicename.isCurrentlyVisible()){
				 if(lbl_serviceview_generalsection_servicename.getText().replaceAll("\\s","").equals(Servicename)){
						slf4jLogger.info("Service Tab Name is matching with the Service Text field");
					} else throw new Error("Service name is not matching with Tab name");
			 }
				
				
				if(lbl_serviceview_generalsection_servicename_old.isCurrentlyVisible()){
					 if(lbl_serviceview_generalsection_servicename_old.getText().replaceAll("\\s","").equals(Servicename)){
							slf4jLogger.info("Service Tab Name is matching with the Service Text field");
						} else throw new Error("Service name is not matching with Tab name");
				}
				
				if(lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.isCurrentlyVisible()){
					 if(lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText().replaceAll("\\s","").equals(Servicename)){
							slf4jLogger.info("Service Tab Name is matching with the Service Text field");
						} else throw new Error("Service name is not matching with Tab name");
				}
				
				if(lbl_service_viewpage_iptv_details_tab_gerneral_sec_name.isCurrentlyVisible()){
					 if(lbl_service_viewpage_iptv_details_tab_gerneral_sec_name.getText().replaceAll("\\s","").equals(Servicename)){
							slf4jLogger.info("Service Tab Name is matching with the Service Text field");
						} else throw new Error("Service name is not matching with Tab name");
				}
				
				if(lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_name.isCurrentlyVisible()){
					 if(lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_name.getText().replaceAll("\\s","").equals(Servicename)){
							slf4jLogger.info("Service Tab Name is matching with the Service Text field");
						} else throw new Error("Service name is not matching with Tab name");
				}
			
				
			
		}
		
		
		
		public void	 Service_search_Sanity_Validation() throws Throwable{			
						
			Thread.sleep(10000);waitForElement(btn_Servicepage_Edit);Thread.sleep(5000);
			String Service_type=null;
			 Servicettab_namevalidation();
			 
			 if(lbl_serviceview_generalsection_servicetype.isCurrentlyVisible()){
				 Service_type=lbl_serviceview_generalsection_servicetype.getText().replaceAll("\\s+$", "");
			 } else if(lbl_serviceview_generalsection_servicetype_old.isCurrentlyVisible()){
				 Service_type=lbl_serviceview_generalsection_servicetype_old.getText().replaceAll("\\s+$", "");
			 }
			 
			if(!btn_Servicepage_Edit.isCurrentlyVisible() && !btn_Servicepage_Edit.isCurrentlyEnabled()){
				throw new Error("Service Edit button is not displayed for "+Service_type);
			}					
			
			
			if(!tab_service_viewpage_Audit_Log.isCurrentlyVisible()){
				throw new Error("Audit log tab is not displayed for "+Service_type);
			}
			
			
			/*if(!btn_viewServicepage_activate.isCurrentlyVisible() && !btn_viewServicepage_activate.isCurrentlyEnabled()){
				if(!Service_type.contains("MEF OVC") || !Service_type.contains("Host Service")||!Service_type.contains("MEF EVC") ){
					throw new Error("Service Activate button is not displayed for "+Service_type);
				}
				
			}	
			
			
			if(!btn_viewServicepage_deactivate.isCurrentlyVisible() && !btn_viewServicepage_deactivate.isCurrentlyEnabled()){
				if(!Service_type.contains("MEF OVC") || !Service_type.contains("Host Service")||!Service_type.contains("MEF EVC")){
					throw new Error("Service Deactivate button is not displayed for "+Service_type);
				}
				
			}		
			
			if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
				if(!Service_type.contains("Probe UNI") || !Service_type.contains("MEF OVC") || !Service_type.contains("MEF EVC")|| !Service_type.contains("HSI") || !Service_type.contains("IPTV") || !Service_type.contains("IPTV Unicast")){
					throw new Error("Association tab is displayed for "+Service_type);
				}
				
			}

			
			
			if(!btn_Servicepage_Reset_ONT.isCurrentlyVisible()&& !btn_Servicepage_Reset_ONT.isCurrentlyEnabled()){
				if(!Service_type.contains("Probe UNI") || !Service_type.contains("Mgmt UNI")|| !Service_type.contains("Mgmt EVC") || !Service_type.contains("MEF UNI") || !Service_type.contains("MEF OVC") || !Service_type.contains("Host Service")){
					if(!Service_type.contains("MEF EVC") || !Service_type.contains("MEF OVC") || !Service_type.contains("Probe UNI") || !Service_type.contains("MEF Service")|| !Service_type.contains("DSL OVC")|| !Service_type.contains("ENNI Link Service")){
						throw new Error("Reset ONT button is not Displayed for "+Service_type);
					}
				}					
			}*/
			

			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    DSL OVC,MEF ENNI Service Details Page View  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
			
			
			if(lbl_serviceview_generalsection_servicetype.isCurrentlyVisible()){
			
			if(!btn_Servicepage_refresh.isCurrentlyVisible() && !btn_Servicepage_refresh.isCurrentlyEnabled()){
				throw new Error("Service Refresh button is not displayed for "+Service_type);
				}
			
			
		
			
			if(!btn_Servicepage_Delete.isCurrentlyVisible() && !btn_Servicepage_Delete.isCurrentlyEnabled()){
				throw new Error("Service Delete button is not displayed for "+Service_type);
			}
			
			if(tab_service_viewpage_Facility_Details.isCurrentlyVisible()){
				throw new Error("Facility tab is displayed for "+Service_type);
			}
			
			
			
			if(!tab_Virtual_Ports_old.isCurrentlyVisible()){
				throw new Error("Virtual VLAN Ports Related Tab is missing in the Service view page in "+Service_type);
			}	
			
			if(tab_services.isCurrentlyVisible()){
				throw new Error("Services Related Tab is displayed in the Service view page in "+Service_type);
			}
			
			if(tab_topologyview.isCurrentlyVisible()){
				throw new Error("Topology View Related Tab is displayed in the Service view page in "+Service_type);
			}	
			
			switch(Service_type){
			
			case "DSL OVC": if(!tab_ctag.isCurrentlyVisible()){
									throw new Error("CTAG Related Tab is missing in the Service view page in "+Service_type);
								}
									
									if(!tab_serviceview_DSLOVCDetails.isCurrentlyVisible()){
								throw new Error("DSLOVC Details Service tab is not displayed for "+Service_type);
							}
									if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
										throw new Error("Reset ONT button is Displayed for "+Service_type);
									}
									
									if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
										throw new Error("Association tab is not displayed for "+Service_type);
										}
									if(!btn_viewServicepage_activate.isCurrentlyVisible()){
										throw new Error("Service Activate button is displayed for "+Service_type);
										}
										
									if(!btn_viewServicepage_deactivate.isCurrentlyVisible()){
										throw new Error("Service Deactivate button is not displayed for "+Service_type);
										}
									jsClick(btn_Servicepage_Edit); Thread.sleep(5000);
                                    ddl_dslovc_ProvisioningStatus_editServicepage.selectByIndex(2);
                                    ddl_dslovc_networkProtocol.selectByIndex(1);
                                    ddl_dslovc_SupportedIPVersion.selectByIndex(1);

							break;
							
			case "MEF ENNI": if(tab_ctag.isCurrentlyVisible()){
									throw new Error("CTAG Related Tab is displayed in the Service view page in "+Service_type);
								}
									
									if(!tab_serviceview_mefenniServiceDetails.isCurrentlyVisible()){
									throw new Error("MEF ENNI Details Service tab is not displayed for "+Service_type);
								}	
									
									
									if(tab_ctag.isCurrentlyVisible()){
										throw new Error("CTAG Related Tab is displayed in the Service view page in "+Service_type);
									}
									
									if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
										throw new Error("Reset ONT button is Displayed for "+Service_type);
									}
									
									if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
										throw new Error("Association tab is not displayed for "+Service_type);
										}
									
									if(!btn_viewServicepage_activate.isCurrentlyVisible()){
										throw new Error("Service Activate button is displayed for "+Service_type);
										}
									
									if(!btn_viewServicepage_deactivate.isCurrentlyVisible()){
										throw new Error("Service Deactivate button is not displayed for "+Service_type);
										}
									
                                    waitForElement(btn_Servicepage_Edit); 
                                    jsClick(btn_Servicepage_Edit);
                                    waitForElement(ddl_ProvisioningStatus_editServicepage_MEFENNI);
                                    ddl_ProvisioningStatus_editServicepage_MEFENNI.selectByIndex(2);
                                    ddl_NCCODE_editServicepage_MEFENNI.selectByIndex(3);
                                    wait(100);
                                    ddl_NCICODE_editServicepage_MEFENNI.selectByIndex(5);
                                    wait(100);
                                    ddl_SecNCICode_editServicepage_MEFENNI.selectByIndex(3);
                                    ddl_RequestingAffiliate_editServicepage_MEFENNI.selectByIndex(2);
                                    ddl_MCO_editServicepage_MEFENNI.selectByIndex(2);

									
									break;
								
			case "Mgmt EVC": if(tab_ctag.isCurrentlyVisible()){
									throw new Error("CTAG Related Tab is displayed in the Service view page in "+Service_type);
								}
									
									if(!tab_serviceview_mgmtevcDetails.isCurrentlyVisible()){
									throw new Error("Mgmt EVC Details Service tab is not displayed for "+Service_type);
								}	
									
									if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
										throw new Error("Reset ONT button is Displayed for "+Service_type);
									}
									if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
										throw new Error("Association tab is not displayed for "+Service_type);
										}
									
									if(!btn_viewServicepage_activate.isCurrentlyVisible()){
										throw new Error("Service Activate button is displayed for "+Service_type);
										}
									
									if(!btn_viewServicepage_deactivate.isCurrentlyVisible()){
										throw new Error("Service Deactivate button is not displayed for "+Service_type);
										}
									
                                    waitForElement(btn_Servicepage_Edit); 
                                    jsClick(btn_Servicepage_Edit);
                                    waitForElement(ddl_ProvisioningStatus_editServicepage_MEFENNI);
                                    ddl_ProvisioningStatus_editServicepage_MEFENNI.selectByIndex(2);
                                    ddl_EVC_NCCODE_editServicepage_MgmtEVC.selectByIndex(1);

                                    
									break;
												
												
									
								
				
				
			}
			}
			
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    ENNI Link, HSOT, Local EVC, MEF EVC, MEF OVC, MEF Service, MEF UNI, Mgmt UNI & Probe UNI Service Details Page View  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
			
			if(lbl_serviceview_generalsection_servicetype_old.isCurrentlyVisible()){
				
				if(!btn_Servicepage_refresh_old.isCurrentlyVisible() && !btn_Servicepage_refresh_old.isCurrentlyEnabled()){
					throw new Error("Service Refresh button is not displayed for "+Service_type);
				}
				
				if(!btn_Servicepage_Delete.isCurrentlyVisible() && !btn_Servicepage_Delete.isCurrentlyEnabled()){
					throw new Error("Service Delete button is not displayed for "+Service_type);
				}
				
				
				if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()&& btn_Servicepage_Reset_ONT.isCurrentlyEnabled()){
					throw new Error("Reset ONT button is Displayed for "+Service_type);
				}
				
				if(tab_service_viewpage_Facility_Details.isCurrentlyVisible()){
					throw new Error("Facility tab is displayed for "+Service_type);
				}
				
				
				
				if(!tab_Virtual_Ports_old.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is missing in the Service view page in "+Service_type);
				}	
				
				if(tab_services.isCurrentlyVisible()){
					throw new Error("Services Related Tab is displayed in the Service view page in "+Service_type);
				}
				
				if(tab_topologyview.isCurrentlyVisible()){
					throw new Error("Topology View Related Tab is displayed in the Service view page in "+Service_type);
				}	
				
				switch(Service_type){
				
				case "ENNI Link Service": 	if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
												throw new Error("Association tab is not displayed for "+Service_type);
											}
											if(!tab_serviceview_ENNILinkServiceDetails.isCurrentlyVisible()){
													throw new Error("ENNI Link Service Details Service tab is not displayed for "+Service_type);
												} 
											if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
												throw new Error("Reset ONT button is Displayed for "+Service_type);
											}
											if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
												throw new Error("Association tab is not displayed for "+Service_type);
												}
											
											if(!btn_viewServicepage_activate.isCurrentlyVisible()){
												throw new Error("Service Activate button is displayed for "+Service_type);
												}
											
											if(!btn_viewServicepage_deactivate.isCurrentlyVisible()){
												throw new Error("Service Deactivate button is not displayed for "+Service_type);
												}
											break;
												
				case "Host Service": if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
													throw new Error("Association tab is not displayed for "+Service_type);
												}
					
										if(!tab_serviceview_HostServiceDetails.isCurrentlyVisible()){
											throw new Error("HOST Service Details Service tab is not displayed for "+Service_type);
										}
										if(btn_viewServicepage_activate.isCurrentlyVisible()){
											throw new Error("Service Activate button is displayed for "+Service_type);
										}
										
										if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
											throw new Error("Reset ONT button is Displayed for "+Service_type);
											}
										
										if(btn_viewServicepage_deactivate.isCurrentlyVisible()){
										throw new Error("Service Deactivate button is displayed for "+Service_type);
										}
										
										
										
										break;
										
				case "Local EVC":if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
										throw new Error("Association tab is not displayed for "+Service_type);
									}
									if(!tab_serviceview_localevcServiceDetails.isCurrentlyVisible()){
									throw new Error("HOST Service Details Service tab is not displayed for "+Service_type);
								} break;
								
				case "MEF EVC": if(tab_service_viewpage_Associations.isCurrentlyVisible()){
										throw new Error("Association tab is displayed for "+Service_type);
									}
								if(!tab_serviceview_mefevcServiceDetails.isCurrentlyVisible()){
									throw new Error("MEF EVC Service Details Service tab is not displayed for "+Service_type);
								} 
								if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
									throw new Error("Reset ONT button is Displayed for "+Service_type);
									}
								
								if(btn_viewServicepage_activate.isCurrentlyVisible()){
									throw new Error("Service Activate button is not displayed for "+Service_type);
									}
								if(btn_viewServicepage_deactivate.isCurrentlyVisible()){
									throw new Error("Service Deactivate button is displayed for "+Service_type);
									}
                                waitForElement(btn_Servicepage_Edit); 
                                jsClick(btn_Servicepage_Edit);
                                waitForElement(ddl_ProvisioningStatus_editServicepage_MEFUNI);
                                ddl_ProvisioningStatus_editServicepage_MEFUNI.selectByIndex(2);
                                ddl_REQUESTING_AFFILIATE_editServicepage_MEFUNI.selectByIndex(1);
                               ddl_MCO_editServicepage_MEFUNI.selectByIndex(2);
                              ddl_SLATemplate_editServicepage_MEFEVC.selectByIndex(1);
                             ddl_PMFLAG_editServicepage_EVCOVCNC.selectByIndex(3);

								
								break;
								
				case "MEF OVC":  if(tab_service_viewpage_Associations.isCurrentlyVisible()){
											throw new Error("Association tab is displayed for "+Service_type);
										}
				
								if(!tab_serviceview_ServiceDetails.isCurrentlyVisible()){
									throw new Error("MEF OVC Service Details Service tab is not displayed for "+Service_type);
								} 
								
								if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
									throw new Error("Reset ONT button is Displayed for "+Service_type);
									}
								
								if(btn_viewServicepage_activate.isCurrentlyVisible()){
									throw new Error("Service Activate button is not displayed for "+Service_type);
									}
								if(btn_viewServicepage_deactivate.isCurrentlyVisible()){
									throw new Error("Service Deactivate button is displayed for "+Service_type);
									}
                                ddl_ProvisioningStatus_editServicepage_MEFUNI.selectByIndex(1);
                                ddl_MCO_editServicepage_MEFUNI.selectByIndex(2);
                                ddl_REQUESTING_AFFILIATE_editServicepage_MEFUNI.selectByIndex(2);
                                

								break;
								
				case "MEF Service": if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
												throw new Error("Association tab is not displayed for "+Service_type);
											}
							
									if(!tab_serviceview_mefServiceDetails.isCurrentlyVisible()){
										throw new Error("MEF Service Details Service tab is not displayed for "+Service_type);
									} 
									if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
										throw new Error("Reset ONT button is Displayed for "+Service_type);
										}break;
									
				case "MEF UNI":  if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
											throw new Error("Association tab is not displayed for "+Service_type);
										}
						
								if(!tab_serviceview_mefuniDetails.isCurrentlyVisible()){
									throw new Error("MEF UNI Details Service tab is not displayed for "+Service_type);
								} 
								if(btn_Servicepage_Reset_ONT.isCurrentlyVisible()){
									throw new Error("Reset ONT button is Displayed for "+Service_type);
									}
                                waitForElement(btn_Servicepage_Edit); 
                          jsClick(btn_Servicepage_Edit);
                          waitForElement(ddl_ProvisioningStatus_editServicepage_MEFUNI);
                          ddl_ProvisioningStatus_editServicepage_MEFUNI.selectByIndex(2);
                          ddl_REQUESTING_AFFILIATE_editServicepage_MEFUNI.selectByIndex(2); 
                          ddl_NCCODE_editServicepage_MEFUNI.selectByIndex(2);
                          ddl_NCICODE_editServicepage_MEFUNI.wait(1000);
                          ddl_NCICODE_editServicepage_MEFUNI.selectByIndex(6);
                          ddl_SECNCICODE_editServicepage_MEFUNI.selectByIndex(6);
                          ddl_MCO_editServicepage_MEFUNI.selectByIndex(1);

								break;
								
				case "MGR UNI":  if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
											throw new Error("Association tab is not displayed for "+Service_type);
										}
						
								if(!tab_serviceview_mgruniDetails.isCurrentlyVisible()){
									throw new Error("MGR UNI Details Service tab is not displayed for "+Service_type);
								} 
								
                                waitForElement(btn_Servicepage_Edit); 
                          jsClick(btn_Servicepage_Edit);
                          waitForElement(ddl_ProvisioningStatus_editServicepage_MEFUNI);
                          ddl_ProvisioningStatus_editServicepage_MEFUNI.selectByIndex(2);
                          ddl_REQUESTING_AFFILIATE_editServicepage_MEFUNI.selectByIndex(2); 
                          ddl_NCCODE_editServicepage_MEFUNI.selectByIndex(2);
                          ddl_NCICODE_editServicepage_MEFUNI.wait(1000);
                          ddl_NCICODE_editServicepage_MEFUNI.selectByIndex(6);
                          ddl_SECNCICODE_editServicepage_MEFUNI.selectByIndex(6);
                          ddl_MCO_editServicepage_MEFUNI.selectByIndex(1);
                          ddl_RateLimitType_editServicepage_MgmtUNI.selectByIndex(1);

								break;
								
				case "Mgmt UNI": if(!tab_service_viewpage_Associations.isCurrentlyVisible()){
											throw new Error("Association tab is not displayed for "+Service_type);
										}
						
								if(!tab_serviceview_mgmtuniDetails.isCurrentlyVisible()){
									throw new Error("Mgmt UNI Details Service tab is not displayed for "+Service_type);
								} 
								
                                waitForElement(btn_Servicepage_Edit); 
                                jsClick(btn_Servicepage_Edit);
                                waitForElement(ddl_ProvisioningStatus_editServicepage_MEFUNI);
                                ddl_ProvisioningStatus_editServicepage_MEFUNI.selectByIndex(2);
                                ddl_REQUESTING_AFFILIATE_editServicepage_MEFUNI.selectByIndex(1);
                                ddl_NCICODE_editServicepage_MEFUNI.selectByIndex(1);
                                ddl_SECNCICODE_editServicepage_MEFUNI.selectByIndex(2);
                                ddl_MCO_editServicepage_MEFUNI.selectByIndex(2);

                                break;
								
				case "Probe UNI": if(tab_service_viewpage_Associations.isCurrentlyVisible()){
											throw new Error("Association tab is displayed for "+Service_type);
										}
						
								if(!tab_serviceview_probeuniDetails.isCurrentlyVisible()){
									throw new Error("Probe UNI Details Service tab is not displayed for "+Service_type);
								} 
								
                                waitForElement(btn_Servicepage_Edit); 
                                jsClick(btn_Servicepage_Edit);
                                waitForElement(ddl_ProvisioningStatus_editServicepage_MEFUNI);
                                ddl_ProvisioningStatus_editServicepage_MEFUNI.selectByIndex(2);
                                 ddl_RateLimitType_editServicepage_MgmtUNI.selectByIndex(1);

                                 break;
				
				
				
				}
				
			}
			
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    HSI Details Page View  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
			
			if(lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.isCurrentlyVisible()){
				
				if(!btn_Servicepage_refresh.isCurrentlyVisible() && !btn_Servicepage_refresh.isCurrentlyEnabled()){
					throw new Error("Service Refresh button is not displayed for "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText().replaceAll("\\s+$", ""));
					}
				
				if(!tab_service_viewpage_HSI_details.isCurrentlyVisible()){
					throw new Error("HSI Details tab is Missing for "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText().replaceAll("\\s+$", ""));
				}
				
				if(!tab_service_viewpage_Facility_Details.isCurrentlyVisible()){
					throw new Error("Facility tab is Missing for "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(!btn_Servicepage_Reset_ONT.isCurrentlyVisible()&& !btn_Servicepage_Reset_ONT.isCurrentlyEnabled()){
					throw new Error("Reset ONT button is Missing for "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(!btn_Servicepage_Delete.isCurrentlyVisible() && !btn_Servicepage_Delete.isCurrentlyEnabled()){
					throw new Error("Service Delete button is not displayed for "+lbl_serviceview_generalsection_servicetype.getText().replaceAll("\\s+$", ""));
				}
				
				if(tab_service_viewpage_Associations.isCurrentlyVisible()){
					throw new Error("Association tab is displayed for "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText().replaceAll("\\s+$", ""));
				}
				
				
				if(!tab_services.isCurrentlyVisible()){
					throw new Error("Services Related Tab is not displayed in the Service view page in "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText());
				}	
				
				if(!tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is missing in the Service view page in "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText());
				}	
				
				if(!tab_topologyview.isCurrentlyVisible()){
					throw new Error("Topology View Related Tab is missing in the Service view page in "+lbl_service_viewpage_hsi_details_tab_gerneral_sec_name.getText());
				}	
			}
			
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    IPTV Details Page View  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
			
			if(lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.isCurrentlyVisible()){
				
				if(!btn_Servicepage_refresh.isCurrentlyVisible() && !btn_Servicepage_refresh.isCurrentlyEnabled()){
					throw new Error("Service Refresh button is not displayed for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
					}
				
				if(!btn_Servicepage_Reset_ONT.isCurrentlyVisible()&& !btn_Servicepage_Reset_ONT.isCurrentlyEnabled()){
					throw new Error("Reset ONT button is Missing for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(!btn_Servicepage_Delete.isCurrentlyVisible() && !btn_Servicepage_Delete.isCurrentlyEnabled()){
					throw new Error("Service Delete button is not displayed for "+lbl_serviceview_generalsection_servicetype.getText().replaceAll("\\s+$", ""));
				}
				
				if(!tab_service_viewpage_IPTV_details.isCurrentlyVisible()){
					throw new Error("IPTV Details tab is Missing for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_name.getText().replaceAll("\\s+$", ""));
				}
				
				if(!tab_service_viewpage_Facility_Details.isCurrentlyVisible()){
					throw new Error("Facility tab is Missing for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(tab_service_viewpage_Associations.isCurrentlyVisible()){
					throw new Error("Association tab is displayed for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				
				if(!tab_services.isCurrentlyVisible()){
					throw new Error("Services Related Tab is not displayed in the Service view page in "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText());
				}	
				
				if(!tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is missing in the Service view page in "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText());
				}	
				
				if(!tab_topologyview.isCurrentlyVisible()){
					throw new Error("Topology View Related Tab is missing in the Service view page in "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText());
				}	
				
				
			}
			
			
			//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    IPTV-UNICAST Details Page View  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
			
		
			if(lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.isCurrentlyVisible()){
				
				if(!btn_Servicepage_refresh.isCurrentlyVisible() && !btn_Servicepage_refresh.isCurrentlyEnabled()){
					throw new Error("Service Refresh button is not displayed for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
					}
				
				if(!btn_Servicepage_Reset_ONT.isCurrentlyVisible()&& !btn_Servicepage_Reset_ONT.isCurrentlyEnabled()){
					throw new Error("Reset ONT button is Missing for "+lbl_service_viewpage_iptv_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(!btn_Servicepage_Delete.isCurrentlyVisible() && btn_Servicepage_Delete.isCurrentlyEnabled()){
					throw new Error("Service Delete button is not displayed for "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(!tab_service_viewpage_IPTVunicast_details.isCurrentlyVisible()){
					throw new Error("IPTV-Unicast Details tab is Missing for "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(!tab_service_viewpage_Facility_Details.isCurrentlyVisible()){
					throw new Error("Facility tab is Missing for "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				if(tab_service_viewpage_Associations.isCurrentlyVisible()){
					throw new Error("Association tab is displayed for "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText().replaceAll("\\s+$", ""));
				}
				
				
				if(!tab_services.isCurrentlyVisible()){
					throw new Error("Services Related Tab is not displayed in the Service view page in "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText());
				}	
				
				if(!tab_Virtual_Ports.isCurrentlyVisible()){
					throw new Error("Virtual VLAN Ports Related Tab is missing in the Service view page in "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText());
				}	
				
				if(!tab_topologyview.isCurrentlyVisible()){
					throw new Error("Topology View Related Tab is missing in the Service view page in "+lbl_service_viewpage_iptvunicast_details_tab_gerneral_sec_service_type.getText());
				}	
				
			}
			
			
			
			
			
			
				//*************************   Related Tab Validations *****************************************************************************************//
							
							/*if(!tab_Activations.isCurrentlyVisible() ){
								throw new Error("Activation Related Tab is missing in the Service view page in "+Service_type);
							}*/							
							
							
							if(!tab_bamreport.isCurrentlyVisible() ){
								throw new Error("BAM Report Related tab is missing in the Service view page in "+Service_type);
							}
							
							if(!tab_circuitdetails.isCurrentlyVisible() ){
								throw new Error("Circuit Details Related tab is missing in the Service view page in "+Service_type);
							}
							
							if(!tab_Circuits.isCurrentlyVisible()){
								throw new Error("Circuit Related Tab is missing in the Service view page in "+Service_type);
							}
							
							
							
							if(!tab_Devices.isCurrentlyVisible()  ){
								throw new Error("Devices Related Tab is missing in the Service view page in "+Service_type);
							}
							
							
							if(!tab_Locations.isCurrentlyVisible()){
								throw new Error("Location Related tab is missing in the Service view page in "+Service_type);
							}
							
							if(!tab_orders.isCurrentlyVisible()){
								throw new Error("Orders Related Tab is missing in the Service view page in "+Service_type);
							}
							

							if(!tab_Performance.isCurrentlyVisible()){
								throw new Error("Performance Related Tab is missing in the Service view page in "+Service_type);
							}
							
							if(!tab_Service_Areas.isCurrentlyVisible()){
								throw new Error("Service Area Related Tab is missing in the Service view page in "+Service_type);
							}							
							
							
							if(!tab_Subscriber.isCurrentlyVisible()){
								throw new Error("Subscriber Related Tab is missing in the Service view page in "+Service_type);
							}
									
							if(!tab_Tasks.isCurrentlyVisible()){
								throw new Error("Task Related Tab is missing in the Service view page in "+Service_type);
							}
							
							if(!tab_TIRKS.isCurrentlyVisible() ){
								throw new Error("TIRKS Related Tab is missing in the Service view page in "+Service_type);
							}
							
							
									
											
									//################################ Related Tabs should not be displayed Circuit view ############################################//
									
											
									
									if(tab_contact.isCurrentlyVisible()){
										throw new Error("Contact Related Tab is Displayed in the Service view page in "+Service_type);
									}
									
									if(tab_Device_ports.isCurrentlyVisible()){
										throw new Error("Audit Logs Tab is Displayed in the Service view page in "+Service_type);
									}				
									
									
									
									
									
									if(tab_Armor.isCurrentlyVisible() ){
										throw new Error("ARMOR Related Tab is displayed in the Service view page in "+Service_type);
									}
							
									if(tab_facilities.isCurrentlyVisible()  ){
										throw new Error("Facilities Related Tab is displayed in the Service view page in "+Service_type);
									}
								
									
			
			
			
		}
		
		//################################ Validate_FROM_Archie_DeviceAuditlog  TC189925 ############################################//
		
		public void Service_View_Action(String action) throws Throwable {					
			waitForElement(btn_Servicepage_Edit);
			
			switch(action){
			case "Audit Log": jsClick(tab_service_viewpage_Audit_Log); waitForElement(tab_serviceview_auditlogs_OMNIVUE_auditlogs); break;
				
			}
		}	
		
		public void Validate_FROM_Archie_ServiceAuditlog(){
			
			if(tab_serviceview_auditlogs_ARM_auditlogs_Active.isCurrentlyVisible()){
				if(!cbx_serach_service_ARM_Audit_log_FromArchive.isCurrentlyVisible()){
					throw new Error("From Archive button is not displayed in the ARM Audit logs tab in service view page");
				}
			} else if(tab_serviceview_auditlogs_OMNIVUE_auditlogs_Active.isCurrentlyVisible()){
				if(!cbx_serach_serviceview_Omnivue_Audit_log_tab_FromArchive.isCurrentlyVisible()){
					throw new Error("From Archive button is not displayed in the Omnivue Audit logs tab in service view page");
				}
			}
			slf4jLogger.info("Able to see From Archive check box in Audit logs tab");
		}
		 
		
		public void Validate_FROM_Archie_Auditlog() {
			try {
			if(tab_serviceview_auditlogs_ARM_auditlogs_Active.isCurrentlyVisible()){
				jsClick(cbx_serach_service_ARM_Audit_log_FromArchive);
				jsClick(btn_serach_service_Audit_log_tab_getlog);
				waitForinvisibleElement(lbl_serach_service_Audit_log_tab_getlog_loader.getText());
				
					Thread.sleep(5000);
				
			} else if(tab_serviceview_auditlogs_OMNIVUE_auditlogs_Active.isCurrentlyVisible()){
				
				jsClick(cbx_serach_serviceview_Omnivue_Audit_log_tab_FromArchive);
				jsClick(btn_serach_serviceview_Omnivue_Audit_log_tab_getlog);
				waitForinvisibleElement(lbl_serach_serviceview_Omnivue_Audit_log_tab_getlog_loader.getText());
				Thread.sleep(5000);
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void Validate_Auditlog_witharchieve() {
			if(!lbl_serach_serviceview_Audit_log_tab_errormsg.isCurrentlyVisible() || !lbl_serach_serviceview_ARMAudit_log_tab_errormsg.isCurrentlyVisible()){
				slf4jLogger.info("Able to see logs in service view page");
			} else {
				slf4jLogger.info("Check ARM DB whether the"+tab_search_result_details.getText().trim()+" service has logs");
			}
		}
		
		//###########################################################################################################################//
		
		
		public void validate_the_affiliate_owner_fields_DSLOVC() {			
			jsClick(ddl_dslovc_affiliateowner);
			String str1=ddl_dslovc_affiliateowner.getText();
			for(String w:str1.split("\n")){
			if ( w.equalsIgnoreCase("--Select--")) {	
				System.out.println("Afffiliated owner value:"+ w);
			}
			else if ( w.equalsIgnoreCase("LOCAL")){
			System.out.println("Afffiliated owner value:"+ w);
			}
			else if ( w.equalsIgnoreCase("IXC")){
			System.out.println("Afffiliated owner value:"+ w);
			}
			else throw new Error("Affiliated Owner is not present");
			}
		}
		
		
		public void validate_the_auditlog_DSLOVC(String action) throws Throwable {	
			 WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
			waitForElement(tab_service_viewpage_Audit_Log);
			Service_View_Action("Audit Log");
			jsClick(tab_serviceview_auditlogs_OMNIVUE_auditlogs);
			
			jsClick(btn_serach_serviceview_Omnivue_Audit_log_tab_getlog);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[@class='tab-pane ng-scope active']//div[@ng-show='init_loader']"))));
			
			waitForElement(lbl_serach_serviceview_Omnivue_Audit_log_tab_username);
			
			switch(action){
			
			case "VIEW": if(!lbl_serach_serviceview_Omnivue_Audit_log_tab_action.getText().trim().equalsIgnoreCase(action)){
								throw new Error(action+" Action is not registered for DSL OVC Service");
							}
							
							if(!lbl_serach_serviceview_Omnivue_Audit_log_tab_username.getText().trim().equals(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
								throw new Error("Log is not registed on the view for DSL OVC Service");
							} break;
			case "UPDATE": if(!lbl_serach_serviceview_Omnivue_Audit_log_tab_action2.getText().trim().equalsIgnoreCase(action)){
								throw new Error(action+" Action is not registered for DSL OVC Service");
							}
							
							if(!lbl_serach_serviceview_Omnivue_Audit_log_tab_username2.getText().trim().equalsIgnoreCase(Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx"))){
								throw new Error("Log is not registed on the view for DSL OVC Service");
							} break;
			
			}
			
			
			
			slf4jLogger.info("Able to see the log getting registerd");
			
		}
		
		public void clickEndDevice() throws Throwable {
			Thread.sleep(2000);
			waitForElement(btn_Servicepage_Edit);
			if(lbl_viewservicepage_portsection_enddevice_hyperlink.isCurrentlyVisible()){
				Thread.sleep(1000);
				jsClick(lbl_viewservicepage_portsection_enddevice_hyperlink);
				Thread.sleep(1000);
				//lbl_viewservicepage_portsection_enddevice_hyperlink.click();
			}
			Thread.sleep(2000);
		}
		
		public void ProbeUniServiceAttributes()throws Throwable{
			
			lbl_service_uni_monitoringtype.selectByVisibleText("HIGH DENSITY");
			//Select 	monitoringtype= new Select(lbl_service_uni_monitoringtype);
			//monitoringtype.selectByValue("HIGH DENSITY");;
			Thread.sleep(2000);
			
			lbl_service_uni_SPECcode.selectByVisibleText("MOENNH");
			//Select 	SPECcode= new Select(lbl_service_uni_SPECcode);
			//SPECcode.selectByVisibleText("MOENNH");
			Thread.sleep(2000);
			
			lbl_service_uni_NCcode.selectByVisibleText("KRE1");
			//Select 	NCcode= new Select(lbl_service_uni_NCcode);
			//NCcode.selectByVisibleText("KRE1");
			Thread.sleep(2000);
			
			lbl_service_uni_NCIcode.selectByVisibleText("02LNF.A07");
			//Select 	NCIcode= new Select(lbl_service_uni_NCIcode);
			//NCIcode.selectByValue("02LNF.A07");
			Thread.sleep(2000);
			
			lbl_service_uni_SecNCIcode.selectByVisibleText("08CX9.N1A");
			//Select 	SecNCIcode= new Select(lbl_service_uni_SecNCIcode);
			//SecNCIcode.selectByValue("08CX9.N1A");
			Thread.sleep(2000);
			
			lbl_service_uni_serviceMUX.selectByVisibleText("Y");
			//Select 	serviceMUX= new Select(lbl_service_uni_serviceMUX);
			//serviceMUX.selectByValue("Y");
			Thread.sleep(2000);
			
			lbl_service_uni_bundling.selectByVisibleText("Y");
			//Select 	bundling= new Select(lbl_service_uni_bundling);
			//bundling.selectByValue("Y");
			Thread.sleep(2000);
			
			lbl_service_uni_AllTo1Bundling.selectByVisibleText("Y");
			//Select 	AllTo1Bundling= new Select(lbl_service_uni_AllTo1Bundling);
			//AllTo1Bundling.selectByValue("Y");
			Thread.sleep(2000);
			
			lbl_service_uni_FramSize.selectByVisibleText("JUMBO");
			//Select 	FramSize= new Select(lbl_service_uni_FramSize);
			//FramSize.selectByVisibleText("JUMBO");
			Thread.sleep(2000);
			
			lbl_service_uni_RateLimitType.selectByVisibleText("EVCM");
			//Select 	RateLimitType= new Select(lbl_service_uni_RateLimitType);
			//RateLimitType.selectByValue("EVCM");
			Thread.sleep(2000);
			
			lbl_service_uni_IsDiverse.selectByVisibleText("Yes");
			//Select 	IsDiverse= new Select(lbl_service_uni_IsDiverse);
			//IsDiverse.selectByValue("Yes");
			Thread.sleep(2000);
			
		}
		
		public void verify_validation(String validation){ try {
			String Message;
			switch(validation){
			case "Update DSLOVC Service Page":
				tbx_service_ALIAS1.clear();
				tbx_service_ALIAS1.sendKeys("Auto update service ALIAS1");
				tbx_service_ALIAS2.clear();
				tbx_service_ALIAS2.sendKeys("Auto update service ALIAS2");
				tbx_service_Note.clear();
				tbx_service_Note.sendKeys("Auto update service Note");
				break;
				
			case "Update MEF ENNI Service Page":
				tbx_service_ALIAS1.clear();
				tbx_service_ALIAS1.sendKeys("Auto update service ALIAS1");
				tbx_service_ALIAS2.clear();
				tbx_service_ALIAS2.sendKeys("Auto update service ALIAS2");
				tbx_service_Note.clear();
				tbx_service_Note.sendKeys("Auto update service Note");
				break;
				
			case "Update MEF UNI Service Page":
				tbx_service_ALIAS1.clear();
				tbx_service_ALIAS1.sendKeys("Auto update UNI service ALIAS1");
				tbx_service_ALIAS2.clear();
				tbx_service_ALIAS2.sendKeys("Auto update UNI service ALIAS2");
				tbx_service_Note.clear();
				tbx_service_Note.sendKeys("Auto update service Note");
				break;
				
			case "Update Probe UNI Service Page":
				tbx_Hostservice_ALIAS1.clear();
				tbx_Hostservice_ALIAS1.sendKeys("Auto update Probe UNI service ALIAS1");
				tbx_Hostservice_ALIAS2.clear();
				tbx_Hostservice_ALIAS2.sendKeys("Auto update Probe UNI service ALIAS2");
				tbx_Hostservice_Note.clear();
				tbx_Hostservice_Note.sendKeys("Auto update Probe UNI Note");
				ProbeUniServiceAttributes();
				break;
				
			case "Update MEF EVC Service Page":
				tbx_Hostservice_ALIAS1.clear();
				tbx_Hostservice_ALIAS1.sendKeys("Auto update EVC service ALIAS1");
				tbx_Hostservice_ALIAS2.clear();
				tbx_Hostservice_ALIAS2.sendKeys("Auto update EVC service ALIAS2");
				tbx_Hostservice_Note.clear();
				tbx_Hostservice_Note.sendKeys("Auto update EVC service Note");
				break;
				
			case "Update HSI/IPTV/IPTV Unicast Service page":
				tbx_service_ALIAS1.clear();
				tbx_service_ALIAS1.sendKeys("Auto update service ALIAS1");
				tbx_service_ALIAS2.clear();
				tbx_service_ALIAS2.sendKeys("Auto update service ALIAS2");
				break;
				
			case "Update Host Service Page":
				tbx_Hostservice_ALIAS1.clear();
				tbx_Hostservice_ALIAS1.sendKeys("Auto update Host service ALIAS1");
				tbx_Hostservice_ALIAS2.clear();
				tbx_Hostservice_ALIAS2.sendKeys("Auto update Host service ALIAS2");
				tbx_Hostservice_Note.clear();
				tbx_Hostservice_Note.sendKeys("Auto update Host service Note");
				break;
				
			case "Start and End Device tabs are displayed in service screen":waitForElement(btn_Servicepage_Edit);
			
								if(lbl_viewservicepage_portsection_startdevice_hyperlink.isCurrentlyVisible()){
									
									waitForElement(getDriver().findElement(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='"+lbl_viewservicepage_portsection_startdevice_hyperlink.getText().trim()+"']")));
									
										Thread.sleep(5000);
									
									if(!isElementVisible(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='"+lbl_viewservicepage_portsection_startdevice_hyperlink.getText().trim()+"']"))){
										slf4jLogger.debug("Start Device is not displayed");
										throw new Error("Start Device is not displayed");
									}
									
									if(!isElementVisible(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//a[text()='"+lbl_viewservicepage_portsection_enddevice_hyperlink.getText().trim()+"']"))){
										slf4jLogger.debug("End Device is not displayed");
										throw new Error("End Device is not displayed");
									}
								}
									
									break;
																			
																			
			case "under Service Circuit Design tab we should be seeing the Google maps button & Member Service drop down should be displayed": waitForElement(ddl_viewservicepage_related_tab_Service_Circuit_Design_memberservice);
																					if(!tab_viewservicepage_related_tab_Service_Circuit_Design.isCurrentlyVisible()){
																						slf4jLogger.debug("Service Circuit Design Tab is not displayed");
																						throw new Error("Service Circuit Design Tab is not displayed");
																					}
																					
																					if(!btn_viewservicepage_related_tab_Service_Circuit_Design_googlemaps.isCurrentlyVisible()){
																						slf4jLogger.debug("Google maps button in Service Circuit Design Tab is not displayed");
																						throw new Error("Google maps button in Service Circuit Design Tab is not displayed");
																					}
																					
																				jsClick(ddl_viewservicepage_related_tab_Service_Circuit_Design_memberservice);break;	

			
			case "IPTV Unicast service should be displayed and disabled under IPTV Service Attributes Section in Edit Service page": 				
				
																				if(tbx_editservice_iptv_unicastlink.isCurrentlyEnabled()){
																					slf4jLogger.debug("IPTV Unicast service text field is enabled in IPTV Service Attributes Section in Edit Service page");
																					throw new Error("IPTV Unicast service text field is enabled in IPTV Service Attributes Section in Edit Service page");
																				} 
																				
																				break;
			case "IPTV Unicast service should be displayed under IPTV Service Attributes Section":
																				waitForElement(btn_edit_service_viewpage);
																				if(!lbl_service_viewpage_iptv_unicast.isCurrentlyVisible()){
																					 slf4jLogger.debug("IPTV Unicast service is not displayed under IPTV Service Attributes Section");
																						throw new Error("IPTV Unicast service is not displayed under IPTV Service Attributes Section");
																				}
																				
																				break;
			
			case "Refresh icon should be displayed for BAM Reports Related tab in Services":
																					
																						 if(!orderpage.btn_BAM_related_tab_getlogs.isCurrentlyVisible()){
																							 slf4jLogger.debug("Get logs button is missing in the Service page");
																								throw new Error("Get logs button is missing in the Service page");
																						 }
																				 break;

			
			case "Only for MEF EVC/MEF OVC service should display a new related tab as Service Circuit Design": waitForElement(btn_edit_service_viewpage); Thread.sleep(2000);
																				if(lbl_serviceview_generalsection_servicetype.isCurrentlyVisible()){
																				if(lbl_serviceview_generalsection_servicetype.getText().trim().equals("MEF OVC") ||lbl_serviceview_generalsection_servicetype.getText().trim().equals("MEF EVC")){
																					
																				if(!tab_servicecircuitdesign.isCurrentlyVisible())	{
																					slf4jLogger.debug("Service Circuit Design Related tab is missing for "+lbl_serviceview_generalsection_servicetype.getText().trim()+" Services");
																					throw new Error("Service Circuit Design Related tab is missing for "+lbl_serviceview_generalsection_servicetype.getText().trim()+" Services");
																				}
																					 
																				} else {
																					
																					if(tab_servicecircuitdesign.isCurrentlyVisible())	{
																						 slf4jLogger.debug("Service Circuit Design Related tab is displayed for "+lbl_serviceview_generalsection_servicetype.getText().trim()+" Services");
																							throw new Error("Service Circuit Design Related tab is displayed for "+lbl_serviceview_generalsection_servicetype.getText().trim()+" Services");
																					}
																					
																				}			
																				
																				} if(lbl_serviceview_generalsection_servicetype_old.isCurrentlyVisible()){
																					if(lbl_serviceview_generalsection_servicetype_old.getText().trim().equals("MEF OVC") ||lbl_serviceview_generalsection_servicetype_old.getText().trim().equals("MEF EVC")){
																						
																						if(!tab_servicecircuitdesign.isCurrentlyVisible())	{
																							slf4jLogger.debug("Service Circuit Design Related tab is missing for "+lbl_serviceview_generalsection_servicetype_old.getText().trim()+" Services");
																							throw new Error("Service Circuit Design Related tab is missing for "+lbl_serviceview_generalsection_servicetype_old.getText().trim()+" Services");
																						}
																							 
																						} else {
																							
																							if(tab_servicecircuitdesign.isCurrentlyVisible())	{
																								 slf4jLogger.debug("Service Circuit Design Related tab is displayed for "+lbl_serviceview_generalsection_servicetype_old.getText().trim()+" Services");
																									throw new Error("Service Circuit Design Related tab is displayed for "+lbl_serviceview_generalsection_servicetype_old.getText().trim()+" Services");
																							}
																				
																					
																				}
																			}																			
																				/*else {
																					
																						
																					 slf4jLogger.debug("Service page is not displayed please recheck");
																						throw new Error("Service page is not displayed please recheck");
																						
																				}*/															
																					
																					
																					break;
			
			case "Configuration column icon should be displayed for BAM Reports Related tab in Services":				
										if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
											 waitForElement(orderpage.btn_related_tab_excel_icon); 
											 if(!orderpage.btn_related_tab_configcol_icon.isCurrentlyVisible()){
												 slf4jLogger.debug("Configuration column icon is missing in the Service page");
													throw new Error("Configuration column icon is missing in the Service page");
											 }
										} else {
											 slf4jLogger.debug("Checkfor other data");
												throw new Error("Checkfor other data");
										} break;
			case "Task related to Order should":				
													waitForElement(btn_taskRT_viewicon);
													if(orderpage.btn_order_tab_search_view_page.isCurrentlyVisible()){
													Message=orderpage.btn_order_tab_search_view_page.getText().replaceAll("\\D+","").replaceAll("\\s","").trim();
													
													if(!isElementVisible(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
														slf4jLogger.debug("Task Order number is not matching With Order ID");
														throw new Error("TaskOrder number is not matching With Order ID");
														
													}}
													break;				
				
			case "Order details should be matching with the Order ID in Service page":
															waitForElement(btn_OrderRT_viewicon);
															
															Message=orderpage.btn_order_tab_search_view_page.getText().replaceAll("\\D+","").replaceAll("\\s","").trim();
															
															if(!isElementVisible(By.xpath("//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//div[text()='"+Message+"']"))){
																slf4jLogger.debug("Order number is not matching With Order ID");
																throw new Error("Order number is not matching With Order ID");
																
															}break;
				
			case "Device Name should match when compared to The Device name displayed in the ENNI Link Details tab under Service Association Section":
																		waitForElement(btn_devicesRT_editdevicesdetails);
																		
																		if(!lbl_vieworderpage_related_tab_active_device_name_hyperlink.getText().trim().equals(lbl_serviceview_serviceassociationsec_devicehyperlink.getText().trim())){
																			slf4jLogger.debug("Devices names are not matching in ENNI Link Services");
																			throw new Error("Devices names are not matching in ENNI Link Services");
																		}else {
																			slf4jLogger.info("Devices names are matching in ENNI Link Services");
																		}			
																		break;
			case "Success message should be displayed on update in Service page": waitForElement(lbl_service_alertmsg);
																			Message = lbl_service_alertmsg.getText();
																			Message = Message.toString().substring(1);		
																			Message = Message.trim().toLowerCase(); 
																			if(!Message.contains("service updated successfully.")){
																				slf4jLogger.error("Invalid message is displayed."+Message);
																				throw new Error("Invalid message is displayed."+Message);
																			}jsClick(btn_service_alertmsg_closeicon); break;					
														
			case "Cable/Strand id are displaying in facility details tab of HSI/IPTV/IPTV Unicast Services": 
				
															if(!lbl_service_viewpage_facility_negative_msg.isCurrentlyVisible()){
																waitForElement(btn_service_viewpage_facility_tab_edit_facility_details); 
																if(!lbl_service_viewpage_facility_tab_cableidheader.isCurrentlyVisible()){
																	slf4jLogger.debug("Cable ID Header is missing in the Facility details tab");
																	throw new Error("Cable ID Header is missing in the Facility details tab");
																}
																
																if(!lbl_service_viewpage_facility_tab_strandidheader.isCurrentlyVisible()){
																	slf4jLogger.debug("Strand ID Header is missing in the Facility details tab");
																	throw new Error("Strand ID Header is missing in the Facility details tab");
																}
															} else {
																slf4jLogger.debug("Check on the Other data");
																throw new Error("Check on the Other data");
															}
															
															break;
			case "Associated Service table is it getting displayed in Services related tab":
				
																	
																		validate_Associated_service_related_tab_validations();
																	
																	
																	break;
			case "Export to Excel icon, Refresh icon, Configure Column icon and Print icon are present & clickable in 360 view related tab in Services":
				
															
																Thread.sleep(3000);
															
															
															if(btn_RT_Supporticon_refresh.isCurrentlyVisible()){
																slf4jLogger.info("Refresh Icon is displayed in the Related Tab");
															}
															
															if(btn_RT_Supporticon_exportexcel.isCurrentlyVisible()){
																slf4jLogger.info("Export to Excel Icon is displayed in the Related Tab");
															}
															
															
															if(btn_RT_Supporticon_print.isCurrentlyVisible()){
																slf4jLogger.info("Print Icon is displayed in the Related Tab");
															}
															
															
														
															
															
															break;
			case "BAM event logs should be displayed": if(lbl_bamtable.isCurrentlyVisible()){
									slf4jLogger.info("BAM Table is present");
									
								}
								else { 
									slf4jLogger.info("BAM Table is not Present getting message as "+orderpage.lbl_alert_message_no_data_related_tabs.getText()); 
									
								}								
						break;
			case "PM Type does not contain any value in Service page": waitForElement(btn_edit_service_viewpage); 
																if(!lbl_Serviceview_pmtype.getText().contains("BRIX")){
																	throw new Error("PM Type is not getting updated in Service page");
																}break;
			case "remove the PM type on Service edit page": waitForElement(btn_save_service_viewpage); 
			
				
					Thread.sleep(2000);
				
				
				ddl_editservice_pmtype.selectByVisibleText("-Select-");break;
			
			

//			case "Activation log must be registered with Activation ID and circuit type in Service view related tab":
//																				//waitForElement(btn_service_RT_activation_refreshicon);jsClick(btn_service_RT_activation_refreshicon);
//																
//																	Thread.sleep(2000);
//																waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//th[text()='Activation ID']")));
//																				if(!isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='right-content']//th[text()='Activation ID']/../../following-sibling::tbody//td[3])[1]"))){
//																					slf4jLogger.error("Activations logs are not displayed");
//																					throw new Error("Activations logs are not displayed");
//																				}																	
//																		break;
																		
			case "Activation process initiated successfully. message should be displayed in the Service page":
												waitForElement(lbl_service_alertmsg);
												Message = lbl_service_alertmsg.getText();
												Message = Message.toString().substring(1);		
												Message = Message.trim(); 
												if(!Message.contains("Activation process initiated successfully.")){
													slf4jLogger.error("Invalid message is displayed."+Message);
													throw new Error("Invalid message is displayed."+Message);
												}jsClick(btn_service_alertmsg_closeicon); break;			
			
			
			case "check the Auto-Activate & click on Activate Button in Service screen":
									waitForElement(btn_save_service_viewpage);
									if(cbk_service_editpage_autoactvate.isCurrentlyVisible()){
										jsClick(cbk_service_editpage_autoactvate);
										Thread.sleep(1000);
									
							
								jsClick(btn_service_editpage_activate);
								waitForElement(lbl_service_alertmsg);
								
									
									}
									break;

			case "Update action type is registered under the Audit logs section in Servic page":if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row0jqxGrid')]/div[1]/div)[1]")).getText().trim().equals("UPDATE")){
																														throw new Error("UPDATE log is not registered in Audit Logs");
																												}
																										if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row0jqxGrid')]/div[3]/div)[1]")).getText().trim().equals("AB52523")){
																											throw new Error("UPDATE log is not registered for right user in Audit Logs");
																										} break;
				

			case "View action type is registered under the Audit logs section in Servic page": if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row0jqxGrid')]/div[1]/div)[1]")).getText().trim().equals("VIEW")){
																											throw new Error("View log is not registered in Audit Logs");
																									}
																							if(!getDriver().findElement(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[starts-with(@id,'contenttablejqxGrid')]/div[starts-with(@id,'row0jqxGrid')]/div[3]/div)[1]")).getText().trim().equals("AB52523")){
																								throw new Error("View log is not registered for right user in Audit Logs");
																							} break;
																							
			case "Max Upstream & Downstream values should be displayed in the HSI service view": 
													if(!lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_Downrate.isCurrentlyVisible()){
														throw new Error("Downstream Rate is not diplaed");
													}
													if(!lbl_service_viewpage_hsi_details_tab_HSI_Service_attribute_sec_provision_uprate.isCurrentlyVisible()){
														throw new Error("Upstream Rate is not diplaed");
													}break;
													
			case "Max Upstream & Downstream fields should display in TB, GB, MB, KB sub values in edit service view":
				slf4jLogger.info("Validationg the Max Upstream & Downstream fields should display in TB, GB, MB, KB sub values");
							waitForElement(ddl_service_editpage_downstreamrate);
							if(!ddl_service_editpage_downstreamrate.isCurrentlyVisible()){
								throw new Error("Downstream rate sub value is not visible in the Service edit page");
							}
							
							if(!ddl_service_editpage_upstreamrate.isCurrentlyVisible()){
								throw new Error("Upstream rate sub value is not visible in the Service edit page");
							}
							
							slf4jLogger.info("Checking the drop down values of Max Upstream & Downstream fields");
							ddl_service_editpage_downstreamrate.selectByVisibleText("-Select-");
							ddl_service_editpage_downstreamrate.selectByVisibleText("KB-Kilobyte");
							ddl_service_editpage_downstreamrate.selectByVisibleText("MB-Megabyte");
							ddl_service_editpage_downstreamrate.selectByVisibleText("GB-Gigabyte");
							ddl_service_editpage_downstreamrate.selectByVisibleText("TB-Terabyte");
							
							
							ddl_service_editpage_upstreamrate.selectByVisibleText("-Select-");
							ddl_service_editpage_upstreamrate.selectByVisibleText("KB-Kilobyte");
							ddl_service_editpage_upstreamrate.selectByVisibleText("MB-Megabyte");
							ddl_service_editpage_upstreamrate.selectByVisibleText("GB-Gigabyte");
							ddl_service_editpage_upstreamrate.selectByVisibleText("TB-Terabyte");
							
							/*ArrayList<String> streamchecklist = new ArrayList<String>();

							streamchecklist.add(0, "-Select-");
							streamchecklist.add(1, "KB-Kilobyte");
							streamchecklist.add(2, "MB-Megabyte");
							streamchecklist.add(3, "GB-Gigabyte");
							streamchecklist.add(4, "TB-Terabyte");
							
							
							Select se=new Select(ddl_service_editpage_downstreamrate);
							List<WebElement> option = se.getOptions();
							for(int i=0;i<option.size();i++){								
								if(!streamchecklist.get(i).equals(option.get(i).getText().trim())){
									throw new Error("DownStream rate Sub value "+streamchecklist.get(i)+" is not matching with "+option.get(i).getText().trim());
								}
							}
							
							
							se=new Select(ddl_service_editpage_upstreamrate);
							option = se.getOptions();
							for(int i=0;i<option.size();i++){
								if(!streamchecklist.get(i).equals(option.get(i).getText().trim())){
									throw new Error("UpStream rate Sub value "+streamchecklist.get(i)+" is not matching with "+option.get(i).getText().trim());
								}
							}*/
							
							break;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		
			
		}
		
		public void ServiceActionmethods(String action) throws Throwable {
		    switch(action){	    
							
		    case "Edit":waitForElement(btn_edit_service_viewpage);slf4jLogger.info("Going to click edit");
		    	jsClick(btn_edit_service_viewpage); waitForElement(btn_save_service_viewpage);break;
		    case "Save":waitForElement(btn_save_service_viewpage); jsClick(btn_save_service_viewpage);Thread.sleep(20000);waitForElement(lbl_service_alertmsg);break;
		    case "Delete":jsClick(btn_Servicepage_Delete); waitForAlert(getDriver());waitForAlert(getDriver());break;
		    case "Getlogs":jsClick(btn_serach_serviceview_Omnivue_Audit_log_tab_getlog); Thread.sleep(2000); break;

		    case "IPTV Unicast Link":jsClick(lbl_service_viewpage_iptv_unicast); Thread.sleep(2000); waitForElement(btn_edit_service_viewpage); break;

		    }
			
			
		}
		
		
		public void task_should_be_generated_and_displayed_in_related_tab_Tasks() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			waitForElement(lbl_taskid);
			
			slf4jLogger.info("Task id generated  = " + lbl_taskid.getText());	
			
			
		}
		
		public void waitForAlert(WebDriver driver) throws InterruptedException
		{
		   int i=0;
		   while(i++<5)
		   {
		        try
		        {
		            Alert alert = loginPage.getDriver().switchTo().alert();
		           	String msg=alert.getText();
		           	Thread.sleep(8000);
		           	alert.accept();
		           	slf4jLogger.info("Accepted popup");
					slf4jLogger.info(msg);
		            break;
		        }
		        catch(NoAlertPresentException e)
		        {
		          try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		          continue;
		        }
		   }
		}
		
		
		
		public Boolean waitForinvisibleElement(String text) {
			slf4jLogger.info("Loader Text="+text);
		    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
		    //wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		    Boolean element2 = wait.until(ExpectedConditions.invisibilityOfElementLocated((By.partialLinkText(text))));
		    
			
		    return element2;
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
		public void service_search_page_tab(String device_tab) throws Throwable {
			// loginPage.getDriver().findElement(By.xpath(".//tab-heading[contains(text(),'"+device_tab+"')]")));
			switch (device_tab) {
			
			case "Audit Log":
				jsClick(tab_service_viewpage_Audit_Log);
				waitForElement(tab_search_service_audit_log_arm_audit_log);
				break;
			case "MEF OVC Details":
				jsClick(tab_serviceview_ServiceDetails);
				waitForElement(btn_delete_service_viewpage);
				break;
			/*
			 * case "Transport Details": jsClick(tab_serach_device_Transport_details);
			 * break;
			 */

			}
		}
		public void associate_uni_to_mef_ovc(String arg1) throws InterruptedException, AWTException {
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
			
	       
	           Thread.sleep(3000);
	           jsClick(tab_ovcmembers);
	           
	           Thread.sleep(2000);  
	           jsClick(btn_addmember);
	           Thread.sleep(2000);
	           jsClick(img_magnifyingglass);
	           Thread.sleep(6000); 
	           tbx_member_name.clear();
	           
	           tbx_member_name.sendKeys(arg1); 
	       
			   jsClick(btn_addmember_lookup);
			   
			   
	           Thread.sleep(2000);
	           waitForElement(lnk_addmember);
	           jsClick(lnk_addmember);
	          
	          
	           
	           Thread.sleep(10000);
	         
	           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@ng-show='mef_evc_loader']")));
	           ddl_addmember_NCI.selectByIndex(3);
	           Thread.sleep(5000);
	           jsClick(btn_savemember);
	           Thread.sleep(5000);
	           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@ng-show='mef_evc_loader']")));
	         
	           
	           System.out.println(lbl_add_members_msg.getText());
			
			
			
		}
		
		public void service_page_validation(String arg1) throws SQLException {
			ArrayList<String> str_service_attributes = new ArrayList<String>();
			ArrayList<String> EVC_NCI_dropDown_values = new ArrayList<String>();
			// ArrayList<String> str_service_attributest_db=new ArrayList<String>();
			List<String> str_service_attributes_db = null;
			List<String> List_EVC_NCI_dropDown_values = null;

			String str_service_name;
			// String[] str_serive_attributes;
			switch (arg1) {
			case "Service details and validate database":

				//str_service_attributes.add(lbl_serviceview_mco.getText().trim());

				// jsClick(tab_service360view);
				
				
				if (lbl_serviceview_name_ethernet.isCurrentlyEnabled()) {
					waitForElement(lbl_serviceview_name_ethernet);
					str_service_name = lbl_serviceview_name_ethernet.getText().trim();
					//lbl_serviceview_mco.getText().trim();
					str_service_attributes.add(str_service_name);
					str_service_attributes.add(lbl_serviceview_alias1.getText().trim());
					str_service_attributes.add(lbl_serviceview_alias2.getText().trim());
					str_service_attributes.add(lbl_serviceview_mco.getText().trim());
					str_service_attributes.add(lbl_pmtype.getText().trim());
					System.out.println(str_service_name);
				}
				else
				{
					waitForElement(lbl_serviceview_name_gpon);
					str_service_name = lbl_serviceview_name_ethernet.getText().trim();
					//lbl_serviceview_mco.getText().trim();
					str_service_attributes.add(str_service_name);
					str_service_attributes.add(lbl_serviceview_alias1_gpon.getText().trim());
					str_service_attributes.add(lbl_serviceview_alias2_gpon.getText().trim());
				
				}

				str_service_attributes_db = armdb.service_details_attributes_values(str_service_name);
				
				
				
				// System.out.println(deivce_details_db_attributes);
				// Thread.sleep(3000);
				for (int p = 0; p <= str_service_attributes.size() - 1; p++) {
					for (int q = 0; q <= str_service_attributes_db.size() - 1; q++) {
						if (str_service_attributes.get(p).equalsIgnoreCase(str_service_attributes_db.get(q))) {
							slf4jLogger.info(str_service_attributes.get(p) + " value is avaliable in Database");
							
						}
					}
				}
				break;
			case "NCI":

				 	waitForElement(ddl_addmember_NCI);
					 
				 
					 
				 	EVC_NCI_dropDown_values.add("02VLN.VB");
				 	EVC_NCI_dropDown_values.add("02VLN.VST");
				 	EVC_NCI_dropDown_values.add("02VLN.VP");
				 	EVC_NCI_dropDown_values.add("02VLN.AL3");
				 	EVC_NCI_dropDown_values.add("02VLN.A2P");
				 	EVC_NCI_dropDown_values.add("02VLN.VB3");
				 	EVC_NCI_dropDown_values.add("02VLN.UNT");
				 	EVC_NCI_dropDown_values.add("02VLN.UL3");
				 	EVC_NCI_dropDown_values.add("02VLN.V");
				 	EVC_NCI_dropDown_values.add("02VLN.VL3");
				 	EVC_NCI_dropDown_values.add("02VLN.VBP");
				 	EVC_NCI_dropDown_values.add("02VLN.VBT");
				 	EVC_NCI_dropDown_values.add("02VLN.A2");

				 	List_EVC_NCI_dropDown_values = armdb.Validate_EVC_NCI_dropDown_values_in_addMember_section();
				
				
				
				// System.out.println(deivce_details_db_attributes);
				// Thread.sleep(3000);
				for (int p = 0; p <= EVC_NCI_dropDown_values.size() - 1; p++) {
					for (int q = 0; q <= List_EVC_NCI_dropDown_values.size() - 1; q++) {
						if (EVC_NCI_dropDown_values.get(p).equalsIgnoreCase(List_EVC_NCI_dropDown_values.get(q))) {
							slf4jLogger.info(EVC_NCI_dropDown_values.get(p) + "--"+ List_EVC_NCI_dropDown_values.get(q)+" value is avaliable in Database");
						}
						}
				}
				break;
			case "Create action log details and validate database":
				String action="Create";
				service_audit_log_validations(action);			
			break;
			case "Update action log details and validate database":
				String argu01="Update";
				service_audit_log_validations(argu01);			
			break;
			
			case "Add Member action log details and validate database":
				String argu03="Add Member";
				service_audit_log_validations(argu03);
				break;
			
			

			}

		}
		public void verify_slatemplate() throws InterruptedException {
			String str_slaname,target_value;
			WebDriverWait wait = new WebDriverWait(loginPage.getDriver(),500);	
			List<String> str_sla_attributes_db;
			jsClick(tab_Performance);
			wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@ng-show='related_circuit_loader']"))));
			//waitForElement(lbl_slatemplate);
			Thread.sleep(1000);
			jsClick(lbl_slatemplate);
			//lbl_slatemplate.click();
			Thread.sleep(1000);
			str_slaname=lbl_slatemplate_name.getText();
			System.out.println(str_slaname);
			 target_value=lbl_slatemplate_targetvalue.getText();
			 System.out.println(target_value);
			 str_sla_attributes_db = armdb.sla_validation(str_slaname);
			 if(target_value.equalsIgnoreCase(str_sla_attributes_db.get(0))){
					slf4jLogger.info(" SLA Template  value is avaliable in Database");
					
				}
			 jsClick(btn_slatemplate_close);
		}
		
		public void verify_slatemplate_name() throws InterruptedException {
			String str_slaname;
			Thread.sleep(9000);
			jsClick(SLA_template);
			//lbl_slatemplate.click();
			Thread.sleep(10000);
			
			str_slaname=slatemplate_name.getText();
			System.out.println(str_slaname);
			
		}
		
	
			public void verifing_slatemplate() throws InterruptedException {
						String str_slaname,str_customerid,str_slatargettype,str_CosLeveltype,str_QOS,str_slaname02,str_customerid02,str_slatargettype02,str_CosLeveltype02,str_QOS02;
						
						jsClick(lbl_slatemplate);
						//lbl_slatemplate.click();
						Thread.sleep(9000);
						str_slaname02=lbl_slatemplate_name.getText();
						System.out.println(str_slaname02);
						str_customerid02=lbl_customer_id_target.getText();
						System.out.println(str_customerid02);
						str_slatargettype02=lbl_slatarget_type_target.getText();
						System.out.println(str_slatargettype02);
						str_CosLeveltype02=lbl_CosLevel_type_target.getText();
						System.out.println(str_CosLeveltype02);
						str_QOS02=lbl_QOS_QUALIFIER_target.getText();
						System.out.println(str_QOS02);
						jsClick(btn_slatemplate_close);
						
						Thread.sleep(3000);
						jsClick(SLA_template);
						//lbl_slatemplate.click();
						Thread.sleep(10000);
						
						str_slaname=slatemplate_name.getText();
						System.out.println(str_slaname);
						str_customerid=lbl_customer_id.getText();
						System.out.println(str_customerid);
						str_slatargettype=lbl_slatarget_type.getText();
						System.out.println(str_slatargettype);
						str_CosLeveltype=lbl_CosLevel_type.getText();
						System.out.println(str_CosLeveltype);
						str_QOS=lbl_QOS_QUALIFIER.getText();
						System.out.println(str_QOS);
						
						
						//String value=btn_SLAtemplate_full.getText();
						//System.out.println("Full Value");
						//System.out.println(value);
						
						jsClick(btn_SLAtemplate_close);
						
						
						if (str_slaname.equalsIgnoreCase(str_slaname02) & str_customerid.equalsIgnoreCase(str_customerid02) & str_slatargettype.equalsIgnoreCase(str_slatargettype02) & str_CosLeveltype.equalsIgnoreCase(str_CosLeveltype02) & str_QOS.equalsIgnoreCase(str_QOS02))
						{
							System.out.println("SLA Templete value from Performance tab and Target tab is same");
						}
						else
						{
							System.out.println("SLA Templete value from Performance tab and Target tab is Not same");
							 System.out.println(str_slaname);
							 System.out.println(str_customerid);
							 System.out.println(str_slatargettype);
							 System.out.println(str_CosLeveltype);
							 System.out.println(str_QOS);
							 System.out.println("Target tag value");
							 System.out.println(str_slaname02);
							 System.out.println(str_customerid02);
							 System.out.println(str_slatargettype02);
							 System.out.println(str_CosLeveltype02);
							 System.out.println(str_QOS02);
						}		
					}
					 
			 

			
		@SuppressWarnings("unused")
		public void service_audit_log_validations(String action) throws SQLException {
			ArrayList<String> str_service_attributes = new ArrayList<String>();
			// ArrayList<String> str_service_attributest_db=new ArrayList<String>();
			List<String> str_service_attributes_db;

			String str_service_name;
			
			waitForElement(getDriver().findElement(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//span[text()='Action Type']")));
			
			if(isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='"+action+"'])[1]"))){
				slf4jLogger.info(action+" logs is  captured under the Audit logs section in Service page");
				//throw new Error("CREATE logs is not captured under the Audit logs section in Device page");
			} else if (isElementVisible(By.xpath("(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='"+action+"'])[1]"))){
				slf4jLogger.info(action+" logs is  captured under the Audit logs section in Service page");
				
			}else {
				slf4jLogger.info(action+" logs is not captured under the Audit logs section in Service page");
				throw new Error(action+" logs is not captured under the Audit logs section in Service page");
			}

			
			jsClick(tab_serviceview_ServiceDetails);
			waitForElement(btn_Servicepage_Edit);
			if (lbl_serviceview_name_ethernet.isCurrentlyEnabled()) {
				str_service_name = lbl_serviceview_name_ethernet.getText().trim();
			}
			else
			{
			str_service_name = lbl_serviceview_name_gpon.getText().trim();
			}
			
			
			 str_service_attributes_db = OmnivueDB.audit_logs_focus("AB67493");
			/*System.out.println(deivce_details_db_attributes);
			Thread.sleep(3000);
			System.out.println(arg1);
			System.out.println(deivce_details_db_attributes.get(0));*/
			for (String act : str_service_attributes_db) {
						
					
			if(action.equalsIgnoreCase(act)){
				slf4jLogger.info(action+" Action Type  value is avaliable in Database "+ act);
				//System.out.println(arg1+" Action Type  value is avaliable in Database");
			
			}
			
					}
		}
		public void validate_service_field_values(String ServiceType) throws Throwable{
			Thread.sleep(3000);
			String servicename;
			ArrayList<String> OV_Serviceattributes = new ArrayList<String>();
			List<String> DB_Serviceattributes = new ArrayList<String>();
			switch(ServiceType){		
			case "HSI": 
				waitForElement(lbl_serviceview_generalsection_servicename);
				servicename = lbl_serviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_serviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_serviceview_generalsection_Alias2.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2(servicename);
				break;
			case "IPTV":
				waitForElement(lbl_serviceview_generalsection_servicename);
				servicename = lbl_serviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_serviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_serviceview_generalsection_Alias2.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2(servicename);
				break;
			case "IPTV Unicast":
				waitForElement(lbl_serviceview_generalsection_servicename);
				servicename = lbl_serviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_serviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_serviceview_generalsection_Alias2.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2(servicename);
				break;
			case "DSL OVC":
				waitForElement(lbl_DSLOVCserviceview_generalsection_servicename);
				servicename = lbl_DSLOVCserviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_DSLOVCserviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_DSLOVCserviceview_generalsection_Alias2.getText());
				OV_Serviceattributes.add(lbl_DSLOVCserviceview_generalsection_Note.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2_Note(servicename);
				break;
				
			case "MEF ENNI":
				waitForElement(lbl_MEF_ENNIserviceview_generalsection_servicename);
				servicename = lbl_MEF_ENNIserviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_MEF_ENNIserviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_MEF_ENNIserviceview_generalsection_Alias2.getText());
				OV_Serviceattributes.add(lbl_MEF_ENNIserviceview_generalsection_Note.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2_Note(servicename);
				break;
				
			case "MEF UNI":
				waitForElement(lbl_MEF_ENNIserviceview_generalsection_servicename);
				servicename = lbl_MEF_ENNIserviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_MEF_UNIserviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_MEF_UNIserviceview_generalsection_Alias2.getText());
				OV_Serviceattributes.add(lbl_MEF_UNIserviceview_generalsection_Note.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2_Note(servicename);
				break;
				
			case "Probe UNI":
				waitForElement(lbl_hostserviceview_generalsection_servicename);
				servicename = lbl_hostserviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_Hostserviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_Hostserviceview_generalsection_Alias2.getText());
				OV_Serviceattributes.add(lbl_Hostserviceview_generalsection_Note.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2_Note(servicename);
				ProbeUniServiceAttributes();
				break;
				
			case "MEF EVC":
				waitForElement(lbl_MEF_EVCserviceview_generalsection_servicename);
				servicename = lbl_MEF_EVCserviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_MEF_EVCserviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_MEF_EVCserviceview_generalsection_Alias2.getText());
				OV_Serviceattributes.add(lbl_MEF_EVCserviceview_generalsection_Note.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2_Note(servicename);
				break;
				
				
			case "Host Service":
				waitForElement(lbl_hostserviceview_generalsection_servicename);
				servicename = lbl_hostserviceview_generalsection_servicename.getText();
				OV_Serviceattributes.add(lbl_Hostserviceview_generalsection_Alias1.getText());
				OV_Serviceattributes.add(lbl_Hostserviceview_generalsection_Alias2.getText());
				OV_Serviceattributes.add(lbl_Hostserviceview_generalsection_Note.getText());
				DB_Serviceattributes = armdb.Validate_service_Alias1_Alias2_Note(servicename);
				break;
			}
			System.out.println("OV_Serviceattributes = " +OV_Serviceattributes);
			if(OV_Serviceattributes.containsAll(DB_Serviceattributes)){
				System.out.println("OV Service attributes are avaliable in Database");
			}else throw new Error("OV Service attributes are not avaliable in Database");
			
			System.out.println("DB_Serviceattributes = " +DB_Serviceattributes);
			if(DB_Serviceattributes.containsAll(OV_Serviceattributes)){
				System.out.println("Database Service attributes are avaliable in OV");
			}else throw new Error("Database Service attributes are NOT avaliable in OV");
		}
		public void verify_service_tab_displayed() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(getDriver(),30);
			jsClick(tab_services);
			
			wait.until(ExpectedConditions.visibilityOf(btn_service_viewpage_associations_tab_edit_associate));
			//Thread.sleep(1000);
			if(btn_service_viewpage_associations_tab_edit_associate.isCurrentlyVisible()) {
				slf4jLogger.info("Service related tab is displayed in HSI service 360 view page and Edit Assocication button is visible");
				
			}else {
				slf4jLogger.error("Service related tab is not displayed in HSI service 360 view page and Edit Assocication button is visible");
			}
			
		}
		
		@SuppressWarnings("unused")
		public void verify_service_related_tab(String tab) throws Throwable {
			 
			  ArrayList<String> circuit_Fieldattributelist=new ArrayList<String>();
				WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), 15);
				
				//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='circuit_specific_loader']")));
				waitForElement(tab_service_name);
				Thread.sleep(6000);
				String service_name = tab_service_name.getText();
				String subscriber_name;
						if(lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribername.isPresent())
						{
							subscriber_name=lbl_service_viewpage_hsi_details_tab_Subscriber_sec_Subscribername.getText();
							 
						}
						else
						{
							subscriber_name=lbl_service_viewpage_HOST_details_tab_Subscriber_sec_Subscribername.getText();
							}
				
				System.out.println(service_name);
				switch(tab){
				//case "Service Circuit Design":jsClick(tab_services_circuitdesign);Thread.sleep(5000); break; 
				/*case "Services": jsClick(tab_services);Thread.sleep(5000);
							if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
									Thread.sleep(3000);
									//waitForElement(orderpage.btn_related_tab_refresh_icon);
									jsClick(btn_Service_refresh);
									wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//*[@id='ajax_loader' and @ng-show='contact_service_loader']")));
									Thread.sleep(3000); 
									List<WebElement> OV_Services_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[@id='right-content']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
									 List<String> DB_Services_list = armdb.circuit_RT_Servicesvalidation(circuitname.trim());
									 System.out.println("No of Services in Database: "+DB_Services_list.size());
									 System.out.println("No of Services in OV: "+OV_Services_list.size());
							   if(DB_Services_list.size()==OV_Services_list.size()){
									 for(int i=0; i<=OV_Services_list.size()-1; i++){
										 //System.out.println(OV_Bamevents_list.get(i).getText());
										 for(int j=0; j<=OV_Services_list.size()-1; j++){
											if(OV_Services_list.get(i).getText().trim().contains(DB_Services_list.get(j).trim())){
												System.out.println(OV_Services_list.get(i).getText()+" Service is avaliable in database");
											}
										 }
									 }	
								}
								} else {
								//	orderpage.failure_icon_validation();
									System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
								}
								break;
				
				
				case "Orders": jsClick(tab_orders); Thread.sleep(5000);
									if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
										// waitForElement(orderpage.btn_related_tab_excel_icon); 
										
									} else {
										//orderpage.failure_icon_validation();
									} break;		*/
									
				case "Devices":  jsClick(tab_Devices); Thread.sleep(5000);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='related_device_loader']")));
									if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
										Thread.sleep(3000);
										jsClick(tab_device_one);
										String device1=tab_device_one.getText().trim();
										Thread.sleep(4000);
										jsClick(tab_device_two);
										Thread.sleep(4000);
										waitForElement(tab_device_two);
										String device2=tab_device_two.getText().trim();
										//List<String> OV_device_list = null; 
										//List<String> OV_DB_device_list = null; 
										circuit_Fieldattributelist.add(device1);
										circuit_Fieldattributelist.add(device2);
										 List<String> OV_DB_device_list = ARMDB.service_RT_devicevalidation(service_name.trim());
										 System.out.println("No of Devices in Database: "+OV_DB_device_list.size());
										 System.out.println("No of Devices in OV: "+circuit_Fieldattributelist.size());
								   if(OV_DB_device_list.size()==circuit_Fieldattributelist.size()){
										 for(int i=0; i<=circuit_Fieldattributelist.size()-1; i++){
											 //System.out.println(OV_Bamevents_list.get(i).getText());
											 for(int j=0; j<=circuit_Fieldattributelist.size()-1; j++){
												if(circuit_Fieldattributelist.get(i).trim().contains(OV_DB_device_list.get(j).trim())){
													System.out.println(circuit_Fieldattributelist.get(i)+" Device is avaliable in database");
												}
											 }
										 }	
								   }else{
										throw new Error("Devices not matched ");
									 }
										
										 //waitForElement(orderpage.btn_related_tab_excel_icon); 
									} break;
								
				case "BAM Report": jsClick(tab_bamreport); Thread.sleep(5000);
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='bamLoader']")));	  					
				  					System.out.println("Loader Diappered");   
				  					//String devicename = lbl_deviceName.getText();
									if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
										 waitForElement(orderpage.btn_related_tab_excel_icon); 
										 List<WebElement> OV_Bamevents_list = loginPage.getDriver().findElements(By.xpath("//div[contains(@id,'contenttablebamGrid')]/div[@role='row']/div[2]/div"));
										 List<String> DB_Bamevents_list = OSRDB.device_bam_reportvalidation(service_name.trim());
										 System.out.println("No of Bam reports ID in OV: "+OV_Bamevents_list.size());
										 System.out.println("No of Bam reports ID in Database: "+DB_Bamevents_list.size());
										 if(DB_Bamevents_list.size()==OV_Bamevents_list.size()){
										 for(int i=0; i<=OV_Bamevents_list.size()-1; i++){
											 //System.out.println(OV_Bamevents_list.get(i).getText());
											 for(int j=0; j<=OV_Bamevents_list.size()-1; j++){
												if(OV_Bamevents_list.get(i).getText().contains(DB_Bamevents_list.get(j))){
													System.out.println(OV_Bamevents_list.get(i).getText()+" BAM Event Row Id is avaliable in database");
												}
											 }
										 }	
										 }else{
											 throw new Error("OV BAM Events are not equal to Database BAM Events");
										 }
									} else {
									//	orderpage.failure_icon_validation();
										System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
									} break;
									
				case "Performance Monitoring":jsClick(tab_Performance); Thread.sleep(3000); 
				if(!orderpage.lbl_alert_message_no_data_Performance_related_tabs.isCurrentlyVisible()){
					waitForElement(orderpage.btn_related_tab_refresh_icon);
					System.out.println(orderpage.lbl_alert_message_no_data_Performance_related_tabs.getText());
				} 
					//orderpage.failure_icon_validation();
				 break;		
									
				case "Tasks": jsClick(tab_Tasks); Thread.sleep(2000); 
				
				 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='task_loader']")));

						  System.out.print("Loader Disappered");   
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									waitForElement(lbl_taskresulttable);
								} else {
								//	orderpage.failure_icon_validation();
								} break;
								
				case "Locations": jsClick(tab_Locations); Thread.sleep(3000);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//*[@id='ajax_loader' and @ng-show='location_loader']")));
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
										Thread.sleep(3000);
										String list = lbl_relatedtab_count.getText();
							            String count[] = list.split(" of ");
							            int OV_Count =Integer.parseInt(count[1]);
										//waitForElement(orderpage.btn_related_tab_refresh_icon);	
										 List<WebElement> OV_Location_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[3]/div"));
										 //List<String> DB_Location_list = armdb.Sevice_RT_locationvalidation(subscriber_name.trim());
										 int DB_Location_count = ARMDB.Sevice_RT_locationvalidation(subscriber_name.trim());
										 System.out.println("No of Locations in OV: "+OV_Count);
				                          System.out.println("No of Locations in Database: "+DB_Location_count);
				               if(DB_Location_count ==OV_Count){
				                      System.out.println("OV and Database Locations count is same");
				                      /*for(int i=0; i<=DB_Location_list.size()-1; i++){                  
				                                        if(OV_Location_list.get(0).getText().trim().contains(DB_Location_list.get(i).trim())){
				                                               System.out.println(OV_Location_list.get(i).getText()+" Location is avaliable in database");
				                                              break;
				                                        }
				                                 }
										}else{
										throw new Error("OV Locations are not equal to Database location");
											 }*/
									}else{
									//	orderpage.failure_icon_validation();
										System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
									}
								}
									break;
											
				case "Circuits":jsClick(tab_Circuits);Thread.sleep(3000);						
									if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
										Thread.sleep(3000);
										
										
										wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='related_circuit_loader']")));
										//waitForElement(orderpage.btn_related_tab_refresh_icon);	
										 List<WebElement> OV_Circuits_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablejqxGrid')]/div/div[2]/div"));
										 List<String> DB_Circuits_list = ARMDB.service_RT_Circuitvalidation(service_name.trim());
										 System.out.println("No of Circuits in OV: "+OV_Circuits_list.size());
										 System.out.println("No of Circuits in Database: "+DB_Circuits_list.size());
										
								   if(DB_Circuits_list.size()==OV_Circuits_list.size()){
									   
									   
									   System.out.println("circuit count matched");
										 /*for(int i=0; i<=OV_Circuits_list.size()-1; i++){
											 //System.out.println(OV_Bamevents_list.get(i).getText());
											 for(int j=0; j<=OV_Circuits_list.size()-1; j++){
												if(OV_Circuits_list.get(i).getText().trim().contains(DB_Circuits_list.get(j).trim())){
													System.out.println(OV_Circuits_list.get(i).getText()+" Circuit is avaliable in database");
												}
											 }
										 }*/	
									}else{
									throw new Error("OV Circuits are not equal to Database Circuits");
										 }
									} else {
									//	orderpage.failure_icon_validation();
										System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
									}
									break;
			/*								
				case "Circuit Details":jsClick(tab_Circuit);Thread.sleep(3000);
								if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
									waitForElement(orderpage.btn_related_tab_refresh_icon);
								}break;
				*/
				case "Subscribers": jsClick(tab_Subscriber);   
				Thread.sleep(5000);
				
				
				if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){	
					Thread.sleep(9000);
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='tab-pane ng-scope active']//div[@id='ajax_loader' and @ng-show='subscriber_loader']")));
					//waitForElement(orderpage.btn_related_tab_refresh_icon);	
					 List<WebElement> OV_subscriber_list = loginPage.getDriver().findElements(By.xpath("//div[@class='tab-pane ng-scope active']//div[contains(@id,'contenttablegenericSubscriberGrid')]/div/div[2]/div"));
					 List<String> DB_subscriber_list = ARMDB.Service_RT_subscribervalidation(service_name.trim());
					 System.out.println("No of Subscribers in Database: "+DB_subscriber_list.size());
					 System.out.println("No of Subscribers in OV: "+OV_subscriber_list.size());
			   if(DB_subscriber_list.size()==OV_subscriber_list.size()){
					 for(int i=0; i<=OV_subscriber_list.size()-1; i++){
						 //System.out.println(OV_Bamevents_list.get(i).getText());
						 for(int j=0; j<=OV_subscriber_list.size()-1; j++){
							if(OV_subscriber_list.get(i).getText().trim().contains(DB_subscriber_list.get(j).trim())){
								System.out.println(OV_subscriber_list.get(i).getText()+" Circuit is avaliable in database");
							}
						 }
					 }	
				}else{
				throw new Error("Subscribers details not matched ");
					 }
				} else {
				//	orderpage.failure_icon_validation();
					System.out.println("Getting Error message like "+orderpage.lbl_alert_message_no_data_related_tabs.getText());
				}
					break;
				
				
				
				 
				
				case "Service Areas": jsClick(tab_Service_Areas); Thread.sleep(3000);
									if(!orderpage.lbl_alert_message_no_data_related_tabs.isCurrentlyVisible()){
										waitForElement(orderpage.btn_related_tab_excel_icon); 
									} else {
										System.out.println("Message displayed"+orderpage.lbl_alert_message_no_data_related_tabs.getText());
										//orderpage.failure_icon_validation();
									} break;
				
				
				case "Topology View":jsClick(tab_Topologyview);break;
				//slf4jLogger.info("Selected "+tab+" in 360 view");
								
			}
		  
		 } 
		
		public void doubleClickOn (String element) throws InterruptedException{
	  
	  		if (!tbx_CEVLAN_name_ON_relative_tab_services.isCurrentlyEnabled()) {
	  			 waitForElementclickable(tbx_CEVLAN_name_ON_relative_tab_services);
	  			 
			} 
	  		//Act.moveToElement(tbx_CEVLAN_name_ON_relative_tab_services).perform();
	  		System.out.println("CEVLAN_name"+tbx_CEVLAN_name_ON_relative_tab_services.getText());
	  		
	  		//jsClick(tbx_CEVLAN_name_ON_relative_tab_services);
	  		jsClick(tbx_CEVLAN_name_ON_relative_tab_services);
	  		tbx_CEVLAN_name_ON_relative_tab_services.click();
	  		System.out.println("clicked once");
	  		Thread.sleep(1000);
	  		tbx_CEVLAN_name_ON_relative_tab_services.click();
	  		System.out.println("clicked 2nd time");
	  		// Act.doubleClick(tbx_CEVLAN_name_ON_relative_tab_services).build().perform();
		  		Thread.sleep(3000);
  
			 
	    	}
		public void verify_associations_tab_displayed() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(getDriver(),30);
			jsClick(tab_services);
			
			wait.until(ExpectedConditions.visibilityOf(btn_service_viewpage_associations_tab_edit_associate));
			//Thread.sleep(1000);
			if(tab_service_viewpage_Associations.isCurrentlyVisible()) {
				slf4jLogger.error("Association supporting  tab is displayed in  IPTV Unicast service 360 view page");
				
			}else {
				slf4jLogger.info("Association supporting  tab is not displayed in  IPTV Unicast service 360 view page");
			}
			jsClick(servicecreatepage.tab_service360view);				
			waitForElement(btn_Servicepage_Delete);
			
		}
		
		 public void fill_ALIAS1_ALIAS2_GPON_service(String alias1, String alias2)
			{
				
			 tbx_service_ALIAS1.sendKeys(alias1);
			 
			 tbx_service_ALIAS2.sendKeys(alias2);
				
			}
		
}
