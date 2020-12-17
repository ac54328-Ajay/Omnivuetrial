package com.ctl.it.qa.omnivue.tools.pages;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVfillmandatoryfields extends OmniVuePage {
	
	//private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//#########################  Logical port create form  fields  ##############################//
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='createLogicalPort();']")
	public WebElementFacade btn_logicalportcreate_create;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='logicalPortName']")
	public WebElementFacade tbx_logicalportcreate_name;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='alias1']")
	public WebElementFacade tbx_logicalportcreate_alias1;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@id='alias2']")
	public WebElementFacade tbx_logicalportcreate_alias2;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openCircuitRelatedDeviceLookUp(field.name)']")
	public WebElementFacade btn_logicalportcreate_devicelookup;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//input[@ng-model='invServiceDevLookUp.deviceClli']")
	public WebElementFacade tbx_logicalportcreate_devicelookup_deviceclli;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='lookUpDeviceDetails()']")
	public WebElementFacade btn_logicalportcreate_devicelookup_lookupicon;
	
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@title='previous']/div")
	public WebElementFacade btn_logicalportcreate_devicelookup_previous;
	
	@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//a[contains(@ng-click,'lookupGridSettings.selLukupValue(')])[1]")
			public WebElementFacade lbl_logicalportcreate_devicelookup_result;
			
	@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//span[@ng-click='openPhysicalPortLookUp(field.name)']")
			public WebElementFacade btn_logicalportcreate_deviceport;
			
			@FindBy(xpath=".//div[@class='tab-pane ng-scope active']//button[@ng-click='servicePhysicalPortlookUp()']")
			public WebElementFacade btn_logicalportcreate_deviceport_lookupicon;
			
			@FindBy(xpath="(.//div[@class='tab-pane ng-scope active']//a[@ng-click='closePhysicalPortDataLookUp(port)'])[1]")
					public WebElementFacade lbl_logicalportcreate_deviceport_result;
	
	//#########################  DSL OVC CTag  fields  ##############################//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield2;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield3;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield4;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[1]/input[@type='text' and @ng-model='poolRange.start']")
	public WebElementFacade tbx_ctagtxtfield5;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//label[2]/input[@type='text' and @ng-model='poolRange.end']")
	public WebElementFacade tbx_ctagtxtfield6;
			
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@id='start_0']")
	public WebElementFacade tbx_ctageditfield1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='right-content']//div[@class='tab-pane ng-scope active']//input[@id='end_0']")
	public WebElementFacade tbx_ctageditfield2;
	
	//#########################  Topology Create form  ##############################//
	
	@FindBy(xpath=".//*[@id='FULLNAME']")
	public WebElementFacade tbx_fullName;
	
	@FindBy(id="NETWORK_ROLE")
	public WebElementFacade ddl_topologyRole;
	
	@FindBy(id="NETWORK_TECHNOLOGY")
	public WebElementFacade ddl_topologyTechType;
	
	@FindBy(xpath=".//*[@id='NOTES']")
	public WebElementFacade tbx_topologyNote;
	

	
	//#########################  Device Create form  ##############################//
	
	@FindBy(id="CLLI")
	public WebElementFacade tbx_DeviceCLLI;
	
	@FindBy(id="DEVICE_DESIGNATOR")
	public WebElementFacade tbx_Devicedesignator;
	
	@FindBy(xpath=".//*[@id='RELAYRACKID']")
	public WebElementFacade tbx_relayID;
	
	@FindBy(xpath=".//*[@id='AerialOrBuried']")
	public WebElementFacade ddl_Aerialrburied;
	
	@FindBy(id="isDiversed")
	public WebElementFacade ddl_IsDiversed;	

	@FindBy(xpath=".//select[@id='IS_DIVERSE']")
	public WebElementFacade ddl_IsDiversedForEthernet;
	
	@FindBy(id="AFFILIATE_OWNER")
	public WebElementFacade ddl_affiliate_owner;
	
	@FindBy(id="AerialOrBuried")
	public WebElementFacade ddl_AerialOrBuried;
	
	@FindBy(id="INDOOR")
	public WebElementFacade ddl_Indooroutdoor;
	
	@FindBy(id="RONTAID")
	public WebElementFacade tbx_rid;
	
	@FindBy(id="InstallationIndicator")
	public WebElementFacade ddl_InstallationIndicator;
	
	@FindBy(id="FiberProvisioning")
	public WebElementFacade ddl_FiberProvisioning;
	
	@FindBy(id="NOSACertification")
	public WebElementFacade ddl_nosacer;
	
	@FindBy(id="1GbpsIndicator")
	public WebElementFacade ddl_gbpsind;
	
	@FindBy(id="ConnectorType")
	public WebElementFacade ddl_connectortype;
	
	@FindBy(id = "AFFILIATE_OWNER")
	public WebElementFacade ddl_Affiliate_Owner;
	
	@FindBy(xpath = ".//div[@class='tab-pane ng-scope active']//label[contains(text(),'Functional Status')]/../../following-sibling::span//select")
	public WebElementFacade ddl_functionalstatus;
	
	@FindBy(id = "MGMT_IP_SUBNET_MASK")
	public WebElementFacade tbx_mng_IP_subset_mask ;
		
	@FindBy(id = "MGMT_IP_DEFAULT_GATEWAY")
	public WebElementFacade tbx_mng_IP_default_gateway ;
	
	
	
	
	//-------------		Subscriber Look Up ------------//
	
	@FindBy(xpath="//*[@ng-model='invSubscriber.subscriberName']")
	public WebElementFacade tbx_Createdevice_subscribername;
	
	//#########################  Contact Create form  ##############################//
	
	@FindBy(id="firstName")
	public WebElementFacade tbx_firstname;
	
	@FindBy(id="lastName")
	public WebElementFacade tbx_lastname;
	
	
	@FindBy(id="contactCategory")
	public WebElementFacade ddl_contactcategory;	
	
	@FindBy(id="timeZone")
	public WebElementFacade ddl_timezone;
	
	@FindBy(id="contactType")
	public WebElementFacade ddl_contacttype;
	
	@FindBy(id="ContactPreference")
	public WebElementFacade ddl_contactpreference;
	
	//@FindBy(xpath=".//*[@id='ContactRole' and @name='ContactRole']/..[contains(text(),'ACCOUNT')]/input")
	@FindBy(xpath="(.//input[@id='ContactRole'])[1]")
	public WebElementFacade cbx_account;
	
	@FindBy(id="idddCode")
	public WebElementFacade tbx_iddcode;
	
	
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Home')]/../../following-sibling::span//input)[1]")
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_home_filed1;
			
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Home')]/../../following-sibling::span//input)[2]")
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_home_filed2;
					
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Home')]/../../following-sibling::span//input)[3]")
	@FindBy(xpath="(.//*[contains(text(),'Home')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_home_filed3;
	
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Cell')]/../../following-sibling::span//input)[1]")
	@FindBy(xpath="(.//*[contains(text(),'Cell')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_Cell_filed1;
			
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Cell')]/../../following-sibling::span//input)[2]")
	@FindBy(xpath="(.//*[contains(text(),'Cell')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_Cell_filed2;
					
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Cell')]/../../following-sibling::span//input)[3]")
	@FindBy(xpath="(.//*[contains(text(),'Cell')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_Cell_filed3;
	
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Office')]/../../following-sibling::span//input)[1]")
	@FindBy(xpath="(.//*[contains(text(),'Office')]/../../following-sibling::span//input)[1]")
	public WebElementFacade tbx_Office_filed1;
			
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Office')]/../../following-sibling::span//input)[2]")
	@FindBy(xpath="(.//*[contains(text(),'Office')]/../../following-sibling::span//input)[2]")
	public WebElementFacade tbx_Office_filed2;
					
	//@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//.[contains(text(),'Office')]/../../following-sibling::span//input)[3]")
	@FindBy(xpath="(.//*[contains(text(),'Office')]/../../following-sibling::span//input)[3]")
	public WebElementFacade tbx_Office_filed3;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//.[contains(text(),'Extension')]/../../following-sibling::span//input")
	@FindBy(xpath=".//*[contains(text(),'Extension')]/../../following-sibling::span//input")
	public WebElementFacade tbx_extensions;
	
	//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//.[contains(text(),'Email')]/../../following-sibling::span//input")
	@FindBy(xpath=".//*[contains(text(),'Email')]/../../following-sibling::span//input")
	public WebElementFacade tbx_email;
	
	
	//#########################  AEB Create form  ##############################//
	
	
	@FindBy(xpath=".//*[@id='addShelf']/div[3]/div[1]/input")
	public WebElementFacade tbx_Altbuld_subscribername;
	
	@FindBy(id="eqRole")
	public WebElementFacade ddl_altequip_equiprole;			
	
	@FindBy(xpath=".//*[@ng-change='checkCLLILength();']")
	public WebElementFacade tbx_altequip_deviceclli;
	
	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.DEVICE_DESIGNATOR']")
	public WebElementFacade tbx_altequip_deviceclli_designator;
	
	//@FindBy(xpath=".//*[@ng-show='!existingMode']/select[@id='deviceType']")
	@FindBy(id="deviceType")
	public WebElementFacade ddl_altequip_devicetype;				
	
	@FindBy(id="deviceSubType")
	public WebElementFacade ddl_altequip_devicesubtype;			

	@FindBy(xpath=".//*[@ng-model='altDeviceAttrForm.RELAYRACK']")
	public WebElementFacade tbx_altequip_relayshelf;
	
	@FindBy(xpath=".//*[@id='affiliateOwner' and @ng-change='enableDisableIsOffnet()']")
	public WebElementFacade ddl_altequip_affliateown;	
	
	//#########################  Create GDB Fields ##############################//
	
	@FindBy(xpath="//select[@id='deviceType']")
	public WebElementFacade ddl_NB_deviceType;//1
	
	@FindBy(xpath="//select[@id='deviceSubType']")
	public WebElementFacade ddl_NB_deviceSubType;//2



@FindBy(xpath="//input[@name='clli']")
	public WebElementFacade tbx_NB_CLLI;

@FindBy(xpath=".//*[@ng-model='invServiceDevLookUp.deviceClli']")
public WebElementFacade tbx_gpon_mdutab_fdhlookup_deviceclli;

//@FindBy(xpath=".//input[@ng-model='gponDeviceObj.DEVICE_DESIGNATOR']")
@FindBy(xpath="//input[@name='desig']")
	public WebElementFacade tbx_NB_Location_Designator;
	

@FindBy(xpath="//select[@id='aerialBuried']")
	public WebElementFacade ddl_NB_aerialBuried;

	
	@FindBy(xpath="//select[@id='buildType']")
	public WebElementFacade ddl_NB_buildType;

@FindBy(xpath="//select[@id='indoorOutdoor']")
	public WebElementFacade ddl_NB_indoorOutdoor;

@FindBy(xpath="//select[@id='selfTechInstall']")
	public WebElementFacade ddl_NB_selfTechInstall;

	//@FindBy(xpath="//input[@ng-model='gponDeviceObj.RONTAID ']")
@FindBy(xpath="//input[@ng-model='aDevice.gponDeviceObj.RONTAID ']")			
public WebElementFacade tbx_NB_Rontaid;

@FindBy(xpath="//select[@id='isDiverse']")
	public WebElementFacade ddl_NB_isDiverse;


//@FindBy(xpath="//input[@ng-model='gponDeviceObj.RELAYRACK']")
@FindBy(xpath="//*[@ng-model='aDevice.gponDeviceObj.RELAYRACK']")
	public WebElementFacade tbx_NB_RelayRack;

@FindBy(xpath="//select[@id='nosaCertificate']")
	public WebElementFacade ddl_NB_nosaCertificate;

@FindBy(xpath="//input[@id='SplitterGroupNumber']")
public WebElementFacade tbx_NB_SplitterNumber;

@FindBy(xpath="//input[@id='StartPortNumber']")
public WebElementFacade tbx_NB_Splitterport;


@FindBy(xpath="//input[@id='SplitterGroupNumber']")
public WebElementFacade tbx_Splitter_no;


@FindBy(xpath="//input[@id='StartPortNumber']")
public WebElementFacade tbx_Splitter_port;

@FindBy(xpath=".//*[text()='Address#']/following-sibling::input")
public WebElementFacade tbx_mltoaddressno;

@FindBy(xpath=".//*[text()='Street Name %']/following-sibling::input")
public WebElementFacade tbx_mltostreetName;

@FindBy(xpath=".//*[text()='City']/following-sibling::input[@placeholder='City']")
public WebElementFacade tbx_mltocity;

@FindBy(xpath=".//*[@id='fiberDistNode']")
public WebElementFacade ddl_gpon_ONTFDNMSTport;	

@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//textarea[@ng-model='aDevice.gponDeviceObj.NETWORK_ELEMENT_NOTE']")
public WebElementFacade tbx_gdb_ntwkelenode;	

//Location lookup fields
	
@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Address#']/following-sibling::input")
public WebElementFacade tbx_addNo;

//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//.[@title='CLLI Lookup']/div[2]/div/div[2]/div[3]/div[2]/input")
@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Street Name']/following-sibling::input")
public WebElementFacade tbx_streetName;

//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//.[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]/div[4]/div/input")
@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='Building CLLI %']/following-sibling::input")
public WebElementFacade tbx_buildingclli;

//@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//.[@title='CLLI Lookup']/div[2]/div/div[2]/div[4]//.[@for='city']/following-sibling::input")
@FindBy(xpath=".//*[@ng-controller='locationLookUpCtrl']//label[text()='City']/following-sibling::input")
public WebElementFacade tbx_lcncity;

@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//.[@ng-keyup='setAdddressFields(entity[field.name])']")
public WebElementFacade tbx_lcnclli_createform;

//Topology fields

@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='port']")
public WebElementFacade ddl_TopologyType;

@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='topologylookup']/div[3]/div[1]/input")
public WebElementFacade tbx_Topologyname;
	
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
	
	//################		Create MEF EVC Service Page ########################//	
	
	@FindBy(id = "NAME")
	 public WebElementFacade tbx_CreateService_name;
	
	@FindBy(id = "ALIAS1")
	 public WebElementFacade tbx_CreateService_alias1;

	@FindBy(id = "ALIAS2")
	 public WebElementFacade tbx_CreateService_alias2;
	
	@FindBy(id = "DESCRIPTION")
	 public WebElementFacade tbx_CreateService_note;	
	
	@FindBy(id = "EVCOVCNC")
	 public WebElementFacade ddl_CreateService_evcnccode;	
	
	@FindBy(id = "CEVLANIDPRESERVATION")
	 public WebElementFacade ddl_CreateService_cevlanidpreservation;
	
	@FindBy(id ="CEVLANCOSPRESERVATION")
	 public WebElementFacade ddl_CreateService_cevlancospreservation;
	
	@FindBy(id = "UNICASTFRAMEDELIVERY")
	 public WebElementFacade ddl_CreateService_unicastframedelivery;
	
	@FindBy(id = "MULTICASTFRAMEDELIVERY")
	 public WebElementFacade ddl_CreateService_multicastframedelivery;	
	
	@FindBy(id = "BROADCASTFRAMEDELIVERY")
	 public WebElementFacade ddl_CreateService_broadcastframedelivery;	
	
	@FindBy(id ="STI")
	 public WebElementFacade ddl_CreateService_servicetypeindicator;	
	
	@FindBy(id = "GROUPNUMBER")
	 public WebElementFacade tbx_CreateService_groupnumber;
	
	
	@FindBy(id ="USAGE")
	 public WebElementFacade ddl_CreateService_usagetype;	
	
	@FindBy(id ="COS_ID")
	 public WebElementFacade ddl_CreateService_cosid;		
	
	@FindBy(id = "ASN")
	 public WebElementFacade tbx_CreateService_asn;
	
	@FindBy(id = "REQUESTING_AFFILIATE")
	 public WebElementFacade ddl_CreateService_requestingaffiliate;
	
	@FindBy(id = "SERVICE2FUNCTIONALSTATUS")
	 public WebElementFacade ddl_CreateService_functionalstatus;	
	
	@FindBy(id = "MCO")
	 public WebElementFacade ddl_CreateService_mco;	
	
	@FindBy(id = "SERVICESUBTYPE")
	 public WebElementFacade ddl_CreateService_servsubtype;	
	
	@FindBy(id = "PM_TYPE")
	 public WebElementFacade ddl_CreateService_pmtype;	
	
	
	
	
	//################		Create Individual Location Page ########################//	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='locationRole']")
	public WebElementFacade ddl_create_individuallcn_lcnrole;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='clliCode']")
	public WebElementFacade tbx_create_individuallcn_ICOsite_cllicode;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='addressNumber']")
	public WebElementFacade tbx_create_individuallcn_addrssno;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='street']")
	public WebElementFacade tbx_create_individuallcn_streetname;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='state']")
	public WebElementFacade ddl_create_individuallcn_state;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='city']")
	public WebElementFacade ddl_create_individuallcn_city;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='zip']")
	public WebElementFacade tbx_create_individuallcn_zip1;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='zip2']")
	public WebElementFacade tbx_create_individuallcn_zip2;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='NewConstructionIndicator']")
	public WebElementFacade ddl_create_individuallcn_newcontrctor;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='sWCCLLI']")
	public WebElementFacade tbx_create_individuallcn_swcclli;
	
	@FindBy(xpath=".//*[@id='streetDirectionSuffix' and @name='streetDirectionSuffix']")
	public WebElementFacade ddl_StreetDirSuffix_individual_addr ;
	
	@FindBy(xpath=".//*[@id='streetDirectionPrefix' and @name='streetDirectionPrefix']")
	public WebElementFacade ddl_StreetDirPrefix_individual_addr;
	
	@FindBy(xpath="//select[@id='streetType']")
	public WebElementFacade ddl_Streettype_individual_addr;
	
	
	//################		Create Address Range Location Page ########################//	
	

	
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
	
	@FindBy(xpath=".//*[@id='streetDirectionSuffix' and @name='streetDirectionSuffix']")
	public WebElementFacade ddl_StreetDirSuffix_addr_range ;
	
	@FindBy(xpath=".//*[@id='streetDirectionPrefix' and @name='streetDirectionPrefix']")
	public WebElementFacade ddl_StreetDirPrefix_addr_range ;
	
	
	//################		Create Link Page ########################//	
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Name')]/../../following-sibling::span//input[@id='NAME']")
	public WebElementFacade tbx_link_createform_Gerneralsection_name ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Provision Status')]/../../following-sibling::span//select")
	public WebElementFacade ddl_link_createform_Gerneralsection_prvisstatus ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Functional Status')]/../../following-sibling::span//select")
	public WebElementFacade ddl_link_createform_Gerneralsection_funcstatus ; 	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Parent Cable ID')]/../../following-sibling::span//input")
	public WebElementFacade tbx_link_createform_Gerneralsection_parentcblid ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Strand ID')]/../../following-sibling::span//input")
	public WebElementFacade tbx_link_createform_Gerneralsection_strndid ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Alias 1')]/../../following-sibling::span//input")
	public WebElementFacade tbx_link_createform_Gerneralsection_alias1 ; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[contains(text(),'Aerial or Buried')]/../../following-sibling::span//select")
	public WebElementFacade ddl_link_createform_Gerneralsection_arialburied ; 
	
	
	//################		Create Service area Page ########################//	
	
	
	@FindBy(xpath = ".//*[@ng-model='locationlkp.BuildingCLLI']")
	public WebElementFacade tbx_SAcreateform_lcnlckup_buildindclli; 			
	
	
	@FindBy(xpath = ".//*[@ng-click='lookupGridSettings.selLukupValue(0)']")
	public WebElementFacade lbl_SAcreateform_locnresult;  
	
	@FindBy(id = "ServiceAreaName")
	public WebElementFacade tbx_createform_Servicearea;		
	
	@FindBy(xpath = ".//*[@ng-model='deviceLookUp.deviceRole']")
	public WebElementFacade ddl_SAcreateform_devicerole;  		
	
	@FindBy(xpath = "(.//*[@ng-click='setSelectedvalue(device)'])[1]")
	public WebElementFacade lbl_SAcreateform_devicename_result;	
	
	//--------------------------------------------------------------		Create QOS  Form   ---------------------------------------------------------------------------//
	
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='qos']")
		public WebElementFacade tbx_createpage_QOSTemplate_templatename;
		
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p2']")
		public WebElementFacade tbx_createpage_QOSTemplate_p2;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p3']")
		public WebElementFacade tbx_createpage_QOSTemplate_p3;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@id='p4']")
		public WebElementFacade tbx_createpage_QOSTemplate_p4;
		
		//************************************************************************************************************************************************************//
	
	//-------------  Create Circuit fields  -----------------------//
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_name;
	

	@FindBy(id="ALIAS1")
	public WebElementFacade tbx_alias1;


	@FindBy(id="ALIAS2")
	public WebElementFacade tbx_alias2;

	@FindBy(id="CIRCUITBANDWIDTH")
	public WebElementFacade tbx_Bandwidth;
	
	@FindBy(id="DESCRIPTION")
	public WebElementFacade tbx_note;


	@FindBy(id ="CIRCUITSERVICETYPE")
	public WebElementFacade ddl_Circuit_Service_Type;

	@FindBy(id="TSP")
	public WebElementFacade tbx_TSP;

	@FindBy(id="TRANSPORTTYPE")
	public WebElementFacade ddl_Trasport_Type;


	@FindBy(id="BANDWIDTH")
	public WebElementFacade tbx_Provisioned_Bandwidth;

	@FindBy(id="CIRCUIT2FUNCTIONALSTATUS")
	public WebElementFacade ddl_Functional_Status;
	


	@FindBy(id="IS_DIVERSE")
	public WebElementFacade ddl_Is_Diverse;



	@FindBy(id = "CIRCUIT2PROVISIONSTATUS")
	public WebElementFacade tbx_Provision_status;


	@FindBy(xpath = "//input[@ng-click='createCircuit();']")
	public WebElementFacade btn_create_circuit;

	
	@FindBy(xpath = "//input[@ng-click='resetCircuit();']")
	public WebElementFacade btn_reset_circuitcreatepage;
	
	@FindBy(xpath = ".//*[@ng-model=\"circuitLookUp['selectedCircuitType']\"]")
	public WebElementFacade ddl_circuitcreatepage_circuittype;
	
	//-------------------------------------------------------------------------------------//
	
	
	//------------------------edit circuit------------------------------------------------//
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS1']")
	public WebElementFacade tbx_circuit_editview_alias1; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='ALIAS2']")
	public WebElementFacade tbx_circuit_editview_alias2; 
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='CIRCUIT2FUNCTIONALSTATUS']")
	public WebElementFacade ddl_circuit_editview_FUNCTIONALSTATUS; 
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='CIRCUIT2PROVISIONSTATUS']")
	public WebElementFacade ddl_circuit_editview_PROVISIONSTATUS;
	
	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='mco']")
	public WebElementFacade ddl_mco_EditEthernetBearer;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='NOTES']")
	public WebElementFacade tbx_circuit_editview_NOTES; 
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='DESCRIPTION']")
	public WebElementFacade tbx_Lagcircuit_editview_NOTES; 
	

	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='BW']")
	public WebElementFacade tbx_circuit_editview_bandwidth; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='BANDWIDTH']")
	public WebElementFacade tbx_circuit_editview_provisionbandwidth; 
	
	
	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='CIRCUITSERVICETYPE']")
	public WebElementFacade ddl_CIRCUITSERVICETYPE_EditEthernetBearer;

	@FindBy(xpath = "//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='TRANSPORTTYPE']")
	public WebElementFacade ddl_TRANSPORTTYPE_EditEthernetBearer;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//*[@id='EXCEPTION_HANDLING_INFO']")
	public WebElementFacade tbx_Circuit_editview_EXCEPTION_HANDLING_INFO; 
	
	
	
//-------------------------------------------------------------------------------------//
	
	//---------------------		Create MLTO Order Page ----------------------------//
	//MLTO
		@FindBy(id="OrderNo")
		public WebElementFacade tbx_orderno;
		
		@FindBy(id="customerFirstName")
		public WebElementFacade tbx_mltocustomername;
		
		@FindBy(id="customerLastname")
		public WebElementFacade tbx_customerlastname;
		
		@FindBy(id="customerType")
		public WebElementFacade ddl_customerType;
		
		@FindBy(id="customerSubtype")
		public WebElementFacade ddl_customerSubtype;
		
		@FindBy(id="accountType")
		public WebElementFacade ddl_accountType;

		@FindBy(id="remark")
		public WebElementFacade tbx_General_remark;
		
		@FindBy(id="DTN")
		public WebElementFacade tbx_dtn;
		
		@FindBy(id = "CVOIP_TN")
		 public WebElementFacade tbx_CVOIP_TN ;
		
		@FindBy(id = "DOWNSTREAM_RATE")
		 public WebElementFacade tbx_Downstream_rate ;
		
		@FindBy(id = "PROVISIONED_DOWNSTREAM_RATE")
		 public WebElementFacade tbx_Provisioned_Downstream_rate ;
		
		@FindBy(id = "UPSTREAM_RATE")
		 public WebElementFacade tbx_Upstream_rate ;
		
		@FindBy(id = "PROVISIONED_UPSTREAM_RATE")
		 public WebElementFacade tbx_Provisioned_Upstream_rate ;
		

		
		@FindBy(id="serviceType")
		public WebElementFacade ddl_mltoserviceType;
		
		@FindBy(id="hdStreams")
		public WebElementFacade ddl_hdStreams;
		
		@FindBy(id="HD_STREAMS")
		public WebElementFacade tbx_hdStreams;
		
		
		@FindBy(id="downSpeed")
		public WebElementFacade ddl_downSpeed;
		
		@FindBy(id="upSpeed")
		public WebElementFacade ddl_upSpeed;		
		
		
		@FindBy(id="featureCodeRemark")
		public WebElementFacade tbx_featureCodeRemark;
		
		@FindBy(id="appointmentStartDate_0")
		public WebElementFacade tbx_appointmentStartDate;
		
		@FindBy(id="appointmentEndDate_0")
		public WebElementFacade tbx_appointmentEndDate;
		
		@FindBy(id="requestedDueDate_0")
		public WebElementFacade tbx_requestedDueDate;
		
		@FindBy(id="dispatchRemark")
		public WebElementFacade tbx_dispatchRemark;
		
		//End of MLTO
	
		@FindBy(xpath="//label[text()='Search Type']/following-sibling::select")
		public WebElementFacade ddl_searchType;
		
		@FindBy(xpath="//label[text()='Inventory Type']/following-sibling::select[1]")
		public WebElementFacade ddl_invntryType;
		
		
	//#########################################################Search device###########################################
		@FindBy(xpath=".//*[@ng-model='deviceDetail.MAXSUBSCRIBERBWOFFERED']")
		public WebElementFacade tbx_maxsubscbandwidth;
		
		@FindBy(xpath=".//*[@ng-model='deviceDetail.MAXSUBSCRIBERUPBWOFFERED']")
		public WebElementFacade tbx_maxsubscbandwidth_up;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//input[@ng-model='deviceDetail.SUBSCRIBERNAME']")
		public WebElementFacade tbx_serach_device_device_details_tab_subscriber;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='deviceDetail.DOWNSTREAM_BW_UNIT']")
		public WebElementFacade tbx_maxsubscbandwidth_unit;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='deviceDetail.UPSTREAM_BW_UNIT']")
		public WebElementFacade tbx_maxsubscbandwidth_upunit;
		
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedAffliate']")
		public WebElementFacade tbx_Affliate_owner;
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedMCO']")
		public WebElementFacade ddl_Edit_device_device_details_MCO;
		
		@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//select[@ng-model='edit.selectedAffliate']")
		public WebElementFacade ddl_Edit_device_device_details_affliateowner;
		
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceDetail.SNMP_PORT_ID']")
		public WebElementFacade tbx_devicepage_edit_networkdetails_snmpportnumber;
		    
		   
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//select[@id='SNMP_VERSION']")
	    public WebElementFacade ddl_devicepage_edit_networkdetails_snmpversion;
		    
		@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='deviceDetail.SNMPOBJECTID']")
		public WebElementFacade tbx_devicepage_edit_networkdetails_snmpobject;
		
	//#################################################################################################################	
		
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
		
		
		//......................................................................................................//
		
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

		
		
				
		//
    	//------------------------------------
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='firstName']")
        public WebElementFacade tbx_clccontactcreate_firstname;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='lastName']")
        public WebElementFacade tbx_clccontactcreate_lastname;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@id='EMAIL']")
        public WebElementFacade tbx_clccontactcreate_email;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='contactData.area']")
        public WebElementFacade tbx_clccontactcreate_telephone1;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='contactData.prefix']")
        public WebElementFacade tbx_clccontactcreate_telephone2;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='contactData.lineNmbr']")
        public WebElementFacade tbx_clccontactcreate_telephone3;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'openSubscriberLookUp();')]/i")
        public WebElementFacade btn_clccontactcreate_custnamelookup;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//input[@ng-model='invSubscriber.subscriberName']")
    	public WebElementFacade tbx_clccontactcreate_custnamelookup_subscribername;
        
        @FindBy(xpath=".//*[@value='LookUp']")
        public WebElementFacade btn_clccontactcreate_custnamelookup_subscriberlookup;
               
        @FindBy(xpath="(.//*[@ng-click='lookupData(subscriberLookupData);']/span)[1]")
        public WebElementFacade lbl_clccontactcreate_custnamelookup_subscriber;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-repeat='customer in editContactParam.customerDetailList']//button")
        public WebElementFacade lbl_clccontactcreate_custnameadded;
        
        @FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@ng-repeat='customer in editContactParam.customerDetailList']//button)[2]")
                      public WebElementFacade lbl_clccontactcreate_custnameadded2;
        
        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-repeat='customer in editContactParam.customerDetailList']//button")
        public WebElementFacade btn_clccontactcreate_custnameadded_remove;
        
               /////
        @FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@id='firstName'])[2]")
        public WebElementFacade tbx_clccontactcreate_firstname1;
        
        @FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//input[@id='lastName'])[2]")
        public WebElementFacade tbx_clccontactcreate_lastname1;
        
        
        @FindBy(xpath="(.//*[@ng-model='invSubscriber.subscriberName'])[3]")
        public WebElementFacade tbx_clccontactcreate_custnamelookup_subscribername1;
        
        @FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//span[contains(@ng-click,'openSubscriberLookUp();')]/i)[2]")
        public WebElementFacade btn_clccontactcreate_custnamelookup1;
        
       
        
        @FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='firstName']")
        public WebElementFacade tbx_CCLcontact_editpage_firstname;
        
        @FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='lastName']")
        public WebElementFacade tbx_CCLcontact_editpage_lastname;
        
        @FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@id='email']")
        public WebElementFacade tbx_CCLcontact_editpage_email;
        
        @FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='editContact.area']")
        public WebElementFacade tbx_CCLcontact_editpage_telephon1;
        
        @FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='editContact.prefix']")
        public WebElementFacade tbx_CCLcontact_editpage_telephon2;
        
        @FindBy(xpath=".//*[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//input[@ng-model='editContact.lineNmbr']")
       public WebElementFacade tbx_CCLcontact_editpage_telephon3;

        @FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/..//*[@ng-model='deviceDetail.MGMT_IP_SUBNET_MASK']")
    	public WebElementFacade tbx_edit_device_netwrok_tab_mngtipsubnetmask;
    	
    	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//div[text()='Manufacturer Information']/..//*[@ng-model='deviceDetail.MGMT_IP_DEFAULT_GATEWAY']")
    	public WebElementFacade tbx_edit_device_netwrok_tab_deftgateway;
    	
    	// MEF OVC Create Page
       	
       	
       	@FindBy(id = "EVCOVCNC")
       	 public WebElementFacade ddl_evcnccode;	
       	
       	@FindBy(id = "UNICASTFRAMEDELIVERY")
    	 public WebElementFacade ddl_unicastframedelivery;
    	
    	@FindBy(id = "MULTICASTFRAMEDELIVERY")
    	 public WebElementFacade ddl_multicastframedelivery;	
    	
    	@FindBy(id = "BROADCASTFRAMEDELIVERY")
    	 public WebElementFacade ddl_broadcastframedelivery;	
    	
    	@FindBy(id ="STI")
    	 public WebElementFacade ddl_servicetypeindicator;
    	@FindBy(id = "REQUESTING_AFFILIATE")
    	 public WebElementFacade ddl_requestingaffiliate;
    	
    	
    	
    	@FindBy(id = "MCO")
    	 public WebElementFacade ddl_mco;
    	
    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//input[@ng-model='invSubscriber.subscriberName']")
    	 public WebElementFacade tbx_subcriber_name_window ;
    	
    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//input[@id='ALIAS1']")
    	public WebElementFacade tbx_serviceview_alias1;

    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//input[@id='ALIAS2']")
    	public WebElementFacade tbx_serviceview_alias2;
    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='MCO']")
    	public WebElementFacade ddl_serviceview_mco;	
    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='PM_TYPE']")
    	public WebElementFacade ddl_pmtype;
    	
    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='PMFLAG']")
    	public WebElementFacade ddl_pmflag;
    	@FindBy(xpath = ".//*[@class='tab-pane ng-scope active']//*[@id='left-content-tab']//Select[@id='SLA_AGREEMENT_TEMPLATE']")
    	public WebElementFacade ddl_leftslatemplate;
    	
    	
    		////##########################CLC Advance search
    	@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//input[@id='firstName']")
    	public WebElementFacade tbx_advclccontactsearch_fname;
    	@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//input[@id='lastName']")
    	public WebElementFacade tbx_advclccontactsearch_lname;
    	@FindBy(xpath =".//*[@class='tab-pane ng-scope active']//input[@id='email']")
    	public WebElementFacade tbx_advclccontactsearch_email;
		
		
		
		
		
		
		
}
