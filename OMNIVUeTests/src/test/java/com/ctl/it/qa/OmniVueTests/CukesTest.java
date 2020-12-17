

package com.ctl.it.qa.OmniVueTests;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctl.it.qa.staf.Environment;
import com.ctl.it.qa.staf.HtmlReport;
import com.ctl.it.qa.staf.STAFEnvironment;
import com.ctl.it.qa.staf.Steps;
import com.ctl.it.qa.staf.TestEnvironment;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * @author AB67493
 * @version 1.0.1.32
 * @Date:04-22-19
 */
@TestEnvironment(Environment.TEST1)//Test Environment on which execution is to happen is provided
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", tags={"@GETENF-5071"})
//
public class CukesTest {	
	@BeforeClass
	public static void setEnvironment() {				
		STAFEnvironment.registerEnvironment(CukesTest.class);
		Steps.initialize("Omnivue.xml");
		//SplunkLogger.cukeTestSplunkBeforeClass();
	}
	
	@AfterClass
	
	public static void clearEnvironment(){				 
		//SplunkLogger.cukeTestSplunkAfterClass(CukesTest.class);
		HtmlReport.generate();
	}	
}