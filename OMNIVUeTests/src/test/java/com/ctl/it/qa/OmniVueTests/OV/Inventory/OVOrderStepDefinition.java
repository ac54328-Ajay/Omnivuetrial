package com.ctl.it.qa.OmniVueTests.OV.Inventory;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OVOrderStepDefinition {

//	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;	
	
	
	//***********************************************************************************************************//
	//																											 //
	//																											 //
	//									Create Section															 //
	//																											 //
	//***********************************************************************************************************//
	
	@And("^I select \"([^\"]*)\" as Create type$")
	public void createtypeform(String type){
		
		
		enduser.create_type_select(type);
		
	}
	
	
	@And("^I select \"([^\"]*)\" in Create Tab$")
	public void createform(String type){
		
		enduser.createtabselect(type);
		/*try {
		actvtnpage.ddl_createType.selectByVisibleText(type);
		//actvtnpage.btn_create_subcform.click();
		
			Thread.sleep(1000);
			actvtnpage.btn_create.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		//}
		
		//actvtnpage.ddl_createType.selectByVisibleText(type);
	 }
	
	@And("^I validate attributes in create form for \"([^\"]*)\"$")
	public void i_validate_attributes_create_form(String type) throws Exception {
		Thread.sleep(5000);
		enduser.Validate_attribute_createform(type);
	}
	
	
	@And("^I fill all the fields in Order with \"([^\"]*)\"$")
	public void i_fill_all_the_fields_orders(String data) throws Throwable {	
		
		enduser.fill_order_fields(data);
	}
	
	@Then("^I Click on the \"([^\"]*)\" Button in Order Details page$")
	public void I_Click_on_the_Create_Button_in_Order_Details_page(String action) throws Throwable {		
		enduser.Createbutton_functionality(action);
	}
	
	@And("^I click on \"([^\"]*)\" button in MLTO Search page$")
	public void Edit_button_MLTOsearch(String action) throws Exception {		
		enduser.action_button_MLTO_Search(action);
	}
	
	@And("^I click on \"([^\"]*)\" button from Available action in MLTO Search page$")
	public void MLTOActionsperformance(String action) throws Exception {		
		enduser.mltoactionavailable(action);
	}
	
	@Then("^I should see success alert message for \"([^\"]*)\"$")
	public void alertmessageonaction(String msg) throws Exception {		
		enduser.alertmessageonmltoaction(msg);
	}
	
/*	@Then("^I update \"([^\"]*)\" in the FTT excel sheet$")
	public void updatefttsheet(String ordertype) throws Throwable {		
		enduser.fttsheetupdate(ordertype);
	}*/
	
	//***********************************************************************************************************//
	//																											 //
	//																											 //
	//									Search Section															 //
	//																											 //
	//***********************************************************************************************************//
	
	@Then("^I validate \"([^\"]*)\" attributes in Search page for \"([^\"]*)\"$")
	public void Search_form_atrribute_validation(String str1,String str2) throws Throwable {		
		enduser.Searchform_attribute_validation(str1,str2);
	}
	
	@Then("^I validate \"([^\"]*)\" attributes in Edit form for \"([^\"]*)\"$")
	public void Edit_form_atrribute_validation(String str1,String str2) throws Exception {		
		enduser.Editform_attribute_validation(str1,str2);
	}
	
	@And("^I enter the order number with \"([^\"]*)\" data and click$")
	public void orderNumberField(String testdata) throws FileNotFoundException, IOException, Throwable{
		enduser.fill_fields(testdata);
		enduser.click_searchBtn("Orders");
	}
	
	
	//***********************************************************************************************************//
	//																											 //
	//																											 //
	//									Validation Section														 //
	//																											 //
	//***********************************************************************************************************//
	
	
	@Then("^I validate \"([^\"]*)\" attributes in create form for \"([^\"]*)\"$")
	public void Create_form_atrribute_validation(String str1,String str2) throws Exception {		
		enduser.Createform_attribute_validation(str1,str2);
	}
	
	@Then("^I verify \"([^\"]*)\"$")
	public void verify_validation(String validation) throws Throwable {		
		enduser.verify_validation(validation);
	}
	
	@Then("^I Validate \"([^\"]*)\" button in MLTO search page which should be \"([^\"]*)\"$")
	public void mlto_button_validation(String btn, String state) throws Exception {		
		enduser.Orderbutton_validation(btn,state);
	}
	
	@When("^I select Product type as \"([^\"]*)\" in Order search$")
	public void search_order_producttype(String type) throws Exception {		
		enduser.search_order_producttype(type);
	}
	
	@And("^I Search with \"([^\"]*)\" through slider with data from Order Advanced Search result$")
	public void search_order_advancesearch_searchslider(String type) throws Throwable {		
		enduser.search_order_advancesearch_searchslider(type);
	}
	
	@And("^I validate Order details tab with Order Advanced Search result data$")
	public void search_order_advancesearch_validations_order() throws Throwable {		
		enduser.search_order_advancesearch_validations_order();
	}
	
	@And("^I click on Advance search button for \"([^\"]*)\"$")			//Advace Search button
	public void Advance_Search_button_action(String button) throws Throwable {
		enduser.Advance_Search_button_action(button);
	}
	
	@And("^Verify the direct 360 view page and Adv search results match$")
	public void exact_advance_search_validation() throws Throwable {
		enduser.exact_advance_search_validation();
	}
	
	@And("^I Validate the \"([^\"]*)\" button functionality on MLTO$")
	public void order_action_fuctionality(String action) throws Throwable {
		
		enduser.order_action_fuctionality(action);
	}
	@And("^I click on \"([^\"]*)\" tab 2time$")
    public void clickonTab2(String Acttab) throws Throwable {
           enduser.Activation_click_Tab2(Acttab);
           //slf4jLogger.info(Acttab);
        
    }
	

	@Then("^I validate the GETO value field is displayed in Order Parameters Section$")
	public void I_validate_the_GETO_value_field_is_displayed_in_Order_Parameters_Section() {
		enduser.i_validate_GETO_value_field_is_displayed();
	}
	
	@Then("^I validate the values displayed under the GETO value field$")
	public void i_validate_the_values_displayed_under_the_GETO_value_field(){
		enduser.i_validate_the_values_displayed_under_the_GETO_value_field();
	}
	



}
