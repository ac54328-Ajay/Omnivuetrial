package com.ctl.it.qa.OmniVueTests.user;

 

 import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedModServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVAssociatedServicesPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateServicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVHomepage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLoginPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModDeviceLookupPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVModServiceDetailsPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchDevicePage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVSearchServicePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OVCreateTransportPathStepDefinition {
	
	//private final static Logger slf4jLogger = LoggerFactory.getLogger(CukesTest.class);
	
	OVLoginPage loginPage;
	OVHomepage ovhomepage;
	OVActivationPage actvtnpage;
	OVAssociatedServicesPage assocservicespage;
	OVDeviceLookupPage devicelookuppage;
	OVSearchDevicePage searchdevicepage;
	OVSearchServicePage servicedetailspage;
	OVModServiceDetailsPage modservicedetailspage;
	OVModDeviceLookupPage moddevicelookuppage;
	OVAssociatedModServicesPage modassocservicespage;
	OVCreateDevicePage devcreatepage;
	OVCreateServicePage ovg; 
	

	@Steps
	UserSteps enduser;	
	
	@When("^I validate \"([^\"]*)\" device name along with the start device name$")
	public void i_validate_device_name_along_with_the_start_device_name(String devName) throws Exception {
		enduser.validate_TransportDeviceName(devName);
	}
	
	@When("^I select \"([^\"]*)\" as circuit between start and end device in Transport Path page$")
	public void selectCircuit(String devName) throws Exception {
		enduser.selectCircuit(devName);
	}
	
	@When("^I validate \"([^\"]*)\" device name along with the end device name$")
	public void i_validate_device_name_along_with_the_end_device_name(String devName) throws Exception {
		enduser.validate_endDeviceName(devName);
	}
	
	@And("^I validate the submit button as enabled and click on it$")
	 public void verifySubmitButtonAndClick() throws Exception{
		 enduser.verifySubmitButtonAndClick();	 
	 }
		
}
