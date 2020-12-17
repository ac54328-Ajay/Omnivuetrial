package com.ctl.it.qa.OmniVueTests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import com.ctl.it.qa.omnivue.tools.pages.common.OVOrderPage;
import com.ctl.it.qa.omnivue.tools.steps.user.FileIOTest;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import com.ctl.it.qa.staf.xml.reader.XMLDataWriter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class StepDefinition  {		
		
	@Steps
	UserSteps userSteps;
	OVOrderPage orderpage;
	FileIOTest fileiotest;
	
	
	@Before
	public void beforeEveryScenario(Scenario scenario) {	
		
		//SplunkLogger.stepDefinitionSplunkBefore(StepDefinition.class,scenario);
		
	    
		Serenity.setSessionVariable("file_type").to(scenario.getName());

	}
	

	@After
	public void afterEveryScenario(Scenario scenario) { 		
		//SplunkLogger.stepDefinitionSplunkAfter(StepDefinition.class,scenario);
		
		try {
			com.ctl.it.qa.staf.Steps.isInitialized = false;
			Page.isInitialized = false;
			scenario.write("Data used for this test case:" + "\r\n");
			if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) userSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			}
			}catch(Exception e) {
			}finally {
			userSteps.captureTestResult(scenario);
			userSteps.getDriver().close();
			userSteps.getDriver().quit();
			}
			}	 
	
	}
	
	//private void printData(Scenario scenario) {
//		if (Serenity.sessionVariableCalled("account_name") != null) {
//			scenario.write("Account Name : " + Serenity.sessionVariableCalled("account_name").toString());
//		}
//		if (Serenity.sessionVariableCalled("opty_name") != null) {
//			scenario.write("Opty Name : " + Serenity.sessionVariableCalled("opty_name").toString());
//		}
//		if (Serenity.sessionVariableCalled("order_request_id") != null) {
//			scenario.write("Order Request ID : " + Serenity.sessionVariableCalled("order_request_id").toString());
//			
//		}
//		
//	}

//	@Then("^I save \"([^\"]*)\" as \"([^\"]*)\" in data xml$")
//	public void i_should_save_as_in_data_xml(String variableName, String tagName)
//			throws Throwable {
//		Page.envData.getContainer("RefreshData").setFieldValue(tagName, Serenity.sessionVariableCalled(variableName).toString());
//		new XMLDataWriter().writeXML(Page.data, "C:\\data.xml");
//	}	


