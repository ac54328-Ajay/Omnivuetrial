package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import java.awt.AWTException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateLocationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLocationDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchLocationPage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OVLocationStepDefinition {

	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVActivationPage actvtnpage;
	OVCreateLocationPage createlocationpage;
	OVLocationDetailsPage locationsearchpage;
	OVSearchLocationPage searchlocationpage; 
	
	@And("^I Search for sample Street Name as \"([^\"]*)\"$")
	public void i_select_street_name_as (String Streetname) throws Throwable {
		
		actvtnpage.tbx_streetname.sendKeys(Streetname);
		
	}
	
	@And("^I Select \"([^\"]*)\" in Location type drop down$")
	public void i_select_location_dropdown(String lcntype) throws Throwable {
		
		actvtnpage.ddl_LocationType.selectByValue(lcntype);
		
	}
	
	@And("^I fill all the mandatory fields required in Location create form with \"([^\"]*)\"$")
	public void i_fill_all_the_mandatory_fields_location_createform(String arg1) throws Throwable {

		//enduser.fill_fields_1();
		
		enduser.fill_fields_create_location(arg1);
		
		
	    //throw new PendingException();
	}
	
	
	
	
	@And("^I click on \"([^\"]*)\" on Location page$")
	public void Location_action(String action) throws Throwable {
		enduser.Location_action(action);
	}
	
	
	@Then("^Error message should be displayed on Location create form$")
	public void Error_message_should_be_displayed() throws Throwable{
		
		slf4jLogger.info(createlocationpage.lbl_error_message.getText());
		
	}
	
	
	@And("^I select \"([^\"]*)\" and search for \"([^\"]*)\"$")
	public void i_select_and_search_for(String arg1, String arg2) throws Throwable {
    
			createlocationpage.rdb_Add_To_Range.click();
	
			enduser.fill_fields_create_location(arg1);
			
			createlocationpage.btn_Find_Address_Range.click();
			
	createlocationpage.ddl_Address_Range_value.selectByValue("1");
	
	
}
	@And("^I fill the \"([^\"]*)\" details in location create form$")
	public void I_fill_the_Address_details(String arg1) throws Throwable {
		
		
		Boolean zip2 = createlocationpage.tbx_Zip_2.isCurrentlyEnabled() ;
		slf4jLogger.info("Is Secondary Zip text-box enabled = " + zip2);
		
		
		enduser.fill_fields_create_location(arg1);
		
		
			slf4jLogger.info("Seconday Zip text value = " + createlocationpage.tbx_Zip_2.getValue());
		
			//createlocationpage.cmb_Location_Role.selectByVisibleText("Building  site") ;
			//screatelocationpage.cmb_Location_Role.selectByVisibleText("Customer Site") ;
		
	}
	

	@And("^I select the Location Role in create form \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_select_the_Location_Role_in_create_form (String LRole, String LRoleType) throws Throwable {
		
		enduser.location_role_selection(LRole,LRoleType);		
		
	}
	
	@And("^I click on Create button in Individual Address page$")
	public void i_click_on_Create_button_in_Individual_Address_page() throws Throwable {
	    
		Boolean Create_button = createlocationpage.btn_Individual_Location.isCurrentlyVisible();
		
		slf4jLogger.info("Create button visibility status = "+ Create_button);
		
		createlocationpage.btn_Individual_Location.click();
	    //throw new PendingException();
	}
	
	@Then("^Location should get created successfully$")
	public void location_should_get_created_successfully() throws Throwable {

		Thread.sleep(5000);
		
		Boolean ana_display = createlocationpage.btn_Add_Next_Address.isDisplayed();
		Boolean btn_enabled = createlocationpage.btn_Add_Next_Address.isEnabled();
		Boolean label_Add_Range_ID = createlocationpage.lbl_Address_Range_ID.isDisplayed();
		
		
		if(ana_display == true ){
			slf4jLogger.info("The Add Next Address Button is DISPLAYED = "+ ana_display);
			
			if (btn_enabled == true){
				
				slf4jLogger.info("The Add Next Address Button is ENABLED = " + btn_enabled);
				
				if (label_Add_Range_ID == true){
					
					slf4jLogger.info("The Add Next Address Button is DISPLAYED = " + label_Add_Range_ID );
					
				}
				else {
					
					slf4jLogger.info("The Add Next Address Button is NOT DISPLAYED");
					
				}
			}
			
			else
			{
				slf4jLogger.info("The Add Next Address Button is DISABLED = "+ btn_enabled);
			}
		}
		
		else
		{
			slf4jLogger.info("The Add Next Address Button is not DISPLAYED = " + ana_display);	
		
		}
		
		/*
		Boolean label_Add_Range_ID =actpage.lbl_Address_Range_ID.isDisplayed();
		
		if (label_Add_Range_ID = true){
			
			slf4jLogger.info("The Add Next Address Button is DISPLAYED");
			
		}
		else {
			
			slf4jLogger.info("The Add Next Address Button is NOT DISPLAYED");
			
		}
		*/
		
		createlocationpage.tab_Individual_location_Create_form.click();
		Thread.sleep(2000);
		
		String message = createlocationpage.lbl_Individual_location_Create_form.getText();
		
		slf4jLogger.info(message);
	    //throw new PendingException();
	}
	
	@Then("^Individual Location should get created successfully$")
	public void Individual_Location_should_get_created_successfully () throws Throwable{
		
Thread.sleep(5000);
		
		Boolean ana_display =createlocationpage.btn_Add_Next_Address.isDisplayed();
		//Boolean btn_enabled = createlocationpage.btn_Add_Next_Address.isEnabled();
		
		if (createlocationpage.btn_Add_Next_Address.isDisplayed() == true){
			
			slf4jLogger.info("The Add Next Address Button is DISPLAYED = "+ ana_display);
			
			}	
		
			else {
			
			slf4jLogger.info("The Add Next Address Button is DISABLED = "+ ana_display);
			
			}
		
	
		if (createlocationpage.btn_Add_Next_Address.isEnabled() == true){
			
			slf4jLogger.info("The Add Next Address Button is DISPLAYED = "+ ana_display);
			
			}	
		
			else {
			
			slf4jLogger.info("The Add Next Address Button is DISABLED = "+ ana_display);
			
				}
	
	
		createlocationpage.tab_Individual_location_Create_form.click();
		Thread.sleep(2000);
		
		String message = createlocationpage.lbl_Individual_location_Create_form.getText();
		
		slf4jLogger.info(message);
	
	}
	
	@And ("^I select Address Range radio button$")
	public void I_select_Address_Range_radio_button () throws Throwable{
		//Thread.sleep(5000);
		createlocationpage.btn_AddressRange_radio_button.click();
		Thread.sleep(2000);
		
	}
	
	@And ("^I search for an \"([^\"]*)\" in Advance search$")
	public void I_search_for_an_TC54068_Address_Range (String arg1) throws Throwable {

		enduser.fill_fields_locationsrch(arg1) ;
		Thread.sleep(2000);
		locationsearchpage.btn_Search.click();
		
		
	}
	
	@And("^I click on Add Individual Address button from Address Range view page$")
	public void I_click_on_Add_Individual_Address_button_from_Address_Range_view_page () throws Throwable{
		
		slf4jLogger.info("Location Tab Title = " + locationsearchpage.lbl_addressTabTtitle.getText() );
		
		slf4jLogger.info("Is Add Individual Location visible = " + locationsearchpage.btn_AddIndividualLocation.isCurrentlyVisible() );
		
		slf4jLogger.info("Is Add Individual Location Enabled = " + locationsearchpage.btn_AddIndividualLocation.isEnabled() );
		
		locationsearchpage.btn_AddIndividualLocation.click();
		
		Thread.sleep(4000);
		
	}
	
	@And("^I fill the mandatory fields required for \"([^\"]*)\"$")
	public void I_fill_the_mandatory_fields_required_for_Individual_Location(String arg1) throws Throwable {
		
		slf4jLogger.info("Create form Tab title = " + locationsearchpage.lbl_locationTabTitle.getText() );
		
		//slf4jLogger.info();

		

		slf4jLogger.info("Primary Zip text value = " + locationsearchpage.tbx_Zip_1.getValue());
		
		Boolean zip2 = locationsearchpage.tbx_Zip_2.isCurrentlyEnabled() ;
		slf4jLogger.info("Is Secondary Zip text-box enabled = " + zip2);
		
		
		locationsearchpage.cmb_Location_Role.selectByVisibleText("Building Site") ;
		locationsearchpage.cmb_Location_Role.selectByVisibleText("Customer Site") ;
		
		
		enduser.fill_fields_locationsrch(arg1);
		
		//locationsearchpage.ddl_Restricted_Location.selectByVisibleText("TDM Voice");
		
		
	}
	
	@And("^I click on Create button in Address Within Range page$")
	public void I_click_on_Create_button_in_Address_Within_Range_page() throws Throwable{
		
		locationsearchpage.btn_Create_AWR.click();
		
		Thread.sleep(4000);
		
		slf4jLogger.info("Title of Newly Created Address = " + locationsearchpage.tab_AWR_view_Tab_title.getText());
		
		slf4jLogger.info("Range ID of Newly Created Address = " + locationsearchpage.lbl_Range_ID_view_screen.getText());
		
		
		//Boolean btn = locationsearchpage.btn_Add_Next_Address.isEnabled() ;
		
		//slf4jLogger.info(btn);
		
		if (locationsearchpage.btn_Add_Next_Address.isEnabled() == true){
			
			slf4jLogger.info("ADD NEXT ADDRESS BUTTON IS ENABLED");
			
		}
		
		else {
		
			slf4jLogger.info("ADD NEXT ADDRESS BUTTON IS DISABLED");
			
		}
		
		
	}
	
	@Then("^AWR Location should get created successfully$")
	public void AWR_Location_should_get_created_successfully() throws Throwable {
		
		Thread.sleep(2000);
		
		locationsearchpage.tab_Create_form_Address_Within_Range.click();
		
		slf4jLogger.info(locationsearchpage.tab_Create_form_Address_Within_Range.getText());
		
		slf4jLogger.info(locationsearchpage.lbl_success_message.getText());
		
		
	}
	
	@Then("^Error message should be displayed for SWC CLLI$")
	public void Error_message_should_be_displayed_for_SWC_CLLI () throws Throwable {
		
		if (createlocationpage.lbl_SWC_CLLI_Error_messge.isDisplayed()) {
			
			slf4jLogger.info("Message displayed on UI : " + createlocationpage.lbl_SWC_CLLI_Error_messge.getText());
		
		}
	
	}
	//************************		Pun FOrm Related	***************************************	//
	
	@And("^I select PUN form from following path \"([^\"]*)\"$")
	public void punform_path(String punform_path) throws AWTException{
		enduser.bulkcreate_Punpath(punform_path);
	}
	
	@And("^I click on \"([^\"]*)\" in create Bulk Address form$")
	public void pun_actions(String pun_action) throws InterruptedException{
		enduser.bulkcreate_punactions(pun_action);
	}
	
	@And("^I select Location type as \"([^\"]*)\" under Location Create Slider$")
	public void createtab_inventory_Location_Type_selectas(String Locationtype) throws Throwable {
		enduser.createtab_inventory_Location_Type_selectas(Locationtype);
	}
	
	@And("^I select Location type as \"([^\"]*)\" under Create Tab$")
	public void createtab_inventory_Location_Typeselect(String Locationtype) throws Throwable {
		enduser.createtab_inventory_Locationtype(Locationtype);
	}
	
	
	@And("^I select Location type as \"([^\"]*)\" in Location Advance Search screen$")
	public void i_select_Location_type_as (String Ltype) throws Throwable {
		
		enduser.Advancesearch_locationtypesearch(Ltype);
	}
	@And("^I click on \"([^\"]*)\" of Bulk Update Location$")
    public void click_on_update_on_bulk_update_page(String action) throws Throwable {
           searchlocationpage.click_on_updateButton_bulk_location_update_page(action);
    }
	@And("^I fill all the mandatory fields required in Bulk Update Location form with \"([^\"]*)\"$")
	public void  i_fill_update_location_createform(String arg1) throws Throwable {

		//enduser.fill_fields_1();
		
		enduser.fill_fields_location_update_form(arg1);
		
		
	    //throw new PendingException();
	}
	@And("^I enter Street name in Location bulk update$")
	public void  i_fill_street_name_in_location_createform() throws Throwable {

		enduser.enter_streetname();
		
	}

	@Then("^I validate the values displayed in the UI$")
	public void i_validate_the_values_displayed_for_the_created_addr_range() throws InterruptedException {
		enduser.validate_the_values_displayed_for_the_address_range_created();
	}
	
	@Then("^I validate the values displayed in the UI for the created individual address$")
	public void i_validate_the_values_displayed_for_the_created_individual_addr() throws InterruptedException {
		enduser.validate_the_values_displayed_for_the_individual_addr_created();
	}
	
	@And("^I update the fields in Individual adress$")
	public void i_update_fields_in_individual_address() {
		enduser.update_street_dir_prefix_suffix_streettype_in_individual_address();
	}
	
	
}
