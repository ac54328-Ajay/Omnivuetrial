package com.ctl.it.qa.omnivue.tools.pages.common;

 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctl.it.qa.omnivue.tools.pages.OVAuthentication;
import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
//import com.ctl.cipherTools.CipherMe;
/*import com.ctl.esec.*;
import com.ctl.esec.crypto.BasicEncryptor;
import com.ctl.esec.crypto.CipherText;  
*/

//import com.ctl.esec.crypto.*;
//import com.ctl.esec.util.GenericDataValidator;
//import com.ctl.esec.crypto.*;




public class OVLoginPage extends OmniVuePage {	
	
	OVAuthentication authenticate=new OVAuthentication();
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(UserSteps.class);

	
	@FindBy(xpath = ".//*[starts-with(text(),'OMNIVue Version')]")
	public WebElementFacade lbl_OV_version;
	
	@FindBy(id = "user")
	public WebElementFacade tbx_userName;
	
	@FindBy(id = "password")
	public WebElementFacade tbx_pwd;
	
	@FindBy(xpath=".//*[text()='Sign in']")
	public WebElementFacade btn_login;	
	
	@FindBy(xpath=".//*[@id='loginForm']//*[contains(text(),'User Login')]")
	public WebElementFacade lbl_loginpage;	
	
	@FindBy(xpath=".//*[@id='pwd-container']//*[@class='marginLRauto']/div[1]//span")
	public WebElementFacade lbl_keyvalue;	
	

	@Override
	public WebElementFacade getUniqueElementInPage() {		
		return tbx_userName;
	}
	
	public void OMNIVUE_Version_should_be_displayed_in_Login_Page() throws Throwable {
		
		
		if (lbl_OV_version.isDisplayed()){
			
			slf4jLogger.info(lbl_OV_version.getText());
			if(!lbl_OV_version.getText().trim().equals(Page.envData.getFieldValue("OV-LoginVersion"))){
				throw new Error("OMNIVUE VERSION IS Wrongly displayed");
			}
		}
		else {
			
			slf4jLogger.info("OMNIVUE VERSION IS NOT DISPLAYED");
		}

	}
	
	public void EnterDetails(String userType) throws Exception {
		IntDataContainer datacontainer = envData.getContainer(
				this.getClass().getSimpleName()).getContainer(userType);			
				
			tbx_userName.type(datacontainer.getFieldValue("username_tbx"));
			tbx_pwd.type(datacontainer.getFieldValue("pwd_tbx"));
			
		
			//tbx_pwd.type(authenticate.enter_cuid(datacontainer.getFieldValue("username_tbx")));
			
		//authenticate.Encrypt_ESEC("AC54328", "cent@123");	
	}
	
	public void clickLogin() {
		jsClick(btn_login);
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
}
