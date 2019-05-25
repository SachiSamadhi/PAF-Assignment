package com.Paf.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class User {
	
	 public String login(String userN, String email, String code, String mobile, String cno) {
     	Connection con = null;
     	Statement statement = null;
     	ResultSet resultSet = null;
     	
     	String userNameDB = "";
     	String email = "";
     	String code = "";
     	String mobile = "";
     	String cno = "";
     	
     	try {
     		con = DBConnection.createConnection();
     		statement = con.createStatement();
     		resultSet = statement.executeQuery("select nameUsers,emailUsers,codeUser,mobileUser,creditUsers");
     		
     		while(resultSet.next()) {
     			userNameDB = resultSet.getString("nameUsers");
     			email = resultSet.getString("emailUsers");
     			code = resultSet.getString("mobileUser");
     			cno = resultSet.getString("creditUser");
     			
     			if(userN.contentEquals(userNameDB) && passw.equals(email)) {
     				return "SUCCESS";
     			}
     		}
     	}
     	catch(SQLException e) {
     		e.printStackTrace();
     	}
     	return "Invalid user credentials...";
     }
     
}


}
