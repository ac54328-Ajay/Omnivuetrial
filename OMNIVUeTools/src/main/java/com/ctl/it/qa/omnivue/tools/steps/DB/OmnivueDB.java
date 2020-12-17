package com.ctl.it.qa.omnivue.tools.steps.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.staf.Page;
import net.serenitybdd.core.pages.WebElementFacade;

public class OmnivueDB extends OmniVuePage {	
	
   private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
   private static final String DB_CONNECTION = "jdbc:oracle:thin:@"+Page.envData.getContainer("OmnivueDB").getFieldValue("Hostname")+":"+Page.envData.getContainer("OmnivueDB").getFieldValue("port")+":"+Page.envData.getContainer("OmnivueDB").getFieldValue("SID");   
   private static final String DB_USER =Page.envData.getContainer("OmnivueDB").getFieldValue("Username");
   private static final String DB_PASSWORD = Page.envData.getContainer("OmnivueDB").getFieldValue("password");
   private static final String user_cuid = Page.envData.getContainer("OVLoginPage").getContainer("Admin").getFieldValue("username_tbx");

   private static Connection dbConnection = null;
   private static Statement statement = null;	
   public static String Return_Value =null;
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
	 public static List<String> device_auditlogs(String name) throws SQLException{
    	 Connection dbConnection = null;
  		Statement statement = null;

  		//String selectTableSQL1 = "SELECT description FROM service where name = '" + ServiceName + "'";
  		
  		//String selectTableSQL1 = "SELECT * FROM track_user where ACTIVITY_VALUE = '"+name+"' order by RECEIVED_DT desc";
  		
  		String selectTableSQL1 = "SELECT * FROM (SELECT ROW_NUMBER() over (order by a.RECEIVED_DT desc) as rn, a.* FROM track_user a where ACTIVITY_VALUE = '"+name+"') where rn = 2";

  		try {

  			dbConnection = getDBConnection();

  			statement = dbConnection.createStatement();

  			System.out.println(selectTableSQL1);

  			// Execute SQL statement

  			ResultSet rs = statement.executeQuery(selectTableSQL1);
  			List<String> List_Device_attributes = new ArrayList<String>();
  			
  			while (rs.next()) {
 				
 				String Auditlog_ACTIVITY = rs.getString("ACTIVITY");
 				List_Device_attributes.add(Auditlog_ACTIVITY);
 				String Auditlog_Details = rs.getString("DETAILS");
 				List_Device_attributes.add(Auditlog_Details);
  			}
 				Return_list_Value = List_Device_attributes;
  		}		 
  	 		catch (SQLException e) {
  	 			System.out.println(e.getMessage());
  	 		} 
  	 		finally {
  	 			if (statement != null) {
  	 				statement.close();
  	 			}
  	 			if (dbConnection != null) {
  	 				dbConnection.close();
  	 			}
  	 		}
  	 		return Return_list_Value;
	 	 
     }
	    public static List<String> audit_log_details(String device,String action){	 		
	    	 try {
	 		//String selectTableSQL1 = "SELECT * FROM node where name ='"+deivce+"'";
	    	
				//	slf4jLogger.info(arg01+" Action Type  value is avaliable in Database");

	 		String selectTableSQL1 ="SELECT * FROM track_user where ACTIVITY_VALUE = '"+device+"' and ACTIVITY='"+action+"'order by RECEIVED_DT desc";

	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_audit_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String activity_name = rs.getString("ACTIVITY");
	 				List_audit_attributes.add(activity_name);
	 				System.out.println(List_audit_attributes);
	 					 				
	 			}
	 			
	 			Return_list_Value = List_audit_attributes;
	 			dbConnection.close();
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
	 
	    public static List<String> audit_logs_focus(String userid) throws SQLException{
            Connection dbConnection = null;
                  Statement statement = null;

                  //String selectTableSQL1 = "SELECT * FROM track_user where USER_ID ='"+userid+"'and ROWNUM <=5 order by RECEIVED_DT desc";
                  
                  String selectTableSQL1 ="select * from (SELECT * FROM track_user where USER_ID ='"+userid+"' order by RECEIVED_DT desc) where ROWNUM <5";
                  
                  try {

                        dbConnection = getDBConnection();

                        statement = dbConnection.createStatement();

                        System.out.println(selectTableSQL1);

                        // Execute SQL statement

                        ResultSet rs = statement.executeQuery(selectTableSQL1);
                        List<String> audit_logs_focus = new ArrayList<String>();
                        
                        while (rs.next()) {
                               String auditlog_DB_focus = rs.getString("FOCUS");
                               String auditlog_DB_ACTIVITY = rs.getString("ACTIVITY");
                                
                               audit_logs_focus.add(auditlog_DB_focus);
                                
                        }
                                Return_list_Value = audit_logs_focus;
                  }             
                         catch (SQLException e) {
                                System.out.println(e.getMessage());
                         } 
                         finally {
                                if (statement != null) {
                                      statement.close();
                                }
                                if (dbConnection != null) {
                                      dbConnection.close();
                                }
                         }
                         return Return_list_Value;
                   
         }

		public List<String> manual_task_validation_db(String taskid) {
			
			
			try {
		 		//String selectTableSQL1 = "SELECT * FROM node where name ='"+deivce+"'";
		 		
		 		String selectTableSQL1 ="Select * from task_instance where TASK_INSTANCE_ID = '"+taskid+"'";

		 		
		 			dbConnection = getDBConnection();
		 			statement = dbConnection.createStatement();

		 			System.out.println(selectTableSQL1);

		 			// Execute SQL statement

		 			ResultSet rs = statement.executeQuery(selectTableSQL1);
		 			List<String> List_audit_attributes = new ArrayList<String>();
		 			
		 			while (rs.next()) {
		 				
		 				String task_instance_id = rs.getString("TASK_INSTANCE_ID");
		 				List_audit_attributes.add(task_instance_id);
		 				System.out.println(List_audit_attributes);
		 				
		 				String task_name = rs.getString("TASK_INSTANCE_REFERRED_AS");
		 				List_audit_attributes.add(task_name);
		 				System.out.println(List_audit_attributes);
		 				
		 				
		 					 				
		 			}
		 			
		 			Return_list_Value = List_audit_attributes;
		 			dbConnection.close();
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
		
public List<String> configurable_data_xref_table_db() {
			
			
			try {
		 		//String selectTableSQL1 = "SELECT * FROM node where name ='"+deivce+"'";
		 		
				String OV_HELP_ICON_LINK ="OV_HELP_ICON_LINK";
		 		String selectTableSQL1 ="select * from configurable_data_xref where CONFIG_TYPE = '"+OV_HELP_ICON_LINK+"'";
		 		System.out.println(selectTableSQL1);
		 		
		 			dbConnection = getDBConnection();
		 			statement = dbConnection.createStatement();

		 			System.out.println(selectTableSQL1);

		 			// Execute SQL statement

		 			ResultSet rs = statement.executeQuery(selectTableSQL1);
		 			List<String> List_audit_attributes = new ArrayList<String>();
		 			
		 			while (rs.next()) {
		 				
		 				String help_CONFIG_ID = rs.getString("CONFIG_ID");
		 				List_audit_attributes.add(help_CONFIG_ID);
		 				System.out.println(List_audit_attributes);
		 				
		 				String help_CONFIG_TYPE = rs.getString("CONFIG_TYPE");
		 				List_audit_attributes.add(help_CONFIG_TYPE);
		 				System.out.println(List_audit_attributes);
		 				
		 				String help_NAME = rs.getString("NAME");
		 				List_audit_attributes.add(help_NAME);
		 				System.out.println(List_audit_attributes);
		 				
		 				//String help_VALUE = rs.getString("VALUE");
		 				List_audit_attributes.add(help_CONFIG_TYPE);
		 				System.out.println(List_audit_attributes);
		 				
		 				
		 					 				
		 			}
		 			
		 			Return_list_Value = List_audit_attributes;
		 			dbConnection.close();
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
		 public static List<String> audit_logs_search(String userid) throws SQLException{
	            Connection dbConnection = null;
	                  Statement statement = null;

	                  //String selectTableSQL1 = "SELECT * FROM track_user where USER_ID ='"+userid+"'and ROWNUM <=5 order by RECEIVED_DT desc";
	                  
	                  String selectTableSQL1 ="select * from (SELECT * FROM track_user where USER_ID ='"+userid+"' and FOCUS='Get Next' order by RECEIVED_DT desc) where ROWNUM <2";
	                  //select * from track_user where USER_ID='AB52523'and FOCUS='Get Next' order by RECEIVED_DT desc ;
	                  try {

	                        dbConnection = getDBConnection();

	                        statement = dbConnection.createStatement();

	                        System.out.println(selectTableSQL1);

	                        // Execute SQL statement

	                        ResultSet rs = statement.executeQuery(selectTableSQL1);
	                        List<String> audit_logs_focus = new ArrayList<String>();
	                        
	                        while (rs.next()) {
	                               String auditlog_DB_focus = rs.getString("ACTIVITY");
	                                
	                               audit_logs_focus.add(auditlog_DB_focus);
	                               System.out.println(audit_logs_focus);
	                                
	                        }
	                                Return_list_Value = audit_logs_focus;
	                  }             
	                         catch (SQLException e) {
	                                System.out.println(e.getMessage());
	                         } 
	                         finally {
	                                if (statement != null) {
	                                      statement.close();
	                                }
	                                if (dbConnection != null) {
	                                      dbConnection.close();
	                                }
	                         }
	                         return Return_list_Value;
	                   
	         }
		 
		 public static List<String> Task_search_dropdown_values(String dropdown) throws SQLException{
	            Connection dbConnection = null;
	                  Statement statement = null;
	                  String selectTableSQL1 = null;
	                  //String selectTableSQL1 = "SELECT * FROM track_user where USER_ID ='"+userid+"'and ROWNUM <=5 order by RECEIVED_DT desc";
	                  switch(dropdown){
	                  case "Task Status":
	                   selectTableSQL1 ="select task_status_desc as value from task_status order by task_status_id";
	                   break;
	                  case "Workgroup":
	                	  selectTableSQL1 ="SELECT GROUP_NAME as value FROM USER_GROUP where USER_GROUP_ID in (select USER_GROUP_ID from USER_GROUP_MAPPING where user_info_id = (select USER_INFO_ID from user_info where cuid = '"+user_cuid+"')) order by group_name";
		                   break; 
	                  case "Task Name":
	                	  selectTableSQL1 ="select distinct(task_instance_referred_as) as value from task_instance order by UPPER (task_instance_referred_as)";
		                   break;
	                  case "lata":
	                	  selectTableSQL1 ="select unique lata, lata_nm as value from UCORD001.LCL_LERG12@locq001 order by lata";
		                   break;  
	                  case "Error Reason":
	                	  selectTableSQL1 ="select distinct(index_value) as value from task_inst_index where index_key='errorReason'";
		                   break;
	                  case "Component Type":
	                	  selectTableSQL1 ="select distinct(index_value) as value from task_inst_index where index_key='Component Type'";
		                   break;
	                  case "Component Status":
	                	  selectTableSQL1 ="select distinct(index_value) as value from task_inst_index where index_key='Component Status'";
		                   break;
	                  }
	                  //select * from track_user where USER_ID='AB52523'and FOCUS='Get Next' order by RECEIVED_DT desc ;
	                  
	                  try {

	                        dbConnection = getDBConnection();

	                        statement = dbConnection.createStatement();
	                        statement.setMaxRows(5);

	                        System.out.println(selectTableSQL1);

	                        // Execute SQL statement

	                        ResultSet rs = statement.executeQuery(selectTableSQL1);
	                        List<String> audit_logs_focus = new ArrayList<String>();
	                        
	                        while (rs.next()){
	                               String auditlog_DB_focus = rs.getString("VALUE");           
	                               audit_logs_focus.add(auditlog_DB_focus);
	                               //System.out.println(audit_logs_focus);
	                        	}      
	                                Return_list_Value = audit_logs_focus;
	                  		}             
	                         catch (SQLException e) {
	                                System.out.println(e.getMessage());
	                         } 
	                         finally {
	                                if (statement != null) {
	                                      statement.close();
	                                }
	                                if (dbConnection != null) {
	                                      dbConnection.close();
	                                }
	                         }
	                         return Return_list_Value;        
	         
		 }
		 
		 
		 public HashMap<String, String> getnext_search_result (String arg1,String arg2) throws SQLException {
			 Connection dbConnection = null;
             Statement statement = null;
             String selectTableSQL1 = null;

		// int a = getA();

		 //int b = getB();

		 HashMap<String, String> result = new HashMap<String, String>();

		 /*result.put("a", a);

		 result.put("b", b);*/
		 
		 
		 try {

             dbConnection = getDBConnection();

             statement = dbConnection.createStatement();
             

             switch(arg1) {
     		case "Button Administrative Name": selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where OV_BUTTON_ADMIN_NM like '"+arg2+"%'";break;
     		case "WorkMate Rule Invoked": selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where INVOKED_RULE_NM like '"+arg2+"%'"; break;
     		
     		}

             // Execute SQL statement
           //  selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where OV_BUTTON_ADMIN_NM like '"+arg1+"%'";
             System.out.println(selectTableSQL1);
             ResultSet rs = statement.executeQuery(selectTableSQL1);
           //  List<String> audit_logs_focus = new ArrayList<String>();
             
             while (rs.next()){
                    String auditlog_DB_focus = rs.getString("OV_BUTTON_ADMIN_NM");  
                    String auditlog_DB_focus1 = rs.getString("INVOKED_RULE_NM");
                    System.out.println(auditlog_DB_focus);
                    System.out.println(auditlog_DB_focus1);
                    result.put(auditlog_DB_focus,auditlog_DB_focus1);
                                        //System.out.println(audit_logs_focus);
             	}    
           //  result.put("TEST",arg2);
            // return result;
       		}             
              catch (SQLException e) {
                     System.out.println(e.getMessage());
              } 
              finally {
                     if (statement != null) {
                           statement.close();
                     }
                     if (dbConnection != null) {
                           dbConnection.close();
                     }
              }

		 
		 return result;

		 }
		 
		 
		 public List<String> getnext_search_db_result (String arg1) throws SQLException {
			 Connection dbConnection = null;
             Statement statement = null;
             String selectTableSQL1 = null;

		// int a = getA();

		 //int b = getB();

		// HashMap<String, String> result = new HashMap<String, String>();

		 /*result.put("a", a);

		 result.put("b", b);*/
		 
		 
		 try {

             dbConnection = getDBConnection();

             statement = dbConnection.createStatement();
             selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where OV_BUTTON_ADMIN_NM ='"+arg1+"'";
             		

             /*switch(arg1) {
     		case "Button Administrative Name": selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where OV_BUTTON_ADMIN_NM like '"+arg2+"%'";break;
     		case "WorkMate Rule Invoked": selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where INVOKED_RULE_NM like '"+arg2+"%'"; break;
     		
     		}*/

            // dbConnection = getDBConnection();

             statement = dbConnection.createStatement();
             statement.setMaxRows(5);

             System.out.println(selectTableSQL1);

             // Execute SQL statement

             ResultSet rs = statement.executeQuery(selectTableSQL1);
             List<String> audit_logs_focus = new ArrayList<String>();
             
             while (rs.next()){
                    //String auditlog_DB_focus = rs.getString("OV_BUTTON_ADMIN_NM"); 
                    
                    audit_logs_focus.add(rs.getString("OV_BUTTON_ADMIN_NM"));
                   // String auditlog_DB_focus = rs.getString("OV_BUTTON_DISPLAY_NM");           
                    audit_logs_focus.add(rs.getString("OV_BUTTON_DISPLAY_NM"));
                    
                   // String auditlog_DB_focus = rs.getString("BUTTON_COLOR");           
                    audit_logs_focus.add(rs.getString("BUTTON_COLOR"));
                    //String auditlog_DB_focus = rs.getString("FONT_COLOR");           
                    audit_logs_focus.add(rs.getString("FONT_COLOR"));
                    
                   // String auditlog_DB_focus = rs.getString("BUTTON_DESC");           
                    audit_logs_focus.add(rs.getString("BUTTON_DESC"));
                    
                    //String auditlog_DB_focus = rs.getString("INVOKED_RULE_NM");           
                    audit_logs_focus.add(rs.getString("INVOKED_RULE_NM"));
                    
                    //String auditlog_DB_focus = rs.getString("CREATED_BY_ID");           
                    audit_logs_focus.add(rs.getString("CREATED_BY_ID"));
                    //String auditlog_DB_focus = rs.getString("MODIFIED_BY_ID");           
                    audit_logs_focus.add(rs.getString("MODIFIED_BY_ID"));
                   
                    
                    //System.out.println(audit_logs_focus);
             	}      
                     Return_list_Value = audit_logs_focus;
       		}             
              catch (SQLException e) {
                     System.out.println(e.getMessage());
              } 
              finally {
                     if (statement != null) {
                           statement.close();
                     }
                     if (dbConnection != null) {
                           dbConnection.close();
                     }
              }
              return Return_list_Value;  

		 }
		 
		 public List<String> tag_search_result_all () throws SQLException {
			 Connection dbConnection = null;
             Statement statement = null;
             String selectTableSQL1 = null;

		// int a = getA();

		 //int b = getB();

		// HashMap<String, String> result = new HashMap<String, String>();

		 /*result.put("a", a);

		 result.put("b", b);*/
		 
		 
		 try {

             dbConnection = getDBConnection();

             statement = dbConnection.createStatement();
             selectTableSQL1 = "select * from ov_task_tag_list";
             		

             /*switch(arg1) {
     		case "Button Administrative Name": selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where OV_BUTTON_ADMIN_NM like '"+arg2+"%'";break;
     		case "WorkMate Rule Invoked": selectTableSQL1 = "select * from OV_GETNEXT_RULE_CONFIG where INVOKED_RULE_NM like '"+arg2+"%'"; break;
     		
     		}*/

              

             statement = dbConnection.createStatement();
             

             System.out.println(selectTableSQL1);

             // Execute SQL statement

             ResultSet rs = statement.executeQuery(selectTableSQL1);
             List<String> audit_logs_focus = new ArrayList<String>();
             
             while (rs.next()){
                    //String auditlog_DB_focus = rs.getString("OV_BUTTON_ADMIN_NM"); 
                    
                    audit_logs_focus.add(rs.getString("OV_TAG_NM"));
                   // String auditlog_DB_focus = rs.getString("OV_BUTTON_DISPLAY_NM");           
                    
                    
                           	}      
                     Return_list_Value = audit_logs_focus;
       		}             
              catch (SQLException e) {
                     System.out.println(e.getMessage());
              } 
              finally {
                     if (statement != null) {
                           statement.close();
                     }
                     if (dbConnection != null) {
                           dbConnection.close();
                     }
              }
              return Return_list_Value;  

		 }
		 
		 public static String Validate_Total_contact(String groupid) throws SQLException{
	    	 Connection dbConnection = null;
	  		Statement statement = null;

	  		String selectTableSQL1 = "Select count(*) COUNT From Clc_Contact_Master where Group_Id = "+groupid+"";
	  	
	  		try {

	  			dbConnection = getDBConnection();

	  			statement = dbConnection.createStatement();

	  			System.out.println(selectTableSQL1);

	  			// Execute SQL statement

	  			ResultSet rs = statement.executeQuery(selectTableSQL1);
	  			String Total_contact_count = null;
	  			while (rs.next()) {
	 				
	 				Total_contact_count = rs.getString("COUNT");
	 				//List_Device_attributes.add(Auditlog_ACTIVITY);
	 
	  			}
	 				Return_Value = Total_contact_count;
	  		}		 
	  	 		catch (SQLException e) {
	  	 			System.out.println(e.getMessage());
	  	 		} 
	  	 		finally {
	  	 			if (statement != null) {
	  	 				statement.close();
	  	 			}
	  	 			if (dbConnection != null) {
	  	 				dbConnection.close();
	  	 			}
	  	 		}
	  	 		return Return_Value;
		 	 
	     }
		 
		 public static String gdb_device_db_validations(String build_id){	 		
	    	 try {
	 		String selectTableSQL1 = "select * from device_group where network_build_id='"+build_id+"'";
	 		
	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);
	 			String device_grp_id=null ;
	 			String count=null;

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 		
	 			
	 			while (rs.next()) {
	 				
	 				 device_grp_id = rs.getString("DEVICE_GROUP_ID");
	 				
	 				//List_device_attributes.add(device_grp_id);
	 				
	 				
	 			}
	 			String selectTableSQL2="select device_status,count(*) from device where device_group_id = '"+device_grp_id+"' group by device_status";

	 			ResultSet rs1 = statement.executeQuery(selectTableSQL2);
 				while (rs1.next()) {
 					 count = rs1.getString("COUNT(*)");
 	 			
 			}
	 			
 				Return_Value = count;
	 			dbConnection.close();
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
	 		return Return_Value;
	 		
	 		
	 		}

}
