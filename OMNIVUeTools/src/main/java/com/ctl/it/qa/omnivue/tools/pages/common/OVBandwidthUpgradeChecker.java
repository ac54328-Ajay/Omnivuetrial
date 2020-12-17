package com.ctl.it.qa.omnivue.tools.pages.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVBandwidthUpgradeChecker extends OmniVuePage{
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath=".//*[@ng-click='select()']//tab-heading[text()='Bandwidth Upgrade Checker']")
	public WebElementFacade tab_BandwidthUpgradeChecker_SLC_Create_Page;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@id='serviceLookup']/i")
	public WebElementFacade tab_Service_BandwidthUpgradeChecker_Page;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-model='bucForm.accessType']")
	public WebElementFacade ddl_Access_Type_BandwidthUpgradeChecker_Page;

	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-model='bucForm.bandwidth']")
	public WebElementFacade ddl_Bandwidth_BandwidthUpgradeChecker_Page;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@ng-model='bucForm.portType']")
	public WebElementFacade ddl_portType_BandwidthUpgradeChecker_Page;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Check Bandwidth']")
	public WebElementFacade btn_CheckBandwidth_BandwidthUpgradeChecker_Page;
	
	@FindBy(xpath=".//*[@class='tab-pane ng-scope active']//*[@value='Check Bandwidth']/preceding-sibling::button")
	public WebElementFacade btn_Cancel_BandwidthUpgradeChecker_Page;


	public void OVCheckBandwidthSanity() throws InterruptedException { 
		waitFor(tab_BandwidthUpgradeChecker_SLC_Create_Page); 	
		tab_BandwidthUpgradeChecker_SLC_Create_Page.click();
		waitFor(btn_CheckBandwidth_BandwidthUpgradeChecker_Page);
			Thread.sleep(5000);
			WaitForPageToLoad(1000);
			
			
			if(!tab_Service_BandwidthUpgradeChecker_Page.isCurrentlyVisible()&&!tab_Service_BandwidthUpgradeChecker_Page.isCurrentlyEnabled()){
				slf4jLogger.debug("Service look up is not displayed in Bandwidth Upgrade Checker Page");
				throw new Error("Service look up is not displayed in Bandwidth Upgrade Page");
			}
			

			if(!ddl_Access_Type_BandwidthUpgradeChecker_Page.isCurrentlyVisible() && ddl_Access_Type_BandwidthUpgradeChecker_Page.isCurrentlyEnabled()){
				slf4jLogger.debug("Access_Type dropdown  is not displayed in Bandwidth Upgrade Checker Page");
				throw new Error("Access_Type dropdown  is not displayed in Bandwidth Upgrade Checker Page");
			}
			
			if(!ddl_Bandwidth_BandwidthUpgradeChecker_Page.isCurrentlyVisible() && ddl_Bandwidth_BandwidthUpgradeChecker_Page.isCurrentlyEnabled()){
				slf4jLogger.debug("Bandwidth dropdown  is not displayed in Bandwidth Upgrade Checker Page");
				throw new Error("Bandwidth dropdown  is not displayed in Bandwidth Upgrade Checker Page");
			}
			
			
			if(!ddl_portType_BandwidthUpgradeChecker_Page.isCurrentlyVisible() && ddl_portType_BandwidthUpgradeChecker_Page.isCurrentlyEnabled()){
				slf4jLogger.debug("portType dropdown  is not displayed in Bandwidth Upgrade Checker Page");
				throw new Error("portType dropdown  is not displayed in Bandwidth Upgrade Checker Page");
			}
			

			if(!btn_CheckBandwidth_BandwidthUpgradeChecker_Page.isCurrentlyVisible() && btn_CheckBandwidth_BandwidthUpgradeChecker_Page.isCurrentlyEnabled()){
				slf4jLogger.debug("CheckBandwidth button  is not displayed in Bandwidth Upgrade Checker Page");
				throw new Error("CheckBandwidth Button  is not displayed in Bandwidth Upgrade Checker Page");
			}
			
			if(!btn_Cancel_BandwidthUpgradeChecker_Page.isCurrentlyVisible() && btn_Cancel_BandwidthUpgradeChecker_Page.isCurrentlyEnabled()){
				slf4jLogger.debug("Cancel button is not displayed in Bandwidth Upgrade Checker Page");
				throw new Error("Cancel Button is not displayed in Bandwidth Upgrade Checker Page");
			}
			
			ddl_Access_Type_BandwidthUpgradeChecker_Page.selectByIndex(0);Thread.sleep(2000);
			ddl_Bandwidth_BandwidthUpgradeChecker_Page.selectByIndex(3); Thread.sleep(3000);
			ddl_portType_BandwidthUpgradeChecker_Page.selectByIndex(1);
	}
}
