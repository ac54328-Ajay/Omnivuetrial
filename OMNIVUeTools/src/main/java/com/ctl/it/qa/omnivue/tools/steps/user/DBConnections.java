package com.ctl.it.qa.omnivue.tools.steps.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnections {
	DBConnections Db_connections;
	// private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	 private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
     private static final String DB_CONNECTION_E2E = "jdbc:oracle:thin:@arm005tdb.dev.qintra.com:1511:arm005t";
     private static final String DB_USER = "OVAPI";
     private static final String DB_PASSWORD = "L5mEVvno";
     
     public static String Actual_Note = null;      
     
     public static String Actual_HPC = null;
     
     public static String Actual_HPCEXPIRATIONDATE  = null;
     
     public static String Return_Value = null;
     
     public static List<String> Return_list_Value = null;
     
     private static Connection getDBConnection() {

  		Connection dbConnection = null;

  		try {

  			Class.forName(DB_DRIVER);

  		}

  		catch (ClassNotFoundException e) {

  			System.out.println(e.getMessage());

  		}

  		try {

  			dbConnection = DriverManager.getConnection(DB_CONNECTION_E2E, DB_USER, DB_PASSWORD);

  			return dbConnection;

  		}

  		catch (SQLException e) {

  			System.out.println(e.getMessage());

  		}

  		return dbConnection;

  	}
     
     public static List<String> location_range_attributes_values(int i) throws SQLException{
 		Connection dbConnection = null;
 		Statement statement = null;

 		//String selectTableSQL1 = "SELECT description FROM service where name = '" + ServiceName + "'";
 		
 		String selectTableSQL1 = "SELECT * FROM address_range where address_range_id ='"+i+"'";

 		try {

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
 			}
 			//System.out.println(List_addressrange_attributes);
 			Return_list_Value = List_addressrange_attributes;
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
 	
 	//HPC Detials END
 	
 	
 	
 	

 	
     
public void DbConnection_1()
{
	try {

        selectRecordsFromDbUserTable(null);

} catch (SQLException e) {

        System.out.println(e.getMessage());

}
}

// Service Note section Start

	public static String selectRecordsFromDbUserTable(String ServiceName) throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		//String selectTableSQL1 = "SELECT description FROM service where name = '" + ServiceName + "'";
		
		String selectTableSQL1 = "select EMU.HPC,EMU.HPCEXPIRATIONDATE from ext_mef_uni EMU,Service S where S.serviceid = EMU.SERVICEID and S.name = '" + ServiceName + "'";

		try {

			dbConnection = getDBConnection();

			statement = dbConnection.createStatement();

			System.out.println(selectTableSQL1);

			// Execute SQL statement

			ResultSet rs = statement.executeQuery(selectTableSQL1);
			
			
			while (rs.next()) {

				//Actual_Note = rs.getString("Description");
				
				Actual_HPC = rs.getString("HPC");				
				
				Actual_HPCEXPIRATIONDATE = rs.getString("HPCEXPIRATIONDATE");
				
				Return_Value = Actual_HPC + "#" + Actual_HPCEXPIRATIONDATE;


			}
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
	
	// Service Note section End
	
	
	
	//HPC Details Start
	

	public static String selectRecordsHPCdetails(String ServiceName) throws SQLException{
	Connection dbConnection = null;
	Statement statement = null;

	//String selectTableSQL1 = "SELECT description FROM service where name = '" + ServiceName + "'";
	
	String selectTableSQL1 = "select EMU.HPC,EMU.HPCEXPIRATIONDATE from ext_mef_uni EMU,Service S where S.serviceid = EMU.SERVICEID and S.name = '" + ServiceName + "'";

	try {

		dbConnection = getDBConnection();

		statement = dbConnection.createStatement();

		System.out.println(selectTableSQL1);

		// Execute SQL statement

		ResultSet rs = statement.executeQuery(selectTableSQL1);
		
		
		while (rs.next()) {

			//Actual_Note = rs.getString("Description");
			
			Actual_HPC = rs.getString("HPC");				
			
			Actual_HPCEXPIRATIONDATE = rs.getString("HPCEXPIRATIONDATE");
			
			Return_Value = Actual_HPC + "#" + Actual_HPCEXPIRATIONDATE;


		}
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
	
	
	
	
public static void main(String args[]) throws Throwable{
	
	location_range_attributes_values(786);
}
	
}

