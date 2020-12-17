package com.ctl.it.qa.omnivue.tools.steps.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.pages.WebElementFacade;

public class ISATDB extends OmniVuePage {	
	
	 private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@"+Page.envData.getContainer("ISATDB").getFieldValue("Hostname")+":"+Page.envData.getContainer("ISATDB").getFieldValue("port")+":"+Page.envData.getContainer("ISATDB").getFieldValue("SID");   
    private static final String DB_USER =Page.envData.getContainer("ISATDB").getFieldValue("Username");
    private static final String DB_PASSWORD = Page.envData.getContainer("ISATDB").getFieldValue("password");

    //private static Connection dbConnection = null;
   // private static Statement statement = null;	 		
   // public static List<String> Return_list_Value = null;
    
	@Override
	public WebElementFacade getUniqueElementInPage() {	
		return null;
	}
	
	 @SuppressWarnings("unused")
	private static Connection getDBConnection() {
	  		Connection dbConnection = null;	  		
	  		try {
	  			Class.forName(DB_DRIVER);
	  		} 		catch (ClassNotFoundException e) {
	  			System.out.println(e.getMessage());
	  		}

	  		try {
	  			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	  			return dbConnection;
	  		}	catch (SQLException e) {
	  			System.out.println(e.getMessage());
	  		}
	  		return dbConnection;
	  	}
	 
	 
}
