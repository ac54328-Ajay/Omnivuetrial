package com.ctl.it.qa.omnivue.tools.steps.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.pages.WebElementFacade;

public class OSRDB extends OmniVuePage {	
	
	 private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
   private static final String DB_CONNECTION = "jdbc:oracle:thin:@"+Page.envData.getContainer("OSRDB").getFieldValue("Hostname")+":"+Page.envData.getContainer("OSRDB").getFieldValue("port")+":"+Page.envData.getContainer("OSRDB").getFieldValue("SID");   
   private static final String DB_USER =Page.envData.getContainer("OSRDB").getFieldValue("Username");
   private static final String DB_PASSWORD = Page.envData.getContainer("OSRDB").getFieldValue("password");

   private static Connection dbConnection = null;
   private static Statement statement = null;	 		
   public static List<String> Return_list_Value = null;
   
	@Override
	public WebElementFacade getUniqueElementInPage() {	
		return null;
	}
	
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
	 
	 public static List<String> bam_reportvalidation(String ordernumber){	 	
		 
		 try {
		 		String query = "SELECT a.event_rowid, e.MASTER_REQUEST_ROWID, e.EVENT_NAME, e.EVENT_CATEGORY, e.EVENT_SUBCATEGORY, e.SOURCE_SYSTEM, e.EVENT_ID, e.EVENT_DATA, e.RECORD_TIME, e.EVENT_TIME, e.NOTE, a.COMPONENT_ROWID, a.ATTRIBUTE_NAME, a.ATTRIBUTE_VALUE FROM bam_attribute a,bam_event e where a.master_request_rowid = e.master_request_rowid and a.event_rowid= e.event_rowid and a.attribute_name = 'Order Number' and a.attribute_value='"+ordernumber+"' order by e.event_time desc";


		 		
		 			dbConnection = getDBConnection();
		 			statement = dbConnection.createStatement();
		 		
		 			// Execute SQL statement

		 			ResultSet rs = statement.executeQuery(query);
		 			List<String> List_attributes = new ArrayList<String>();
		 			
		 			while (rs.next()) {
		 				
		 			
		 				List_attributes.add(rs.getString("EVENT_ROWID"));
		 				
		 				List_attributes.add(rs.getString("MASTER_REQUEST_ROWID"));
		 	
		 				List_attributes.add(rs.getString("EVENT_NAME"));
		 
		 				List_attributes.add(rs.getString("EVENT_CATEGORY"));
		 			
		 				List_attributes.add(rs.getString("EVENT_SUBCATEGORY"));			
		 				
		 				List_attributes.add(rs.getString("SOURCE_SYSTEM"));
		 		
		 				List_attributes.add(rs.getString("EVENT_ID"));
		 				
		 				List_attributes.add(rs.getString("EVENT_DATA"));
		 				List_attributes.add(rs.getString("RECORD_TIME"));
		 				List_attributes.add(rs.getString("EVENT_TIME"));
		 				List_attributes.add(rs.getString("NOTE"));
		 				List_attributes.add(rs.getString("COMPONENT_ROWID"));
		 				List_attributes.add(rs.getString("ATTRIBUTE_NAME"));
		 				List_attributes.add(rs.getString("ATTRIBUTE_VALUE"));
		 				
		 			}
		 			
		 			
		 			
		 			 
		 			Return_list_Value = List_attributes;
		 		} 
		 		catch (SQLException e) {

		 			System.out.println(e.getMessage());

		 		} 

		 		finally {
		 			try {
		 			if (statement != null) { 				
							statement.close();
		 			}
		 			if (dbConnection != null) {
		 				dbConnection.close();
		 			}
		 			} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 		}
		 		return Return_list_Value;
		 
	 }
public static List<String> device_bam_reportvalidation(String name){	 	
		 
		 try {
		 	        String query = "SELECT a.EVENT_ROWID FROM bam_attribute a,bam_event e where a.master_request_rowid = e.master_request_rowid and a.event_rowid= e.event_rowid and a.attribute_value='"+name+"' order by e.event_time desc";
		 			dbConnection = getDBConnection();
		 			statement = dbConnection.createStatement();
		 		
		 			ResultSet rs = statement.executeQuery(query);
		 			List<String> List_attributes = new ArrayList<String>();
		 			
		 			while(rs.next()) {
		 				List_attributes.add(rs.getString("EVENT_ROWID"));	 				
		 				
		 			}
		 			Return_list_Value = List_attributes;
		 		} 
		 		catch (SQLException e) {

		 			System.out.println(e.getMessage());

		 		} 

		 		finally {
		 			try {
		 			if (statement != null) { 				
							statement.close();
		 			}
		 			if (dbConnection != null) {
		 				dbConnection.close();
		 			}
		 			} catch (SQLException e) {
						e.printStackTrace();
					}
		 		}
		 		return Return_list_Value;
		 
	 }
}

