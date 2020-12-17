package com.ctl.it.qa.OmniVueTests.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.OmniVueTests.CukesTest;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
 
 
import cucumber.api.java.en.And;
 
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OVHomepagestepdefinition {
	
	private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	@Steps
	UserSteps enduser;
	OVHomepage homePage;
	
	
	
	@When("^I am in the Omnivue Welcome page$")
	public void i_am_in_the_Omnivue_Welcome_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Thread.sleep(1000);
		slf4jLogger.info("First stage");
		enduser.Homepagevalidation();
		//sanityenduser.Homepagevalidation();
	   // throw new PendingException();
	}

	@And("^I need to check User login box$")
	public void i_need_to_check_User_login_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		enduser.Userloginvalidation();
	   // throw new PendingException();
	}

	@When("^I need to check OSR, DSP, MOB, ARM, ICL, CLC System are up & running in Omnivue page$")
	public void i_need_to_evaluate_all_the_systems_are_up_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		enduser.Systemcheckonloginpage();
		
	   // throw new PendingException();
	}
	
	@Then("^OMNIVUE Version should be displayed in Login Page$")
		public void OMNIVUE_Version_should_be_displayed_in_Login_Page() throws Throwable {		
		
		enduser.OMNIVUE_Version_should_be_displayed_in_Login_Page();
			
	
	}
	
	@Then("^User should be navigated to \"([^\"]*)\" Page$")
	public void User_should_be_navigated_to_Page(String action) throws Throwable {
		enduser.User_should_be_navigated_to_Page(action);
		
	}
	
	@And("^I verify SOLR Suggestions for \"([^\"]*)\" google search$")
		public void Solr_Search(String Acttab) throws Throwable {
		enduser.solr_search_value(Acttab);	    
		}

	
	
		

}
