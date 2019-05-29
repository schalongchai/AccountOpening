package com.me.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.me.app.model.Customer;
//This just a sample when doing every thing by your self, Not used any more...
//
public class CustomerRepository2{
		// JDBC driver name and database URL
		@Value("${spring.datasource.driver-class-name}")
	   	private String JDBC_DRIVER;
		
	   	@Value("${spring.datasource.url}")
	   	private String DB_URL;
	
	   	//  Database credentials
		@Value("${spring.datasource.username}")
	   	private String DB_USER;

		@Value("${spring.datasource.password}")
	   	private String DB_PASS;
   
		public List<Customer> searchByName(String name) {
			List<Customer> listCust = new ArrayList<Customer>();
			
			Connection conn = null;
			Statement stmt = null;
			try {
	
	            Class.forName(JDBC_DRIVER);
	            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
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
