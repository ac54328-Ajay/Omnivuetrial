package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCreateTopologyPage extends OmniVuePage {
	
//	OVCreateTopologyPage createtopologypage;
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);
	
/*	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='addDevice();']")
	public WebElementFacade btn_addDevice;*/
	
	
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//label[contains(text(),'Full Name')]/../../following-sibling::span//input")
	public WebElementFacade tbx_fullName;
	
	
	@FindBy(xpath="//span[span[label[contains(text(),'Alias1')]]]/following-sibling::span//input")
	public WebElementFacade tbx_alias1;
	
	
	@FindBy(id="NETWORK_ROLE")
	public WebElementFacade ddl_topologyRole;
	
	@FindBy(xpath=".//*[@ng-model='searchDeviceDetail.DEVCLLI']")
	public WebElementFacade tbx_Create_topology_deviceclli;
	
	@FindBy(id="NETWORK_TECHNOLOGY")
	public WebElementFacade ddl_topologyTechType;
	
	@FindBy(xpath=".//*[@id='NOTES']")
	public WebElementFacade tbx_topologyNote;
	
/*	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createTopology();']")
	public WebElementFacade btn_create;*/
	
	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='Reset']")
	public WebElementFacade btn_reset;
	
	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='AddCircuit']")
	public WebElementFacade btn_addCircuit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='searchCircuit();']")
	public WebElementFacade btn_searchCircuit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetTopology();']")
	public WebElementFacade btn_reset_topology_create_page;
	
	
	@FindBy(xpath="//label[text()='Device CLLI %']/following-sibling::input")
	public WebElementFacade tbx_deviceCLLI;
	
	@FindBy(xpath="(//label[text()='Device Name %'])[1]/following-sibling::input")
	public WebElementFacade tbx_deviceName;
	
	@FindBy(xpath="(//label[text()='Device Type'])[2]/following-sibling::select")
	public WebElementFacade ddl_deviceType;
	
	@FindBy(xpath="//label[text()='Device SubType']/following-sibling::select")
	public WebElementFacade ddl_deviceSubType;
		
	@FindBy(id="locationAddress")
	public WebElementFacade tbx_locnAddress;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='searchDevice();']")
	public WebElementFacade btn_searchDevice;
	
	@FindBy(xpath="//input[@value='Search Device']/following-sibling::input[@value='Cancel']")
	public WebElementFacade btn_cancel;
	
	@FindBy(xpath="//input[@value='Search Device']/following-sibling::input[@value='Reset']")
	public WebElementFacade btn_resetInPlaceDevices;
		
	@FindBy(xpath="//table[contains(@id,'Device_Data_')]/tbody/tr[1]/td[1]/input")
	public WebElementFacade chk_deviceName;
	
	@FindBy(xpath=".//*[@ng-if='showAssociationDeviceTable']//tbody/tr[1]/td[6]")
	public WebElementFacade lbl_topologycreate_searchdevice_devicerole;
	
	//@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='associateDevices();']")
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='associateDevices();']")
	public WebElementFacade btn_AssociateDevices;	

	@FindBy(xpath=".//*[@ng-model='searchCircuitDetail.CIRCUIT_NAME']")
	public WebElementFacade tbx_circuitname;
	
	@FindBy(xpath="//select[@ng-model='searchCircuitDetail.CIRCUIT_TYPE']")
	public WebElementFacade ddl_circuittype;
	
	/*@FindBy(xpath="//input[@value='Search Circuit']")
	public WebElementFacade btn_searchcircuit;*/
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/input")
	public WebElementFacade chk_Circuit1;
	
	@FindBy(xpath="//*[@class='tab-pane ng-scope active']//button[@ng-click='associateCircuits();']")
	public WebElementFacade btn_AssociateCircuits;
	
	@FindBy(xpath=".//*[@ng-show='showSelectedCircuitAssociation']//tbody//td[1]")
	public WebElementFacade lbl_Associate_Circuit1;
	
	@FindBy(xpath="//select[@ng-model='searchDeviceDetail.DEVTYPE']")
	public WebElementFacade ddl_devicetype;
	
	@FindBy(xpath=".//select[@ng-model='searchDeviceDetail.DEVSUBTYPE']")
	public WebElementFacade ddl_devicesubtype;
	
	@FindBy(xpath="//*[@ng-click='searchDevice();']")
	public WebElementFacade btn_searchdevice;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/input")
	public WebElementFacade chk_device1;
	
	@FindBy(xpath="//*[@ng-show='showSelectedDeviceAssociation']//tbody//td[1]")
	public WebElementFacade lal_Associate_Device1;
	
	
	
	//-----------------------------Topology Detail Page-----------------------------------------------------//
	
	@FindBy(xpath="(//span[span[label[text()='Name']]])/following-sibling::span/div/label")
	public WebElementFacade lbl_Name;
	
	@FindBy(xpath="(//span[span[label[text()='Full Name']]])/following-sibling::span/div/label")
	public WebElementFacade lbl_FullName;
	
	@FindBy(xpath="(//span[span[label[text()='Topology Role']]])/following-sibling::span/div/label")
	public WebElementFacade lbl_TopologyRole;
	
	@FindBy(xpath="(//span[span[label[text()='Topology Technology Type']]])/following-sibling::span/div/label")
	public WebElementFacade lbl_TopologyTechType;
	
	@FindBy(xpath="//ul[@role='tablist']/li[1]")
	public WebElementFacade tab_Circuits;
	
	@FindBy(xpath="//ul[@role='tablist']/li[2]")
	public WebElementFacade tab_Devices;
	
	@FindBy(xpath="//ul[@role='tablist']/li[3]")
	public WebElementFacade tab_Locations;
	
	@FindBy(xpath="//div[starts-with(@id,'contenttablejqxGrid')]//input[@type='image']")
	public List<WebElementFacade> btn_count;
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='NETWORK_ROLE']")
	public WebElementFacade ddl_Createtopology_role; 
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//select[@id='NETWORK_TECHNOLOGY']")
	public WebElementFacade ddl_Createtopology_Technology_Type ;
	
    @FindBy(xpath="//ul[@role='tablist']/li[5]/a")
    public WebElementFacade tab_Topology_view;

    @FindBy(xpath=".//div[@class='tab-pane ng-scope active']//div[@ng-controller='topologyViewTabCtrl']/div/div/span")
    public WebElementFacade btn_Google_maps;
    
    @FindBy(xpath="(.//div[@class='table-responsive']/table[@class='default-table ng-scope']/tbody/tr/td)[2]")
    public WebElementFacade tab_Host_sequence;

	//------------------------------------------Topology Update page---------------------------------------------------------------------//

	//@FindBy(xpath=".//input[@value='Add Circuit']")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='addCircuit();']")
	public WebElementFacade btn_Update_AddCircuit;
	
	//@FindBy(xpath=".//input[@value='Add Device']")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='addDevice();']")
	public WebElementFacade btn_Update_AddDevice;	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='saveEditData();']")
	public WebElementFacade btn_Save;
	
	//@FindBy(xpath=".//input[@value='Cancel']")
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@ng-click='resetLink();']")
	public WebElementFacade btn_Cancel;
	
	@FindBy(xpath=".//*[@ng-controller='invGridListViewCtrl']/div[@class='alert alert-danger ng-binding']")
	public WebElementFacade lbl_deleteAlertmessage;
	
	//@FindBy(xpath="//div[@ng-show='showDevContained']//table/tbody/tr[1]/td[6]/span/input")
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[@ng-click='deleteDevice(deviceL)'])[1]")
	public WebElementFacade btn_device_remove_icon;
	
	//@FindBy(xpath="//div[@ng-show='showCirContained']//table/tbody/tr[1]/td[6]/span/input")
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//i[@ng-click='deleteCircuit(circuitL)'])[1]")
	public WebElementFacade btn_circuit_remove_icon;
	
	@FindBy(xpath="(.//*[@class='tab-pane ng-scope active']//td[@class='ng-binding ng-scope'][contains(.,'1')]")
	public WebElementFacade tab_sequence;
	
	@FindBy(xpath="//div[@id='left-content-tab']//*[contains(text(),'Contained Circuits')]")
	public WebElementFacade lbl_circuit_container;
	
	@FindBy(xpath=".//*[@id='row0jqxGrid0']/div[1]/div/input")
	public WebElementFacade btn_Topology_viewicon;
	
	@FindBy(xpath=".//div[contains(@id,'InventoryTopology')]//div[@class='ng-binding alert alert-danger']")
	public WebElementFacade lbl_Topology_ErrorMsg;
	
	@FindBy(xpath=".//*[@id='InventoryTopology0']//div[@ng-show='showAlert']/button")
	public WebElementFacade btn_Topology_ErrorMsg_cancel;
	//------------------------------------------------------------
	@FindBy(xpath=".//select[@ng-model='topoDetail.CIRTYPE']")
	public WebElementFacade ddl_update_CircuitType;
	
	@FindBy(xpath=".//div[@ng-show='showCircuitSrch']//input[@value='Search Circuit']")
	public WebElementFacade btn_update_SearchCircuit;
	
	@FindBy(xpath=".//tr[@ng-show='shotSearCirc'][2]//input")
	public WebElementFacade cbk_update_circuitsearch;
	
	@FindBy(xpath="//div[@ng-show='shotSearCirc']//input[@value='Associate Circuits']")
	public WebElementFacade btn_update_AssociateCircuits;
	//-------------------------------------------------------------
	@FindBy(xpath=".//select[@ng-model='topoDetail.DEVTYPE']")
	public WebElementFacade ddl_update_DeviceType;
	
	@FindBy(xpath=".//select[@ng-model='topoDetail.DEVSUBTYPE']")
	public WebElementFacade ddl_update_DevicesubType;
	
	@FindBy(xpath=".//div[@ng-show='showDevice']//input[@value='Search Device']")
	public WebElementFacade btn_update_searchdevice;
	
	@FindBy(xpath=".//div[@ng-show='showDevSearch']//tr[2]//input")
	public WebElementFacade cbk_update_searchdevice2;
	@FindBy(xpath=".//div[@ng-show='showDevSearch']//tr[3]//input")
	public WebElementFacade cbk_update_searchdevice3;
	
	@FindBy(xpath=".//div[@ng-show='showDevSearch']//input[@value='Associate Devices']")
	public WebElementFacade btn_update_Associatedevices;
	//---------------------------------------------------------------------------------------------------//
	@FindBy(xpath=".//div[@ng-if='isEditMode']//input[@name='NAME']")
	public WebElementFacade tbx_update_Name;
	
	@FindBy(xpath=".//div[@ng-if='isEditMode']//input[@name='FULLNAME']")
	public WebElementFacade tbx_update_Fullname;
	
	@FindBy(xpath=".//div[@ng-if='isEditMode']//input[@name='ALIAS1']")
	public WebElementFacade tbx_update_ALIAS1;
	
	@FindBy(xpath=".//div[@ng-if='isEditMode']//*[@name='NOTES']")
	public WebElementFacade tbx_update_Note;
	
	@FindBy(xpath=".//div[contains(@id,'InventoryTopology')]//div[@class='ng-binding alert alert-success']")
	public WebElementFacade lbl_Topology_SuccessMsg;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Edit']")
	public WebElementFacade btn_TopologyPage_Edit;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@id='left-content-tab']//div[@class='tab-pane ng-scope active']//button[@value='Save']")
	public WebElementFacade btn_TopologyPage_Save;
	
	@FindBy(xpath=".//*[@ng-click='refreshDevices()']//i")
	public WebElementFacade btn_update_refresh;
	
	@FindBy(xpath=".//div[@ng-show='showDevContained']//tr")
	public List<WebElementFacade> Devicecontainer_count;
	
//--------------------------------------Topology Audit Logs----------------------------------------------------------------//
	
	@FindBy(xpath="//tab-heading[contains(text(),'Audit Logs')]")
	public WebElementFacade tab_Auditlogs;
	
	@FindBy(xpath="//tab-heading[contains(text(),'Topology Details')]")
	public WebElementFacade tab_Topologydetails;
	
	@FindBy(xpath="//div[@id='left-content-tab']//div[contains(@id,'dropdownlistContentgridpagerlistjqxGrid')]")
	public WebElementFacade count_Auditlogs;
	
	//--------------------------------------Topology Sanity Validations----------------------------------------------------------------//
	
	@FindBy(xpath = ".//*[@id='mainTab']//tab-heading")
	public WebElementFacade tab_currentlydisplayed ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='createTopology();']")
	public WebElementFacade btn_topology_create;
	
/*	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='Reset']")
	public WebElementFacade btn_reset;
	
	@FindBy(xpath="//input[@value='Create']/following-sibling::input[@value='AddCircuit']")
	public WebElementFacade btn_addCircuit;*/
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//button[@ng-click='resetTopology();']")
	public WebElementFacade btn_topology_createpage_reset ;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='addCircuit();']")
	public WebElementFacade btn_topology_createpage_AddCircuit ;
	
	@FindBy(xpath="//div[@class='tab-pane ng-scope active']//button[@ng-click='addDevice();']")
	public WebElementFacade btn_topology_createpage_AddDevice ;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[text()='General Attributes']")
	public WebElementFacade lbl_Topology_createform_GerneralAttributes;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//label[@class='control-label ng-binding']")			
	public List<WebElementFacade> lbl_allXapath;
	
	//--------------------------------------Topology message on adding device or circuit ----------------------------------------------------------------//
	
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-class='alert.className']")
	public WebElementFacade lbl_Topology_createform_msgonadding_device_circuit;	

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//div[@ng-class='alert.className']/button")
	public WebElementFacade btn_Topology_createform_msgonadding_device_circuit_closeicon;
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return btn_topology_create;
	}
	
	public void clickAdddevicecircuit(String button) throws InterruptedException{		
		switch(button){
		case "AddDevice": jsClick(btn_topology_createpage_AddDevice); waitForElement(btn_searchDevice); break;
		case "AddCircuit": jsClick(btn_topology_createpage_AddCircuit); waitForElement(btn_searchCircuit); break;
		case "Reset": jsClick(btn_topology_createpage_AddCircuit); waitForElement(btn_reset_topology_create_page); break;
		
		
		}		
	}
	
	public void Topologyaction(String action) throws InterruptedException{
		Thread.sleep(3000);
		jsClick(btn_searchDevice);
		Thread.sleep(60000);	
		jsClick(chk_deviceName);
		jsClick(btn_AssociateDevices);
		Thread.sleep(5000);
		jsClick(btn_topology_create);
		Thread.sleep(5000);
	}
	
	

	/*public void clickAddDevice() throws InterruptedException{
		btn_addDevice);
		Thread.sleep(5000);
	}*/ // 10/13/2016	Need to check if the it's impacting other region
	
	public void verifyAttributes() throws InterruptedException{
		
		Boolean deviceCLLI = tbx_deviceCLLI.isDisplayed();
		Assert.assertTrue(deviceCLLI);
		
		Boolean deviceName = tbx_deviceName.isDisplayed();
		Assert.assertTrue(deviceName);
		
		Boolean deviceType = ddl_deviceType.isPresent();
		Assert.assertTrue(deviceType);
		
		Boolean deviceSubType = ddl_deviceSubType.isPresent();
		Assert.assertTrue(deviceSubType);
		
		Boolean locnAddress = tbx_locnAddress.isDisplayed();
		Assert.assertTrue(locnAddress);

	}
	
	public void searchDevice(String devType , String devSubType) throws InterruptedException{
		
		ddl_deviceType.selectByVisibleText(devType);
		Thread.sleep(3000);
		
		ddl_deviceSubType.selectByVisibleText(devSubType);
		Thread.sleep(3000);
		
		jsClick(btn_searchDevice);
		Thread.sleep(60000);
		
		jsClick(chk_deviceName);
		jsClick(btn_AssociateDevices);
		Thread.sleep(5000);
		
		jsClick(btn_topology_create);
		Thread.sleep(5000);
		
	}
	public void updatecommonsection(){
		long Time= System.currentTimeMillis();
		String Topologyname = lbl_Name.getText();
	    System.out.println("Before update Topologyname="+Topologyname);
	    jsClick(btn_TopologyPage_Edit);
		tbx_update_Name.clear();
		tbx_update_Name.sendKeys("Topology"+Time);
		tbx_update_Fullname.clear();
		tbx_update_Fullname.sendKeys("TopologyFull"+Time);
		tbx_update_ALIAS1.clear();
	    tbx_update_ALIAS1.sendKeys("TopologyALIAS1"+Time);
		tbx_update_Note.clear();
		tbx_update_Note.sendKeys("Topology as updated at: "+Time);
	}
	
	
	
	public void	Topology_create_Sanity_Validation() throws Throwable{	
		waitForElement(btn_topology_createpage_AddDevice);
		slf4jLogger.info("Create Topology Validations");
		Thread.sleep(2000);
		if(!tab_currentlydisplayed.isCurrentlyVisible()){
			throw new Error("Create form is not displayed");
		}
		
		if(!btn_topology_create.isCurrentlyVisible() && !btn_topology_create.isCurrentlyEnabled()){
			throw new Error("Create button is not Visible & enabled");
		}
		
		if(!btn_topology_createpage_reset.isCurrentlyVisible() && !btn_topology_createpage_reset.isCurrentlyEnabled()){
			throw new Error("Reset button is not Visible & enabled");
		}
		
		if(!btn_topology_createpage_AddCircuit.isCurrentlyVisible() && !btn_topology_createpage_AddCircuit.isCurrentlyEnabled()){
			throw new Error("Add Circuit button is not Visible & enabled");
		}
		
		if(!btn_topology_createpage_AddDevice.isCurrentlyVisible() && !btn_topology_createpage_AddDevice.isCurrentlyEnabled()){
			throw new Error("Add Device button is not Visible & enabled");
		}
		
		if(!lbl_Topology_createform_GerneralAttributes.isCurrentlyVisible()){
			throw new Error("General Attributes is not displayed");
		}
		
		List<WebElementFacade> topology_create_attribute = lbl_allXapath;
		
		ArrayList<String> topologycreate_Fieldattributelist=new ArrayList<String>();
			for(int j=0;j<topology_create_attribute.size();j++){
				topologycreate_Fieldattributelist.add(j, topology_create_attribute.get(j).getText());
					//slf4jLogger.info("Fields Present:"+Devicecreate_attribute.get(j).getText());
				}
		ArrayList<String> List2compare_topology_Fieldattributelist=new ArrayList<String>();
		
		//slf4jLogger.info("tab_currentlydisplayed="+tab_currentlydisplayed.getText());
		
		
		
		 			    List2compare_topology_Fieldattributelist.add(0, "Name");
						List2compare_topology_Fieldattributelist.add(1, "Full Name");
						List2compare_topology_Fieldattributelist.add(2, "Alias1");
						List2compare_topology_Fieldattributelist.add(3, "Topology Role");
						List2compare_topology_Fieldattributelist.add(4, "Topology Technology Type");
						List2compare_topology_Fieldattributelist.add(5, "Provisioning Status");
						List2compare_topology_Fieldattributelist.add(6, "Topology Notes");
												
						for(int i=0;i<topologycreate_Fieldattributelist.size();i++){
							if(!topologycreate_Fieldattributelist.get(i).equals(List2compare_topology_Fieldattributelist.get(i))){
								slf4jLogger.info("topologycreate_Fieldattributelist="+topologycreate_Fieldattributelist.get(i));
								slf4jLogger.info("List2compare_topology_Fieldattributelist="+List2compare_topology_Fieldattributelist.get(i)+" Not matching");
								throw new Error("Fields are not matching check:"+tab_currentlydisplayed.getText().replaceAll("\\s+$", ""));
							}
						}
						slf4jLogger.info("Topology Create field attributes are expected");
						ddl_Createtopology_role.selectByIndex(5);	Thread.sleep(2000);
						waitFor(ddl_Createtopology_Technology_Type);
						ddl_Createtopology_Technology_Type.selectByIndex(1);
						

		}
	
	
	 public void Topology_craete_topologyrole(String Topologyrole) throws Throwable{	
		 switch(Topologyrole){
		 case "Topology role as Host Client or Satellite": ddl_topologyRole.selectByVisibleText("Host Client or Satellite"); Thread.sleep(2000);break;
		 case "Topology Technology Type as Cisco ASR 9000 Series":ddl_topologyTechType.selectByVisibleText("Cisco ASR 9000 Series"); Thread.sleep(2000);break;
		 case "Topology Technology Type as ALU-Nokia 7750 Series":ddl_topologyTechType.selectByVisibleText("ALU-Nokia 7750 Series"); Thread.sleep(2000);break;
		 }	 
	 }
	
	 
	 public void topology_sequence()
	 {
		 if (tab_sequence.isCurrentlyVisible()&& tab_sequence.getTextValue().equals("1")) 
		 {
			System.out.println("sequence number is "+ tab_sequence.getTextValue().equals("1"));
		} else 
		{
			throw new Error("Topolgy equence number is not correct ");
		}
	 }
	 public void validate_topologytechtype_for_hostClient_in_createTopologyPage(){
			String[] expectedvalues = {"--Select--", "ALU-Nokia 7750 Series", "Cisco ASR 9000 Series"};		
			Select select_topology_tech_type=new Select(ddl_topologyTechType);
			 
			List<WebElement>  allvalues_topology_tech_type=select_topology_tech_type.getOptions();
			for(String str:expectedvalues) 
			{
				boolean found=false;
				for(WebElement ele1: allvalues_topology_tech_type)
				{
					
					if(str.equals(ele1.getText()))
					{
						found=true;
						slf4jLogger.info(str+" Topology Technology Type exists in Advance Search");
						break;
					}
				}
				if(!found)
				{
					throw new Error("Topolgy Technology Type does not exist in Advance Search");
				}
			}
	 }
	 
	 public void validate_topologytechtype_inDB() throws Exception{
		 List<String> expectedvalues= new ArrayList<>();
		 expectedvalues.add("ALU-Nokia 7750 Series");
		 expectedvalues.add("Cisco ASR 9000 Series");
			List<String> topologytechtype = new ArrayList<String>();
			//topologytechtype = ARMDB.validate_topologytechtype_values_in_topology();
			System.out.println("topologytechtype values are "+expectedvalues);
			
			/*if (topologytechtype.containsAll(expectedvalues)) {
				
				System.out.println("topologytechtype values are "+topologytechtype);
			}
			else 
				throw new Error("DB values are not matching with GUI values");*/
		}
			
	 public void Topology_create_Adddevcie(String action) throws Throwable{
		 String Message=null;
		 switch(action){
		 
		 case "HOST":jsClick(chk_deviceName);
		 			jsClick(btn_AssociateDevices);
					 waitForElement(lbl_Topology_createform_msgonadding_device_circuit);
					 
					 Message = lbl_Topology_createform_msgonadding_device_circuit.getText();
						Message = Message.toString().substring(1);
						
						Message = Message.trim(); 
					 if(Message.equals("Host device added successfully")){
				    	slf4jLogger.info("Topology Add device with role as HOST is associated successfully");
					 } else throw new Error("Invalid message is displayed:"+lbl_Topology_createform_msgonadding_device_circuit.getText().trim()+" for role HOST"); jsClick(btn_Topology_createform_msgonadding_device_circuit_closeicon); 
					  break;
		
		 case "CLIENT":  jsClick(chk_deviceName);
		 					jsClick(btn_AssociateDevices);
						 waitForElement(lbl_Topology_createform_msgonadding_device_circuit);
						 
						 Message = lbl_Topology_createform_msgonadding_device_circuit.getText();
							Message = Message.toString().substring(1);
							
							Message = Message.trim(); 
						 if(Message.equals("Host device added successfully")){
					    	slf4jLogger.info("Topology Add device with role as HOST is associated successfully");
						 } else throw new Error("Invalid message is displayed:"+lbl_Topology_createform_msgonadding_device_circuit.getText().trim()+" for role HOST"); jsClick(btn_Topology_createform_msgonadding_device_circuit_closeicon); 
						break;
		 
		 case "Create": jsClick(btn_topology_create); waitForElement(btn_TopologyPage_Edit); break;
		 
		 case "Device Role is updated as HOST in Topology create form":jsClick(btn_searchDevice); waitForElement(btn_AssociateDevices);
		 
		 									if(lbl_topologycreate_searchdevice_devicerole.getText().trim().contains("HOST")){
		 										slf4jLogger.info(lbl_topologycreate_searchdevice_devicerole.getText().trim()+ "Equipment role is displayed as expected");break;
		 									} throw new Error("Equipment role is wrongly displayed as "+lbl_topologycreate_searchdevice_devicerole.getText().trim()+" for the first search device"); 
		 									
		 									
		 case "Device Role is updated as Client in Topology create form": 			 							
			 							JavascriptExecutor je = (JavascriptExecutor) getDriver();
			 							je.executeScript("arguments[0].scrollIntoView(true);",btn_searchDevice);
			 							
			 							waitForElement(btn_searchDevice);
			 							jsClick(btn_searchDevice); waitForElement(btn_AssociateDevices); 
											if(lbl_topologycreate_searchdevice_devicerole.getText().trim().equals("CLIENT")){
													slf4jLogger.info(lbl_topologycreate_searchdevice_devicerole.getText().trim()+ "Equipment role is displayed as expected");break;
												} throw new Error("Equipment role is wrongly displayed as "+lbl_topologycreate_searchdevice_devicerole.getText().trim()+" for the first search device"); 
		 					

		 }
		 
		
		
	 }
	 public void validate_devSubType_Values(String devType) throws InterruptedException{
		 List<String> Expected_DevSubType_list = new ArrayList<String>();
		 Select s = new Select(ddl_deviceSubType);
		 List<WebElement> DevSubType_list = s.getOptions();
		 List<String> Actual_DevSubType_list = new ArrayList<String>();
		 for(int i=0; i<=DevSubType_list.size()-1; i++){
			 Actual_DevSubType_list.add(DevSubType_list.get(i).getText());	 
			 }
		 switch(devType){
		 case "Cisco ASR 9000 Series":
			 Expected_DevSubType_list.add("Cisco ASR 9922");
			 Expected_DevSubType_list.add("Cisco ASR 9010");
			 Expected_DevSubType_list.add("Cisco ASR 9006");
			 break;
		 case "Alcatel-Lucent 7750 Service Router":
			 Expected_DevSubType_list.add("Alcatel-Lucent 7750 SR-12");
			 Expected_DevSubType_list.add("Alcatel-Lucent 7750 SR-12e");
			 Expected_DevSubType_list.add("Alcatel-Lucent 7750 SR-7");
			 Expected_DevSubType_list.add("Nokia 7750 SR-7-B");
			 Expected_DevSubType_list.add("Nokia 7750 SR-12-B");
			 break;
		 case "Nokia 7210 SAS-S":
			 Expected_DevSubType_list.add("Nokia 7210 SAS-Sx 46F2C4SFP+"); 
			 break;
		 }
		 
		 if(Actual_DevSubType_list.containsAll(Expected_DevSubType_list)){
			 System.out.println("Expected DevSubType values are avaliable in drop down");
		 } else {
			 System.out.println("Expected DevSubType values are avaliable in drop down");
		 }
	 }
	 public void searchDevice_forassociation(String devType , String devSubType) throws InterruptedException{
			
			ddl_deviceType.selectByVisibleText(devType);
			Thread.sleep(3000);
			validate_devSubType_Values(devType);
			Thread.sleep(2000);
			ddl_deviceSubType.selectByVisibleText(devSubType);
			Thread.sleep(3000);
			
			jsClick(btn_searchDevice);
			Thread.sleep(6000);
			
			jsClick(chk_deviceName);
			jsClick(btn_AssociateDevices);
			Thread.sleep(5000);
			
			//jsClick(btn_create);
			Thread.sleep(5000);
			
		}
	 public void searchDevice_forassociation_with_devicetype(String devType) throws InterruptedException{
         
         ddl_deviceType.selectByVisibleText(devType);
         Thread.sleep(3000);
         validate_devSubType_Values(devType);
		 Thread.sleep(2000);
         jsClick(btn_searchDevice);
         Thread.sleep(6000);
         
         jsClick(chk_deviceName);
         jsClick(btn_AssociateDevices);
         Thread.sleep(5000);
         
         //jsClick(btn_create);
         Thread.sleep(5000);
         
  }

	 
	 public void select_circuit_Lag(String circuit) throws InterruptedException {
			
			switch(circuit){
			case "EB": Thread.sleep(3000);
						ddl_circuittype.selectByVisibleText("Unrouted Ethernet Bearer");
						 Thread.sleep(2000);
						 jsClick(btn_searchCircuit);
						Thread.sleep(8000);
						jsClick(chk_Circuit1);
						
						Thread.sleep(5000);
						jsClick(btn_AssociateCircuits);
						break;
			
			case "LAG": Thread.sleep(3000);
						ddl_circuittype.selectByVisibleText("Link Aggregation Group");
						 Thread.sleep(2000);
						 jsClick(btn_searchCircuit);
						Thread.sleep(8000);
						jsClick(chk_Circuit1);
						
						Thread.sleep(5000);
						jsClick(btn_AssociateCircuits); break;
			}
			   
			}
	 
		public WebElement waitForElement(WebElement elementToBeLoaded) {
		    WebDriverWait wait = new WebDriverWait(getDriver(),500);				   
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
/*	public void validateTopologyDetail(String template){
		try {
			
			
			UserSteps enduser = new UserSteps();
			
			
			String sName = lbl_Name.getText();
			String actualSerialName = sName.trim();
			slf4jLogger.info("actualSerialName= "+actualSerialName);
			
			String sFullName = lbl_FullName.getText();
			String actualFullName = sFullName.trim();
			slf4jLogger.info("actualFullName= "+actualFullName);
			
			String sTopologyRole = lbl_TopologyRole.getText();
			String actualTopologyRole = sTopologyRole.trim();
			slf4jLogger.info("actualTopologyRole= "+actualTopologyRole);
			
			
			String sTopologyTechType = lbl_TopologyTechType.getText();
			String actualTopologyTechType = sTopologyTechType.trim();
			slf4jLogger.info("actualTopologyTechType= "+actualTopologyTechType);
			
			IntDataContainer datacontainer = enduser.get_data_for_page(createtopologypage).getContainer(template);
			
			String fullNamefieldValue1 = datacontainer.getFieldValue("tbx_fullName");
			String topologyRolefieldValue = datacontainer.getFieldValue("ddl_topologyRole");
			String topologyTypefieldValue = datacontainer.getFieldValue("ddl_topologyTechType");
			
			slf4jLogger.info("fullNamefieldValue1 ="+fullNamefieldValue1);
			slf4jLogger.info("topologyRolefieldValue ="+topologyRolefieldValue);
			slf4jLogger.info("topologyTypefieldValue ="+topologyTypefieldValue);
			
			String FielsString[] = fullNamefieldValue1.split(":");
			String expectFullName = FielsString[1];
			slf4jLogger.info("expectFullName= "+expectFullName);
			
			
			String FielsString1[] = topologyRolefieldValue.split(":");
			String expecttopologyRolefieldValue = FielsString1[1];
			slf4jLogger.info("expecttopologyRolefieldValue= "+expecttopologyRolefieldValue);
			
			String FielsString2[] = topologyTypefieldValue.split(":");
			String expecttopologyTypefieldValue = FielsString2[1];
			slf4jLogger.info("expecttopologyTypefieldValue= "+expecttopologyTypefieldValue);
			
			
			Assert.assertEquals("Topology Full Name is not same", expectFullName, actualFullName);
//			slf4jLogger.info("Serial Name is same");
			
			Assert.assertEquals("Topology Role is not same", expecttopologyRolefieldValue, actualTopologyRole);
//			slf4jLogger.info("Vendor Part Name is same");
			
			Assert.assertEquals("Topology Technology Type is not same", expecttopologyTypefieldValue, actualTopologyTechType);
//			slf4jLogger.info("Vendor Part Name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}*/
		
		public void I_validate_Google_maps_option_is_displayed_in_the_Topology_view_related_tab() {
	        try {
	              Thread.sleep(1000);
	              Assert.assertTrue("Google Maps option not displayed",btn_Google_maps.isVisible() );
	              jsClick(btn_Google_maps);
	              Thread.sleep(1000);
	              Assert.assertTrue("Google Maps option not enabled", btn_Google_maps.isEnabled());
	        }catch(Exception e) {
	              e.printStackTrace();
	        }
	 }

	public void validate_topology_host_sequence_number(String Device_subtype) {
	                     try {
	                           switch(Device_subtype) {
	                           case "Alcatel-Lucent 7750 SR-12"  :Thread.sleep(1000);
	                                                                if (tab_Host_sequence.isCurrentlyVisible()&& tab_Host_sequence.getTextValue().equals("0")) 
	                                                                {
	                                                                       System.out.println("sequence number is "+ tab_Host_sequence.getTextValue().equals("0"));
	                                                                } else 
	                                                                {
	                                                                       throw new Error("Topology sequence number is not correct ");
	                                                                }break;
	                                                                
	                           case "Alcatel-Lucent 7750 SR-7"  :Thread.sleep(1000);
	                                                 if (tab_Host_sequence.isCurrentlyVisible()&& tab_Host_sequence.getTextValue().equals("0")) 
	                                                 {
	                                                    System.out.println("sequence number is "+ tab_Host_sequence.getTextValue().equals("0"));
	                                                 } else 
	                                                 {
	                                                    throw new Error("Topology sequence number is not correct ");
	                                                 }break;
	                
	                           case "Nokia 7750 SR-7-B"         :Thread.sleep(1000);
	                                                 if (tab_Host_sequence.isCurrentlyVisible()&& tab_Host_sequence.getTextValue().equals("0")) 
	                                                 {
	                                                     System.out.println("sequence number is "+ tab_Host_sequence.getTextValue().equals("0"));
	                                                 } else 
	                                                 {
	                                                     throw new Error("Topology sequence number is not correct ");
	                                                 }break;
	                                  
	                           case "Nokia 7750 SR-12-B"        :Thread.sleep(1000);
	                                                            if (tab_Host_sequence.isCurrentlyVisible()&& tab_Host_sequence.getTextValue().equals("1"))
	                                                            {
	                                                               System.out.println("sequence number is "+ tab_Host_sequence.getTextValue().equals("1"));
	                                                            } else 
	                                                            {
	                                                               throw new Error("Topology sequence number is not correct ");
	                                                            }break;
	                                                            
	                           }
	                           
	                 }catch(Exception e) {
	                           e.printStackTrace();
	                     }
	              }


}
