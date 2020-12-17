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

public class ARMDB extends OmniVuePage {	
	
	 private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
     private static final String DB_CONNECTION = "jdbc:oracle:thin:@"+Page.envData.getContainer("ARMDB").getFieldValue("Hostname")+":"+Page.envData.getContainer("ARMDB").getFieldValue("port")+":"+Page.envData.getContainer("ARMDB").getFieldValue("SID");   
     private static final String DB_USER =Page.envData.getContainer("ARMDB").getFieldValue("Username");
     private static final String DB_PASSWORD = Page.envData.getContainer("ARMDB").getFieldValue("password");
     private static Connection dbConnection = null;
     private static Statement statement = null;	 		
     public static List<String> Return_list_Value = null;
     public static String Return_Value = null; 
     public static Integer Return_list_count =0;
	@Override
	public WebElementFacade getUniqueElementInPage() {	
		return null;
	}
	 public static List<String> Validate_PMType_Values_in_Service(String Service){	 		
    	 try {
 		String selectTableSQL1 = "SELECT PMFLAG, PM_TYPE, SLA_AGREEMENT_TEMPLATE FROM ext_mef_evc where serviceid = (select serviceid from service where name = '"+Service+"');";

 		
 			dbConnection = getDBConnection();
 			statement = dbConnection.createStatement();

 			System.out.println(selectTableSQL1);

 			// Execute SQL statement

 			ResultSet rs = statement.executeQuery(selectTableSQL1);
 			List<String> List_PM_Values = new ArrayList<String>();
 			
 			while (rs.next()) {
 				
 				String PM_Flag = rs.getString("PMFLAG");
 				List_PM_Values.add(PM_Flag);
 				
 				String PM_Type = rs.getString("PM_TYPE");
 				List_PM_Values.add(PM_Type);
 				
 				String SLA_AGREEMENT_TEMPLATE = rs.getString("SLA_AGREEMENT_TEMPLATE");
 				List_PM_Values.add(SLA_AGREEMENT_TEMPLATE);

 			}
 			
 			Return_list_Value = List_PM_Values;
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
	 
	 public static List<String> validate_topologytechtype_values_in_topology(){	 		
    	 try {
 		String selectTableSQL1 = "SELECT * FROM ARMAPI.v_topology_tech_type";

 		
 			dbConnection = getDBConnection();
 			statement = dbConnection.createStatement();

 			System.out.println(selectTableSQL1);

 			// Execute SQL statement

 			ResultSet rs = statement.executeQuery(selectTableSQL1);
 			List<String> List_topologytechtype_Values = new ArrayList<String>();
 			
 			while (rs.next()) {
 				
 				String PM_Flag = rs.getString("NAME");
 				List_topologytechtype_Values.add(PM_Flag);
 				
 				 

 			}
 			
 			Return_list_Value = List_topologytechtype_Values;
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
	 
	public static String validate_circuitname_in_database(String name){               
        try {
              String selectTableSQL1 = "select NAME from circuit where name = '"+name+"'";

                     dbConnection = getDBConnection();
                     statement = dbConnection.createStatement();

                     System.out.println(selectTableSQL1);

                     // Execute SQL statement

                     ResultSet rs = statement.executeQuery(selectTableSQL1);
                     String Circuitname = null;
                     while (rs.next()) {
                           Circuitname = rs.getString("NAME");
                           System.out.println("auditlog_DB_focus>>>>>>>>>>>"+Circuitname);      
                     }             
                     Return_Value = Circuitname;
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

	
	 private static Connection getDBConnection() {
	  		Connection dbConnection = null;
	  		System.out.println("DB_CONNECTION="+DB_CONNECTION);
	  		try {
	  			Class.forName(DB_DRIVER);
	  			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	  			return dbConnection;
	  		} 		
	  		catch (Exception e) {
	  			System.out.println(e.getMessage());
	  			return null;
	  		}

	  		/*try {
	  			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
	  			return dbConnection;
	  		}	catch (SQLException e) {
	  			System.out.println(e.getMessage());
	  		}*/
	  		//return dbConnection;
	  	}
	     
	     public static List<String> location_range_attributes_values(int i){	 		
	    	 try {
	 		String selectTableSQL1 = "SELECT * FROM address_range where address_range_id ='"+i+"'";

	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_addressrange_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String Actual_low_street_num = rs.getString("low_street_num");
	 				List_addressrange_attributes.add(Actual_low_street_num);
	 				String Actual_high_street_num = rs.getString("high_street_num");
	 				List_addressrange_attributes.add(Actual_high_street_num);
	 				String Actual_Indicator = rs.getString("ODD_EVEN_BOTH_IND");
	 				List_addressrange_attributes.add(Actual_Indicator);
	 				String Actual_street = rs.getString("street_nm");
	 				List_addressrange_attributes.add(Actual_street);
	 				String Actual_street_type = rs.getString("street_type_cd");
	 				List_addressrange_attributes.add(Actual_street_type);			
	 				String Actual_state = rs.getString("state_province_cd");
	 				List_addressrange_attributes.add(Actual_state);
	 				String Actual_zip = rs.getString("zip");
	 				List_addressrange_attributes.add(Actual_zip);
	 				String Actual_STREET_DIRECTION_PREFIX = rs.getString("STREET_DIRECTION_PREFIX");
	 				System.out.println("STREET_DIRECTION_PREFIX>>>>>>>>>>>"+Actual_STREET_DIRECTION_PREFIX);
	 				List_addressrange_attributes.add(Actual_STREET_DIRECTION_PREFIX);
	 				rs.getString("STREET_DIRECTION_SUFFIX");
	 				System.out.println("STREET_DIRECTION_SUFFIX>>>>>>>>>>>"+Actual_STREET_DIRECTION_PREFIX);
	 				List_addressrange_attributes.add(Actual_STREET_DIRECTION_PREFIX); 
	 			}
	 			
	 			Return_list_Value = List_addressrange_attributes;
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
	     
	     
	     public static List<String> location_range_attributes_values(String STREET_NM){	 		
	    	 try {
	 		String selectTableSQL1 = "select * from Service_Address where STREET_NM ='"+STREET_NM+"'";

	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_addressrange_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				 
	 				 
	 				String Actual_street = rs.getString("STREET_NM");
	 				List_addressrange_attributes.add(Actual_street);
	 				String Actual_street_type = rs.getString("street_type_cd");
	 				List_addressrange_attributes.add(Actual_street_type);			
	 				String Actual_state = rs.getString("state_province_cd");
	 				List_addressrange_attributes.add(Actual_state);
	 				String Actual_zip = rs.getString("zip");
	 				List_addressrange_attributes.add(Actual_zip);
	 				String Actual_STREET_DIRECTION_PREFIX = rs.getString("STREET_DIRECTION_PREFIX");
	 				System.out.println("STREET_DIRECTION_PREFIX>>>>>>>>>>>"+Actual_STREET_DIRECTION_PREFIX);
	 				List_addressrange_attributes.add(Actual_STREET_DIRECTION_PREFIX);
	 				rs.getString("STREET_DIRECTION_SUFFIX");
	 				System.out.println("STREET_DIRECTION_SUFFIX>>>>>>>>>>>"+Actual_STREET_DIRECTION_PREFIX);
	 				List_addressrange_attributes.add(Actual_STREET_DIRECTION_PREFIX); 
	 			}
	 			
	 			Return_list_Value = List_addressrange_attributes;
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
	     
	     public static List<String> circuit_Ethernet_bandwidth(String Circuitname){	 		
	    	 try {
	 		String selectTableSQL1 = "SELECT BW FROM EXT_CIRCUIT_ETH_BEARER where circuitid = (SELECT circuitid FROM circuit where name ='"+Circuitname+"')";
	 		String selectTableSQL2 = "SELECT BANDWIDTH FROM circuit where name = '"+Circuitname+"'";
	 		
	 	
	 	
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			//System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_tobesent = new ArrayList<String>();
	 			
	 		
	 			while (rs.next()) {	 				
	 				List_tobesent.add(rs.getString("BW"));
	 		
	 			}
	 			
	 			//List_tobesent.add(rs.getString("))
	 			
	 			
	 			
	 			rs= statement.executeQuery(selectTableSQL2);
	 			while (rs.next()) {	 				
	 				List_tobesent.add(rs.getString("BANDWIDTH"));
	 				
	 			}
	 			//System.out.println("selectTableSQL2"+rs.getString("BANDWIDTH"));
	 			Return_list_Value = List_tobesent;
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
	     
	     public static List<String> device_details_attributes_values(String deivce){	 		
	    	 try {
	 		String selectTableSQL1 = "SELECT * FROM node where name ='"+deivce+"'";

	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String device_name = rs.getString("NAME");
	 				List_device_attributes.add(device_name);
	 				String device_full_name = rs.getString("FULLNAME");
	 				List_device_attributes.add(device_full_name);
	 				
	 			}
	 			
	 			Return_list_Value = List_device_attributes;
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
	     
	     
	     // function for null value update in address range
	     public static List<String> location_range_attributes_null_values(int i){	 		
	    	 try {
	 		String selectTableSQL1 = "SELECT STREET_DIRECTION_PREFIX,STREET_DIRECTION_SUFFIX FROM address_range where address_range_id ='"+i+"'";

	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_addressrange_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				String Actual_STREET_DIRECTION_PREFIX = rs.getString("STREET_DIRECTION_PREFIX");
	 				System.out.println("STREET_DIRECTION_PREFIX>>>>>>>>>>>"+Actual_STREET_DIRECTION_PREFIX);
	 				List_addressrange_attributes.add(Actual_STREET_DIRECTION_PREFIX);
	 				rs.getString("STREET_DIRECTION_SUFFIX");
	 				System.out.println("STREET_DIRECTION_SUFFIX>>>>>>>>>>>"+Actual_STREET_DIRECTION_PREFIX);
	 				List_addressrange_attributes.add(Actual_STREET_DIRECTION_PREFIX);
	 			}
	 			
	 			Return_list_Value = List_addressrange_attributes;
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

	     public static List<String> device_delete_validation(String deivce){	 		
	    	 try {
	 		String selectTableSQL1 = "SELECT * FROM node where name ='"+deivce+"'";

	 		
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			
	 			if (!rs.next()) {                            //if rs.next() returns false
                    //then there are no rows.
	 				System.out.println("Device is deleted from datdabase");
	 				
	 				Return_list_Value = List_device_attributes;

	 				}
	 			
	 			//Return_list_Value = List_device_attributes;
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
	     
	     public static String audit_logs_focus(String userid){	 		
	    	 try {
	 		String selectTableSQL1 = "SELECT * FROM track_user where USER_ID ='"+userid+"' order by RECEIVED_DT desc";

	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			String auditlog_DB_focus = null;
	 			while (rs.next()) {
	 				 auditlog_DB_focus = rs.getString("FOCUS");
	 				System.out.println("auditlog_DB_focus>>>>>>>>>>>"+auditlog_DB_focus);	
	 			}
	 			
	 			Return_Value = auditlog_DB_focus;

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
	     
	     public static List<String> update_ethernet_device_details_attributes_values(String deivce){	 		
	    	 try {
	 		String selectTableSQL1 = "select * from ext_device_type where nodeid in (Select nodeid from node where name='"+deivce+"')";
	 		String selectTableSQL2 = "Select RELATIVENAME from node where name='"+deivce+"'";

	 	//	select * from ext_device_type where nodeid in (Select nodeid from node where name='BURLOR62H01-000107.01B');
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String mco_value = rs.getString("MCO");
	 				List_device_attributes.add(mco_value);
	 				//String affiliate_owner = rs.getString("AFFILIATE_OWNER");
	 				//List_device_attributes.add(affiliate_owner);
	 				/*String maxdown = rs.getString("MAXSUBSCRIBERBWOFFERED");
	 				List_device_attributes.add(maxdown);
	 				String maxup = rs.getString("MAXSUBSCRIBERUPBWOFFERED");
	 				List_device_attributes.add(maxup);*/
	 				
	 			}
	 			
	 			ResultSet rs1 = statement.executeQuery(selectTableSQL2);
	 				while (rs1.next()) {
	 					String relative_id = rs1.getString("RELATIVENAME");
	 	 				List_device_attributes.add(relative_id);
	 			}
	 			
	 				/*for(int p=0; p<=List_device_attributes.size()-1; p++){
	 					System.out.println("values" +List_device_attributes.get(p));
	 				}*/
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     
	     public static List<String> update_ethernet_device_networkk_details_attributes_values(String deivce){	 		
	    	 try {
	 		String selectTableSQL1 = "select * from ext_device_type where nodeid in (Select nodeid from node where name='"+deivce+"')";
	 	
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String snmp_object = rs.getString("SNMPOBJECTID");
	 				List_device_attributes.add(snmp_object);
	 				String snmp_port = rs.getString("SNMP_PORT_ID");
	 				List_device_attributes.add(snmp_port);
	 				String snmp_ver = rs.getString("SNMP_VERSION");
	 				List_device_attributes.add(snmp_ver);
	 				 
	 				
	 			}
	 			
	 			
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     
	     public static List<String> validate_transport_path_db(String device){	 		
	    	 try {
	 		//String selectTableSQL1 = "select * from ext_device_type where nodeid in (Select nodeid from node where name='"+deivce+"')";
	 		
	 		
	 		String selectTableSQL1 ="Select * from (SELECT NAME FROM circuit where CIRCUIT2CIRCUITTYPE = '1900000007' and (CIRCUIT2STARTNODE =(select nodeid from node where name = '"+device+"') or CIRCUIT2ENDNODE = (select nodeid from node where name = '"+device+"'))) WHERE ROWNUM <=1";
	 	
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String routename = rs.getString("NAME");
	 				List_device_attributes.add(routename);
	 					 				
	 			}
	 			
	 			
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     
	     public static List<String> validate_functionalStatusOfDevice_db(String device){	 		
	    	 try {
	 		//String selectTableSQL1 = "select * from ext_device_type where nodeid in (Select nodeid from node where name='"+deivce+"')";
	 		
	 		
	 		String selectTableSQL1 ="SELECT * FROM FUNCTIONALSTATUS where FUNCTIONALSTATUSID =(Select NODE2FUNCTIONALSTATUS from node where name= '"+device+"')";
	 	
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String routename = rs.getString("NAME");
	 				List_device_attributes.add(routename);
	 				System.out.println("........FUNCTIONALSTATUS....."+rs.getString("NAME"));			
	 			}
	 			
                 
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     
	     
	     public static List<String> validate_MGMTVLAN_OfDevice_db(String device){	 		
	    	 try {
	 		//String selectTableSQL1 = "select * from ext_device_type where nodeid in (Select nodeid from node where name='"+deivce+"')";
	 		
	 		
	 		String selectTableSQL1 ="Select nodeid,MGMTVLAN from EXT_DEVICE_TYPE where nodeid = (select nodeid from node where name= '"+device+"')";
	 	
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String MGMTVLAN = rs.getString("MGMTVLAN");
	 				List_device_attributes.add(MGMTVLAN);
	 				System.out.println("........MGMTVLAN....."+rs.getString("MGMTVLAN"));			
	 			}
	 			
                 
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     
	     public static List<String> validate_OVER_SUBSCRIPTION_AMOUNT_and_SUPPORTS_OVER_SUBSCRIPTION_DB(String device){	 		
	    	 try {
	 		//String selectTableSQL1 = "select * from ext_device_type where nodeid in (Select nodeid from node where name='"+deivce+"')";
	 		
	 		
	 		String selectTableSQL1 ="select SUPPORTS_OVER_SUBSCRIPTION,OVER_SUBSCRIPTION_AMOUNT from ext_device_type where nodeid in (select nodeid from node where name ='"+device+"')";
	 	
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String SUPPORTS_OVER_SUBSCRIPTION = rs.getString("SUPPORTS_OVER_SUBSCRIPTION");
	 				String OVER_SUBSCRIPTION_AMOUNT = rs.getString("OVER_SUBSCRIPTION_AMOUNT");
	 				List_device_attributes.add(SUPPORTS_OVER_SUBSCRIPTION);
	 				//List_device_attributes.add(OVER_SUBSCRIPTION_AMOUNT);
	 				System.out.println("........SUPPORTS_OVER_SUBSCRIPTION....."+rs.getString("SUPPORTS_OVER_SUBSCRIPTION"));			
	 			}
	 			
                 
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     
	     public List<String> vectoring_type_validation_internal(String device,String vectoringtype){	 		
	    	 try {
	    		 ResultSet rs;
	    		 String selectTableSQL1=null;
	    		 List<String> List_device_attributes=null;
	    		 
	    		 //device="CLVSNMEH221-123";
	    		 switch(vectoringtype)
	    		 {
	    		 
	    		 case "INTERNAL":
	    			  //selectTableSQL1 ="Select N.nodeid,N.Name Device_Name,VT.Name,ED.IPV4MGMROUTERID From Node N, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where	ED.NODEID = N.nodeid and N.Name = '"+device+"'";
	    			 selectTableSQL1= "Select * from(Select N.Name Device_Name,N.NOdeid,VT.Name vectoring_type,null Vectoring_Topology From Node N, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where ED.NODEID = N.nodeid and VT.VECTORINGTYPEID = ED.VECTORINGTYPEID and Upper(VT.Name) like '%INTERNAL%' union Select  N.Name Device_Name,N.NOdeid,VT.Name vectoring_type,T.Name Vectoring_Topology From Node N,TOPOBJECT TB, Topology T, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where TB.TOPOBJECT2OBJECT = N.Nodeid and TB.TOPOBJECT2TOPOLOGY = T.TOPOLOGYID and TOPOLOGY2TOPOLOGYTYPE = 1940024000 and ED.NODEID = N.nodeid and VT.VECTORINGTYPEID = ED.VECTORINGTYPEID) where Device_Name = '"+device+"'";
	    			  dbConnection = getDBConnection();
	 	 			statement = dbConnection.createStatement();

	 	 			System.out.println(selectTableSQL1);

	 	 			// Execute SQL statement

	 	 			 rs = statement.executeQuery(selectTableSQL1);
	 	 			 List_device_attributes = new ArrayList<String>();
	 	 			
	 	 			while (rs.next()) {
	 	 				String device_name = rs.getString("VECTORING_TYPE");
	 	 				List_device_attributes.add(device_name);
	 	 				String vectoring_type = rs.getString("DEVICE_NAME");
	 	 				List_device_attributes.add(vectoring_type);
	 	 				
	 	 			}
	 	 			
	 	 			
	 	 			Return_list_Value = List_device_attributes;
	 	 			break;
	    			 
	    			 
	    			 
	    		 case "EXTERNAL": 
	    			 
	    			 // selectTableSQL1 ="Select N.nodeid,N.Name Device_Name,VT.Name,ED.IPV4MGMROUTERID From Node N, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where	ED.NODEID = N.nodeid and N.Name = '"+device+"'";
	    			  
	    			  //selectTableSQL1= "Select  N.Name Device_Name,N.NOdeid,T.Name Vectoring_Topology,VT.Name From Node N,TOPOBJECT TB, Topology T, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where TB.TOPOBJECT2OBJECT = N.Nodeid and  TB.TOPOBJECT2TOPOLOGY = T.TOPOLOGYID and ED.NODEID = N.nodeid and  VT.VECTORINGTYPEID = ED.VECTORINGTYPEID and N.Name Like'"+device+"'";
	    			
	    			  
	    			  selectTableSQL1= "Select * from(Select N.Name Device_Name,N.NOdeid,VT.Name vectoring_type,null Vectoring_Topology From Node N, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where ED.NODEID = N.nodeid and VT.VECTORINGTYPEID = ED.VECTORINGTYPEID and Upper(VT.Name) like '%INTERNAL%' union Select  N.Name Device_Name,N.NOdeid,VT.Name vectoring_type,T.Name Vectoring_Topology From Node N,TOPOBJECT TB, Topology T, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT where TB.TOPOBJECT2OBJECT = N.Nodeid and TB.TOPOBJECT2TOPOLOGY = T.TOPOLOGYID and TOPOLOGY2TOPOLOGYTYPE = 1940024000 and ED.NODEID = N.nodeid and VT.VECTORINGTYPEID = ED.VECTORINGTYPEID) where Device_Name = '"+device+"'";
	    			  
	    			  
	    			  
	    			  
	    			  dbConnection = getDBConnection();
	 	 			statement = dbConnection.createStatement();

	 	 			System.out.println(selectTableSQL1);

	 	 			// Execute SQL statement

	 	 			 rs = statement.executeQuery(selectTableSQL1);
	 	 			 List_device_attributes = new ArrayList<String>();
	 	 			
	 	 			while (rs.next()) {
	 	 				
	 	 				String vectoring_type = rs.getString("VECTORING_TYPE");
	 	 				List_device_attributes.add(vectoring_type);
	 	 				String vectoring_topology = rs.getString("VECTORING_TOPOLOGY");
	 	 				List_device_attributes.add(vectoring_topology);
	 	 				String device_name = rs.getString("DEVICE_NAME");
	 	 				List_device_attributes.add(device_name);
	 	 				
	 	 					 				
	 	 			}
	    		 
	 	 			/*String selectTableSQL2="Select N.nodeid,N.Name Device_Name,T.Name Vectoring_Topology,VT.Name,ED.IPV4MGMROUTERID From Node N,TOPOBJECT TB, Topology T, EXT_DEVICE_TYPE ED, VECTORING_TYPE VT,TOPOLOGYTYPE T_Type where T_Type.name = 'Vectoring Topology' and T_Type.TOPOLOGYTYPEID = T.TOPOLOGY2TOPOLOGYTYPE and TB.TOPOBJECT2OBJECT = N.Nodeid and TB.TOPOBJECT2TOPOLOGY = T.TOPOLOGYID and ED.NODEID = N.nodeid and VT.VECTORINGTYPEID = ED.VECTORINGTYPEID  and N.Name = '"+device+"'";
	 	 			rs = statement.executeQuery(selectTableSQL2);
	 	 			while (rs.next()) {
	 	 				
	 	 				String vectoring_topology = rs.getString("VECTORING_TOPOLOGY");
	 	 				List_device_attributes.add(vectoring_topology);
	 	 					 	 					 				
	 	 			}*/
	 	 			Return_list_Value = List_device_attributes;
	    		 
	    		 break;
	    		 
	    		 }
	    				
	 			
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
	      
	     public static List<String> device_RT_Circuitvalidation(String name){	 	
			 try {
			//comneted the below as for device relative tab circuit 1st  query is working.
				 String query = "select Unique(C.Name) from node N, Port P, Circuit C where (C.CIRCUIT2STARTPORT = P.Portid or C.CIRCUIT2ENDPORT = P.Portid) and N.nodeid = P.PORT2NODE and N.name = '"+name+"'";
			//String query = "select C.Name from Circuit C, CircuitCircuit CC where  C.circuitid = CC.USEDBY2CIRCUIT and CC.USES2CIRCUIT IN (select circuitid from circuit where name = '"+name+"')";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     public static List<String> device_RT_Servicesvalidation(String name){	 	
			 try {
			 	 String query = "select s.name as Service_name from node nd, port p, service s, serviceobject so where nd.nodeid = p.port2node and p.portid = so.serviceobject2object and so.SERVICEOBJECT2DIMOBJECT = 4 and so.serviceobject2service = s.serviceid and nd.name ='"+name+"'";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("SERVICE_NAME"));		
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
	     
	     public static List<String> device_RT_locationsvalidation(String name){	 	
			 try {
			 String query = "Select IA.ASSET_VALUE_NM,SA.Name from service_address_asset SAA,service_address SA,Inventory_asset IA where SAA.SERVICE_ADDRESS_ID = SA.SERVICE_ADDRESS_ID and IA.INVENTORY_ASSET_ID = SAA.INVENTORY_ASSET_ID and IA.ASSET_VALUE_NM ='"+name+"'";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     
	     public static List<String> circuit_RT_devicevalidation(String name){	 	
			 try {
			 String query = "select * from node where nodeid in (select CIRCUIT2STARTNODE from circuit where name = '"+name+"') union (select * from node where nodeid in (Select CIRCUIT2ENDNODE from circuit where name = '"+name+"'))";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		System.out.println(query);
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     
	     public static List<String> circuit_RT_subscribervalidation(String name){	 	
			 try {
			String query = "SELECT * FROM subscriber where name = (select relativename from circuit where name ='"+name+"')";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("FULLNAME"));		
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
	     public static List<String> circuit_RT_Servicesvalidation(String name){	 	
			 try {
			 	// String query = "SELECT * FROM service where name = (select relativename from circuit where name = '"+name+"')";
			 	 
				 String query ="select name from service where serviceid in (SELECT SERVICEOBJECT2SERVICE FROM serviceobject where  SERVICEOBJECT2OBJECT = (select circuitid from circuit where name = '"+name+"'))";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		System.out.println(query);
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     public static List<String> circuit_RT_locationvalidation(String name){	 	
			 try {
			 String query = "SELECT * FROM location where locationid IN (select CIRCUIT2STARTLOCATION from circuit where name ='"+name+"' union select CIRCUIT2ENDLOCATION from circuit where name ='"+name+"')";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		System.out.println(query);
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     public static List<String> circuit_RT_Circuitvalidation(String name){	 	
			 try {
			//String query = "select Unique(C.Name) from node N, Port P, Circuit C where (C.CIRCUIT2STARTPORT = P.Portid or C.CIRCUIT2ENDPORT = P.Portid) and N.nodeid = P.PORT2NODE and N.name = '"+name+"'";
			String query = "select C.Name from Circuit C, CircuitCircuit CC where C.circuitid = CC.USEDBY2CIRCUIT and CC.USES2CIRCUIT in (select circuitid from circuit where name = '"+name+"')";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     public static List<String> lagcircuit_RT_Circuitvalidation(String name){	 	
			 try {
			//String query = "select Unique(C.Name) from node N, Port P, Circuit C where (C.CIRCUIT2STARTPORT = P.Portid or C.CIRCUIT2ENDPORT = P.Portid) and N.nodeid = P.PORT2NODE and N.name = '"+name+"'";
			String query = "Select EB.IS_LAG_MEMBER,C.name from EXT_CIRCUIT_ETH_BEARER EB,Circuit C where C.CIRCUITID = EB.CIRCUITID and EB.IS_LAG_MEMBER = '"+name+"'";
			System.out.println(query);
			String query1="select C.Name from Circuit C, CircuitCircuit CC where C.circuitid = CC.USEDBY2CIRCUIT and CC.USES2CIRCUIT in (select circuitid from circuit where name = '"+name+"')";
			System.out.println(query1); 			
						dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
			 			}
			 			//statement = dbConnection.createStatement();
			 			 rs = statement.executeQuery(query1);
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     
	     public static List<String> vlancircuit_RT_Circuitvalidation(String name){	 	
			 try {
			//String query = "select Unique(C.Name) from node N, Port P, Circuit C where (C.CIRCUIT2STARTPORT = P.Portid or C.CIRCUIT2ENDPORT = P.Portid) and N.nodeid = P.PORT2NODE and N.name = '"+name+"'";
			String query = "Select * from circuit where circuitid in (select USES2CIRCUIT from circuitcircuit where USEDBY2CIRCUIT in (select circuitid from circuit where name ='"+name+"'))";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     
	     
	     public static List<String> update_circuit_details_attributes_values(String NAME){	 		
	    	 try {
	 		 
	 		String selectTableSQL1 = "select * from circuit where name='"+NAME+"'";

	 	//	select * from ext_device_type where nodeid in (Select nodeid from node where name='BURLOR62H01-000107.01B');
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String name_value = rs.getString("NAME");
	 				List_device_attributes.add(name_value);
	 				
	 				rs.getString("alias1");
	 				List_device_attributes.add(name_value);
	 				rs.getString("alias2");
	 				List_device_attributes.add(name_value);
	        		//String affiliate_owner = rs.getString("AFFILIATE_OWNER");
	 				//List_device_attributes.add(affiliate_owner);
	 				/*String maxdown = rs.getString("MAXSUBSCRIBERBWOFFERED");
	 				List_device_attributes.add(maxdown);
	 				String maxup = rs.getString("MAXSUBSCRIBERUPBWOFFERED");
	 				List_device_attributes.add(maxup);*/
	 				
	 			}
	 			
	 			
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     public static List<String> update_ethernet_device_ManagementIPSubnetMask_defaultgateway_values(String deivce){	 		
	    	 try {
	 		String selectTableSQL1 = "Select MGMT_IP_SUBNET_MASK SUBNETMASK, MGMT_IP_DEFAULT_GATEWAY GATEWAY from ext_device_type where nodeid = (select nodeid from node where name ='"+deivce+"')";

	 	//	select * from ext_device_type where nodeid in (Select nodeid from node where name='BURLOR62H01-000107.01B');
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();

	 			System.out.println(selectTableSQL1);

	 			// Execute SQL statement

	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_device_attributes = new ArrayList<String>();
	 			
	 			while (rs.next()) {
	 				
	 				String SUBNETMASK_value = rs.getString("SUBNETMASK");
	 				List_device_attributes.add(SUBNETMASK_value);
	 				String GATEWAY_value = rs.getString("GATEWAY");
	 				List_device_attributes.add(GATEWAY_value);
	 				//String affiliate_owner = rs.getString("AFFILIATE_OWNER");
	 				//List_device_attributes.add(affiliate_owner);
	 				/*String maxdown = rs.getString("MAXSUBSCRIBERBWOFFERED");
	 				List_device_attributes.add(maxdown);
	 				String maxup = rs.getString("MAXSUBSCRIBERUPBWOFFERED");
	 				List_device_attributes.add(maxup);*/
	 				
	 			}
	 				/*for(int p=0; p<=List_device_attributes.size()-1; p++){
	 					System.out.println("values" +List_device_attributes.get(p));
	 				}*/
	 			Return_list_Value = List_device_attributes;
	 			
	 			
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
	     public  List<String> service_details_attributes_values(String service_name){	 		
	    	 try {
	 	 		
	 	 		String selectTableSQL1 = "select * from service where name ='"+service_name+"'";
	 	 		String selectTableSQL2 = "select * from ext_mef_ovc  where SERVICEID in (Select SERVICEID from service where name='"+service_name+"')";

	 	 	//	select * from ext_device_type where nodeid in (Select nodeid from node where name='BURLOR62H01-000107.01B');
	 	 			dbConnection = getDBConnection();
	 	 			statement = dbConnection.createStatement();

	 	 			System.out.println(selectTableSQL1);

	 	 			// Execute SQL statement

	 	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 	 			List<String> List_service_attributes = new ArrayList<String>();
	 	 			
	 	 			while (rs.next()) {
	 	 				String servicename_value = rs.getString("NAME");
	 	 				List_service_attributes.add(servicename_value);
	 	 				
	 	 				String alias1_value = rs.getString("ALIAS1");
	 	 				List_service_attributes.add(alias1_value);
	 	 				String alias2_value = rs.getString("ALIAS1");
	 	 				List_service_attributes.add(alias2_value);
	 	 				//String affiliate_owner = rs.getString("AFFILIATE_OWNER");
	 	 				//List_device_attributes.add(affiliate_owner);
	 	 				/*String maxdown = rs.getString("MAXSUBSCRIBERBWOFFERED");
	 	 				List_device_attributes.add(maxdown);
	 	 				String maxup = rs.getString("MAXSUBSCRIBERUPBWOFFERED");
	 	 				List_device_attributes.add(maxup);*/
	 	 				
	 	 			}
	 	 			
	 	 			ResultSet rs1 = statement.executeQuery(selectTableSQL2);
	 	 				while (rs1.next()) {
	 	 					String mco_value = rs1.getString("MCO");
		 	 				List_service_attributes.add(mco_value);
		 	 				String pm_type = rs1.getString("PM_TYPE");
		 	 				List_service_attributes.add(pm_type);
	 	 			}
	 	 			
	 	 				/*for(int p=0; p<=List_device_attributes.size()-1; p++){
	 	 					System.out.println("values" +List_device_attributes.get(p));
	 	 				}*/
	 	 			Return_list_Value = List_service_attributes;
	 	 			
	 	 			
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
	     public  List<String> sla_validation(String sla_name){	 		
	    	 try {
	 	 		
	 	 		String selectTableSQL1 = "Select * from PM_SLA_MILEAGE_RANGE where PM_SLA_ID in (Select PM_SLA_ID from SLA_TARGET_TEMPLATE where TEMPLATE_NAME like '"+sla_name+"')";
	 	 		

	 	 	//	select * from ext_device_type where nodeid in (Select nodeid from node where name='BURLOR62H01-000107.01B');
	 	 			dbConnection = getDBConnection();
	 	 			statement = dbConnection.createStatement();

	 	 			System.out.println(selectTableSQL1);

	 	 			// Execute SQL statement

	 	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 	 			List<String> List_service_attributes = new ArrayList<String>();
	 	 			
	 	 			while (rs.next()) {
	 	 				String sla_target_value = rs.getString("AVAILABILITY_TARGET_VALUE");
	 	 				List_service_attributes.add(sla_target_value);
	 	 				
	 	 			}
	 	 			
	 	 			
	 	 			
	 	 				/*for(int p=0; p<=List_device_attributes.size()-1; p++){
	 	 					System.out.println("values" +List_device_attributes.get(p));
	 	 				}*/
	 	 			Return_list_Value = List_service_attributes;
	 	 			
	 	 			
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
	     public List<String> Validate_service_Alias1_Alias2(String service) {
	 		try {
	 			String selectTableSQL1 = "select ALIAS1,ALIAS2 from service where name ='" + service + "'";
	 			// select * from ext_device_type where nodeid in (Select nodeid from
	 			// node where name='BURLOR62H01-000107.01B');
	 			dbConnection = getDBConnection();
	 			statement = dbConnection.createStatement();
	 			System.out.println(selectTableSQL1);
	 			// Execute SQL statement
	 			ResultSet rs = statement.executeQuery(selectTableSQL1);
	 			List<String> List_service_attributes = new ArrayList<String>();
	 			while (rs.next()) {
	 				String Service_ALIAS1 = rs.getString("ALIAS1");
	 				List_service_attributes.add(Service_ALIAS1);
	 				String Service_ALIAS2 = rs.getString("ALIAS2");
	 				List_service_attributes.add(Service_ALIAS2);
	 				// String affiliate_owner = rs.getString("AFFILIATE_OWNER");
	 			}
	 			Return_list_Value = List_service_attributes;
	 			dbConnection.close();
	 		} catch (SQLException e) {
	 			System.out.println(e.getMessage());
	 		} finally {
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
	     public List<String> Validate_service_Alias1_Alias2_Note(String service) {
		 		try {
		 			String selectTableSQL1 = "select DESCRIPTION,ALIAS1,ALIAS2 from service where name ='" + service + "'";
		 			// select * from ext_device_type where nodeid in (Select nodeid from
		 			// node where name='BURLOR62H01-000107.01B');
		 			dbConnection = getDBConnection();
		 			statement = dbConnection.createStatement();
		 			System.out.println(selectTableSQL1);
		 			// Execute SQL statement
		 			ResultSet rs = statement.executeQuery(selectTableSQL1);
		 			List<String> List_service_attributes = new ArrayList<String>();
		 			while (rs.next()) {
		 				String Service_ALIAS1 = rs.getString("ALIAS1");
		 				List_service_attributes.add(Service_ALIAS1);
		 				String Service_ALIAS2 = rs.getString("ALIAS2");
		 				List_service_attributes.add(Service_ALIAS2);
		 				String Service_DESCRIPTION = rs.getString("DESCRIPTION");
		 				List_service_attributes.add(Service_DESCRIPTION);
		 				// String affiliate_owner = rs.getString("AFFILIATE_OWNER");
		 			}
		 			Return_list_Value = List_service_attributes;
		 			dbConnection.close();
		 		} catch (SQLException e) {
		 			System.out.println(e.getMessage());
		 		} finally {
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
	     
	     
	     
	     public List<String> Validate_EVC_NCI_dropDown_values_in_addMember_section ( ) {
		 		try {
		 			String selectTableSQL1 = "SELECT DISTINCT NCI FROM nci_spec_code_xref";
		 			// select * from ext_device_type where nodeid in (Select nodeid from
		 			// node where name='BURLOR62H01-000107.01B');
		 			dbConnection = getDBConnection();
		 			statement = dbConnection.createStatement();
		 			System.out.println(selectTableSQL1);
		 			// Execute SQL statement
		 			ResultSet rs = statement.executeQuery(selectTableSQL1);
		 			List<String> List_EVC_NCI_dropDown_values = new ArrayList<String>();
		 			while (rs.next()) {
		 				String Service_EVC_NCI_dropDown_values = rs.getString("NCI");
		 				List_EVC_NCI_dropDown_values.add(Service_EVC_NCI_dropDown_values);
		 				 
		 			}
		 			Return_list_Value = List_EVC_NCI_dropDown_values;
		 			dbConnection.close();
		 		} catch (SQLException e) {
		 			System.out.println(e.getMessage());
		 		} finally {
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
	     
	     // service DB validation 
	     public static List<String> service_RT_devicevalidation(String name){	 	
			 try {
			 String query = "SELECT * FROM node where nodeid in (SELECT port2node FROM port where portid in (SELECT serviceobject2object FROM serviceobject where serviceobject2dimobject = '4'and serviceobject2service in (select serviceid from service where name = '"+name+"')))";
			 
			 
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		System.out.println(query);
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("NAME"));		
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
	     public static List<String> service_RT_Circuitvalidation(String name){	 	
			 try {
			//String query = "select Unique(C.Name) from node N, Port P, Circuit C where (C.CIRCUIT2STARTPORT = P.Portid or C.CIRCUIT2ENDPORT = P.Portid) and N.nodeid = P.PORT2NODE and N.name = '"+name+"'";
			String query = "SELECT assocrt.circuitid from circuit crt, serviceobject so, circuitcircuit ctct,circuit assocrt where so.serviceobject2service = '528316' and so.serviceobject2dimobject = 4 and serviceobject2object "
					+ "= crt.circuit2startport and crt.circuitid= ctct.usedby2circuit (+) and assocrt.circuitid in (crt.circuitid,ctct.uses2circuit )and assocrt.circuit2circuittype='150000059'";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("circuitid"));		
			 				List_attributes.add(rs.getString("circuitid"));	
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
	     
	     
	     public static int Sevice_RT_locationvalidation(String name){	 	
			 try {
			 String query = "Select count(*) from CUSTOMER_SERVICE_ADDRESS CSD,Service_Address SA,Customer CA where CA.CLC_CUSTOMER_ID = CSD.CLC_CUSTOMER_ID and CSD.SERVICE_ADDRESS_ID = SA.SERVICE_ADDRESS_ID and CA.CUSTOMER_NM  = '"+name+"'";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		System.out.println(query);
			 			ResultSet rs = statement.executeQuery(query);
			 			
			 			 
			 			
			 			new ArrayList<Integer>();
			 			
			 			while(rs.next()) {
			 				//List_attributes.add(rs.getInt("COUNT(*)"));		
			 				Return_list_count = rs.getInt("COUNT(*)");
			 			}
			 			
			 			
			 			
			 			
			 			//Return_list_count = rs.getInt("COUNT(*)");
			 			System.out.println("Return_list_count......."+ Return_list_count);
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
			 		return Return_list_count;
			 		}

	     
	     public static List<String> Service_RT_subscribervalidation(String name){	 	
			 try {
			String query = "select * from subscriber where subscriberid = (SELECT service2subscriber FROM service where name ='"+name+"')";
			 			dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				List_attributes.add(rs.getString("FULLNAME"));		
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
	     public static String device_mco_search(String name){	 
	    	 String Return_mco_count=null;
			 try {
			 	 String query = "SELECT count(*) FROM ext_device_type where upper(MCO) like '"+name+"'";
			 			
			 	System.out.println(query);
			 	 dbConnection = getDBConnection();
			 			statement = dbConnection.createStatement();
			 		
			 			ResultSet rs = statement.executeQuery(query);
			 			//List<String> List_attributes = new ArrayList<String>();
			 			
			 			while(rs.next()) {
			 				Return_mco_count=rs.getString("COUNT(*)");
			 				
			 				System.out.println(Return_mco_count);
			 				
			 				//List_attributes.add(rs.getString("COUNT(*)"));		
			 			}
			 			//Return_list_Value = List_attributes;
			 			return Return_mco_count;
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
			 		return Return_mco_count;
			 
		 }
	     
	    
}
