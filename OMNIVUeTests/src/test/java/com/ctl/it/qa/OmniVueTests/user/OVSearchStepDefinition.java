package com.ctl.it.qa.OmniVueTests.user;

import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVTaskrenderingpage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVSearchStepDefinition {
	
	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVActivationPage actvtnpage;
	OVCreateDevicePage devcreatepage;
	OVLoginPage loginPage;
	OVSearchServicePage servicepage;
	OVTaskrenderingpage taskpage;
	//Tab selecting-Create or Search
	
	@And("^I Click on \"([^\"]*)\" tab in Omnivue Home Screen$")
	public void clickonTab1(String Acttab) throws Throwable {
		enduser.click_Tab(Acttab);
		//slf4jLogger.info(Acttab);
	    
	}
	
	@When("^I click on Gear Icon$")		
    public void i_click_gearIcon() throws Throwable {
           enduser.click_gearIcon();
    }
	
	
	
	@Then("^FAQ link should be absent$")
	public void i_check_FAQ() throws Throwable {
        enduser.i_check_FAQ();
 }
	
	@And("^I Search for \"([^\"]*)\" from Seacrh result page$")
	public void searchresult(String type) throws Throwable {
		enduser.searchresult(type);
	}
	
	@And("^I click on \"([^\"]*)\" tab$")
	public void clickonTab(String Acttab) throws Throwable {
		enduser.Activation_click_Tab(Acttab);
		//slf4jLogger.info(Acttab);
	    
	}
	
	@And("^I click on \"([^\"]*)\" tab2$")
	public void clickonTab2(String Acttab) throws Throwable {
		enduser.Activation_click_Tab2(Acttab);
		//slf4jLogger.info(Acttab);
	    
	}
	@And("^I select \"([^\"]*)\"$")
	public void selectaction(String Action) throws Throwable {
		enduser.verify_validation(Action);
	}
	
	//Going to OSIP Mode
	
	@And("^I goto Activation Page$")
	
	public void I_goto_Activation_Page() throws Exception {
		
		enduser.click_activationTab();
		
	}
	
	/* ************************************************************************* */
						//Search Tab Items are Listed Down
	/* ************************************************************************* */

	@And("^I searched for \"([^\"]*)\"$")			//Currently used by Order search & Passive Device Container 
	public void i_searched_for_device(String field) throws Throwable {
		slf4jLogger.info(field);
		enduser.fill_fields(field);
		//enduser.click_searchBtn();	    
	}
	
	@And("^I Search for \"([^\"]*)\" in Search Tab$")		//Currently used by Order search
	public void i_searched_for_orders(String field) throws Throwable {
		slf4jLogger.info(field);
		enduser.fill_fields(field);
		//enduser.click_searchBtn();	    
	}
	
	@And("^I Search for the \"([^\"]*)\" data from Search Tab$") 
	public void i_searched_for_data(String field) throws Throwable {
		//slf4jLogger.info(field+"Advaceorder");
		enduser.fill_fields(field);
		//enduser.click_searchBtn();	    
	}
	
	@And("^I click on search button for \"([^\"]*)\"$")			//Search button
	public void i_clicked_on_INV_search_button(String button) throws Throwable 
	{
		enduser.click_searchBtn(button);
		
		//slf4jLogger.info("First stage");
	}
	@And("^I click on task search and validate task results page$")
	public void i_clicked_on_task_search_button() throws Throwable 
	{
		enduser.i_clicked_on_task_search_button();
		
		//slf4jLogger.info("First stage");
	}
	@And("^I click on task advance search and validate task results page$")
	public void i_clicked_on_task_advancesearch_page() throws Throwable 
	{
		enduser.i_clicked_on_task_advancesearch_page();
		
		//slf4jLogger.info("First stage");
	}
	
	@And("I verity device list by selecting \"([^\"]*)\" row option")
	public void i_select_row_option(String rows) throws Throwable 
	{
		enduser.browser_zoom_in();
		enduser.select_row_option(rows);
		
		//slf4jLogger.info("First stage");
	}
	

	@And("^I clicked on Advance Search for \"([^\"]*)\"$")
	public void i_clicked_on_Adcance_Search_for(String advanced_Search) throws Throwable {
	   // enduser.click_searchBtn(advanced_Search);
		enduser.i_clicked_on_Adcance_Search_for(advanced_Search);
		
	}
	
	@And("^I Search for \"([^\"]*)\" type in Advance search screen$")
	public void i_search_order_inadvancesearchOrder(String searchcriteria) throws Throwable{
		enduser.i_search_order_inadvancesearchOrder(searchcriteria);
	}
	
	@And("^I Search order with \"([^\"]*)\"-Service type in Advance search screen$")
	public void i_search_order_with_DTN(String searchcriteria) throws Throwable{
		enduser.order_advance_search(searchcriteria);
	}
	
	@And("^I validate Action type in the search result page$")
	public void validate_actiontype_order_Search_page() throws Throwable{
		enduser.validate_actiontype_order_Search_page();
	}

	@And("^I click on \"([^\"]*)\" in the QOS Template page$")
	public void i_click_On_Button(String actkey) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		//Thread.sleep(5000);
		//loginPage.getDriver().findElement(By.xpath(".//*[contains(@value,'Edit')]")).click();
		enduser.Qos_screen_edit_and_save(actkey);
		
	}
	
	@And("^I clicked on expand icon of Related tab \"([^\"]*)\" page$")
	public void i_clicked_on_expand_icon_of_related_tab_activations_page(String tab) throws Exception {
		enduser.select_expandIcon(tab);
		Thread.sleep(10000);

	}
	
	@And("^I select product type as \"([^\"]*)\" under Order paramaters$")
	public void select_productype_advcesearch(String product_type) throws Throwable {
		
		enduser.Order_advancesearch_producttype(product_type);
	}
	
	@And("^I Search for the ([^\"]*) data from Search Tab$")
 	public void i_Search_for_the_TC_A_data_from_Search_Tab(String arg1) throws Throwable {
 	    // Write code here that turns the phrase above into concrete actions
 		slf4jLogger.info(arg1);
 		enduser.fill_fields(arg1);
 	} 


	//End of Search Button items ****************************************************************
	
	

	

	@And("^I searched for ([^\"]*) device$")  //Check do we need this
	public void i_searched_for_a_device(String container3) throws Throwable {
		enduser.fill_fields_from("OVActivationPage","US43123-TC24975",container3);
		enduser.get_container_from_xml("OVActivationPage","US43123-TC24975",container3);
		System.out.println(enduser.get_container_from_xml("OVActivationPage","US43123-TC24975",container3));
		//enduser.click_searchBtn();
	     
	}
	
		/* ************************************************************************* */
								//Create Tab Items are Below
		/* ************************************************************************* */
	
	
	
	@And("^I go to \"([^\"]*)\" type and select \"([^\"]*)\"$")  //Selecting Type & sub-Type in Create form
	public void selectFormType(String type,String subtype) {
	
	enduser.selectFormType(type,subtype);
	}
	
	
	@And("^I select Create type as \"([^\"]*)\" and sub-type as \"([^\"]*)\" under the Create Tab$")  //Selecting Type & sub-Type in Create form Similar to line 168 decide & remove one of it
	public void Create_Selecttype_withsubtype(String type,String subtype) {
		
		enduser.selectFormType(type,subtype);
		}
	
	@And("^I Select \"([^\"]*)\" as Filter By value$")     //Selecting the filter type in Create form for Inventory Type
	public void selectFilterby(String tech) throws InterruptedException{
			actvtnpage.click_Technologytype(tech);
			Thread.sleep(1000);
		}
	
	@Then("Select the technology as \"([^\"]*)\" with Device Type as \"([^\"]*)\" with Sub-Type as \"([^\"]*)\"$")	//Selecting the TECHNOLOGY Type with Device & sub-device categories
	public void createFormpage(String techtype,String devtype,String devsubtype){
		enduser.createFormpage(techtype,devtype,devsubtype);
	}
	
	@Then("^Select the Role as \"([^\"]*)\" with Device Type as \"([^\"]*)\" with Sub-Type as \"([^\"]*)\"$") //Selecting the Role Type with Device & sub-device categories
	public void createroleform(String role,String devtype,String devsubtype){
		enduser.createroleform(role,devtype,devsubtype);
	}	

	@And("^Select Device Type as \"([^\"]*)\" with Sub-Type as \"([^\"]*)\"$")  //Selecting Device category Type & its Sub-category for Inventory Create form
	public void createFormpage(String devtype,String devsubtype){
		
		enduser.device_select(devtype,devsubtype);		
	}	
	
	@And("^I Select Port Type as \"([^\"]*)\"$")
	public void create_tab_porttype(String Porttype){
		enduser.selectport_createtab(Porttype);
	}
	
	@And("^I select \"([^\"]*)\" location type$")		//Sairam code merge---21/7/2016--@US48525 @TC53733
	public void select_locationtype(String locationtype) throws Throwable{
		enduser.locationtype(locationtype);
	}
	
	@And("^I entered details for the \"([^\"]*)\"$") // Shivaprasad code is dependent
	public void i_entered_details_for_gos(String field) throws Throwable {
		slf4jLogger.info(field);
		enduser.fill_fields(field);
		// enduser.click_searchBtn();
	}
	
	@And("^I Select \"([^\"]*)\" for the drop down Device Sub Type$")
	public void i_select_splitter_option_for_gos(String splitter_option) throws Exception {
		slf4jLogger.info(splitter_option);
		enduser.select_devicesubtype(splitter_option);
		// enduser.click_searchBtn();
	}
	
/*	@And("^I click on Launch Create Form for \"([^\"]*)\"$") // shiva
	public void i_click_on_Launch_Create_Form(String create_button) throws Throwable {
		enduser.click_launch_create_form(create_button);
	
	}*/
	
	@And("^I Select \"([^\"]*)\" for the drop down Service Type$")
	public void i_Select_for_the_drop_down_Service_Type(String service_type) throws Throwable {                          //8.04.2016/shiva
	    // Write code here that turns the phrase above into concrete actions
		enduser.i_Select_for_the_drop_down_Service_Type_us(service_type);
	}
	
	@And("^I clicked Networking Details Tab$") //Fill the Device create form page details
	public void clickedNetworkingDetailsTab(){
		enduser.clickedNetworkingDetailsTab();		
	}
	
	
	
	/* ******************Network Create Form ************ */
	
	@And("^I Launch the Network form with \"([^\"]*)\"$")
	public void Enter_WirecenterCLLI_and_EngOrdId(String detailsgpon) throws Throwable{
		
		enduser.fill_create_GDB(detailsgpon);
		
	}
		
	//End of Create Button items ****************************************************************
	
	@Then("^Validate the fields present in the result page$") // Move to UserStep Definition
	public void attribute_validation(){
		enduser.attri_field();
	}
	

	
 	  @And("^I verified \"([^\"]*)\" from the Search type dropdown$")
 	  public void verifySearchSection(String sectionValue){
 		  enduser.verifySearchSection(sectionValue);
 	  }
 	  
 	 @And("^I verified \"([^\"]*)\" from the Inventory type dropdown$")
	  public void verifyInventorySection(String sectionValue){
		  enduser.verifyInventorySection(sectionValue);
	  }

 	@And("^I Select Device Role as \"([^\"]*)\" with Device Name as \"([^\"]*)\"$")
 	public void i_Select_Device_Role_as_with_Device_Name_as(String devRole, String devName) {
 		enduser.createDeviceRole_Name(devRole,devName);
 	}
 	
 	
	@Then("^I should see the following Search types \"([^\"]*)\"$")
 	public void i_search_tab_serachtype_validation(String searchtype) throws Throwable {
 		enduser.search_tab_searchtype(searchtype);
 	}
 	
 	@And("^I select \"([^\"]*)\" from the Search type$")
 	public void i_select_searchtype_search_tab(String invtype) throws Throwable {
 		enduser.search_tab_searchtype(invtype);
 	}
 	
 	@And("^I should see the following Inventory type values \"([^\"]*)\"$")
 	public void i_search_tab_inventorytype_validation(String invtype) throws Throwable {
 		enduser.search_tab_inventorytype(invtype);
 	}
 	
 	
 	@And("^I should see the following Circuit Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_circuit_validation(String cirtype) throws Throwable {
 		enduser.search_tab_inventory_circuit(cirtype);
 	}
 	
 	@And("^I should see the following Contact Type values \"([^\"]*)\"$")
	public void i_search_tab_inventory_contact_validation(String contype) throws Throwable {
 		enduser.search_tab_inventory_contact(contype);
 	}
 	
 	@And("^I should see the following Device Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_device_validation(String devtype) throws Throwable {
 		enduser.search_tab_inventory_device(devtype);
 	}
 	
 	@And("^I select Device Type as \"([^\"]*)\"$")
 	public void i_selectdevicetypeas(String devtype) throws Throwable {
 		enduser.search_tab_inventory_deviceselect(devtype);
 	}
 	
 	@And("^I should see the following Link Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_Link_validation(String Linktype) throws Throwable {
 		enduser.search_tab_inventory_Link(Linktype);
 	}
 	
 	@And("^I should see the following Number Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_Number_validation(String Numbertype) throws Throwable {
 		enduser.search_tab_inventory_Number(Numbertype);
 	}
 	
 	@And("^I should see the following Reservation Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_Reservation_validation(String Reservationtype) throws Throwable {
 		enduser.search_tab_inventory_Reservation(Reservationtype);
 	}
 	
 	@And("^I should see the following Service Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_Service_validation(String Servicetype) throws Throwable {
 		enduser.search_tab_inventory_Service(Servicetype);
 	}
 	
 	@And("^I select Service Type values as \"([^\"]*)\" under Service Search slider$")
 	public void i_inventory_Service_searchslider(String Servicetype) throws Throwable {
 		enduser.i_inventory_Service_searchslider(Servicetype);
 	}
 	
 	@And("^I should see the following Topology Type values \"([^\"]*)\"$")
 	public void i_search_tab_inventory_Topology_validation(String Topologytype) throws Throwable {
 		enduser.search_tab_inventory_Topology(Topologytype);
 	}
 	
 	@And("^I should see the following Network Type values \"([^\"]*)\"$")
 	public void i_search_tab_Network_validation(String Networktype) throws Throwable {
 		enduser.search_tab_Network_type(Networktype);
 	}
 	
 	@And("^I should see the following Fiber Build- Devicerole values \"([^\"]*)\"$")
 	public void i_search_tab_Network_Fiber_Build_validation(String FiberBuildtype) throws Throwable {
 		enduser.search_tab_Network_FiberBuild(FiberBuildtype);
 	}
 	
 	@And("^I should see the following Transport Path-Devicerole values \"([^\"]*)\"$")
 	public void i_search_tab_Network_Transport_Path_validation(String TransportPathtype) throws Throwable {
 		enduser.search_tab_Network_TransportPathtype(TransportPathtype);
 	}
 	
	@And("^I should see the following Order type \"([^\"]*)\"$")
 	public void i_search_tab_ordertype_validation(String ordertype) throws Throwable {
 		enduser.i_search_tab_ordertype_validation(ordertype);
 		
 	}
 	
 	
 	@And("^I should see the following Product type \"([^\"]*)\" with Order type \"([^\"]*)\"$")
 	public void i_search_tab_order_validation(String producttype, String ordertype) throws Throwable {
 		enduser.search_tab_ordertype_validation(producttype,ordertype);
 	}
 	
 	@And("^I should see the following SLC check Types \"([^\"]*)\"$")
 	public void i_search_tab_SLC_check_Types_validation(String SLCtype) throws Throwable {
 		enduser.search_tab_SLCtype(SLCtype);
 	}
 	
 	
 	/* GFast Related */
 	
 	@And("^I select \"([^\"]*)\" in Search slider$")
 	public void i_select_Search_slider(String searchtype) throws Throwable {
 		enduser.search_tab_searchtype(searchtype);
 	}
 	
 	@And("^I enter correlation Id$")
 	public void i_enter_CID() throws Throwable {
 		enduser. i_enter_CID();
 	}
 	
 	@And("^I click on \"([^\"]*)\" button for task search$")
 	public void i_click_Searchbutton_task(String searchtype) throws Throwable {
 		enduser.search_tab_searchbutton_task(searchtype);
 	}
 	
 	@And("^I verify whether the workgroup is added top disconnect task$")
 	public void i_verify_workgroup_is_added_to_task() throws Throwable {
 		enduser.i_verify_workgroup_is_added_to_task();
 	}
 	
 	
 	@And("^I click on \"([^\"]*)\" button for disconnect task$")
 	public void  i_click_Abort_or_Proceed_button_task(String buttontype) throws Throwable {
 		enduser.i_click_Abort_or_Proceed_button_task(buttontype);
 	}
 	
 	@And("^I select \"([^\"]*)\" as Product-type in Order’s Search slider$")
 	public void i_select_Search_slider_orders_producttype(String search_order_producttype) throws Throwable {
 		enduser.search_tab_orders_producttype_select(search_order_producttype);
 	}
 	 
 	@And("^I select \"([^\"]*)\" form Order-type in Order’s Search slider$")
 	public void i_select_Search_slider_GPONorders_ordertype(String search_order_ordertype) throws Throwable {
 		enduser.search_tab_GPONorders_ordertype_select(search_order_ordertype);
 	}
 	
 	@And("^I click on the circuit tab and validate$")
	public void I_click_on_circuittab_and_validate() throws Exception 
	{
		servicepage.Validate_circuits_in_service();
	}
 	@And("^I searched for Task \"([^\"]*)\"$")			//Currently used by Order search & Passive Device Container 
	public void i_searched_for_Task(String field1) throws Exception {
		actvtnpage.ddl_searchType.selectByVisibleText("Tasks");
		//actvtnpage.ddl_task_type.selectByVisibleText("All Tasks");
		Thread.sleep(5000);
		actvtnpage.tbx_taskname.sendKeys(field1);
		Thread.sleep(5000);
		actvtnpage.tbx_taskname.sendKeys(Keys.ENTER);
		//enduser.click_searchBtn();	    
	}
	@And("^I have clicked on the arrow$")
	public void I_have_clicked_on_the_arrow() throws Exception {
		Thread.sleep(3000);
		taskpage.btn_Task_arrow.click();
		Thread.sleep(5000);
	}
	@And("^I Validate the action buttons in API View$")
	public void I_Validate_actionbuttons_API_View() throws Exception {
		Thread.sleep(3000);
		taskpage.btn_taskaction_retry.shouldBePresent();
		System.out.println("Retry button is present");
		taskpage.btn_taskaction_reassign.shouldBePresent();
		System.out.println("Reassign button is present");
		taskpage.btn_taskaction_complete.shouldBePresent();
		System.out.println("complete button is present");
		taskpage.btn_taskaction_save.shouldBePresent();
		System.out.println("Save button is present");
		Thread.sleep(5000);
	}
	
	@And("^I Enter Subscriber Full name as \"([^\"]*)\"$")
	public void I_Enter_Subscriber_Fullname_as_Test(String name) throws Throwable 
	{
		enduser.I_Enter_Subscriber_Fullname_as_Test(name);
		
	}
	
	@And("^I search QOS Template with Template name as \"([^\"]*)\"$")
	public void searchtab_templatename(String name) throws Throwable 
	{
		enduser.searchtab_templatename(name);
		
	}
	
	@And("^I should see Task value in the Search from dropdown$")
	public void searchtab_archieve_searchfrom() throws Throwable {
		enduser.searchtab_archieve_searchfrom();
	}
	
	@And("^I select \"([^\"]*)\" in the Search Archive slider$")
	public void searchtab_archieve_criteria(String value) throws Throwable {
		enduser.searchtab_archieve_criteria(value);
	}
	
	@And("^I should be able to see the Archive search result displayed$")
	public void validate_archive_resulttable() throws Throwable {
		enduser.validate_archive_resulttable();
	}
	
	@And("^I verify the OLT RING & PON Collector Topology Technology Type should not be displayed in \"([^\"]*)\" slider$")
	public void validate_topologydropdownvalues(String slider) throws Throwable {
		enduser.validate_topologydropdownvalues(slider);
	}
	//TransportPath Create
	
    @And("^I select Device Role as \"([^\"]*)\" and Device Name as \"([^\"]*)\"$")  //Selecting Type & sub-Type in Create form
    public void I_select_DeviceRole_and_DeviceName_in_TransportPath(String DeviceRole,String DeviceName) {
    
           actvtnpage.ddl_Create_TransportPath_DeviceRole.selectByVisibleText(DeviceRole);
           
           actvtnpage.tbx_Create_TransportPath_DeviceName.clear();
           
           actvtnpage.tbx_Create_TransportPath_DeviceName.sendKeys(DeviceName);
    
    }
    
    @And("^I select Device Role as \"([^\"]*)\"$")  //Selecting Type 
    public void I_select_DeviceRolein_TransportPath(String DeviceRole) throws InterruptedException {
    
           actvtnpage.ddl_Create_TransportPath_DeviceRole.selectByVisibleText(DeviceRole);
     //      Thread.sleep(3000);
			 actvtnpage.tbx_Create_TransportPath_DeviceName.type("LSVGNVXV");
			 String svalue = "dasd";
		actvtnpage. Solr_select(svalue, "LSV");
			
    
    }
    
	//TransportPath Create
	
	
	@And("^I Click on  Add Contact button$")
	public void Add_Contact_button() throws Throwable {
	   // enduser.click_searchBtn(advanced_Search);
		enduser.Add_Contact_button_click();
		
	}
	
	
	public void validate_GETO_values_under_GETOvalue_task_advanced_search()   {
        
        taskpage.verify_GETOvalues_in_Task_advanced_search();
        
        
 }

}
