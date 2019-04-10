package com.me.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.me.app.model.Customer;
//This just a sample when doing every thing by your self, Not used any more...
//
public class CustomerRepository2{
	// JDBC driver name and database URL
	   	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	   	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	   	//  Database credentials
	   	static final String USER = "SYSTEM";
	   	static final String PASS = "123456";
   
		public List<Customer> searchByName(String name) {
			List<Customer> listCust = new ArrayList<Customer>();
			
			Connection conn = null;
			Statement stmt = null;
			try {
	
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            conn = DriverManager.getConnection(DB_URL, USER, PASS);
	            stmt = conn.createStatement();
	            name = name.toLowerCase();
	            String sql = "SELECT * from customer where LOWER(name) like '%"+name+"%'";
	            ResultSet rs = stmt.executeQuery(sql);
	            //STEP 5: Extract data from result set
	            while(rs.next()){
	               //Retrieve by column name
	            	Customer c = new Customer();
	            	c.setId(rs.getLong("id"));
	            	c.setName(rs.getString("name"));
	            	
	            	listCust.add(c);
	            }
	            rs.close();
	            
	        } catch (ClassNotFoundException e) {
	
	            e.printStackTrace();       
	
			} catch (SQLException se) {
			
				se.printStackTrace();

			} catch (Exception e) {

				e.printStackTrace();
				
			} finally {	
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
	         
			}
			
			return listCust;
		}
	
	 
}
