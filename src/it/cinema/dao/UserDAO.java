package it.cinema.dao;

import java.sql.*;


import it.cinema.entity.User;
public class UserDAO {
	
	 public User checkLogin(String email, String password) throws SQLException,
     ClassNotFoundException {
 String jdbcURL = "jdbc:mysql://localhost:3306/cinema";
 String dbUser = "root";
 String dbPassword = "Scorpion1985";

 Class.forName("com.mysql.jdbc.Driver");
 Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
 String sql = "SELECT * FROM visitatori WHERE EMAIL = ? and PSW = ?";
 PreparedStatement statement = connection.prepareStatement(sql);
 statement.setString(1, email);
 statement.setString(2, password);

 ResultSet result = statement.executeQuery();

 User user = null;

 if (result.next()) {
     user = new User();
     user.setNOME(result.getString("nome"));
     user.setEMAIL(email);
 }

 connection.close();

 return user;
}
	 
}
